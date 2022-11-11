// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.weather.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Returned temperature values. */
@Fluent
public final class WeatherValueYearMaxMinAvg {
    /*
     * Maximum temperature for the time period.
     */
    @JsonProperty(value = "maximum")
    private WeatherValueYear maximum;

    /*
     * Minimum temperature for the time period.
     */
    @JsonProperty(value = "minimum")
    private WeatherValueYear minimum;

    /*
     * Average temperature for the time period.
     */
    @JsonProperty(value = "average")
    private WeatherUnitDetails average;

    /** Set default WeatherValueYearMaxMinAvg constructor to private */
    private WeatherValueYearMaxMinAvg() {}

    /**
     * Get the maximum property: Maximum temperature for the time period.
     *
     * @return the maximum value.
     */
    public WeatherValueYear getMaximum() {
        return this.maximum;
    }

    /**
     * Get the minimum property: Minimum temperature for the time period.
     *
     * @return the minimum value.
     */
    public WeatherValueYear getMinimum() {
        return this.minimum;
    }

    /**
     * Get the average property: Average temperature for the time period.
     *
     * @return the average value.
     */
    public WeatherUnitDetails getAverage() {
        return this.average;
    }
}
