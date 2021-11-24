// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.containerservice.models.ContainerServiceAgentPoolProfile;
import com.azure.resourcemanager.containerservice.models.ContainerServiceCustomProfile;
import com.azure.resourcemanager.containerservice.models.ContainerServiceDiagnosticsProfile;
import com.azure.resourcemanager.containerservice.models.ContainerServiceLinuxProfile;
import com.azure.resourcemanager.containerservice.models.ContainerServiceMasterProfile;
import com.azure.resourcemanager.containerservice.models.ContainerServiceOrchestratorProfile;
import com.azure.resourcemanager.containerservice.models.ContainerServicePrincipalProfile;
import com.azure.resourcemanager.containerservice.models.ContainerServiceWindowsProfile;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Container service. */
@Fluent
public final class ContainerServiceInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ContainerServiceInner.class);

    /*
     * Properties of the container service.
     */
    @JsonProperty(value = "properties")
    private ContainerServiceProperties innerProperties;

    /**
     * Get the innerProperties property: Properties of the container service.
     *
     * @return the innerProperties value.
     */
    private ContainerServiceProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public ContainerServiceInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ContainerServiceInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the provisioningState property: The current deployment or provisioning state, which only appears in the
     * response.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the orchestratorProfile property: Profile for the container service orchestrator.
     *
     * @return the orchestratorProfile value.
     */
    public ContainerServiceOrchestratorProfile orchestratorProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().orchestratorProfile();
    }

    /**
     * Set the orchestratorProfile property: Profile for the container service orchestrator.
     *
     * @param orchestratorProfile the orchestratorProfile value to set.
     * @return the ContainerServiceInner object itself.
     */
    public ContainerServiceInner withOrchestratorProfile(ContainerServiceOrchestratorProfile orchestratorProfile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ContainerServiceProperties();
        }
        this.innerProperties().withOrchestratorProfile(orchestratorProfile);
        return this;
    }

    /**
     * Get the customProfile property: Properties to configure a custom container service cluster.
     *
     * @return the customProfile value.
     */
    public ContainerServiceCustomProfile customProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().customProfile();
    }

    /**
     * Set the customProfile property: Properties to configure a custom container service cluster.
     *
     * @param customProfile the customProfile value to set.
     * @return the ContainerServiceInner object itself.
     */
    public ContainerServiceInner withCustomProfile(ContainerServiceCustomProfile customProfile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ContainerServiceProperties();
        }
        this.innerProperties().withCustomProfile(customProfile);
        return this;
    }

    /**
     * Get the servicePrincipalProfile property: Information about a service principal identity for the cluster to use
     * for manipulating Azure APIs. Exact one of secret or keyVaultSecretRef need to be specified.
     *
     * @return the servicePrincipalProfile value.
     */
    public ContainerServicePrincipalProfile servicePrincipalProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().servicePrincipalProfile();
    }

    /**
     * Set the servicePrincipalProfile property: Information about a service principal identity for the cluster to use
     * for manipulating Azure APIs. Exact one of secret or keyVaultSecretRef need to be specified.
     *
     * @param servicePrincipalProfile the servicePrincipalProfile value to set.
     * @return the ContainerServiceInner object itself.
     */
    public ContainerServiceInner withServicePrincipalProfile(ContainerServicePrincipalProfile servicePrincipalProfile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ContainerServiceProperties();
        }
        this.innerProperties().withServicePrincipalProfile(servicePrincipalProfile);
        return this;
    }

    /**
     * Get the masterProfile property: Profile for the container service master.
     *
     * @return the masterProfile value.
     */
    public ContainerServiceMasterProfile masterProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().masterProfile();
    }

    /**
     * Set the masterProfile property: Profile for the container service master.
     *
     * @param masterProfile the masterProfile value to set.
     * @return the ContainerServiceInner object itself.
     */
    public ContainerServiceInner withMasterProfile(ContainerServiceMasterProfile masterProfile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ContainerServiceProperties();
        }
        this.innerProperties().withMasterProfile(masterProfile);
        return this;
    }

    /**
     * Get the agentPoolProfiles property: Properties of the agent pool.
     *
     * @return the agentPoolProfiles value.
     */
    public List<ContainerServiceAgentPoolProfile> agentPoolProfiles() {
        return this.innerProperties() == null ? null : this.innerProperties().agentPoolProfiles();
    }

    /**
     * Set the agentPoolProfiles property: Properties of the agent pool.
     *
     * @param agentPoolProfiles the agentPoolProfiles value to set.
     * @return the ContainerServiceInner object itself.
     */
    public ContainerServiceInner withAgentPoolProfiles(List<ContainerServiceAgentPoolProfile> agentPoolProfiles) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ContainerServiceProperties();
        }
        this.innerProperties().withAgentPoolProfiles(agentPoolProfiles);
        return this;
    }

    /**
     * Get the windowsProfile property: Profile for Windows VMs in the container service cluster.
     *
     * @return the windowsProfile value.
     */
    public ContainerServiceWindowsProfile windowsProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().windowsProfile();
    }

    /**
     * Set the windowsProfile property: Profile for Windows VMs in the container service cluster.
     *
     * @param windowsProfile the windowsProfile value to set.
     * @return the ContainerServiceInner object itself.
     */
    public ContainerServiceInner withWindowsProfile(ContainerServiceWindowsProfile windowsProfile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ContainerServiceProperties();
        }
        this.innerProperties().withWindowsProfile(windowsProfile);
        return this;
    }

    /**
     * Get the linuxProfile property: Profile for Linux VMs in the container service cluster.
     *
     * @return the linuxProfile value.
     */
    public ContainerServiceLinuxProfile linuxProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().linuxProfile();
    }

    /**
     * Set the linuxProfile property: Profile for Linux VMs in the container service cluster.
     *
     * @param linuxProfile the linuxProfile value to set.
     * @return the ContainerServiceInner object itself.
     */
    public ContainerServiceInner withLinuxProfile(ContainerServiceLinuxProfile linuxProfile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ContainerServiceProperties();
        }
        this.innerProperties().withLinuxProfile(linuxProfile);
        return this;
    }

    /**
     * Get the diagnosticsProfile property: Profile for diagnostics in the container service cluster.
     *
     * @return the diagnosticsProfile value.
     */
    public ContainerServiceDiagnosticsProfile diagnosticsProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().diagnosticsProfile();
    }

    /**
     * Set the diagnosticsProfile property: Profile for diagnostics in the container service cluster.
     *
     * @param diagnosticsProfile the diagnosticsProfile value to set.
     * @return the ContainerServiceInner object itself.
     */
    public ContainerServiceInner withDiagnosticsProfile(ContainerServiceDiagnosticsProfile diagnosticsProfile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ContainerServiceProperties();
        }
        this.innerProperties().withDiagnosticsProfile(diagnosticsProfile);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
