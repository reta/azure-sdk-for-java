// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.netapp.fluent.NetAppResourcesClient;
import com.azure.resourcemanager.netapp.fluent.models.CheckAvailabilityResponseInner;
import com.azure.resourcemanager.netapp.models.QuotaAvailabilityRequest;
import com.azure.resourcemanager.netapp.models.ResourceNameAvailabilityRequest;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in NetAppResourcesClient. */
public final class NetAppResourcesClientImpl implements NetAppResourcesClient {
    private final ClientLogger logger = new ClientLogger(NetAppResourcesClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final NetAppResourcesService service;

    /** The service client containing this operation class. */
    private final NetAppManagementClientImpl client;

    /**
     * Initializes an instance of NetAppResourcesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    NetAppResourcesClientImpl(NetAppManagementClientImpl client) {
        this.service =
            RestProxy.create(NetAppResourcesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for NetAppManagementClientNetAppResources to be used by the proxy service
     * to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "NetAppManagementClie")
    private interface NetAppResourcesService {
        @Headers({"Content-Type: application/json"})
        @Post("/subscriptions/{subscriptionId}/providers/Microsoft.NetApp/locations/{location}/checkNameAvailability")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<CheckAvailabilityResponseInner>> checkNameAvailability(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("location") String location,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") ResourceNameAvailabilityRequest body,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/providers/Microsoft.NetApp/locations/{location}/checkFilePathAvailability")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<CheckAvailabilityResponseInner>> checkFilePathAvailability(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("location") String location,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") ResourceNameAvailabilityRequest body,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Post("/subscriptions/{subscriptionId}/providers/Microsoft.NetApp/locations/{location}/checkQuotaAvailability")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<CheckAvailabilityResponseInner>> checkQuotaAvailability(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("location") String location,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") QuotaAvailabilityRequest body,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Check if a resource name is available.
     *
     * @param location The location.
     * @param body Name availability request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information regarding availability of a resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<CheckAvailabilityResponseInner>> checkNameAvailabilityWithResponseAsync(
        String location, ResourceNameAvailabilityRequest body) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (body == null) {
            return Mono.error(new IllegalArgumentException("Parameter body is required and cannot be null."));
        } else {
            body.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .checkNameAvailability(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            location,
                            this.client.getApiVersion(),
                            body,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Check if a resource name is available.
     *
     * @param location The location.
     * @param body Name availability request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information regarding availability of a resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<CheckAvailabilityResponseInner>> checkNameAvailabilityWithResponseAsync(
        String location, ResourceNameAvailabilityRequest body, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (body == null) {
            return Mono.error(new IllegalArgumentException("Parameter body is required and cannot be null."));
        } else {
            body.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .checkNameAvailability(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                location,
                this.client.getApiVersion(),
                body,
                accept,
                context);
    }

    /**
     * Check if a resource name is available.
     *
     * @param location The location.
     * @param body Name availability request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information regarding availability of a resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<CheckAvailabilityResponseInner> checkNameAvailabilityAsync(
        String location, ResourceNameAvailabilityRequest body) {
        return checkNameAvailabilityWithResponseAsync(location, body)
            .flatMap(
                (Response<CheckAvailabilityResponseInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Check if a resource name is available.
     *
     * @param location The location.
     * @param body Name availability request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information regarding availability of a resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public CheckAvailabilityResponseInner checkNameAvailability(String location, ResourceNameAvailabilityRequest body) {
        return checkNameAvailabilityAsync(location, body).block();
    }

    /**
     * Check if a resource name is available.
     *
     * @param location The location.
     * @param body Name availability request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information regarding availability of a resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<CheckAvailabilityResponseInner> checkNameAvailabilityWithResponse(
        String location, ResourceNameAvailabilityRequest body, Context context) {
        return checkNameAvailabilityWithResponseAsync(location, body, context).block();
    }

    /**
     * Check if a file path is available.
     *
     * @param location The location.
     * @param body File path availability request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information regarding availability of a resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<CheckAvailabilityResponseInner>> checkFilePathAvailabilityWithResponseAsync(
        String location, ResourceNameAvailabilityRequest body) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (body == null) {
            return Mono.error(new IllegalArgumentException("Parameter body is required and cannot be null."));
        } else {
            body.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .checkFilePathAvailability(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            location,
                            this.client.getApiVersion(),
                            body,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Check if a file path is available.
     *
     * @param location The location.
     * @param body File path availability request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information regarding availability of a resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<CheckAvailabilityResponseInner>> checkFilePathAvailabilityWithResponseAsync(
        String location, ResourceNameAvailabilityRequest body, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (body == null) {
            return Mono.error(new IllegalArgumentException("Parameter body is required and cannot be null."));
        } else {
            body.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .checkFilePathAvailability(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                location,
                this.client.getApiVersion(),
                body,
                accept,
                context);
    }

    /**
     * Check if a file path is available.
     *
     * @param location The location.
     * @param body File path availability request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information regarding availability of a resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<CheckAvailabilityResponseInner> checkFilePathAvailabilityAsync(
        String location, ResourceNameAvailabilityRequest body) {
        return checkFilePathAvailabilityWithResponseAsync(location, body)
            .flatMap(
                (Response<CheckAvailabilityResponseInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Check if a file path is available.
     *
     * @param location The location.
     * @param body File path availability request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information regarding availability of a resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public CheckAvailabilityResponseInner checkFilePathAvailability(
        String location, ResourceNameAvailabilityRequest body) {
        return checkFilePathAvailabilityAsync(location, body).block();
    }

    /**
     * Check if a file path is available.
     *
     * @param location The location.
     * @param body File path availability request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information regarding availability of a resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<CheckAvailabilityResponseInner> checkFilePathAvailabilityWithResponse(
        String location, ResourceNameAvailabilityRequest body, Context context) {
        return checkFilePathAvailabilityWithResponseAsync(location, body, context).block();
    }

    /**
     * Check if a quota is available.
     *
     * @param location The location.
     * @param body Quota availability request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information regarding availability of a resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<CheckAvailabilityResponseInner>> checkQuotaAvailabilityWithResponseAsync(
        String location, QuotaAvailabilityRequest body) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (body == null) {
            return Mono.error(new IllegalArgumentException("Parameter body is required and cannot be null."));
        } else {
            body.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .checkQuotaAvailability(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            location,
                            this.client.getApiVersion(),
                            body,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Check if a quota is available.
     *
     * @param location The location.
     * @param body Quota availability request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information regarding availability of a resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<CheckAvailabilityResponseInner>> checkQuotaAvailabilityWithResponseAsync(
        String location, QuotaAvailabilityRequest body, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (body == null) {
            return Mono.error(new IllegalArgumentException("Parameter body is required and cannot be null."));
        } else {
            body.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .checkQuotaAvailability(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                location,
                this.client.getApiVersion(),
                body,
                accept,
                context);
    }

    /**
     * Check if a quota is available.
     *
     * @param location The location.
     * @param body Quota availability request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information regarding availability of a resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<CheckAvailabilityResponseInner> checkQuotaAvailabilityAsync(
        String location, QuotaAvailabilityRequest body) {
        return checkQuotaAvailabilityWithResponseAsync(location, body)
            .flatMap(
                (Response<CheckAvailabilityResponseInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Check if a quota is available.
     *
     * @param location The location.
     * @param body Quota availability request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information regarding availability of a resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public CheckAvailabilityResponseInner checkQuotaAvailability(String location, QuotaAvailabilityRequest body) {
        return checkQuotaAvailabilityAsync(location, body).block();
    }

    /**
     * Check if a quota is available.
     *
     * @param location The location.
     * @param body Quota availability request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information regarding availability of a resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<CheckAvailabilityResponseInner> checkQuotaAvailabilityWithResponse(
        String location, QuotaAvailabilityRequest body, Context context) {
        return checkQuotaAvailabilityWithResponseAsync(location, body, context).block();
    }
}
