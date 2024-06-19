// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.sms.implementation;

import com.azure.communication.sms.implementation.models.SendMessageRequest;
import com.azure.communication.sms.implementation.models.SmsSendResponse;
import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in Sms.
 */
public final class SmsImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private final SmsService service;

    /**
     * The service client containing this operation class.
     */
    private final AzureCommunicationSMSServiceImpl client;

    /**
     * Initializes an instance of SmsImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    SmsImpl(AzureCommunicationSMSServiceImpl client) {
        this.service = RestProxy.create(SmsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for AzureCommunicationSMSServiceSms to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{endpoint}")
    @ServiceInterface(name = "AzureCommunicationSM")
    public interface SmsService {
        @Post("/sms")
        @ExpectedResponses({ 202 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<SmsSendResponse>> send(@HostParam("endpoint") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") SendMessageRequest sendMessageRequest, @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Sends a SMS message from a phone number that belongs to the authenticated account.
     * 
     * @param sendMessageRequest Represents the body of the send message request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for a successful or multi status send Sms request along with {@link Response} on successful
     * completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<SmsSendResponse>> sendWithResponseAsync(SendMessageRequest sendMessageRequest) {
        final String accept = "application/json";
        return FluxUtil.withContext(context -> service.send(this.client.getEndpoint(), this.client.getApiVersion(),
            sendMessageRequest, accept, context));
    }

    /**
     * Sends a SMS message from a phone number that belongs to the authenticated account.
     * 
     * @param sendMessageRequest Represents the body of the send message request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for a successful or multi status send Sms request along with {@link Response} on successful
     * completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<SmsSendResponse>> sendWithResponseAsync(SendMessageRequest sendMessageRequest,
        Context context) {
        final String accept = "application/json";
        return service.send(this.client.getEndpoint(), this.client.getApiVersion(), sendMessageRequest, accept,
            context);
    }

    /**
     * Sends a SMS message from a phone number that belongs to the authenticated account.
     * 
     * @param sendMessageRequest Represents the body of the send message request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for a successful or multi status send Sms request on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SmsSendResponse> sendAsync(SendMessageRequest sendMessageRequest) {
        return sendWithResponseAsync(sendMessageRequest).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Sends a SMS message from a phone number that belongs to the authenticated account.
     * 
     * @param sendMessageRequest Represents the body of the send message request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for a successful or multi status send Sms request on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SmsSendResponse> sendAsync(SendMessageRequest sendMessageRequest, Context context) {
        return sendWithResponseAsync(sendMessageRequest, context).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Sends a SMS message from a phone number that belongs to the authenticated account.
     * 
     * @param sendMessageRequest Represents the body of the send message request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for a successful or multi status send Sms request along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<SmsSendResponse> sendWithResponse(SendMessageRequest sendMessageRequest, Context context) {
        return sendWithResponseAsync(sendMessageRequest, context).block();
    }

    /**
     * Sends a SMS message from a phone number that belongs to the authenticated account.
     * 
     * @param sendMessageRequest Represents the body of the send message request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for a successful or multi status send Sms request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SmsSendResponse send(SendMessageRequest sendMessageRequest) {
        return sendWithResponse(sendMessageRequest, Context.NONE).getValue();
    }
}
