// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of DataNetworks. */
public interface DataNetworks {
    /**
     * Deletes the specified data network.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param mobileNetworkName The name of the mobile network.
     * @param dataNetworkName The name of the data network.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String mobileNetworkName, String dataNetworkName);

    /**
     * Deletes the specified data network.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param mobileNetworkName The name of the mobile network.
     * @param dataNetworkName The name of the data network.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String mobileNetworkName, String dataNetworkName, Context context);

    /**
     * Gets information about the specified data network.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param mobileNetworkName The name of the mobile network.
     * @param dataNetworkName The name of the data network.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified data network.
     */
    DataNetwork get(String resourceGroupName, String mobileNetworkName, String dataNetworkName);

    /**
     * Gets information about the specified data network.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param mobileNetworkName The name of the mobile network.
     * @param dataNetworkName The name of the data network.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified data network along with {@link Response}.
     */
    Response<DataNetwork> getWithResponse(
        String resourceGroupName, String mobileNetworkName, String dataNetworkName, Context context);

    /**
     * Lists all data networks in the mobile network.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param mobileNetworkName The name of the mobile network.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for data network API service call as paginated response with {@link PagedIterable}.
     */
    PagedIterable<DataNetwork> listByMobileNetwork(String resourceGroupName, String mobileNetworkName);

    /**
     * Lists all data networks in the mobile network.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param mobileNetworkName The name of the mobile network.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for data network API service call as paginated response with {@link PagedIterable}.
     */
    PagedIterable<DataNetwork> listByMobileNetwork(String resourceGroupName, String mobileNetworkName, Context context);

    /**
     * Gets information about the specified data network.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified data network along with {@link Response}.
     */
    DataNetwork getById(String id);

    /**
     * Gets information about the specified data network.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified data network along with {@link Response}.
     */
    Response<DataNetwork> getByIdWithResponse(String id, Context context);

    /**
     * Deletes the specified data network.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes the specified data network.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new DataNetwork resource.
     *
     * @param name resource name.
     * @return the first stage of the new DataNetwork definition.
     */
    DataNetwork.DefinitionStages.Blank define(String name);
}
