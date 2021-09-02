// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement;

import com.azure.core.util.Context;
import com.azure.resourcemanager.apimanagement.models.GatewayKeyRegenerationRequestContract;
import com.azure.resourcemanager.apimanagement.models.KeyType;

/** Samples for Gateway RegenerateKey. */
public final class GatewayRegenerateKeySamples {
    /*
     * operationId: Gateway_RegenerateKey
     * api-version: 2020-12-01
     * x-ms-examples: ApiManagementGatewayRegenerateKey
     */
    /**
     * Sample code: ApiManagementGatewayRegenerateKey.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementGatewayRegenerateKey(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager
            .gateways()
            .regenerateKeyWithResponse(
                "rg1",
                "apimService1",
                "gwId",
                new GatewayKeyRegenerationRequestContract().withKeyType(KeyType.PRIMARY),
                Context.NONE);
    }
}
