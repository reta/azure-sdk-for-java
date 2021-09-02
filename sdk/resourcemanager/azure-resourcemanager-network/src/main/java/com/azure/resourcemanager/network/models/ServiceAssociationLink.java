// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.fluent.models.ServiceAssociationLinkPropertiesFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** ServiceAssociationLink resource. */
@Fluent
public final class ServiceAssociationLink extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ServiceAssociationLink.class);

    /*
     * Resource navigation link properties format.
     */
    @JsonProperty(value = "properties")
    private ServiceAssociationLinkPropertiesFormat innerProperties;

    /*
     * Name of the resource that is unique within a resource group. This name
     * can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Resource type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * Get the innerProperties property: Resource navigation link properties format.
     *
     * @return the innerProperties value.
     */
    private ServiceAssociationLinkPropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: Name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @param name the name value to set.
     * @return the ServiceAssociationLink object itself.
     */
    public ServiceAssociationLink withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the type property: Resource type.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /** {@inheritDoc} */
    @Override
    public ServiceAssociationLink withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the linkedResourceType property: Resource type of the linked resource.
     *
     * @return the linkedResourceType value.
     */
    public String linkedResourceType() {
        return this.innerProperties() == null ? null : this.innerProperties().linkedResourceType();
    }

    /**
     * Set the linkedResourceType property: Resource type of the linked resource.
     *
     * @param linkedResourceType the linkedResourceType value to set.
     * @return the ServiceAssociationLink object itself.
     */
    public ServiceAssociationLink withLinkedResourceType(String linkedResourceType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ServiceAssociationLinkPropertiesFormat();
        }
        this.innerProperties().withLinkedResourceType(linkedResourceType);
        return this;
    }

    /**
     * Get the link property: Link to the external resource.
     *
     * @return the link value.
     */
    public String link() {
        return this.innerProperties() == null ? null : this.innerProperties().link();
    }

    /**
     * Set the link property: Link to the external resource.
     *
     * @param link the link value to set.
     * @return the ServiceAssociationLink object itself.
     */
    public ServiceAssociationLink withLink(String link) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ServiceAssociationLinkPropertiesFormat();
        }
        this.innerProperties().withLink(link);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the service association link resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the allowDelete property: If true, the resource can be deleted.
     *
     * @return the allowDelete value.
     */
    public Boolean allowDelete() {
        return this.innerProperties() == null ? null : this.innerProperties().allowDelete();
    }

    /**
     * Set the allowDelete property: If true, the resource can be deleted.
     *
     * @param allowDelete the allowDelete value to set.
     * @return the ServiceAssociationLink object itself.
     */
    public ServiceAssociationLink withAllowDelete(Boolean allowDelete) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ServiceAssociationLinkPropertiesFormat();
        }
        this.innerProperties().withAllowDelete(allowDelete);
        return this;
    }

    /**
     * Get the locations property: A list of locations.
     *
     * @return the locations value.
     */
    public List<String> locations() {
        return this.innerProperties() == null ? null : this.innerProperties().locations();
    }

    /**
     * Set the locations property: A list of locations.
     *
     * @param locations the locations value to set.
     * @return the ServiceAssociationLink object itself.
     */
    public ServiceAssociationLink withLocations(List<String> locations) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ServiceAssociationLinkPropertiesFormat();
        }
        this.innerProperties().withLocations(locations);
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
