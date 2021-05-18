// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Azure Key Vault secret reference. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AzureKeyVaultSecret")
@Fluent
public final class AzureKeyVaultSecretReference extends SecretBase {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AzureKeyVaultSecretReference.class);

    /*
     * The Azure Key Vault linked service reference.
     */
    @JsonProperty(value = "store", required = true)
    private LinkedServiceReference store;

    /*
     * The name of the secret in Azure Key Vault. Type: string (or Expression
     * with resultType string).
     */
    @JsonProperty(value = "secretName", required = true)
    private Object secretName;

    /*
     * The version of the secret in Azure Key Vault. The default value is the
     * latest version of the secret. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "secretVersion")
    private Object secretVersion;

    /**
     * Get the store property: The Azure Key Vault linked service reference.
     *
     * @return the store value.
     */
    public LinkedServiceReference store() {
        return this.store;
    }

    /**
     * Set the store property: The Azure Key Vault linked service reference.
     *
     * @param store the store value to set.
     * @return the AzureKeyVaultSecretReference object itself.
     */
    public AzureKeyVaultSecretReference withStore(LinkedServiceReference store) {
        this.store = store;
        return this;
    }

    /**
     * Get the secretName property: The name of the secret in Azure Key Vault. Type: string (or Expression with
     * resultType string).
     *
     * @return the secretName value.
     */
    public Object secretName() {
        return this.secretName;
    }

    /**
     * Set the secretName property: The name of the secret in Azure Key Vault. Type: string (or Expression with
     * resultType string).
     *
     * @param secretName the secretName value to set.
     * @return the AzureKeyVaultSecretReference object itself.
     */
    public AzureKeyVaultSecretReference withSecretName(Object secretName) {
        this.secretName = secretName;
        return this;
    }

    /**
     * Get the secretVersion property: The version of the secret in Azure Key Vault. The default value is the latest
     * version of the secret. Type: string (or Expression with resultType string).
     *
     * @return the secretVersion value.
     */
    public Object secretVersion() {
        return this.secretVersion;
    }

    /**
     * Set the secretVersion property: The version of the secret in Azure Key Vault. The default value is the latest
     * version of the secret. Type: string (or Expression with resultType string).
     *
     * @param secretVersion the secretVersion value to set.
     * @return the AzureKeyVaultSecretReference object itself.
     */
    public AzureKeyVaultSecretReference withSecretVersion(Object secretVersion) {
        this.secretVersion = secretVersion;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (store() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property store in model AzureKeyVaultSecretReference"));
        } else {
            store().validate();
        }
        if (secretName() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property secretName in model AzureKeyVaultSecretReference"));
        }
    }
}
