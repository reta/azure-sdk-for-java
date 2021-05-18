// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The custom resource function definition. */
@Fluent
public final class DataManifestCustomResourceFunctionDefinition {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(DataManifestCustomResourceFunctionDefinition.class);

    /*
     * The function name as it will appear in the policy rule. eg - 'vault'.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The fully qualified control plane resource type that this function
     * represents. eg - 'Microsoft.KeyVault/vaults'.
     */
    @JsonProperty(value = "fullyQualifiedResourceType")
    private String fullyQualifiedResourceType;

    /*
     * The top-level properties that can be selected on the function's output.
     * eg - [ "name", "location" ] if vault().name and vault().location are
     * supported
     */
    @JsonProperty(value = "defaultProperties")
    private List<String> defaultProperties;

    /*
     * A value indicating whether the custom properties within the property bag
     * are allowed. Needs api-version to be specified in the policy rule eg -
     * vault('2019-06-01').
     */
    @JsonProperty(value = "allowCustomProperties")
    private Boolean allowCustomProperties;

    /**
     * Get the name property: The function name as it will appear in the policy rule. eg - 'vault'.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The function name as it will appear in the policy rule. eg - 'vault'.
     *
     * @param name the name value to set.
     * @return the DataManifestCustomResourceFunctionDefinition object itself.
     */
    public DataManifestCustomResourceFunctionDefinition withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the fullyQualifiedResourceType property: The fully qualified control plane resource type that this function
     * represents. eg - 'Microsoft.KeyVault/vaults'.
     *
     * @return the fullyQualifiedResourceType value.
     */
    public String fullyQualifiedResourceType() {
        return this.fullyQualifiedResourceType;
    }

    /**
     * Set the fullyQualifiedResourceType property: The fully qualified control plane resource type that this function
     * represents. eg - 'Microsoft.KeyVault/vaults'.
     *
     * @param fullyQualifiedResourceType the fullyQualifiedResourceType value to set.
     * @return the DataManifestCustomResourceFunctionDefinition object itself.
     */
    public DataManifestCustomResourceFunctionDefinition withFullyQualifiedResourceType(
        String fullyQualifiedResourceType) {
        this.fullyQualifiedResourceType = fullyQualifiedResourceType;
        return this;
    }

    /**
     * Get the defaultProperties property: The top-level properties that can be selected on the function's output. eg -
     * [ "name", "location" ] if vault().name and vault().location are supported.
     *
     * @return the defaultProperties value.
     */
    public List<String> defaultProperties() {
        return this.defaultProperties;
    }

    /**
     * Set the defaultProperties property: The top-level properties that can be selected on the function's output. eg -
     * [ "name", "location" ] if vault().name and vault().location are supported.
     *
     * @param defaultProperties the defaultProperties value to set.
     * @return the DataManifestCustomResourceFunctionDefinition object itself.
     */
    public DataManifestCustomResourceFunctionDefinition withDefaultProperties(List<String> defaultProperties) {
        this.defaultProperties = defaultProperties;
        return this;
    }

    /**
     * Get the allowCustomProperties property: A value indicating whether the custom properties within the property bag
     * are allowed. Needs api-version to be specified in the policy rule eg - vault('2019-06-01').
     *
     * @return the allowCustomProperties value.
     */
    public Boolean allowCustomProperties() {
        return this.allowCustomProperties;
    }

    /**
     * Set the allowCustomProperties property: A value indicating whether the custom properties within the property bag
     * are allowed. Needs api-version to be specified in the policy rule eg - vault('2019-06-01').
     *
     * @param allowCustomProperties the allowCustomProperties value to set.
     * @return the DataManifestCustomResourceFunctionDefinition object itself.
     */
    public DataManifestCustomResourceFunctionDefinition withAllowCustomProperties(Boolean allowCustomProperties) {
        this.allowCustomProperties = allowCustomProperties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
