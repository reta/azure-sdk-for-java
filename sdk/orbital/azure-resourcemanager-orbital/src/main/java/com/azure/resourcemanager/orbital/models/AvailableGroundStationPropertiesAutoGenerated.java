// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.orbital.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties object for Available groundstation. */
@Fluent
public class AvailableGroundStationPropertiesAutoGenerated {
    /*
     * City of ground station.
     */
    @JsonProperty(value = "city")
    private String city;

    /*
     * Ground station provider name.
     */
    @JsonProperty(value = "providerName")
    private String providerName;

    /*
     * Longitude of the ground station in decimal degrees.
     */
    @JsonProperty(value = "longitudeDegrees")
    private Float longitudeDegrees;

    /*
     * Latitude of the ground station in decimal degrees.
     */
    @JsonProperty(value = "latitudeDegrees")
    private Float latitudeDegrees;

    /*
     * Altitude of the ground station.
     */
    @JsonProperty(value = "altitudeMeters")
    private Float altitudeMeters;

    /*
     * Release Status of a ground station.
     */
    @JsonProperty(value = "releaseMode")
    private ReleaseMode releaseMode;

    /**
     * Get the city property: City of ground station.
     *
     * @return the city value.
     */
    public String city() {
        return this.city;
    }

    /**
     * Set the city property: City of ground station.
     *
     * @param city the city value to set.
     * @return the AvailableGroundStationPropertiesAutoGenerated object itself.
     */
    public AvailableGroundStationPropertiesAutoGenerated withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * Get the providerName property: Ground station provider name.
     *
     * @return the providerName value.
     */
    public String providerName() {
        return this.providerName;
    }

    /**
     * Set the providerName property: Ground station provider name.
     *
     * @param providerName the providerName value to set.
     * @return the AvailableGroundStationPropertiesAutoGenerated object itself.
     */
    public AvailableGroundStationPropertiesAutoGenerated withProviderName(String providerName) {
        this.providerName = providerName;
        return this;
    }

    /**
     * Get the longitudeDegrees property: Longitude of the ground station in decimal degrees.
     *
     * @return the longitudeDegrees value.
     */
    public Float longitudeDegrees() {
        return this.longitudeDegrees;
    }

    /**
     * Set the longitudeDegrees property: Longitude of the ground station in decimal degrees.
     *
     * @param longitudeDegrees the longitudeDegrees value to set.
     * @return the AvailableGroundStationPropertiesAutoGenerated object itself.
     */
    public AvailableGroundStationPropertiesAutoGenerated withLongitudeDegrees(Float longitudeDegrees) {
        this.longitudeDegrees = longitudeDegrees;
        return this;
    }

    /**
     * Get the latitudeDegrees property: Latitude of the ground station in decimal degrees.
     *
     * @return the latitudeDegrees value.
     */
    public Float latitudeDegrees() {
        return this.latitudeDegrees;
    }

    /**
     * Set the latitudeDegrees property: Latitude of the ground station in decimal degrees.
     *
     * @param latitudeDegrees the latitudeDegrees value to set.
     * @return the AvailableGroundStationPropertiesAutoGenerated object itself.
     */
    public AvailableGroundStationPropertiesAutoGenerated withLatitudeDegrees(Float latitudeDegrees) {
        this.latitudeDegrees = latitudeDegrees;
        return this;
    }

    /**
     * Get the altitudeMeters property: Altitude of the ground station.
     *
     * @return the altitudeMeters value.
     */
    public Float altitudeMeters() {
        return this.altitudeMeters;
    }

    /**
     * Set the altitudeMeters property: Altitude of the ground station.
     *
     * @param altitudeMeters the altitudeMeters value to set.
     * @return the AvailableGroundStationPropertiesAutoGenerated object itself.
     */
    public AvailableGroundStationPropertiesAutoGenerated withAltitudeMeters(Float altitudeMeters) {
        this.altitudeMeters = altitudeMeters;
        return this;
    }

    /**
     * Get the releaseMode property: Release Status of a ground station.
     *
     * @return the releaseMode value.
     */
    public ReleaseMode releaseMode() {
        return this.releaseMode;
    }

    /**
     * Set the releaseMode property: Release Status of a ground station.
     *
     * @param releaseMode the releaseMode value to set.
     * @return the AvailableGroundStationPropertiesAutoGenerated object itself.
     */
    public AvailableGroundStationPropertiesAutoGenerated withReleaseMode(ReleaseMode releaseMode) {
        this.releaseMode = releaseMode;
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
