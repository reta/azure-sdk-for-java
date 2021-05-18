// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.models;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.devtestlabs.fluent.models.LabVirtualMachineInner;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of LabVirtualMachine. */
public interface LabVirtualMachine {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the notes property: The notes of the virtual machine.
     *
     * @return the notes value.
     */
    String notes();

    /**
     * Gets the ownerObjectId property: The object identifier of the owner of the virtual machine.
     *
     * @return the ownerObjectId value.
     */
    String ownerObjectId();

    /**
     * Gets the ownerUserPrincipalName property: The user principal name of the virtual machine owner.
     *
     * @return the ownerUserPrincipalName value.
     */
    String ownerUserPrincipalName();

    /**
     * Gets the createdByUserId property: The object identifier of the creator of the virtual machine.
     *
     * @return the createdByUserId value.
     */
    String createdByUserId();

    /**
     * Gets the createdByUser property: The email address of creator of the virtual machine.
     *
     * @return the createdByUser value.
     */
    String createdByUser();

    /**
     * Gets the createdDate property: The creation date of the virtual machine.
     *
     * @return the createdDate value.
     */
    OffsetDateTime createdDate();

    /**
     * Gets the computeId property: The resource identifier (Microsoft.Compute) of the virtual machine.
     *
     * @return the computeId value.
     */
    String computeId();

    /**
     * Gets the customImageId property: The custom image identifier of the virtual machine.
     *
     * @return the customImageId value.
     */
    String customImageId();

    /**
     * Gets the osType property: The OS type of the virtual machine.
     *
     * @return the osType value.
     */
    String osType();

    /**
     * Gets the size property: The size of the virtual machine.
     *
     * @return the size value.
     */
    String size();

    /**
     * Gets the username property: The user name of the virtual machine.
     *
     * @return the username value.
     */
    String username();

    /**
     * Gets the password property: The password of the virtual machine administrator.
     *
     * @return the password value.
     */
    String password();

    /**
     * Gets the sshKey property: The SSH key of the virtual machine administrator.
     *
     * @return the sshKey value.
     */
    String sshKey();

    /**
     * Gets the isAuthenticationWithSshKey property: Indicates whether this virtual machine uses an SSH key for
     * authentication.
     *
     * @return the isAuthenticationWithSshKey value.
     */
    Boolean isAuthenticationWithSshKey();

    /**
     * Gets the fqdn property: The fully-qualified domain name of the virtual machine.
     *
     * @return the fqdn value.
     */
    String fqdn();

    /**
     * Gets the labSubnetName property: The lab subnet name of the virtual machine.
     *
     * @return the labSubnetName value.
     */
    String labSubnetName();

    /**
     * Gets the labVirtualNetworkId property: The lab virtual network identifier of the virtual machine.
     *
     * @return the labVirtualNetworkId value.
     */
    String labVirtualNetworkId();

    /**
     * Gets the disallowPublicIpAddress property: Indicates whether the virtual machine is to be created without a
     * public IP address.
     *
     * @return the disallowPublicIpAddress value.
     */
    Boolean disallowPublicIpAddress();

    /**
     * Gets the artifacts property: The artifacts to be installed on the virtual machine.
     *
     * @return the artifacts value.
     */
    List<ArtifactInstallProperties> artifacts();

    /**
     * Gets the artifactDeploymentStatus property: The artifact deployment status for the virtual machine.
     *
     * @return the artifactDeploymentStatus value.
     */
    ArtifactDeploymentStatusProperties artifactDeploymentStatus();

    /**
     * Gets the galleryImageReference property: The Microsoft Azure Marketplace image reference of the virtual machine.
     *
     * @return the galleryImageReference value.
     */
    GalleryImageReference galleryImageReference();

    /**
     * Gets the planId property: The id of the plan associated with the virtual machine image.
     *
     * @return the planId value.
     */
    String planId();

    /**
     * Gets the computeVm property: The compute virtual machine properties.
     *
     * @return the computeVm value.
     */
    ComputeVmProperties computeVm();

    /**
     * Gets the networkInterface property: The network interface properties.
     *
     * @return the networkInterface value.
     */
    NetworkInterfaceProperties networkInterface();

    /**
     * Gets the applicableSchedule property: The applicable schedule for the virtual machine.
     *
     * @return the applicableSchedule value.
     */
    ApplicableSchedule applicableSchedule();

    /**
     * Gets the expirationDate property: The expiration date for VM.
     *
     * @return the expirationDate value.
     */
    OffsetDateTime expirationDate();

