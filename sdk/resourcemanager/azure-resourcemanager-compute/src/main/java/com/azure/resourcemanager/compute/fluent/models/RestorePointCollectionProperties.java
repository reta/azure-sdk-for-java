// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.models.RestorePointCollectionSourceProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The restore point collection properties. */
@Fluent
public final class RestorePointCollectionProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RestorePointCollectionProperties.class);

    /*
     * The properties of the source resource that this restore point collection
     * is created from.
     */
    @JsonProperty(value = "source")
    private RestorePointCollectionSourceProperties source;

    /*
     * The provisioning state of the restore point collection.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * The unique id of the restore point collection.
     */
    @JsonProperty(value = "restorePointCollectionId", access = JsonProperty.Access.WRITE_ONLY)
    private String restorePointCollectionId;

    /*
     * A list containing all restore points created under this restore point
     * collection.
     */
    @JsonProperty(value = "restorePoints", access = JsonProperty.Access.WRITE_ONLY)
    private List<RestorePointInner> restorePoints;

    /**
     * Get the source property: The properties of the source resource that this restore point collection is created
     * from.
     *
     * @return the source value.
     */
    public RestorePointCollectionSourceProperties source() {
        return this.source;
    }

    /**
     * Set the source property: The properties of the source resource that this restore point collection is created
     * from.
     *
     * @param source the source value to set.
     * @return the RestorePointCollectionProperties object itself.
     */
    public RestorePointCollectionProperties withSource(RestorePointCollectionSourceProperties source) {
        this.source = source;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the restore point collection.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the restorePointCollectionId property: The unique id of the restore point collection.
     *
     * @return the restorePointCollectionId value.
     */
    public String restorePointCollectionId() {
        return this.restorePointCollectionId;
    }

    /**
     * Get the restorePoints property: A list containing all restore points created under this restore point collection.
     *
     * @return the restorePoints value.
     */
    public List<RestorePointInner> restorePoints() {
        return this.restorePoints;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (source() != null) {
            source().validate();
        }
        if (restorePoints() != null) {
            restorePoints().forEach(e -> e.validate());
        }
    }
}
