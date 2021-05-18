// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.implementation;

import com.azure.resourcemanager.applicationinsights.fluent.models.ComponentPurgeStatusResponseInner;
import com.azure.resourcemanager.applicationinsights.models.ComponentPurgeStatusResponse;
import com.azure.resourcemanager.applicationinsights.models.PurgeState;

public final class ComponentPurgeStatusResponseImpl implements ComponentPurgeStatusResponse {
    private ComponentPurgeStatusResponseInner innerObject;

    private final com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager serviceManager;

    ComponentPurgeStatusResponseImpl(
        ComponentPurgeStatusResponseInner innerObject,
        com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public PurgeState status() {
        return this.innerModel().status();
    }

    public ComponentPurgeStatusResponseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager manager() {
        return this.serviceManager;
    }
}
