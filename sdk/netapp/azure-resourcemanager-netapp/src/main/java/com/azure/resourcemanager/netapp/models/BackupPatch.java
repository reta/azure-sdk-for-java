// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Map;

/** Backup patch. */
@JsonFlatten
@Fluent
public class BackupPatch {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BackupPatch.class);

    /*
     * Resource tags
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /*
     * UUID v4 used to identify the Backup
     */
    @JsonProperty(value = "properties.backupId", access = JsonProperty.Access.WRITE_ONLY)
    private String backupId;

    /*
     * The creation date of the backup
     */
    @JsonProperty(value = "properties.creationDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime creationDate;

    /*
     * Azure lifecycle management
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * Size of backup
     */
    @JsonProperty(value = "properties.size", access = JsonProperty.Access.WRITE_ONLY)
    private Long size;

    /*
     * Label for backup
     */
    @JsonProperty(value = "properties.label")
    private String label;

    /*
     * Type of backup adhoc or scheduled
     */
    @JsonProperty(value = "properties.backupType", access = JsonProperty.Access.WRITE_ONLY)
    private String backupType;

    /*
     * Failure reason
     */
    @JsonProperty(value = "properties.failureReason", access = JsonProperty.Access.WRITE_ONLY)
    private String failureReason;

    /*
     * Volume name
     */
    @JsonProperty(value = "properties.volumeName", access = JsonProperty.Access.WRITE_ONLY)
    private String volumeName;

    /**
     * Get the tags property: Resource tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Resource tags.
     *
     * @param tags the tags value to set.
     * @return the BackupPatch object itself.
     */
    public BackupPatch withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the backupId property: UUID v4 used to identify the Backup.
     *
     * @return the backupId value.
     */
    public String backupId() {
        return this.backupId;
    }

    /**
     * Get the creationDate property: The creation date of the backup.
     *
     * @return the creationDate value.
     */
    public OffsetDateTime creationDate() {
        return this.creationDate;
    }

    /**
     * Get the provisioningState property: Azure lifecycle management.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the size property: Size of backup.
     *
     * @return the size value.
     */
    public Long size() {
        return this.size;
    }

    /**
     * Get the label property: Label for backup.
     *
     * @return the label value.
     */
    public String label() {
        return this.label;
    }

    /**
     * Set the label property: Label for backup.
     *
     * @param label the label value to set.
     * @return the BackupPatch object itself.
     */
    public BackupPatch withLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * Get the backupType property: Type of backup adhoc or scheduled.
     *
     * @return the backupType value.
     */
    public String backupType() {
        return this.backupType;
    }

    /**
     * Get the failureReason property: Failure reason.
     *
     * @return the failureReason value.
     */
    public String failureReason() {
        return this.failureReason;
    }

    /**
     * Get the volumeName property: Volume name.
     *
     * @return the volumeName value.
     */
    public String volumeName() {
        return this.volumeName;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
