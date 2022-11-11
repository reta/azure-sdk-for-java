// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.weather.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The DailyHistoricalNormalsResult model. */
@Fluent
public final class DailyHistoricalNormalsResult {
    /*
     * Historical normals for each requested day.
     */
    @JsonProperty(value = "results")
    private List<DailyHistoricalNormals> historicalNormals;

    /*
     * The is the link to the next page of the features returned. If it's the last page, no this field.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /** Set default DailyHistoricalNormalsResult constructor to private */
    private DailyHistoricalNormalsResult() {}

    /**
     * Get the historicalNormals property: Historical normals for each requested day.
     *
     * @return the historicalNormals value.
     */
    public List<DailyHistoricalNormals> getHistoricalNormals() {
        return this.historicalNormals;
    }

    /**
     * Get the nextLink property: The is the link to the next page of the features returned. If it's the last page, no
     * this field.
     *
     * @return the nextLink value.
     */
    public String getNextLink() {
        return this.nextLink;
    }
}
