// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.ApplicationGatewayLoadDistributionAlgorithm;
import com.azure.resourcemanager.network.models.ApplicationGatewayLoadDistributionTarget;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Properties of Load Distribution Policy of an application gateway. */
@Fluent
public final class ApplicationGatewayLoadDistributionPolicyPropertiesFormat {
    @JsonIgnore
    private final ClientLogger logger =
        new ClientLogger(ApplicationGatewayLoadDistributionPolicyPropertiesFormat.class);

    /*
     * Load Distribution Targets resource of an application gateway.
     */
    @JsonProperty(value = "loadDistributionTargets")
    private List<ApplicationGatewayLoadDistributionTarget> loadDistributionTargets;

    /*
     * Load Distribution Targets resource of an application gateway.
     */
    @JsonProperty(value = "loadDistributionAlgorithm")
    private ApplicationGatewayLoadDistributionAlgorithm loadDistributionAlgorithm;

    /*
     * The provisioning state of the Load Distribution Policy resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Get the loadDistributionTargets property: Load Distribution Targets resource of an application gateway.
     *
     * @return the loadDistributionTargets value.
     */
    public List<ApplicationGatewayLoadDistributionTarget> loadDistributionTargets() {
        return this.loadDistributionTargets;
    }

    /**
     * Set the loadDistributionTargets property: Load Distribution Targets resource of an application gateway.
     *
     * @param loadDistributionTargets the loadDistributionTargets value to set.
     * @return the ApplicationGatewayLoadDistributionPolicyPropertiesFormat object itself.
     */
    public ApplicationGatewayLoadDistributionPolicyPropertiesFormat withLoadDistributionTargets(
        List<ApplicationGatewayLoadDistributionTarget> loadDistributionTargets) {
        this.loadDistributionTargets = loadDistributionTargets;
        return this;
    }

    /**
     * Get the loadDistributionAlgorithm property: Load Distribution Targets resource of an application gateway.
     *
     * @return the loadDistributionAlgorithm value.
     */
    public ApplicationGatewayLoadDistributionAlgorithm loadDistributionAlgorithm() {
        return this.loadDistributionAlgorithm;
    }

    /**
     * Set the loadDistributionAlgorithm property: Load Distribution Targets resource of an application gateway.
     *
     * @param loadDistributionAlgorithm the loadDistributionAlgorithm value to set.
     * @return the ApplicationGatewayLoadDistributionPolicyPropertiesFormat object itself.
     */
    public ApplicationGatewayLoadDistributionPolicyPropertiesFormat withLoadDistributionAlgorithm(
        ApplicationGatewayLoadDistributionAlgorithm loadDistributionAlgorithm) {
        this.loadDistributionAlgorithm = loadDistributionAlgorithm;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the Load Distribution Policy resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (loadDistributionTargets() != null) {
            loadDistributionTargets().forEach(e -> e.validate());
        }
    }
}
