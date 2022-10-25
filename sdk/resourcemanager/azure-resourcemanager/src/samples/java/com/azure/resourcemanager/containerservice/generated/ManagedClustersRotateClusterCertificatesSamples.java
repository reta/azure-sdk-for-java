// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.generated;

import com.azure.core.util.Context;

/** Samples for ManagedClusters RotateClusterCertificates. */
public final class ManagedClustersRotateClusterCertificatesSamples {
    /*
     * x-ms-original-file: specification/containerservice/resource-manager/Microsoft.ContainerService/stable/2022-09-01/examples/ManagedClustersRotateClusterCertificates.json
     */
    /**
     * Sample code: Rotate Cluster Certificates.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void rotateClusterCertificates(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .kubernetesClusters()
            .manager()
            .serviceClient()
            .getManagedClusters()
            .rotateClusterCertificates("rg1", "clustername1", Context.NONE);
    }
}
