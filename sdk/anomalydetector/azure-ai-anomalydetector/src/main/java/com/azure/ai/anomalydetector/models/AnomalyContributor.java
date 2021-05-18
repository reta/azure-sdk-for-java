// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.anomalydetector.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The AnomalyContributor model. */
@Fluent
public final class AnomalyContributor {
    /*
     * The higher the contribution score is, the more likely the variable to be
     * the root cause of a anomaly.
     */
    @JsonProperty(value = "contributionScore")
    private Float contributionScore;

    /*
     * Variable name of a contributor
     */
    @JsonProperty(value = "variable")
    private String variable;

    /**
     * Get the contributionScore property: The higher the contribution score is, the more likely the variable to be the
     * root cause of a anomaly.
     *
     * @return the contributionScore value.
     */
    public Float getContributionScore() {
        return this.contributionScore;
    }

    /**
     * Set the contributionScore property: The higher the contribution score is, the more likely the variable to be the
     * root cause of a anomaly.
     *
     * @param contributionScore the contributionScore value to set.
     * @return the AnomalyContributor object itself.
     */
    public AnomalyContributor setContributionScore(Float contributionScore) {
        this.contributionScore = contributionScore;
        return this;
    }

    /**
     * Get the variable property: Variable name of a contributor.
     *
     * @return the variable value.
     */
    public String getVariable() {
        return this.variable;
    }

    /**
     * Set the variable property: Variable name of a contributor.
     *
     * @param variable the variable value to set.
     * @return the AnomalyContributor object itself.
     */
    public AnomalyContributor setVariable(String variable) {
        this.variable = variable;
        return this;
    }
}
