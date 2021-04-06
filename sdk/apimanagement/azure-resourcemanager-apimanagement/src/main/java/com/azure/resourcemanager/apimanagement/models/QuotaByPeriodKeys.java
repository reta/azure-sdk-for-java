// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of QuotaByPeriodKeys. */
public interface QuotaByPeriodKeys {
    /**
     * Gets the value of the quota counter associated with the counter-key in the policy for the specific period in
     * service instance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param quotaCounterKey Quota counter key identifier.This is the result of expression defined in counter-key
     *     attribute of the quota-by-key policy.For Example, if you specify counter-key="boo" in the policy, then it’s
     *     accessible by "boo" counter key. But if it’s defined as counter-key="@("b"+"a")" then it will be accessible
     *     by "ba" key.
     * @param quotaPeriodKey Quota period key identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the value of the quota counter associated with the counter-key in the policy for the specific period in
     *     service instance.
     */
    QuotaCounterContract get(
        String resourceGroupName, String serviceName, String quotaCounterKey, String quotaPeriodKey);

    /**
     * Gets the value of the quota counter associated with the counter-key in the policy for the specific period in
     * service instance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param quotaCounterKey Quota counter key identifier.This is the result of expression defined in counter-key
     *     attribute of the quota-by-key policy.For Example, if you specify counter-key="boo" in the policy, then it’s
     *     accessible by "boo" counter key. But if it’s defined as counter-key="@("b"+"a")" then it will be accessible
     *     by "ba" key.
     * @param quotaPeriodKey Quota period key identifier.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the value of the quota counter associated with the counter-key in the policy for the specific period in
     *     service instance.
     */
    Response<QuotaCounterContract> getWithResponse(
        String resourceGroupName, String serviceName, String quotaCounterKey, String quotaPeriodKey, Context context);

    /**
     * Updates an existing quota counter value in the specified service instance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param quotaCounterKey Quota counter key identifier.This is the result of expression defined in counter-key
     *     attribute of the quota-by-key policy.For Example, if you specify counter-key="boo" in the policy, then it’s
     *     accessible by "boo" counter key. But if it’s defined as counter-key="@("b"+"a")" then it will be accessible
     *     by "ba" key.
     * @param quotaPeriodKey Quota period key identifier.
     * @param parameters The value of the Quota counter to be applied on the specified period.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return quota counter details.
     */
    QuotaCounterContract update(
        String resourceGroupName,
        String serviceName,
        String quotaCounterKey,
        String quotaPeriodKey,
        QuotaCounterValueUpdateContract parameters);

    /**
     * Updates an existing quota counter value in the specified service instance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param quotaCounterKey Quota counter key identifier.This is the result of expression defined in counter-key
     *     attribute of the quota-by-key policy.For Example, if you specify counter-key="boo" in the policy, then it’s
     *     accessible by "boo" counter key. But if it’s defined as counter-key="@("b"+"a")" then it will be accessible
     *     by "ba" key.
     * @param quotaPeriodKey Quota period key identifier.
     * @param parameters The value of the Quota counter to be applied on the specified period.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return quota counter details.
     */
    Response<QuotaCounterContract> updateWithResponse(
        String resourceGroupName,
        String serviceName,
        String quotaCounterKey,
        String quotaPeriodKey,
        QuotaCounterValueUpdateContract parameters,
        Context context);
}
