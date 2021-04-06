// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Schema for all properties of Recording Chunk Information. */
@Fluent
public final class AcsRecordingChunkInfoProperties {
    /*
     * The documentId of the recording chunk
     */
    @JsonProperty(value = "documentId")
    private String documentId;

    /*
     * The index of the recording chunk
     */
    @JsonProperty(value = "index")
    private Long index;

    /*
     * The reason for ending the recording chunk
     */
    @JsonProperty(value = "endReason")
    private String endReason;

    /**
     * Get the documentId property: The documentId of the recording chunk.
     *
     * @return the documentId value.
     */
    public String getDocumentId() {
        return this.documentId;
    }

    /**
     * Set the documentId property: The documentId of the recording chunk.
     *
     * @param documentId the documentId value to set.
     * @return the AcsRecordingChunkInfoProperties object itself.
     */
    public AcsRecordingChunkInfoProperties setDocumentId(String documentId) {
        this.documentId = documentId;
        return this;
    }

    /**
     * Get the index property: The index of the recording chunk.
     *
     * @return the index value.
     */
    public Long getIndex() {
        return this.index;
    }

    /**
     * Set the index property: The index of the recording chunk.
     *
     * @param index the index value to set.
     * @return the AcsRecordingChunkInfoProperties object itself.
     */
    public AcsRecordingChunkInfoProperties setIndex(Long index) {
        this.index = index;
        return this;
    }

    /**
     * Get the endReason property: The reason for ending the recording chunk.
     *
     * @return the endReason value.
     */
    public String getEndReason() {
        return this.endReason;
    }

    /**
     * Set the endReason property: The reason for ending the recording chunk.
     *
     * @param endReason the endReason value to set.
     * @return the AcsRecordingChunkInfoProperties object itself.
     */
    public AcsRecordingChunkInfoProperties setEndReason(String endReason) {
        this.endReason = endReason;
        return this;
    }
}