    /**
     * Gets the allowClaim property: Indicates whether another user can take ownership of the virtual machine.
     *
     * @return the allowClaim value.
     */
    Boolean allowClaim();

    /**
     * Gets the storageType property: Storage type to use for virtual machine (i.e. Standard, Premium).
     *
     * @return the storageType value.
     */
    String storageType();

    /**
     * Gets the virtualMachineCreationSource property: Tells source of creation of lab virtual machine. Output property
     * only.
     *
     * @return the virtualMachineCreationSource value.
     */
    VirtualMachineCreationSource virtualMachineCreationSource();

    /**
     * Gets the environmentId property: The resource ID of the environment that contains this virtual machine, if any.
     *
     * @return the environmentId value.
     */
    String environmentId();

    /**
     * Gets the dataDiskParameters property: New or existing data disks to attach to the virtual machine after creation.
     *
     * @return the dataDiskParameters value.
     */
    List<DataDiskProperties> dataDiskParameters();

    /**
     * Gets the scheduleParameters property: Virtual Machine schedules to be created.
     *
     * @return the scheduleParameters value.
     */
    List<ScheduleCreationParameter> scheduleParameters();

    /**
     * Gets the lastKnownPowerState property: Last known compute power state captured in DTL.
     *
     * @return the lastKnownPowerState value.
     */
    String lastKnownPowerState();

    /**
     * Gets the provisioningState property: The provisioning status of the resource.
     *
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * Gets the uniqueIdentifier property: The unique immutable identifier of a resource (Guid).
     *
     * @return the uniqueIdentifier value.
     */
    String uniqueIdentifier();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the inner com.azure.resourcemanager.devtestlabs.fluent.models.LabVirtualMachineInner object.
     *
     * @return the inner object.
     */
    LabVirtualMachineInner innerModel();

