// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dns.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.dns.models.ZoneType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Represents the properties of the zone. */
@Fluent
public final class ZoneProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ZoneProperties.class);

    /*
     * The maximum number of record sets that can be created in this DNS zone.
     * This is a read-only property and any attempt to set this value will be
     * ignored.
     */
    @JsonProperty(value = "maxNumberOfRecordSets")
    private Long maxNumberOfRecordSets;

    /*
     * The maximum number of records per record set that can be created in this
     * DNS zone.  This is a read-only property and any attempt to set this
     * value will be ignored.
     */
    @JsonProperty(value = "maxNumberOfRecordsPerRecordSet", access = JsonProperty.Access.WRITE_ONLY)
    private Long maxNumberOfRecordsPerRecordSet;

    /*
     * The current number of record sets in this DNS zone.  This is a read-only
     * property and any attempt to set this value will be ignored.
     */
    @JsonProperty(value = "numberOfRecordSets")
    private Long numberOfRecordSets;

    /*
     * The name servers for this DNS zone. This is a read-only property and any
     * attempt to set this value will be ignored.
     */
    @JsonProperty(value = "nameServers", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> nameServers;

    /*
     * The type of this DNS zone (Public or Private).
     */
    @JsonProperty(value = "zoneType")
    private ZoneType zoneType;

    /**
     * Get the maxNumberOfRecordSets property: The maximum number of record sets that can be created in this DNS zone.
     * This is a read-only property and any attempt to set this value will be ignored.
     *
     * @return the maxNumberOfRecordSets value.
     */
    public Long maxNumberOfRecordSets() {
        return this.maxNumberOfRecordSets;
    }

    /**
     * Set the maxNumberOfRecordSets property: The maximum number of record sets that can be created in this DNS zone.
     * This is a read-only property and any attempt to set this value will be ignored.
     *
     * @param maxNumberOfRecordSets the maxNumberOfRecordSets value to set.
     * @return the ZoneProperties object itself.
     */
    public ZoneProperties withMaxNumberOfRecordSets(Long maxNumberOfRecordSets) {
        this.maxNumberOfRecordSets = maxNumberOfRecordSets;
        return this;
    }

    /**
     * Get the maxNumberOfRecordsPerRecordSet property: The maximum number of records per record set that can be created
     * in this DNS zone. This is a read-only property and any attempt to set this value will be ignored.
     *
     * @return the maxNumberOfRecordsPerRecordSet value.
     */
    public Long maxNumberOfRecordsPerRecordSet() {
        return this.maxNumberOfRecordsPerRecordSet;
    }

    /**
     * Get the numberOfRecordSets property: The current number of record sets in this DNS zone. This is a read-only
     * property and any attempt to set this value will be ignored.
     *
     * @return the numberOfRecordSets value.
     */
    public Long numberOfRecordSets() {
        return this.numberOfRecordSets;
    }

    /**
     * Set the numberOfRecordSets property: The current number of record sets in this DNS zone. This is a read-only
     * property and any attempt to set this value will be ignored.
     *
     * @param numberOfRecordSets the numberOfRecordSets value to set.
     * @return the ZoneProperties object itself.
     */
    public ZoneProperties withNumberOfRecordSets(Long numberOfRecordSets) {
        this.numberOfRecordSets = numberOfRecordSets;
        return this;
    }

    /**
     * Get the nameServers property: The name servers for this DNS zone. This is a read-only property and any attempt to
     * set this value will be ignored.
     *
     * @return the nameServers value.
     */
    public List<String> nameServers() {
        return this.nameServers;
    }

    /**
     * Get the zoneType property: The type of this DNS zone (Public or Private).
     *
     * @return the zoneType value.
     */
    public ZoneType zoneType() {
        return this.zoneType;
    }

    /**
     * Set the zoneType property: The type of this DNS zone (Public or Private).
     *
     * @param zoneType the zoneType value to set.
     * @return the ZoneProperties object itself.
     */
    public ZoneProperties withZoneType(ZoneType zoneType) {
        this.zoneType = zoneType;
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
