// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.containerservice.models.OrchestratorVersionProfile;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The properties of an orchestrator version profile. */
@Fluent
public final class OrchestratorVersionProfileProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OrchestratorVersionProfileProperties.class);

    /*
     * List of orchestrator version profiles.
     */
    @JsonProperty(value = "orchestrators", required = true)
    private List<OrchestratorVersionProfile> orchestrators;

    /**
     * Get the orchestrators property: List of orchestrator version profiles.
     *
     * @return the orchestrators value.
     */
    public List<OrchestratorVersionProfile> orchestrators() {
        return this.orchestrators;
    }

    /**
     * Set the orchestrators property: List of orchestrator version profiles.
     *
     * @param orchestrators the orchestrators value to set.
     * @return the OrchestratorVersionProfileProperties object itself.
     */
    public OrchestratorVersionProfileProperties withOrchestrators(List<OrchestratorVersionProfile> orchestrators) {
        this.orchestrators = orchestrators;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (orchestrators() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property orchestrators in model OrchestratorVersionProfileProperties"));
        } else {
            orchestrators().forEach(e -> e.validate());
        }
    }
}