    /** The entirety of the LabVirtualMachine definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithParentResource,
            DefinitionStages.WithCreate {
    }
    /** The LabVirtualMachine definition stages. */
    interface DefinitionStages {
        /** The first stage of the LabVirtualMachine definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the LabVirtualMachine definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(String location);
        }
        /** The stage of the LabVirtualMachine definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, labName.
             *
             * @param resourceGroupName The name of the resource group.
             * @param labName The name of the lab.
             * @return the next definition stage.
             */
            WithCreate withExistingLab(String resourceGroupName, String labName);
        }
        /**
         * The stage of the LabVirtualMachine definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithNotes,
                DefinitionStages.WithOwnerObjectId,
                DefinitionStages.WithOwnerUserPrincipalName,
                DefinitionStages.WithCreatedDate,
                DefinitionStages.WithCustomImageId,
                DefinitionStages.WithSize,
                DefinitionStages.WithUsername,
                DefinitionStages.WithPassword,
                DefinitionStages.WithSshKey,
                DefinitionStages.WithIsAuthenticationWithSshKey,
                DefinitionStages.WithLabSubnetName,
                DefinitionStages.WithLabVirtualNetworkId,
                DefinitionStages.WithDisallowPublicIpAddress,
                DefinitionStages.WithArtifacts,
                DefinitionStages.WithGalleryImageReference,
                DefinitionStages.WithPlanId,
                DefinitionStages.WithNetworkInterface,
                DefinitionStages.WithExpirationDate,
                DefinitionStages.WithAllowClaim,
                DefinitionStages.WithStorageType,
                DefinitionStages.WithEnvironmentId,
                DefinitionStages.WithDataDiskParameters,
                DefinitionStages.WithScheduleParameters {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            LabVirtualMachine create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            LabVirtualMachine create(Context context);
        }
        /** The stage of the LabVirtualMachine definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the LabVirtualMachine definition allowing to specify notes. */
        interface WithNotes {
            /**
             * Specifies the notes property: The notes of the virtual machine..
             *
             * @param notes The notes of the virtual machine.
             * @return the next definition stage.
             */
            WithCreate withNotes(String notes);
        }
        /** The stage of the LabVirtualMachine definition allowing to specify ownerObjectId. */
        interface WithOwnerObjectId {
            /**
             * Specifies the ownerObjectId property: The object identifier of the owner of the virtual machine..
             *
             * @param ownerObjectId The object identifier of the owner of the virtual machine.
             * @return the next definition stage.
             */
            WithCreate withOwnerObjectId(String ownerObjectId);
        }
        /** The stage of the LabVirtualMachine definition allowing to specify ownerUserPrincipalName. */
        interface WithOwnerUserPrincipalName {
            /**
             * Specifies the ownerUserPrincipalName property: The user principal name of the virtual machine owner..
             *
             * @param ownerUserPrincipalName The user principal name of the virtual machine owner.
             * @return the next definition stage.
             */
            WithCreate withOwnerUserPrincipalName(String ownerUserPrincipalName);
        }
        /** The stage of the LabVirtualMachine definition allowing to specify createdDate. */
        interface WithCreatedDate {
            /**
             * Specifies the createdDate property: The creation date of the virtual machine..
             *
             * @param createdDate The creation date of the virtual machine.
             * @return the next definition stage.
             */
            WithCreate withCreatedDate(OffsetDateTime createdDate);
        }
        /** The stage of the LabVirtualMachine definition allowing to specify customImageId. */
        interface WithCustomImageId {
            /**
             * Specifies the customImageId property: The custom image identifier of the virtual machine..
             *
             * @param customImageId The custom image identifier of the virtual machine.
             * @return the next definition stage.
             */
            WithCreate withCustomImageId(String customImageId);
        }
        /** The stage of the LabVirtualMachine definition allowing to specify size. */
        interface WithSize {
            /**
             * Specifies the size property: The size of the virtual machine..
             *
             * @param size The size of the virtual machine.
             * @return the next definition stage.
             */
            WithCreate withSize(String size);
        }
        /** The stage of the LabVirtualMachine definition allowing to specify username. */
        interface WithUsername {
            /**
             * Specifies the username property: The user name of the virtual machine..
             *
             * @param username The user name of the virtual machine.
             * @return the next definition stage.
             */
            WithCreate withUsername(String username);
        }
        /** The stage of the LabVirtualMachine definition allowing to specify password. */
        interface WithPassword {
            /**
             * Specifies the password property: The password of the virtual machine administrator..
             *
             * @param password The password of the virtual machine administrator.
             * @return the next definition stage.
             */
            WithCreate withPassword(String password);
        }
        /** The stage of the LabVirtualMachine definition allowing to specify sshKey. */
        interface WithSshKey {
            /**
             * Specifies the sshKey property: The SSH key of the virtual machine administrator..
             *
             * @param sshKey The SSH key of the virtual machine administrator.
             * @return the next definition stage.
             */
            WithCreate withSshKey(String sshKey);
        }
        /** The stage of the LabVirtualMachine definition allowing to specify isAuthenticationWithSshKey. */
        interface WithIsAuthenticationWithSshKey {
            /**
             * Specifies the isAuthenticationWithSshKey property: Indicates whether this virtual machine uses an SSH key
             * for authentication..
             *
             * @param isAuthenticationWithSshKey Indicates whether this virtual machine uses an SSH key for
             *     authentication.
             * @return the next definition stage.
             */
            WithCreate withIsAuthenticationWithSshKey(Boolean isAuthenticationWithSshKey);
        }
        /** The stage of the LabVirtualMachine definition allowing to specify labSubnetName. */
        interface WithLabSubnetName {
            /**
             * Specifies the labSubnetName property: The lab subnet name of the virtual machine..
             *
             * @param labSubnetName The lab subnet name of the virtual machine.
             * @return the next definition stage.
             */
            WithCreate withLabSubnetName(String labSubnetName);
        }
        /** The stage of the LabVirtualMachine definition allowing to specify labVirtualNetworkId. */
        interface WithLabVirtualNetworkId {
            /**
             * Specifies the labVirtualNetworkId property: The lab virtual network identifier of the virtual machine..
             *
             * @param labVirtualNetworkId The lab virtual network identifier of the virtual machine.
             * @return the next definition stage.
             */
            WithCreate withLabVirtualNetworkId(String labVirtualNetworkId);
        }
        /** The stage of the LabVirtualMachine definition allowing to specify disallowPublicIpAddress. */
        interface WithDisallowPublicIpAddress {
            /**
             * Specifies the disallowPublicIpAddress property: Indicates whether the virtual machine is to be created
             * without a public IP address..
             *
             * @param disallowPublicIpAddress Indicates whether the virtual machine is to be created without a public IP
             *     address.
             * @return the next definition stage.
             */
            WithCreate withDisallowPublicIpAddress(Boolean disallowPublicIpAddress);
        }
        /** The stage of the LabVirtualMachine definition allowing to specify artifacts. */
        interface WithArtifacts {
            /**
             * Specifies the artifacts property: The artifacts to be installed on the virtual machine..
             *
             * @param artifacts The artifacts to be installed on the virtual machine.
             * @return the next definition stage.
             */
            WithCreate withArtifacts(List<ArtifactInstallProperties> artifacts);
        }
        /** The stage of the LabVirtualMachine definition allowing to specify galleryImageReference. */
        interface WithGalleryImageReference {
            /**
             * Specifies the galleryImageReference property: The Microsoft Azure Marketplace image reference of the
             * virtual machine..
             *
             * @param galleryImageReference The Microsoft Azure Marketplace image reference of the virtual machine.
             * @return the next definition stage.
             */
            WithCreate withGalleryImageReference(GalleryImageReference galleryImageReference);
        }
        /** The stage of the LabVirtualMachine definition allowing to specify planId. */
        interface WithPlanId {
            /**
             * Specifies the planId property: The id of the plan associated with the virtual machine image.
             *
             * @param planId The id of the plan associated with the virtual machine image.
             * @return the next definition stage.
             */
            WithCreate withPlanId(String planId);
        }
        /** The stage of the LabVirtualMachine definition allowing to specify networkInterface. */
        interface WithNetworkInterface {
            /**
             * Specifies the networkInterface property: The network interface properties..
             *
             * @param networkInterface The network interface properties.
             * @return the next definition stage.
             */
            WithCreate withNetworkInterface(NetworkInterfaceProperties networkInterface);
        }
        /** The stage of the LabVirtualMachine definition allowing to specify expirationDate. */
        interface WithExpirationDate {
            /**
             * Specifies the expirationDate property: The expiration date for VM..
             *
             * @param expirationDate The expiration date for VM.
             * @return the next definition stage.
             */
            WithCreate withExpirationDate(OffsetDateTime expirationDate);
        }
        /** The stage of the LabVirtualMachine definition allowing to specify allowClaim. */
        interface WithAllowClaim {
            /**
             * Specifies the allowClaim property: Indicates whether another user can take ownership of the virtual
             * machine.
             *
             * @param allowClaim Indicates whether another user can take ownership of the virtual machine.
             * @return the next definition stage.
             */
            WithCreate withAllowClaim(Boolean allowClaim);
        }
        /** The stage of the LabVirtualMachine definition allowing to specify storageType. */
        interface WithStorageType {
            /**
             * Specifies the storageType property: Storage type to use for virtual machine (i.e. Standard, Premium)..
             *
             * @param storageType Storage type to use for virtual machine (i.e. Standard, Premium).
             * @return the next definition stage.
             */
            WithCreate withStorageType(String storageType);
        }
        /** The stage of the LabVirtualMachine definition allowing to specify environmentId. */
        interface WithEnvironmentId {
            /**
             * Specifies the environmentId property: The resource ID of the environment that contains this virtual
             * machine, if any..
             *
             * @param environmentId The resource ID of the environment that contains this virtual machine, if any.
             * @return the next definition stage.
             */
            WithCreate withEnvironmentId(String environmentId);
        }
        /** The stage of the LabVirtualMachine definition allowing to specify dataDiskParameters. */
        interface WithDataDiskParameters {
            /**
             * Specifies the dataDiskParameters property: New or existing data disks to attach to the virtual machine
             * after creation.
             *
             * @param dataDiskParameters New or existing data disks to attach to the virtual machine after creation.
             * @return the next definition stage.
             */
            WithCreate withDataDiskParameters(List<DataDiskProperties> dataDiskParameters);
        }
        /** The stage of the LabVirtualMachine definition allowing to specify scheduleParameters. */
        interface WithScheduleParameters {
            /**
             * Specifies the scheduleParameters property: Virtual Machine schedules to be created.
             *
             * @param scheduleParameters Virtual Machine schedules to be created.
             * @return the next definition stage.
             */
            WithCreate withScheduleParameters(List<ScheduleCreationParameter> scheduleParameters);
        }
    }
    /**
     * Begins update for the LabVirtualMachine resource.
     *
     * @return the stage of resource update.
     */
    LabVirtualMachine.Update update();

    /** The template for LabVirtualMachine update. */
    interface Update extends UpdateStages.WithTags {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        LabVirtualMachine apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        LabVirtualMachine apply(Context context);
    }
    /** The LabVirtualMachine update stages. */
    interface UpdateStages {
        /** The stage of the LabVirtualMachine update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: The tags of the resource..
             *
             * @param tags The tags of the resource.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    LabVirtualMachine refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    LabVirtualMachine refresh(Context context);

    /**
     * Attach a new or existing data disk to virtual machine. This operation can take a while to complete.
     *
     * @param dataDiskProperties Request body for adding a new or existing data disk to a virtual machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void addDataDisk(DataDiskProperties dataDiskProperties);

    /**
     * Attach a new or existing data disk to virtual machine. This operation can take a while to complete.
     *
     * @param dataDiskProperties Request body for adding a new or existing data disk to a virtual machine.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void addDataDisk(DataDiskProperties dataDiskProperties, Context context);

    /**
     * Apply artifacts to virtual machine. This operation can take a while to complete.
     *
     * @param applyArtifactsRequest Request body for applying artifacts to a virtual machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void applyArtifacts(ApplyArtifactsRequest applyArtifactsRequest);

    /**
     * Apply artifacts to virtual machine. This operation can take a while to complete.
     *
     * @param applyArtifactsRequest Request body for applying artifacts to a virtual machine.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void applyArtifacts(ApplyArtifactsRequest applyArtifactsRequest, Context context);

    /**
     * Take ownership of an existing virtual machine This operation can take a while to complete.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void claim();

    /**
     * Take ownership of an existing virtual machine This operation can take a while to complete.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void claim(Context context);

    /**
     * Detach the specified disk from the virtual machine. This operation can take a while to complete.
     *
     * @param detachDataDiskProperties Request body for detaching data disk from a virtual machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void detachDataDisk(DetachDataDiskProperties detachDataDiskProperties);

    /**
     * Detach the specified disk from the virtual machine. This operation can take a while to complete.
     *
     * @param detachDataDiskProperties Request body for detaching data disk from a virtual machine.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void detachDataDisk(DetachDataDiskProperties detachDataDiskProperties, Context context);

    /**
     * Gets a string that represents the contents of the RDP file for the virtual machine.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a string that represents the contents of the RDP file for the virtual machine.
     */
    RdpConnection getRdpFileContents();

    /**
     * Gets a string that represents the contents of the RDP file for the virtual machine.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a string that represents the contents of the RDP file for the virtual machine.
     */
    Response<RdpConnection> getRdpFileContentsWithResponse(Context context);

    /**
     * Lists the applicable start/stop schedules, if any.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return schedules applicable to a virtual machine.
     */
    ApplicableSchedule listApplicableSchedules();

    /**
     * Lists the applicable start/stop schedules, if any.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return schedules applicable to a virtual machine.
     */
    Response<ApplicableSchedule> listApplicableSchedulesWithResponse(Context context);

    /**
     * Redeploy a virtual machine This operation can take a while to complete.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void redeploy();

    /**
     * Redeploy a virtual machine This operation can take a while to complete.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void redeploy(Context context);

    /**
     * Resize Virtual Machine. This operation can take a while to complete.
     *
     * @param resizeLabVirtualMachineProperties Request body for resizing a virtual machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void resize(ResizeLabVirtualMachineProperties resizeLabVirtualMachineProperties);

    /**
     * Resize Virtual Machine. This operation can take a while to complete.
     *
     * @param resizeLabVirtualMachineProperties Request body for resizing a virtual machine.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void resize(ResizeLabVirtualMachineProperties resizeLabVirtualMachineProperties, Context context);

    /**
     * Restart a virtual machine. This operation can take a while to complete.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void restart();

    /**
     * Restart a virtual machine. This operation can take a while to complete.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void restart(Context context);

    /**
     * Start a virtual machine. This operation can take a while to complete.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void start();

    /**
     * Start a virtual machine. This operation can take a while to complete.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void start(Context context);

    /**
     * Stop a virtual machine This operation can take a while to complete.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void stop();

    /**
     * Stop a virtual machine This operation can take a while to complete.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void stop(Context context);

    /**
     * Transfers all data disks attached to the virtual machine to be owned by the current user. This operation can take
     * a while to complete.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void transferDisks();

    /**
     * Transfers all data disks attached to the virtual machine to be owned by the current user. This operation can take
     * a while to complete.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void transferDisks(Context context);

    /**
     * Release ownership of an existing virtual machine This operation can take a while to complete.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void unClaim();

    /**
     * Release ownership of an existing virtual machine This operation can take a while to complete.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void unClaim(Context context);
}
