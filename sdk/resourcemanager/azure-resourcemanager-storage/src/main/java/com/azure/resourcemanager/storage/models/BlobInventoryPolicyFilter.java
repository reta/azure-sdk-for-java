// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * An object that defines the blob inventory rule filter conditions. For 'Blob' definition.objectType all filter
 * properties are applicable, 'blobTypes' is required and others are optional. For 'Container' definition.objectType
 * only prefixMatch is applicable and is optional.
 */
@Fluent
public final class BlobInventoryPolicyFilter {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BlobInventoryPolicyFilter.class);

    /*
     * An array of strings for blob prefixes to be matched.
     */
    @JsonProperty(value = "prefixMatch")
    private List<String> prefixMatch;

    /*
     * An array of predefined enum values. Valid values include blockBlob,
     * appendBlob, pageBlob. Hns accounts does not support pageBlobs. This
     * field is required when definition.objectType property is set to 'Blob'.
     */
    @JsonProperty(value = "blobTypes")
    private List<String> blobTypes;

    /*
     * Includes blob versions in blob inventory when value is set to true. The
     * definition.schemaFields values 'VersionId and IsCurrentVersion' are
     * required if this property is set to true, else they must be excluded.
     */
    @JsonProperty(value = "includeBlobVersions")
    private Boolean includeBlobVersions;

    /*
     * Includes blob snapshots in blob inventory when value is set to true. The
     * definition.schemaFields value 'Snapshot' is required if this property is
     * set to true, else it must be excluded.
     */
    @JsonProperty(value = "includeSnapshots")
    private Boolean includeSnapshots;

    /**
     * Get the prefixMatch property: An array of strings for blob prefixes to be matched.
     *
     * @return the prefixMatch value.
     */
    public List<String> prefixMatch() {
        return this.prefixMatch;
    }

    /**
     * Set the prefixMatch property: An array of strings for blob prefixes to be matched.
     *
     * @param prefixMatch the prefixMatch value to set.
     * @return the BlobInventoryPolicyFilter object itself.
     */
    public BlobInventoryPolicyFilter withPrefixMatch(List<String> prefixMatch) {
        this.prefixMatch = prefixMatch;
        return this;
    }

    /**
     * Get the blobTypes property: An array of predefined enum values. Valid values include blockBlob, appendBlob,
     * pageBlob. Hns accounts does not support pageBlobs. This field is required when definition.objectType property is
     * set to 'Blob'.
     *
     * @return the blobTypes value.
     */
    public List<String> blobTypes() {
        return this.blobTypes;
    }

    /**
     * Set the blobTypes property: An array of predefined enum values. Valid values include blockBlob, appendBlob,
     * pageBlob. Hns accounts does not support pageBlobs. This field is required when definition.objectType property is
     * set to 'Blob'.
     *
     * @param blobTypes the blobTypes value to set.
     * @return the BlobInventoryPolicyFilter object itself.
     */
    public BlobInventoryPolicyFilter withBlobTypes(List<String> blobTypes) {
        this.blobTypes = blobTypes;
        return this;
    }

    /**
     * Get the includeBlobVersions property: Includes blob versions in blob inventory when value is set to true. The
     * definition.schemaFields values 'VersionId and IsCurrentVersion' are required if this property is set to true,
     * else they must be excluded.
     *
     * @return the includeBlobVersions value.
     */
    public Boolean includeBlobVersions() {
        return this.includeBlobVersions;
    }

    /**
     * Set the includeBlobVersions property: Includes blob versions in blob inventory when value is set to true. The
     * definition.schemaFields values 'VersionId and IsCurrentVersion' are required if this property is set to true,
     * else they must be excluded.
     *
     * @param includeBlobVersions the includeBlobVersions value to set.
     * @return the BlobInventoryPolicyFilter object itself.
     */
    public BlobInventoryPolicyFilter withIncludeBlobVersions(Boolean includeBlobVersions) {
        this.includeBlobVersions = includeBlobVersions;
        return this;
    }

    /**
     * Get the includeSnapshots property: Includes blob snapshots in blob inventory when value is set to true. The
     * definition.schemaFields value 'Snapshot' is required if this property is set to true, else it must be excluded.
     *
     * @return the includeSnapshots value.
     */
    public Boolean includeSnapshots() {
        return this.includeSnapshots;
    }

    /**
     * Set the includeSnapshots property: Includes blob snapshots in blob inventory when value is set to true. The
     * definition.schemaFields value 'Snapshot' is required if this property is set to true, else it must be excluded.
     *
     * @param includeSnapshots the includeSnapshots value to set.
     * @return the BlobInventoryPolicyFilter object itself.
     */
    public BlobInventoryPolicyFilter withIncludeSnapshots(Boolean includeSnapshots) {
        this.includeSnapshots = includeSnapshots;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
