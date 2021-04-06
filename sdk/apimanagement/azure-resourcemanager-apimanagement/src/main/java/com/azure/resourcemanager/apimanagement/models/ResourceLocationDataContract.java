// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Resource location data properties. */
@Fluent
public final class ResourceLocationDataContract {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ResourceLocationDataContract.class);

    /*
     * A canonical name for the geographic or physical location.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The city or locality where the resource is located.
     */
    @JsonProperty(value = "city")
    private String city;

    /*
     * The district, state, or province where the resource is located.
     */
    @JsonProperty(value = "district")
    private String district;

    /*
     * The country or region where the resource is located.
     */
    @JsonProperty(value = "countryOrRegion")
    private String countryOrRegion;

    /**
     * Get the name property: A canonical name for the geographic or physical location.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: A canonical name for the geographic or physical location.
     *
     * @param name the name value to set.
     * @return the ResourceLocationDataContract object itself.
     */
    public ResourceLocationDataContract withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the city property: The city or locality where the resource is located.
     *
     * @return the city value.
     */
    public String city() {
        return this.city;
    }

    /**
     * Set the city property: The city or locality where the resource is located.
     *
     * @param city the city value to set.
     * @return the ResourceLocationDataContract object itself.
     */
    public ResourceLocationDataContract withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * Get the district property: The district, state, or province where the resource is located.
     *
     * @return the district value.
     */
    public String district() {
        return this.district;
    }

    /**
     * Set the district property: The district, state, or province where the resource is located.
     *
     * @param district the district value to set.
     * @return the ResourceLocationDataContract object itself.
     */
    public ResourceLocationDataContract withDistrict(String district) {
        this.district = district;
        return this;
    }

    /**
     * Get the countryOrRegion property: The country or region where the resource is located.
     *
     * @return the countryOrRegion value.
     */
    public String countryOrRegion() {
        return this.countryOrRegion;
    }

    /**
     * Set the countryOrRegion property: The country or region where the resource is located.
     *
     * @param countryOrRegion the countryOrRegion value to set.
     * @return the ResourceLocationDataContract object itself.
     */
    public ResourceLocationDataContract withCountryOrRegion(String countryOrRegion) {
        this.countryOrRegion = countryOrRegion;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property name in model ResourceLocationDataContract"));
        }
    }
}
