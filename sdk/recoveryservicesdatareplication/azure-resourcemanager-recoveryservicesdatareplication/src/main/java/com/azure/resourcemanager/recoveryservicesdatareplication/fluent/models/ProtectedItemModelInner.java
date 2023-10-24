// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesdatareplication.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.recoveryservicesdatareplication.models.ProtectedItemModelProperties;
import com.azure.resourcemanager.recoveryservicesdatareplication.models.ProtectedItemModelSystemData;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Protected item model. */
@Fluent
public final class ProtectedItemModelInner extends ProxyResource {
    /*
     * Protected item model properties.
     */
    @JsonProperty(value = "properties", required = true)
    private ProtectedItemModelProperties properties;

    /*
     * The systemData property.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private ProtectedItemModelSystemData systemData;

    /** Creates an instance of ProtectedItemModelInner class. */
    public ProtectedItemModelInner() {
    }

    /**
     * Get the properties property: Protected item model properties.
     *
     * @return the properties value.
     */
    public ProtectedItemModelProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Protected item model properties.
     *
     * @param properties the properties value to set.
     * @return the ProtectedItemModelInner object itself.
     */
    public ProtectedItemModelInner withProperties(ProtectedItemModelProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the systemData property: The systemData property.
     *
     * @return the systemData value.
     */
    public ProtectedItemModelSystemData systemData() {
        return this.systemData;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property properties in model ProtectedItemModelInner"));
        } else {
            properties().validate();
        }
        if (systemData() != null) {
            systemData().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ProtectedItemModelInner.class);
}
