// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/** The interface for PolicyClient class. */
public interface PolicyClient {
    /**
     * Gets The ID of the target subscription.
     *
     * @return the subscriptionId value.
     */
    String getSubscriptionId();

    /**
     * Gets server parameter.
     *
     * @return the endpoint value.
     */
    String getEndpoint();

    /**
     * Gets Api Version.
     *
     * @return the apiVersion value.
     */
    String getApiVersion();

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    HttpPipeline getHttpPipeline();

    /**
     * Gets The default poll interval for long-running operation.
     *
     * @return the defaultPollInterval value.
     */
    Duration getDefaultPollInterval();

    /**
     * Gets the PolicyDefinitionsClient object to access its operations.
     *
     * @return the PolicyDefinitionsClient object.
     */
    PolicyDefinitionsClient getPolicyDefinitions();

    /**
     * Gets the PolicyAssignmentsClient object to access its operations.
     *
     * @return the PolicyAssignmentsClient object.
     */
    PolicyAssignmentsClient getPolicyAssignments();
}
