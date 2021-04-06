// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.communication.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.communication.fluent.models.CommunicationServiceResourceInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Object that includes an array of CommunicationServices and a possible link for next set. */
@Fluent
public final class CommunicationServiceResourceList {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CommunicationServiceResourceList.class);

    /*
     * List of CommunicationService
     */
    @JsonProperty(value = "value")
    private List<CommunicationServiceResourceInner> value;

    /*
     * The URL the client should use to fetch the next page (per server side
     * paging).
     * It's null for now, added for future use.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: List of CommunicationService.
     *
     * @return the value value.
     */
    public List<CommunicationServiceResourceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of CommunicationService.
     *
     * @param value the value value to set.
     * @return the CommunicationServiceResourceList object itself.
     */
    public CommunicationServiceResourceList withValue(List<CommunicationServiceResourceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL the client should use to fetch the next page (per server side paging). It's
     * null for now, added for future use.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URL the client should use to fetch the next page (per server side paging). It's
     * null for now, added for future use.
     *
     * @param nextLink the nextLink value to set.
     * @return the CommunicationServiceResourceList object itself.
     */
    public CommunicationServiceResourceList withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
