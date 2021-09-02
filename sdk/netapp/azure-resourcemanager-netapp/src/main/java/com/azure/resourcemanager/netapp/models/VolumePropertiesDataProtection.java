// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** DataProtection DataProtection type volumes include an object containing details of the replication. */
@Fluent
public final class VolumePropertiesDataProtection {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VolumePropertiesDataProtection.class);

    /*
     * Backup Properties
     */
    @JsonProperty(value = "backup")
    private VolumeBackupProperties backup;

    /*
     * Replication properties
     */
    @JsonProperty(value = "replication")
    private ReplicationObject replication;

    /*
     * Snapshot properties.
     */
    @JsonProperty(value = "snapshot")
    private VolumeSnapshotProperties snapshot;

    /**
     * Get the backup property: Backup Properties.
     *
     * @return the backup value.
     */
    public VolumeBackupProperties backup() {
        return this.backup;
    }

    /**
     * Set the backup property: Backup Properties.
     *
     * @param backup the backup value to set.
     * @return the VolumePropertiesDataProtection object itself.
     */
    public VolumePropertiesDataProtection withBackup(VolumeBackupProperties backup) {
        this.backup = backup;
        return this;
    }

    /**
     * Get the replication property: Replication properties.
     *
     * @return the replication value.
     */
    public ReplicationObject replication() {
        return this.replication;
    }

    /**
     * Set the replication property: Replication properties.
     *
     * @param replication the replication value to set.
     * @return the VolumePropertiesDataProtection object itself.
     */
    public VolumePropertiesDataProtection withReplication(ReplicationObject replication) {
        this.replication = replication;
        return this;
    }

    /**
     * Get the snapshot property: Snapshot properties.
     *
     * @return the snapshot value.
     */
    public VolumeSnapshotProperties snapshot() {
        return this.snapshot;
    }

    /**
     * Set the snapshot property: Snapshot properties.
     *
     * @param snapshot the snapshot value to set.
     * @return the VolumePropertiesDataProtection object itself.
     */
    public VolumePropertiesDataProtection withSnapshot(VolumeSnapshotProperties snapshot) {
        this.snapshot = snapshot;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (backup() != null) {
            backup().validate();
        }
        if (replication() != null) {
            replication().validate();
        }
        if (snapshot() != null) {
            snapshot().validate();
        }
    }
}
