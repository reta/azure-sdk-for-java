// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.apimanagement.fluent.models.GatewayHostnameConfigurationContractInner;
import com.azure.resourcemanager.apimanagement.models.GatewayHostnameConfigurationContract;

public final class GatewayHostnameConfigurationContractImpl
    implements GatewayHostnameConfigurationContract,
        GatewayHostnameConfigurationContract.Definition,
        GatewayHostnameConfigurationContract.Update {
    private GatewayHostnameConfigurationContractInner innerObject;

    private final com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String hostname() {
        return this.innerModel().hostname();
    }

    public String certificateId() {
        return this.innerModel().certificateId();
    }

    public Boolean negotiateClientCertificate() {
        return this.innerModel().negotiateClientCertificate();
    }

    public Boolean tls10Enabled() {
        return this.innerModel().tls10Enabled();
    }

    public Boolean tls11Enabled() {
        return this.innerModel().tls11Enabled();
    }

    public Boolean http2Enabled() {
        return this.innerModel().http2Enabled();
    }

    public GatewayHostnameConfigurationContractInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.apimanagement.ApiManagementManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String serviceName;

    private String gatewayId;

    private String hcId;

    private String createIfMatch;

    private String updateIfMatch;

    public GatewayHostnameConfigurationContractImpl withExistingGateway(
        String resourceGroupName, String serviceName, String gatewayId) {
        this.resourceGroupName = resourceGroupName;
        this.serviceName = serviceName;
        this.gatewayId = gatewayId;
        return this;
    }

    public GatewayHostnameConfigurationContract create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getGatewayHostnameConfigurations()
                .createOrUpdateWithResponse(
                    resourceGroupName, serviceName, gatewayId, hcId, this.innerModel(), createIfMatch, Context.NONE)
                .getValue();
        return this;
    }

    public GatewayHostnameConfigurationContract create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getGatewayHostnameConfigurations()
                .createOrUpdateWithResponse(
                    resourceGroupName, serviceName, gatewayId, hcId, this.innerModel(), createIfMatch, context)
                .getValue();
        return this;
    }

    GatewayHostnameConfigurationContractImpl(
        String name, com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager) {
        this.innerObject = new GatewayHostnameConfigurationContractInner();
        this.serviceManager = serviceManager;
        this.hcId = name;
        this.createIfMatch = null;
    }

    public GatewayHostnameConfigurationContractImpl update() {
        this.updateIfMatch = null;
        return this;
    }

    public GatewayHostnameConfigurationContract apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getGatewayHostnameConfigurations()
                .createOrUpdateWithResponse(
                    resourceGroupName, serviceName, gatewayId, hcId, this.innerModel(), updateIfMatch, Context.NONE)
                .getValue();
        return this;
    }

    public GatewayHostnameConfigurationContract apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getGatewayHostnameConfigurations()
                .createOrUpdateWithResponse(
                    resourceGroupName, serviceName, gatewayId, hcId, this.innerModel(), updateIfMatch, context)
                .getValue();
        return this;
    }

    GatewayHostnameConfigurationContractImpl(
        GatewayHostnameConfigurationContractInner innerObject,
        com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.serviceName = Utils.getValueFromIdByName(innerObject.id(), "service");
        this.gatewayId = Utils.getValueFromIdByName(innerObject.id(), "gateways");
        this.hcId = Utils.getValueFromIdByName(innerObject.id(), "hostnameConfigurations");
    }

    public GatewayHostnameConfigurationContract refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getGatewayHostnameConfigurations()
                .getWithResponse(resourceGroupName, serviceName, gatewayId, hcId, Context.NONE)
                .getValue();
        return this;
    }

    public GatewayHostnameConfigurationContract refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getGatewayHostnameConfigurations()
                .getWithResponse(resourceGroupName, serviceName, gatewayId, hcId, context)
                .getValue();
        return this;
    }

    public GatewayHostnameConfigurationContractImpl withHostname(String hostname) {
        this.innerModel().withHostname(hostname);
        return this;
    }

    public GatewayHostnameConfigurationContractImpl withCertificateId(String certificateId) {
        this.innerModel().withCertificateId(certificateId);
        return this;
    }

    public GatewayHostnameConfigurationContractImpl withNegotiateClientCertificate(Boolean negotiateClientCertificate) {
        this.innerModel().withNegotiateClientCertificate(negotiateClientCertificate);
        return this;
    }

    public GatewayHostnameConfigurationContractImpl withTls10Enabled(Boolean tls10Enabled) {
        this.innerModel().withTls10Enabled(tls10Enabled);
        return this;
    }

    public GatewayHostnameConfigurationContractImpl withTls11Enabled(Boolean tls11Enabled) {
        this.innerModel().withTls11Enabled(tls11Enabled);
        return this;
    }

    public GatewayHostnameConfigurationContractImpl withHttp2Enabled(Boolean http2Enabled) {
        this.innerModel().withHttp2Enabled(http2Enabled);
        return this;
    }

    public GatewayHostnameConfigurationContractImpl withIfMatch(String ifMatch) {
        if (isInCreateMode()) {
            this.createIfMatch = ifMatch;
            return this;
        } else {
            this.updateIfMatch = ifMatch;
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
