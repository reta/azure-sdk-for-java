// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policyinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Policy assignment summary. */
@Fluent
public final class PolicyAssignmentSummary {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PolicyAssignmentSummary.class);

    /*
     * Policy assignment ID.
     */
    @JsonProperty(value = "policyAssignmentId")
    private String policyAssignmentId;

    /*
     * Policy set definition ID, if the policy assignment is for a policy set.
     */
    @JsonProperty(value = "policySetDefinitionId")
    private String policySetDefinitionId;

    /*
     * Compliance summary for the policy assignment.
     */
    @JsonProperty(value = "results")
    private SummaryResults results;

    /*
     * Policy definitions summary.
     */
    @JsonProperty(value = "policyDefinitions")
    private List<PolicyDefinitionSummary> policyDefinitions;

    /*
     * Policy definition group summary.
     */
    @JsonProperty(value = "policyGroups")
    private List<PolicyGroupSummary> policyGroups;

    /**
     * Get the policyAssignmentId property: Policy assignment ID.
     *
     * @return the policyAssignmentId value.
     */
    public String policyAssignmentId() {
        return this.policyAssignmentId;
    }

    /**
     * Set the policyAssignmentId property: Policy assignment ID.
     *
     * @param policyAssignmentId the policyAssignmentId value to set.
     * @return the PolicyAssignmentSummary object itself.
     */
    public PolicyAssignmentSummary withPolicyAssignmentId(String policyAssignmentId) {
        this.policyAssignmentId = policyAssignmentId;
        return this;
    }

    /**
     * Get the policySetDefinitionId property: Policy set definition ID, if the policy assignment is for a policy set.
     *
     * @return the policySetDefinitionId value.
     */
    public String policySetDefinitionId() {
        return this.policySetDefinitionId;
    }

    /**
     * Set the policySetDefinitionId property: Policy set definition ID, if the policy assignment is for a policy set.
     *
     * @param policySetDefinitionId the policySetDefinitionId value to set.
     * @return the PolicyAssignmentSummary object itself.
     */
    public PolicyAssignmentSummary withPolicySetDefinitionId(String policySetDefinitionId) {
        this.policySetDefinitionId = policySetDefinitionId;
        return this;
    }

    /**
     * Get the results property: Compliance summary for the policy assignment.
     *
     * @return the results value.
     */
    public SummaryResults results() {
        return this.results;
    }

    /**
     * Set the results property: Compliance summary for the policy assignment.
     *
     * @param results the results value to set.
     * @return the PolicyAssignmentSummary object itself.
     */
    public PolicyAssignmentSummary withResults(SummaryResults results) {
        this.results = results;
        return this;
    }

    /**
     * Get the policyDefinitions property: Policy definitions summary.
     *
     * @return the policyDefinitions value.
     */
    public List<PolicyDefinitionSummary> policyDefinitions() {
        return this.policyDefinitions;
    }

    /**
     * Set the policyDefinitions property: Policy definitions summary.
     *
     * @param policyDefinitions the policyDefinitions value to set.
     * @return the PolicyAssignmentSummary object itself.
     */
    public PolicyAssignmentSummary withPolicyDefinitions(List<PolicyDefinitionSummary> policyDefinitions) {
        this.policyDefinitions = policyDefinitions;
        return this;
    }

    /**
     * Get the policyGroups property: Policy definition group summary.
     *
     * @return the policyGroups value.
     */
    public List<PolicyGroupSummary> policyGroups() {
        return this.policyGroups;
    }

    /**
     * Set the policyGroups property: Policy definition group summary.
     *
     * @param policyGroups the policyGroups value to set.
     * @return the PolicyAssignmentSummary object itself.
     */
    public PolicyAssignmentSummary withPolicyGroups(List<PolicyGroupSummary> policyGroups) {
        this.policyGroups = policyGroups;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (results() != null) {
            results().validate();
        }
        if (policyDefinitions() != null) {
            policyDefinitions().forEach(e -> e.validate());
        }
        if (policyGroups() != null) {
            policyGroups().forEach(e -> e.validate());
        }
    }
}
