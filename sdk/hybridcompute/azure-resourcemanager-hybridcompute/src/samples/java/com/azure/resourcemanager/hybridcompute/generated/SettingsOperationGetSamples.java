// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

/**
 * Samples for SettingsOperation Get.
 */
public final class SettingsOperationGetSamples {
    /*
     * x-ms-original-file:
     * specification/hybridcompute/resource-manager/Microsoft.HybridCompute/preview/2024-05-20-preview/examples/settings
     * /SettingsGet.json
     */
    /**
     * Sample code: NetworkConfigurationsGet.
     * 
     * @param manager Entry point to HybridComputeManager.
     */
    public static void networkConfigurationsGet(com.azure.resourcemanager.hybridcompute.HybridComputeManager manager) {
        manager.settingsOperations()
            .getWithResponse("hybridRG", "Microsoft.HybridCompute", "machines", "testMachine", "default",
                com.azure.core.util.Context.NONE);
    }
}
