// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.storage.fluent.models.StorageAccountPropertiesUpdateParameters;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The parameters that can be provided when updating the storage account properties. */
@Fluent
public final class StorageAccountUpdateParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(StorageAccountUpdateParameters.class);

    /*
     * Gets or sets the SKU name. Note that the SKU name cannot be updated to
     * Standard_ZRS, Premium_LRS or Premium_ZRS, nor can accounts of those SKU
     * names be updated to any other value.
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /*
     * Gets or sets a list of key value pairs that describe the resource. These
     * tags can be used in viewing and grouping this resource (across resource
     * groups). A maximum of 15 tags can be provided for a resource. Each tag
     * must have a key no greater in length than 128 characters and a value no
     * greater in length than 256 characters.
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /*
     * The identity of the resource.
     */
    @JsonProperty(value = "identity")
    private Identity identity;

    /*
     * The parameters used when updating a storage account.
     */
    @JsonProperty(value = "properties")
    private StorageAccountPropertiesUpdateParameters innerProperties;

    /*
     * Optional. Indicates the type of storage account. Currently only
     * StorageV2 value supported by server.
     */
    @JsonProperty(value = "kind")
    private Kind kind;

    /**
     * Get the sku property: Gets or sets the SKU name. Note that the SKU name cannot be updated to Standard_ZRS,
     * Premium_LRS or Premium_ZRS, nor can accounts of those SKU names be updated to any other value.
     *
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: Gets or sets the SKU name. Note that the SKU name cannot be updated to Standard_ZRS,
     * Premium_LRS or Premium_ZRS, nor can accounts of those SKU names be updated to any other value.
     *
     * @param sku the sku value to set.
     * @return the StorageAccountUpdateParameters object itself.
     */
    public StorageAccountUpdateParameters withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the tags property: Gets or sets a list of key value pairs that describe the resource. These tags can be used
     * in viewing and grouping this resource (across resource groups). A maximum of 15 tags can be provided for a
     * resource. Each tag must have a key no greater in length than 128 characters and a value no greater in length than
     * 256 characters.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Gets or sets a list of key value pairs that describe the resource. These tags can be used
     * in viewing and grouping this resource (across resource groups). A maximum of 15 tags can be provided for a
     * resource. Each tag must have a key no greater in length than 128 characters and a value no greater in length than
     * 256 characters.
     *
     * @param tags the tags value to set.
     * @return the StorageAccountUpdateParameters object itself.
     */
    public StorageAccountUpdateParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the identity property: The identity of the resource.
     *
     * @return the identity value.
     */
    public Identity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The identity of the resource.
     *
     * @param identity the identity value to set.
     * @return the StorageAccountUpdateParameters object itself.
     */
    public StorageAccountUpdateParameters withIdentity(Identity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the innerProperties property: The parameters used when updating a storage account.
     *
     * @return the innerProperties value.
     */
    private StorageAccountPropertiesUpdateParameters innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the kind property: Optional. Indicates the type of storage account. Currently only StorageV2 value supported
     * by server.
     *
     * @return the kind value.
     */
    public Kind kind() {
        return this.kind;
    }

    /**
     * Set the kind property: Optional. Indicates the type of storage account. Currently only StorageV2 value supported
     * by server.
     *
     * @param kind the kind value to set.
     * @return the StorageAccountUpdateParameters object itself.
     */
    public StorageAccountUpdateParameters withKind(Kind kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the customDomain property: Custom domain assigned to the storage account by the user. Name is the CNAME
     * source. Only one custom domain is supported per storage account at this time. To clear the existing custom
     * domain, use an empty string for the custom domain name property.
     *
     * @return the customDomain value.
     */
    public CustomDomain customDomain() {
        return this.innerProperties() == null ? null : this.innerProperties().customDomain();
    }

    /**
     * Set the customDomain property: Custom domain assigned to the storage account by the user. Name is the CNAME
     * source. Only one custom domain is supported per storage account at this time. To clear the existing custom
     * domain, use an empty string for the custom domain name property.
     *
     * @param customDomain the customDomain value to set.
     * @return the StorageAccountUpdateParameters object itself.
     */
    public StorageAccountUpdateParameters withCustomDomain(CustomDomain customDomain) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageAccountPropertiesUpdateParameters();
        }
        this.innerProperties().withCustomDomain(customDomain);
        return this;
    }

    /**
     * Get the encryption property: Provides the encryption settings on the account. The default setting is unencrypted.
     *
     * @return the encryption value.
     */
    public Encryption encryption() {
        return this.innerProperties() == null ? null : this.innerProperties().encryption();
    }

    /**
     * Set the encryption property: Provides the encryption settings on the account. The default setting is unencrypted.
     *
     * @param encryption the encryption value to set.
     * @return the StorageAccountUpdateParameters object itself.
     */
    public StorageAccountUpdateParameters withEncryption(Encryption encryption) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageAccountPropertiesUpdateParameters();
        }
        this.innerProperties().withEncryption(encryption);
        return this;
    }

    /**
     * Get the accessTier property: Required for storage accounts where kind = BlobStorage. The access tier used for
     * billing.
     *
     * @return the accessTier value.
     */
    public AccessTier accessTier() {
        return this.innerProperties() == null ? null : this.innerProperties().accessTier();
    }

    /**
     * Set the accessTier property: Required for storage accounts where kind = BlobStorage. The access tier used for
     * billing.
     *
     * @param accessTier the accessTier value to set.
     * @return the StorageAccountUpdateParameters object itself.
     */
    public StorageAccountUpdateParameters withAccessTier(AccessTier accessTier) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageAccountPropertiesUpdateParameters();
        }
        this.innerProperties().withAccessTier(accessTier);
        return this;
    }

    /**
     * Get the azureFilesIdentityBasedAuthentication property: Provides the identity based authentication settings for
     * Azure Files.
     *
     * @return the azureFilesIdentityBasedAuthentication value.
     */
    public AzureFilesIdentityBasedAuthentication azureFilesIdentityBasedAuthentication() {
        return this.innerProperties() == null ? null : this.innerProperties().azureFilesIdentityBasedAuthentication();
    }

    /**
     * Set the azureFilesIdentityBasedAuthentication property: Provides the identity based authentication settings for
     * Azure Files.
     *
     * @param azureFilesIdentityBasedAuthentication the azureFilesIdentityBasedAuthentication value to set.
     * @return the StorageAccountUpdateParameters object itself.
     */
    public StorageAccountUpdateParameters withAzureFilesIdentityBasedAuthentication(
        AzureFilesIdentityBasedAuthentication azureFilesIdentityBasedAuthentication) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageAccountPropertiesUpdateParameters();
        }
        this.innerProperties().withAzureFilesIdentityBasedAuthentication(azureFilesIdentityBasedAuthentication);
        return this;
    }

    /**
     * Get the enableHttpsTrafficOnly property: Allows https traffic only to storage service if sets to true.
     *
     * @return the enableHttpsTrafficOnly value.
     */
    public Boolean enableHttpsTrafficOnly() {
        return this.innerProperties() == null ? null : this.innerProperties().enableHttpsTrafficOnly();
    }

    /**
     * Set the enableHttpsTrafficOnly property: Allows https traffic only to storage service if sets to true.
     *
     * @param enableHttpsTrafficOnly the enableHttpsTrafficOnly value to set.
     * @return the StorageAccountUpdateParameters object itself.
     */
    public StorageAccountUpdateParameters withEnableHttpsTrafficOnly(Boolean enableHttpsTrafficOnly) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageAccountPropertiesUpdateParameters();
        }
        this.innerProperties().withEnableHttpsTrafficOnly(enableHttpsTrafficOnly);
        return this;
    }

    /**
     * Get the networkRuleSet property: Network rule set.
     *
     * @return the networkRuleSet value.
     */
    public NetworkRuleSet networkRuleSet() {
        return this.innerProperties() == null ? null : this.innerProperties().networkRuleSet();
    }

    /**
     * Set the networkRuleSet property: Network rule set.
     *
     * @param networkRuleSet the networkRuleSet value to set.
     * @return the StorageAccountUpdateParameters object itself.
     */
    public StorageAccountUpdateParameters withNetworkRuleSet(NetworkRuleSet networkRuleSet) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageAccountPropertiesUpdateParameters();
        }
        this.innerProperties().withNetworkRuleSet(networkRuleSet);
        return this;
    }

    /**
     * Get the largeFileSharesState property: Allow large file shares if sets to Enabled. It cannot be disabled once it
     * is enabled.
     *
     * @return the largeFileSharesState value.
     */
    public LargeFileSharesState largeFileSharesState() {
        return this.innerProperties() == null ? null : this.innerProperties().largeFileSharesState();
    }

    /**
     * Set the largeFileSharesState property: Allow large file shares if sets to Enabled. It cannot be disabled once it
     * is enabled.
     *
     * @param largeFileSharesState the largeFileSharesState value to set.
     * @return the StorageAccountUpdateParameters object itself.
     */
    public StorageAccountUpdateParameters withLargeFileSharesState(LargeFileSharesState largeFileSharesState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageAccountPropertiesUpdateParameters();
        }
        this.innerProperties().withLargeFileSharesState(largeFileSharesState);
        return this;
    }

    /**
     * Get the routingPreference property: Maintains information about the network routing choice opted by the user for
     * data transfer.
     *
     * @return the routingPreference value.
     */
    public RoutingPreference routingPreference() {
        return this.innerProperties() == null ? null : this.innerProperties().routingPreference();
    }

    /**
     * Set the routingPreference property: Maintains information about the network routing choice opted by the user for
     * data transfer.
     *
     * @param routingPreference the routingPreference value to set.
     * @return the StorageAccountUpdateParameters object itself.
     */
    public StorageAccountUpdateParameters withRoutingPreference(RoutingPreference routingPreference) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageAccountPropertiesUpdateParameters();
        }
        this.innerProperties().withRoutingPreference(routingPreference);
        return this;
    }

    /**
     * Get the allowBlobPublicAccess property: Allow or disallow public access to all blobs or containers in the storage
     * account. The default interpretation is true for this property.
     *
     * @return the allowBlobPublicAccess value.
     */
    public Boolean allowBlobPublicAccess() {
        return this.innerProperties() == null ? null : this.innerProperties().allowBlobPublicAccess();
    }

    /**
     * Set the allowBlobPublicAccess property: Allow or disallow public access to all blobs or containers in the storage
     * account. The default interpretation is true for this property.
     *
     * @param allowBlobPublicAccess the allowBlobPublicAccess value to set.
     * @return the StorageAccountUpdateParameters object itself.
     */
    public StorageAccountUpdateParameters withAllowBlobPublicAccess(Boolean allowBlobPublicAccess) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageAccountPropertiesUpdateParameters();
        }
        this.innerProperties().withAllowBlobPublicAccess(allowBlobPublicAccess);
        return this;
    }

    /**
     * Get the minimumTlsVersion property: Set the minimum TLS version to be permitted on requests to storage. The
     * default interpretation is TLS 1.0 for this property.
     *
     * @return the minimumTlsVersion value.
     */
    public MinimumTlsVersion minimumTlsVersion() {
        return this.innerProperties() == null ? null : this.innerProperties().minimumTlsVersion();
    }

    /**
     * Set the minimumTlsVersion property: Set the minimum TLS version to be permitted on requests to storage. The
     * default interpretation is TLS 1.0 for this property.
     *
     * @param minimumTlsVersion the minimumTlsVersion value to set.
     * @return the StorageAccountUpdateParameters object itself.
     */
    public StorageAccountUpdateParameters withMinimumTlsVersion(MinimumTlsVersion minimumTlsVersion) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageAccountPropertiesUpdateParameters();
        }
        this.innerProperties().withMinimumTlsVersion(minimumTlsVersion);
        return this;
    }

    /**
     * Get the allowSharedKeyAccess property: Indicates whether the storage account permits requests to be authorized
     * with the account access key via Shared Key. If false, then all requests, including shared access signatures, must
     * be authorized with Azure Active Directory (Azure AD). The default value is null, which is equivalent to true.
     *
     * @return the allowSharedKeyAccess value.
     */
    public Boolean allowSharedKeyAccess() {
        return this.innerProperties() == null ? null : this.innerProperties().allowSharedKeyAccess();
    }

    /**
     * Set the allowSharedKeyAccess property: Indicates whether the storage account permits requests to be authorized
     * with the account access key via Shared Key. If false, then all requests, including shared access signatures, must
     * be authorized with Azure Active Directory (Azure AD). The default value is null, which is equivalent to true.
     *
     * @param allowSharedKeyAccess the allowSharedKeyAccess value to set.
     * @return the StorageAccountUpdateParameters object itself.
     */
    public StorageAccountUpdateParameters withAllowSharedKeyAccess(Boolean allowSharedKeyAccess) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageAccountPropertiesUpdateParameters();
        }
        this.innerProperties().withAllowSharedKeyAccess(allowSharedKeyAccess);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sku() != null) {
            sku().validate();
        }
        if (identity() != null) {
            identity().validate();
        }
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
