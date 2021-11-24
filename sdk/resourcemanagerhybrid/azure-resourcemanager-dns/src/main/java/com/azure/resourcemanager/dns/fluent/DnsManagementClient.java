// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dns.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/** The interface for DnsManagementClient class. */
public interface DnsManagementClient {
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
     * Gets the RecordSetsClient object to access its operations.
     *
     * @return the RecordSetsClient object.
     */
    RecordSetsClient getRecordSets();

    /**
     * Gets the ZonesClient object to access its operations.
     *
     * @return the ZonesClient object.
     */
    ZonesClient getZones();
}
