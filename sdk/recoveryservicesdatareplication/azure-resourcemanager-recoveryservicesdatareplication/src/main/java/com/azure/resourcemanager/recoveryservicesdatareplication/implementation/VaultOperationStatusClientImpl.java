// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesdatareplication.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
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
import com.azure.resourcemanager.recoveryservicesdatareplication.fluent.VaultOperationStatusClient;
import com.azure.resourcemanager.recoveryservicesdatareplication.fluent.models.OperationStatusInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in VaultOperationStatusClient. */
public final class VaultOperationStatusClientImpl implements VaultOperationStatusClient {
    /** The proxy service used to perform REST calls. */
    private final VaultOperationStatusService service;

    /** The service client containing this operation class. */
    private final DataReplicationMgmtClientImpl client;

    /**
     * Initializes an instance of VaultOperationStatusClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    VaultOperationStatusClientImpl(DataReplicationMgmtClientImpl client) {
        this.service =
            RestProxy
                .create(VaultOperationStatusService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for DataReplicationMgmtClientVaultOperationStatus to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "DataReplicationMgmtC")
    public interface VaultOperationStatusService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DataReplication/replicationVaults/{vaultName}/operations/{operationId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<OperationStatusInner>> get(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("vaultName") String vaultName,
            @PathParam("operationId") String operationId,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Gets the vault operation status.
     *
     * <p>Tracks the results of an asynchronous operation on the vault.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param vaultName The vault name.
     * @param operationId The ID of an ongoing async operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the operation status along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<OperationStatusInner>> getWithResponseAsync(
        String resourceGroupName, String vaultName, String operationId) {
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
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (vaultName == null) {
            return Mono.error(new IllegalArgumentException("Parameter vaultName is required and cannot be null."));
        }
        if (operationId == null) {
            return Mono.error(new IllegalArgumentException("Parameter operationId is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            vaultName,
                            operationId,
                            this.client.getApiVersion(),
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets the vault operation status.
     *
     * <p>Tracks the results of an asynchronous operation on the vault.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param vaultName The vault name.
     * @param operationId The ID of an ongoing async operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the operation status along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<OperationStatusInner>> getWithResponseAsync(
        String resourceGroupName, String vaultName, String operationId, Context context) {
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
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (vaultName == null) {
            return Mono.error(new IllegalArgumentException("Parameter vaultName is required and cannot be null."));
        }
        if (operationId == null) {
            return Mono.error(new IllegalArgumentException("Parameter operationId is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                vaultName,
                operationId,
                this.client.getApiVersion(),
                accept,
                context);
    }

    /**
     * Gets the vault operation status.
     *
     * <p>Tracks the results of an asynchronous operation on the vault.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param vaultName The vault name.
     * @param operationId The ID of an ongoing async operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the operation status on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<OperationStatusInner> getAsync(String resourceGroupName, String vaultName, String operationId) {
        return getWithResponseAsync(resourceGroupName, vaultName, operationId)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Gets the vault operation status.
     *
     * <p>Tracks the results of an asynchronous operation on the vault.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param vaultName The vault name.
     * @param operationId The ID of an ongoing async operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the operation status along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<OperationStatusInner> getWithResponse(
        String resourceGroupName, String vaultName, String operationId, Context context) {
        return getWithResponseAsync(resourceGroupName, vaultName, operationId, context).block();
    }

    /**
     * Gets the vault operation status.
     *
     * <p>Tracks the results of an asynchronous operation on the vault.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param vaultName The vault name.
     * @param operationId The ID of an ongoing async operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the operation status.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public OperationStatusInner get(String resourceGroupName, String vaultName, String operationId) {
        return getWithResponse(resourceGroupName, vaultName, operationId, Context.NONE).getValue();
    }
}
