// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.models.HyperVGenerationTypes;
import com.azure.resourcemanager.compute.models.ImageStorageProfile;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes the properties of an Image. */
@Fluent
public final class ImageProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ImageProperties.class);

    /*
     * The source virtual machine from which Image is created.
     */
    @JsonProperty(value = "sourceVirtualMachine")
    private SubResource sourceVirtualMachine;

    /*
     * Specifies the storage settings for the virtual machine disks.
     */
    @JsonProperty(value = "storageProfile")
    private ImageStorageProfile storageProfile;

    /*
     * The provisioning state.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * Gets the HyperVGenerationType of the VirtualMachine created from the
     * image
     */
    @JsonProperty(value = "hyperVGeneration")
    private HyperVGenerationTypes hyperVGeneration;

    /**
     * Get the sourceVirtualMachine property: The source virtual machine from which Image is created.
     *
     * @return the sourceVirtualMachine value.
     */
    public SubResource sourceVirtualMachine() {
        return this.sourceVirtualMachine;
    }

    /**
     * Set the sourceVirtualMachine property: The source virtual machine from which Image is created.
     *
     * @param sourceVirtualMachine the sourceVirtualMachine value to set.
     * @return the ImageProperties object itself.
     */
    public ImageProperties withSourceVirtualMachine(SubResource sourceVirtualMachine) {
        this.sourceVirtualMachine = sourceVirtualMachine;
        return this;
    }

    /**
     * Get the storageProfile property: Specifies the storage settings for the virtual machine disks.
     *
     * @return the storageProfile value.
     */
    public ImageStorageProfile storageProfile() {
        return this.storageProfile;
    }

    /**
     * Set the storageProfile property: Specifies the storage settings for the virtual machine disks.
     *
     * @param storageProfile the storageProfile value to set.
     * @return the ImageProperties object itself.
     */
    public ImageProperties withStorageProfile(ImageStorageProfile storageProfile) {
        this.storageProfile = storageProfile;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the hyperVGeneration property: Gets the HyperVGenerationType of the VirtualMachine created from the image.
     *
     * @return the hyperVGeneration value.
     */
    public HyperVGenerationTypes hyperVGeneration() {
        return this.hyperVGeneration;
    }

    /**
     * Set the hyperVGeneration property: Gets the HyperVGenerationType of the VirtualMachine created from the image.
     *
     * @param hyperVGeneration the hyperVGeneration value to set.
     * @return the ImageProperties object itself.
     */
    public ImageProperties withHyperVGeneration(HyperVGenerationTypes hyperVGeneration) {
        this.hyperVGeneration = hyperVGeneration;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (storageProfile() != null) {
            storageProfile().validate();
        }
    }
}
