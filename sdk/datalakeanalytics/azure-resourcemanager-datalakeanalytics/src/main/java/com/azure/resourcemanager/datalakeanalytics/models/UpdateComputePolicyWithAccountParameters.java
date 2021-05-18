// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakeanalytics.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;

/** The parameters used to update a compute policy while updating a Data Lake Analytics account. */
@JsonFlatten
@Fluent
public class UpdateComputePolicyWithAccountParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(UpdateComputePolicyWithAccountParameters.class);

    /*
     * The unique name of the compute policy to update.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The AAD object identifier for the entity to create a policy for.
     */
    @JsonProperty(value = "properties.objectId")
    private UUID objectId;

    /*
     * The type of AAD object the object identifier refers to.
     */
    @JsonProperty(value = "properties.objectType")
    private AadObjectType objectType;

    /*
     * The maximum degree of parallelism per job this user can use to submit
     * jobs. This property, the min priority per job property, or both must be
     * passed.
     */
    @JsonProperty(value = "properties.maxDegreeOfParallelismPerJob")
    private Integer maxDegreeOfParallelismPerJob;

    /*
     * The minimum priority per job this user can use to submit jobs. This
     * property, the max degree of parallelism per job property, or both must
     * be passed.
     */
    @JsonProperty(value = "properties.minPriorityPerJob")
    private Integer minPriorityPerJob;

    /**
     * Get the name property: The unique name of the compute policy to update.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The unique name of the compute policy to update.
     *
     * @param name the name value to set.
     * @return the UpdateComputePolicyWithAccountParameters object itself.
     */
    public UpdateComputePolicyWithAccountParameters withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the objectId property: The AAD object identifier for the entity to create a policy for.
     *
     * @return the objectId value.
     */
    public UUID objectId() {
        return this.objectId;
    }

    /**
     * Set the objectId property: The AAD object identifier for the entity to create a policy for.
     *
     * @param objectId the objectId value to set.
     * @return the UpdateComputePolicyWithAccountParameters object itself.
     */
    public UpdateComputePolicyWithAccountParameters withObjectId(UUID objectId) {
        this.objectId = objectId;
        return this;
    }

    /**
     * Get the objectType property: The type of AAD object the object identifier refers to.
     *
     * @return the objectType value.
     */
    public AadObjectType objectType() {
        return this.objectType;
    }

    /**
     * Set the objectType property: The type of AAD object the object identifier refers to.
     *
     * @param objectType the objectType value to set.
     * @return the UpdateComputePolicyWithAccountParameters object itself.
     */
    public UpdateComputePolicyWithAccountParameters withObjectType(AadObjectType objectType) {
        this.objectType = objectType;
        return this;
    }

    /**
     * Get the maxDegreeOfParallelismPerJob property: The maximum degree of parallelism per job this user can use to
     * submit jobs. This property, the min priority per job property, or both must be passed.
     *
     * @return the maxDegreeOfParallelismPerJob value.
     */
    public Integer maxDegreeOfParallelismPerJob() {
        return this.maxDegreeOfParallelismPerJob;
    }

    /**
     * Set the maxDegreeOfParallelismPerJob property: The maximum degree of parallelism per job this user can use to
     * submit jobs. This property, the min priority per job property, or both must be passed.
     *
     * @param maxDegreeOfParallelismPerJob the maxDegreeOfParallelismPerJob value to set.
     * @return the UpdateComputePolicyWithAccountParameters object itself.
     */
    public UpdateComputePolicyWithAccountParameters withMaxDegreeOfParallelismPerJob(
        Integer maxDegreeOfParallelismPerJob) {
        this.maxDegreeOfParallelismPerJob = maxDegreeOfParallelismPerJob;
        return this;
    }

    /**
     * Get the minPriorityPerJob property: The minimum priority per job this user can use to submit jobs. This property,
     * the max degree of parallelism per job property, or both must be passed.
     *
     * @return the minPriorityPerJob value.
     */
    public Integer minPriorityPerJob() {
        return this.minPriorityPerJob;
    }

    /**
     * Set the minPriorityPerJob property: The minimum priority per job this user can use to submit jobs. This property,
     * the max degree of parallelism per job property, or both must be passed.
     *
     * @param minPriorityPerJob the minPriorityPerJob value to set.
     * @return the UpdateComputePolicyWithAccountParameters object itself.
     */
    public UpdateComputePolicyWithAccountParameters withMinPriorityPerJob(Integer minPriorityPerJob) {
        this.minPriorityPerJob = minPriorityPerJob;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property name in model UpdateComputePolicyWithAccountParameters"));
        }
    }
}
