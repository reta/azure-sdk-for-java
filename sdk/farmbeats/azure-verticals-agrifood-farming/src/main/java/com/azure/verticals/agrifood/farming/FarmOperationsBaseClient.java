// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.verticals.agrifood.farming;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.experimental.http.DynamicRequest;
import com.azure.core.http.HttpMethod;
import com.azure.core.http.HttpPipeline;
import com.azure.core.util.serializer.ObjectSerializer;

/** Initializes a new instance of the FarmOperationsBaseClient type. */
@ServiceClient(builder = FarmBeatsClientBuilder.class)
public final class FarmOperationsBaseClient {
    private final String endpoint;

    private final String apiVersion;

    private final HttpPipeline httpPipeline;

    private final ObjectSerializer serializer;

    /**
     * Initializes an instance of FarmOperationsBaseClient client.
     *
     * @param endpoint The endpoint of your FarmBeats resource (protocol and hostname, for example:
     *     https://{resourceName}.farmbeats.azure.net).
     * @param apiVersion Api Version.
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializer The serializer to serialize an object into a string.
     */
    FarmOperationsBaseClient(
            String endpoint, String apiVersion, HttpPipeline httpPipeline, ObjectSerializer serializer) {
        this.endpoint = endpoint;
        this.apiVersion = apiVersion;
        this.httpPipeline = httpPipeline;
        this.serializer = serializer;
    }

    /**
     * Create a farm operation data ingestion job.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     farmerId: String
     *     authProviderId: String
     *     operations: [
     *         String
     *     ]
     *     startYear: int
     *     id: String
     *     status: String
     *     durationInSeconds: Double
     *     message: String
     *     createdDateTime: OffsetDateTime
     *     lastActionDateTime: OffsetDateTime
     *     startTime: OffsetDateTime
     *     endTime: OffsetDateTime
     *     name: String
     *     description: String
     *     properties: {
     *         String: Object
     *     }
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * (recursive schema, see above)
     * }</pre>
     *
     * @param jobId Job ID supplied by user.
     * @return a DynamicRequest where customizations can be made before sent to the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DynamicRequest createDataIngestionJob(String jobId) {
        return new DynamicRequest(serializer, httpPipeline)
                .setUrl("{Endpoint}/farm-operations/ingest-data/{jobId}")
                .setPathParam("Endpoint", endpoint)
                .setPathParam("jobId", jobId)
                .addQueryParam("api-version", apiVersion)
                .addHeader("Accept", "application/json")
                .addHeader("Content-Type", "application/json")
                .setHttpMethod(HttpMethod.PUT);
    }

    /**
     * Get a farm operation data ingestion job.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     farmerId: String
     *     authProviderId: String
     *     operations: [
     *         String
     *     ]
     *     startYear: int
     *     id: String
     *     status: String
     *     durationInSeconds: Double
     *     message: String
     *     createdDateTime: OffsetDateTime
     *     lastActionDateTime: OffsetDateTime
     *     startTime: OffsetDateTime
     *     endTime: OffsetDateTime
     *     name: String
     *     description: String
     *     properties: {
     *         String: Object
     *     }
     * }
     * }</pre>
     *
     * @param jobId ID of the job.
     * @return a DynamicRequest where customizations can be made before sent to the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DynamicRequest getDataIngestionJobDetails(String jobId) {
        return new DynamicRequest(serializer, httpPipeline)
                .setUrl("{Endpoint}/farm-operations/ingest-data/{jobId}")
                .setPathParam("Endpoint", endpoint)
                .setPathParam("jobId", jobId)
                .addQueryParam("api-version", apiVersion)
                .addHeader("Accept", "application/json")
                .addHeader("Content-Type", "application/json")
                .setHttpMethod(HttpMethod.GET);
    }

    /**
     * Create an empty DynamicRequest with the serializer and pipeline initialized for this client.
     *
     * @return a DynamicRequest where customizations can be made before sent to the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DynamicRequest invoke() {
        return new DynamicRequest(serializer, httpPipeline);
    }
}
