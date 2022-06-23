// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.orbital.generated;

import com.azure.core.util.Context;

/** Samples for Spacecrafts ListByResourceGroup. */
public final class SpacecraftsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/orbital/resource-manager/Microsoft.Orbital/stable/2022-03-01/examples/SpacecraftsByResourceGroupList.json
     */
    /**
     * Sample code: List of Spacecraft by Resource Group.
     *
     * @param manager Entry point to OrbitalManager.
     */
    public static void listOfSpacecraftByResourceGroup(com.azure.resourcemanager.orbital.OrbitalManager manager) {
        manager.spacecrafts().listByResourceGroup("contoso-Rgp", "opaqueString", Context.NONE);
    }
}
