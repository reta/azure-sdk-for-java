// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Suggested utterances where the detector can be applicable. */
@Fluent
public final class QueryUtterancesResults {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(QueryUtterancesResults.class);

    /*
     * Search Query.
     */
    @JsonProperty(value = "query")
    private String query;

    /*
     * Array of utterance results for search query.
     */
    @JsonProperty(value = "results")
    private List<QueryUtterancesResult> results;

    /**
     * Get the query property: Search Query.
     *
     * @return the query value.
     */
    public String query() {
        return this.query;
    }

    /**
     * Set the query property: Search Query.
     *
     * @param query the query value to set.
     * @return the QueryUtterancesResults object itself.
     */
    public QueryUtterancesResults withQuery(String query) {
        this.query = query;
        return this;
    }

    /**
     * Get the results property: Array of utterance results for search query.
     *
     * @return the results value.
     */
    public List<QueryUtterancesResult> results() {
        return this.results;
    }

    /**
     * Set the results property: Array of utterance results for search query.
     *
     * @param results the results value to set.
     * @return the QueryUtterancesResults object itself.
     */
    public QueryUtterancesResults withResults(List<QueryUtterancesResult> results) {
        this.results = results;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (results() != null) {
            results().forEach(e -> e.validate());
        }
    }
}
