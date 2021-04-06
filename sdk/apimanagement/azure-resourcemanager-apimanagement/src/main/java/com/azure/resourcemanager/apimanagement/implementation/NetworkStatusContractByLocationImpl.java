// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.implementation;

import com.azure.resourcemanager.apimanagement.fluent.models.NetworkStatusContractByLocationInner;
import com.azure.resourcemanager.apimanagement.fluent.models.NetworkStatusContractInner;
import com.azure.resourcemanager.apimanagement.models.NetworkStatusContract;
import com.azure.resourcemanager.apimanagement.models.NetworkStatusContractByLocation;

public final class NetworkStatusContractByLocationImpl implements NetworkStatusContractByLocation {
    private NetworkStatusContractByLocationInner innerObject;

    private final com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager;

    NetworkStatusContractByLocationImpl(
        NetworkStatusContractByLocationInner innerObject,
        com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String location() {
        return this.innerModel().location();
    }

    public NetworkStatusContract networkStatus() {
        NetworkStatusContractInner inner = this.innerModel().networkStatus();
        if (inner != null) {
            return new NetworkStatusContractImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public NetworkStatusContractByLocationInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.apimanagement.ApiManagementManager manager() {
        return this.serviceManager;
    }
}
