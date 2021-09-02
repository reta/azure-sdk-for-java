// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.models.AutomaticOSUpgradeProperties;
import com.azure.resourcemanager.compute.models.DataDiskImage;
import com.azure.resourcemanager.compute.models.DisallowedConfiguration;
import com.azure.resourcemanager.compute.models.ExtendedLocation;
import com.azure.resourcemanager.compute.models.HyperVGenerationTypes;
import com.azure.resourcemanager.compute.models.OSDiskImage;
import com.azure.resourcemanager.compute.models.PurchasePlan;
import com.azure.resourcemanager.compute.models.VirtualMachineImageFeature;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Describes a Virtual Machine Image. */
@Fluent
public final class VirtualMachineImageInner extends VirtualMachineImageResourceInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualMachineImageInner.class);

    /*
     * Describes the properties of a Virtual Machine Image.
     */
    @JsonProperty(value = "properties")
    private VirtualMachineImageProperties innerProperties;

    /**
     * Get the innerProperties property: Describes the properties of a Virtual Machine Image.
     *
     * @return the innerProperties value.
     */
    private VirtualMachineImageProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public VirtualMachineImageInner withName(String name) {
        super.withName(name);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VirtualMachineImageInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VirtualMachineImageInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VirtualMachineImageInner withExtendedLocation(ExtendedLocation extendedLocation) {
        super.withExtendedLocation(extendedLocation);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VirtualMachineImageInner withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the plan property: Used for establishing the purchase context of any 3rd Party artifact through MarketPlace.
     *
     * @return the plan value.
     */
    public PurchasePlan plan() {
        return this.innerProperties() == null ? null : this.innerProperties().plan();
    }

    /**
     * Set the plan property: Used for establishing the purchase context of any 3rd Party artifact through MarketPlace.
     *
     * @param plan the plan value to set.
     * @return the VirtualMachineImageInner object itself.
     */
    public VirtualMachineImageInner withPlan(PurchasePlan plan) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineImageProperties();
        }
        this.innerProperties().withPlan(plan);
        return this;
    }

    /**
     * Get the osDiskImage property: Contains the os disk image information.
     *
     * @return the osDiskImage value.
     */
    public OSDiskImage osDiskImage() {
        return this.innerProperties() == null ? null : this.innerProperties().osDiskImage();
    }

    /**
     * Set the osDiskImage property: Contains the os disk image information.
     *
     * @param osDiskImage the osDiskImage value to set.
     * @return the VirtualMachineImageInner object itself.
     */
    public VirtualMachineImageInner withOsDiskImage(OSDiskImage osDiskImage) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineImageProperties();
        }
        this.innerProperties().withOsDiskImage(osDiskImage);
        return this;
    }

    /**
     * Get the dataDiskImages property: The dataDiskImages property.
     *
     * @return the dataDiskImages value.
     */
    public List<DataDiskImage> dataDiskImages() {
        return this.innerProperties() == null ? null : this.innerProperties().dataDiskImages();
    }

    /**
     * Set the dataDiskImages property: The dataDiskImages property.
     *
     * @param dataDiskImages the dataDiskImages value to set.
     * @return the VirtualMachineImageInner object itself.
     */
    public VirtualMachineImageInner withDataDiskImages(List<DataDiskImage> dataDiskImages) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineImageProperties();
        }
        this.innerProperties().withDataDiskImages(dataDiskImages);
        return this;
    }

    /**
     * Get the automaticOSUpgradeProperties property: Describes automatic OS upgrade properties on the image.
     *
     * @return the automaticOSUpgradeProperties value.
     */
    public AutomaticOSUpgradeProperties automaticOSUpgradeProperties() {
        return this.innerProperties() == null ? null : this.innerProperties().automaticOSUpgradeProperties();
    }

    /**
     * Set the automaticOSUpgradeProperties property: Describes automatic OS upgrade properties on the image.
     *
     * @param automaticOSUpgradeProperties the automaticOSUpgradeProperties value to set.
     * @return the VirtualMachineImageInner object itself.
     */
    public VirtualMachineImageInner withAutomaticOSUpgradeProperties(
        AutomaticOSUpgradeProperties automaticOSUpgradeProperties) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineImageProperties();
        }
        this.innerProperties().withAutomaticOSUpgradeProperties(automaticOSUpgradeProperties);
        return this;
    }

    /**
     * Get the hyperVGeneration property: Specifies the HyperVGeneration Type.
     *
     * @return the hyperVGeneration value.
     */
    public HyperVGenerationTypes hyperVGeneration() {
        return this.innerProperties() == null ? null : this.innerProperties().hyperVGeneration();
    }

    /**
     * Set the hyperVGeneration property: Specifies the HyperVGeneration Type.
     *
     * @param hyperVGeneration the hyperVGeneration value to set.
     * @return the VirtualMachineImageInner object itself.
     */
    public VirtualMachineImageInner withHyperVGeneration(HyperVGenerationTypes hyperVGeneration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineImageProperties();
        }
        this.innerProperties().withHyperVGeneration(hyperVGeneration);
        return this;
    }

    /**
     * Get the disallowed property: Specifies disallowed configuration for the VirtualMachine created from the image.
     *
     * @return the disallowed value.
     */
    public DisallowedConfiguration disallowed() {
        return this.innerProperties() == null ? null : this.innerProperties().disallowed();
    }

    /**
     * Set the disallowed property: Specifies disallowed configuration for the VirtualMachine created from the image.
     *
     * @param disallowed the disallowed value to set.
     * @return the VirtualMachineImageInner object itself.
     */
    public VirtualMachineImageInner withDisallowed(DisallowedConfiguration disallowed) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineImageProperties();
        }
        this.innerProperties().withDisallowed(disallowed);
        return this;
    }

    /**
     * Get the features property: The features property.
     *
     * @return the features value.
     */
    public List<VirtualMachineImageFeature> features() {
        return this.innerProperties() == null ? null : this.innerProperties().features();
    }

    /**
     * Set the features property: The features property.
     *
     * @param features the features value to set.
     * @return the VirtualMachineImageInner object itself.
     */
    public VirtualMachineImageInner withFeatures(List<VirtualMachineImageFeature> features) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineImageProperties();
        }
        this.innerProperties().withFeatures(features);
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
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
