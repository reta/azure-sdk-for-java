// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.IpTag;
import com.azure.resourcemanager.network.models.IpVersion;
import com.azure.resourcemanager.network.models.ReferencedPublicIpAddress;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Public IP prefix properties. */
@Fluent
public final class PublicIpPrefixPropertiesFormat {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PublicIpPrefixPropertiesFormat.class);

    /*
     * The public IP address version. Possible values are: 'IPv4' and 'IPv6'.
     */
    @JsonProperty(value = "publicIPAddressVersion")
    private IpVersion publicIpAddressVersion;

    /*
     * The list of tags associated with the public IP prefix.
     */
    @JsonProperty(value = "ipTags")
    private List<IpTag> ipTags;

    /*
     * The Length of the Public IP Prefix.
     */
    @JsonProperty(value = "prefixLength")
    private Integer prefixLength;

    /*
     * The allocated Prefix
     */
    @JsonProperty(value = "ipPrefix")
    private String ipPrefix;

    /*
     * The list of all referenced PublicIPAddresses
     */
    @JsonProperty(value = "publicIPAddresses")
    private List<ReferencedPublicIpAddress> publicIpAddresses;

    /*
     * The reference to load balancer frontend IP configuration associated with
     * the public IP prefix.
     */
    @JsonProperty(value = "loadBalancerFrontendIpConfiguration", access = JsonProperty.Access.WRITE_ONLY)
    private SubResource loadBalancerFrontendIpConfiguration;

    /*
     * The resource GUID property of the public IP prefix resource.
     */
    @JsonProperty(value = "resourceGuid")
    private String resourceGuid;

    /*
     * The provisioning state of the Public IP prefix resource. Possible values
     * are: 'Updating', 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "provisioningState")
    private String provisioningState;

    /**
     * Get the publicIpAddressVersion property: The public IP address version. Possible values are: 'IPv4' and 'IPv6'.
     *
     * @return the publicIpAddressVersion value.
     */
    public IpVersion publicIpAddressVersion() {
        return this.publicIpAddressVersion;
    }

    /**
     * Set the publicIpAddressVersion property: The public IP address version. Possible values are: 'IPv4' and 'IPv6'.
     *
     * @param publicIpAddressVersion the publicIpAddressVersion value to set.
     * @return the PublicIpPrefixPropertiesFormat object itself.
     */
    public PublicIpPrefixPropertiesFormat withPublicIpAddressVersion(IpVersion publicIpAddressVersion) {
        this.publicIpAddressVersion = publicIpAddressVersion;
        return this;
    }

    /**
     * Get the ipTags property: The list of tags associated with the public IP prefix.
     *
     * @return the ipTags value.
     */
    public List<IpTag> ipTags() {
        return this.ipTags;
    }

    /**
     * Set the ipTags property: The list of tags associated with the public IP prefix.
     *
     * @param ipTags the ipTags value to set.
     * @return the PublicIpPrefixPropertiesFormat object itself.
     */
    public PublicIpPrefixPropertiesFormat withIpTags(List<IpTag> ipTags) {
        this.ipTags = ipTags;
        return this;
    }

    /**
     * Get the prefixLength property: The Length of the Public IP Prefix.
     *
     * @return the prefixLength value.
     */
    public Integer prefixLength() {
        return this.prefixLength;
    }

    /**
     * Set the prefixLength property: The Length of the Public IP Prefix.
     *
     * @param prefixLength the prefixLength value to set.
     * @return the PublicIpPrefixPropertiesFormat object itself.
     */
    public PublicIpPrefixPropertiesFormat withPrefixLength(Integer prefixLength) {
        this.prefixLength = prefixLength;
        return this;
    }

    /**
     * Get the ipPrefix property: The allocated Prefix.
     *
     * @return the ipPrefix value.
     */
    public String ipPrefix() {
        return this.ipPrefix;
    }

    /**
     * Set the ipPrefix property: The allocated Prefix.
     *
     * @param ipPrefix the ipPrefix value to set.
     * @return the PublicIpPrefixPropertiesFormat object itself.
     */
    public PublicIpPrefixPropertiesFormat withIpPrefix(String ipPrefix) {
        this.ipPrefix = ipPrefix;
        return this;
    }

    /**
     * Get the publicIpAddresses property: The list of all referenced PublicIPAddresses.
     *
     * @return the publicIpAddresses value.
     */
    public List<ReferencedPublicIpAddress> publicIpAddresses() {
        return this.publicIpAddresses;
    }

    /**
     * Set the publicIpAddresses property: The list of all referenced PublicIPAddresses.
     *
     * @param publicIpAddresses the publicIpAddresses value to set.
     * @return the PublicIpPrefixPropertiesFormat object itself.
     */
    public PublicIpPrefixPropertiesFormat withPublicIpAddresses(List<ReferencedPublicIpAddress> publicIpAddresses) {
        this.publicIpAddresses = publicIpAddresses;
        return this;
    }

    /**
     * Get the loadBalancerFrontendIpConfiguration property: The reference to load balancer frontend IP configuration
     * associated with the public IP prefix.
     *
     * @return the loadBalancerFrontendIpConfiguration value.
     */
    public SubResource loadBalancerFrontendIpConfiguration() {
        return this.loadBalancerFrontendIpConfiguration;
    }

    /**
     * Get the resourceGuid property: The resource GUID property of the public IP prefix resource.
     *
     * @return the resourceGuid value.
     */
    public String resourceGuid() {
        return this.resourceGuid;
    }

    /**
     * Set the resourceGuid property: The resource GUID property of the public IP prefix resource.
     *
     * @param resourceGuid the resourceGuid value to set.
     * @return the PublicIpPrefixPropertiesFormat object itself.
     */
    public PublicIpPrefixPropertiesFormat withResourceGuid(String resourceGuid) {
        this.resourceGuid = resourceGuid;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the Public IP prefix resource. Possible values are:
     * 'Updating', 'Deleting', and 'Failed'.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: The provisioning state of the Public IP prefix resource. Possible values are:
     * 'Updating', 'Deleting', and 'Failed'.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the PublicIpPrefixPropertiesFormat object itself.
     */
    public PublicIpPrefixPropertiesFormat withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (ipTags() != null) {
            ipTags().forEach(e -> e.validate());
        }
        if (publicIpAddresses() != null) {
            publicIpAddresses().forEach(e -> e.validate());
        }
    }
}
