// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.servicebus;

import com.azure.core.util.Context;
import com.azure.core.util.metrics.Meter;
import com.azure.core.util.tracing.Tracer;
import com.azure.messaging.servicebus.implementation.instrumentation.ServiceBusMeter;
import com.azure.messaging.servicebus.implementation.instrumentation.ServiceBusTracer;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * Contains convenience methods to instrument specific sender calls with traces and metrics.
 */
class ServiceBusSenderInstrumentation {
    private final ServiceBusMeter meter;
    private final ServiceBusTracer tracer;

    ServiceBusSenderInstrumentation(Tracer tracer, Meter meter, String fullyQualifiedName, String entityPath) {
        this.tracer = new ServiceBusTracer(tracer, fullyQualifiedName, entityPath);
        this.meter = new ServiceBusMeter(meter, fullyQualifiedName, entityPath, null);
    }

    ServiceBusTracer getTracer() {
        return tracer;
    }

    /**
     * Traces send call and reports send count metric.
     */
    <T> Mono<T> instrumentSendBatch(String spanName, Mono<T> publisher, List<ServiceBusMessage> batch) {
        if (!tracer.isEnabled() && !meter.isBatchSendEnabled()) {
            return publisher;
        }

        if (tracer.isEnabled()) {
            return Mono.defer(() -> {
                Context span = tracer.startSpanWithLinks(spanName, ServiceBusTracer.OperationName.PUBLISH, batch,
                    ServiceBusMessage::getContext, Context.NONE);
                return publisher
                    .doOnEach(signal -> {
                        meter.reportBatchSend(batch.size(), signal.getThrowable(), false, span);
                        tracer.endSpan(signal.getThrowable(), span, null);
                    })
                    .doOnCancel(() -> {
                        meter.reportBatchSend(batch.size(), null, true, span);
                        tracer.cancelSpan(span);
                    });
            });
        } else {
            return publisher
                .doOnEach(signal -> meter.reportBatchSend(batch.size(), signal.getThrowable(), false, Context.NONE))
                .doOnCancel(() -> meter.reportBatchSend(batch.size(), null, true, Context.NONE));
        }
    }
}
