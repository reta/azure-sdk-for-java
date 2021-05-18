// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mariadb.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.mariadb.fluent.models.RecommendationActionInner;

/** An instance of this class provides access to all the operations defined in RecommendedActionsClient. */
public interface RecommendedActionsClient {
    /**
     * Retrieve recommended actions from the advisor.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param advisorName The advisor name for recommendation action.
     * @param recommendedActionName The recommended action name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a Recommendation Action.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RecommendationActionInner get(
        String resourceGroupName, String serverName, String advisorName, String recommendedActionName);

    /**
     * Retrieve recommended actions from the advisor.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param advisorName The advisor name for recommendation action.
     * @param recommendedActionName The recommended action name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a Recommendation Action.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RecommendationActionInner> getWithResponse(
        String resourceGroupName, String serverName, String advisorName, String recommendedActionName, Context context);

    /**
     * Retrieve recommended actions from the advisor.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param advisorName The advisor name for recommendation action.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of recommendation actions.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RecommendationActionInner> listByServer(
        String resourceGroupName, String serverName, String advisorName);

    /**
     * Retrieve recommended actions from the advisor.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param advisorName The advisor name for recommendation action.
     * @param sessionId The recommendation action session identifier.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of recommendation actions.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RecommendationActionInner> listByServer(
        String resourceGroupName, String serverName, String advisorName, String sessionId, Context context);
}
