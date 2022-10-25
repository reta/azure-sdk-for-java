// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Details about the pod identity assigned to the Managed Cluster. */
@Fluent
public class ManagedClusterPodIdentity {
    /*
     * The name of the pod identity.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The namespace of the pod identity.
     */
    @JsonProperty(value = "namespace", required = true)
    private String namespace;

    /*
     * The binding selector to use for the AzureIdentityBinding resource.
     */
    @JsonProperty(value = "bindingSelector")
    private String bindingSelector;

    /*
     * The user assigned identity details.
     */
    @JsonProperty(value = "identity", required = true)
    private UserAssignedIdentity identity;

    /*
     * The current provisioning state of the pod identity.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ManagedClusterPodIdentityProvisioningState provisioningState;

    /*
     * The provisioningInfo property.
     */
    @JsonProperty(value = "provisioningInfo", access = JsonProperty.Access.WRITE_ONLY)
    private ManagedClusterPodIdentityProvisioningInfo provisioningInfo;

    /** Creates an instance of ManagedClusterPodIdentity class. */
    public ManagedClusterPodIdentity() {
    }

    /**
     * Get the name property: The name of the pod identity.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the pod identity.
     *
     * @param name the name value to set.
     * @return the ManagedClusterPodIdentity object itself.
     */
    public ManagedClusterPodIdentity withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the namespace property: The namespace of the pod identity.
     *
     * @return the namespace value.
     */
    public String namespace() {
        return this.namespace;
    }

    /**
     * Set the namespace property: The namespace of the pod identity.
     *
     * @param namespace the namespace value to set.
     * @return the ManagedClusterPodIdentity object itself.
     */
    public ManagedClusterPodIdentity withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * Get the bindingSelector property: The binding selector to use for the AzureIdentityBinding resource.
     *
     * @return the bindingSelector value.
     */
    public String bindingSelector() {
        return this.bindingSelector;
    }

    /**
     * Set the bindingSelector property: The binding selector to use for the AzureIdentityBinding resource.
     *
     * @param bindingSelector the bindingSelector value to set.
     * @return the ManagedClusterPodIdentity object itself.
     */
    public ManagedClusterPodIdentity withBindingSelector(String bindingSelector) {
        this.bindingSelector = bindingSelector;
        return this;
    }

    /**
     * Get the identity property: The user assigned identity details.
     *
     * @return the identity value.
     */
    public UserAssignedIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The user assigned identity details.
     *
     * @param identity the identity value to set.
     * @return the ManagedClusterPodIdentity object itself.
     */
    public ManagedClusterPodIdentity withIdentity(UserAssignedIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the provisioningState property: The current provisioning state of the pod identity.
     *
     * @return the provisioningState value.
     */
    public ManagedClusterPodIdentityProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the provisioningInfo property: The provisioningInfo property.
     *
     * @return the provisioningInfo value.
     */
    public ManagedClusterPodIdentityProvisioningInfo provisioningInfo() {
        return this.provisioningInfo;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property name in model ManagedClusterPodIdentity"));
        }
        if (namespace() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property namespace in model ManagedClusterPodIdentity"));
        }
        if (identity() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property identity in model ManagedClusterPodIdentity"));
        } else {
            identity().validate();
        }
        if (provisioningInfo() != null) {
            provisioningInfo().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ManagedClusterPodIdentity.class);
}
