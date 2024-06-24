// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callautomation.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Configuration of Media streaming. */
@Fluent
public final class MediaStreamingConfigurationInternal {
    /*
     * Transport URL for media streaming
     */
    @JsonProperty(value = "transportUrl", required = true)
    private String transportUrl;

    /*
     * The type of transport to be used for media streaming, eg. Websocket
     */
    @JsonProperty(value = "transportType", required = true)
    private MediaStreamingTransportTypeInternal transportType;

    /*
     * Content type to stream, eg. audio
     */
    @JsonProperty(value = "contentType", required = true)
    private MediaStreamingContentTypeInternal contentType;

    /*
     * Audio channel type to stream, eg. unmixed audio, mixed audio
     */
    @JsonProperty(value = "audioChannelType", required = true)
    private MediaStreamingAudioChannelTypeInternal audioChannelType;

    /*
     * Determines if the media streaming should be started immediately after
     * call is answered or not.
     */
    @JsonProperty(value = "startMediaStreaming")
    private Boolean startMediaStreaming;

    /**
     * Get the transportUrl property: Transport URL for media streaming.
     *
     * @return the transportUrl value.
     */
    public String getTransportUrl() {
        return this.transportUrl;
    }

    /**
     * Set the transportUrl property: Transport URL for media streaming.
     *
     * @param transportUrl the transportUrl value to set.
     * @return the MediaStreamingConfigurationInternal object itself.
     */
    public MediaStreamingConfigurationInternal setTransportUrl(String transportUrl) {
        this.transportUrl = transportUrl;
        return this;
    }

    /**
     * Get the transportType property: The type of transport to be used for media streaming, eg. Websocket.
     *
     * @return the transportType value.
     */
    public MediaStreamingTransportTypeInternal getTransportType() {
        return this.transportType;
    }

    /**
     * Set the transportType property: The type of transport to be used for media streaming, eg. Websocket.
     *
     * @param transportType the transportType value to set.
     * @return the MediaStreamingConfigurationInternal object itself.
     */
    public MediaStreamingConfigurationInternal setTransportType(MediaStreamingTransportTypeInternal transportType) {
        this.transportType = transportType;
        return this;
    }

    /**
     * Get the contentType property: Content type to stream, eg. audio.
     *
     * @return the contentType value.
     */
    public MediaStreamingContentTypeInternal getContentType() {
        return this.contentType;
    }

    /**
     * Set the contentType property: Content type to stream, eg. audio.
     *
     * @param contentType the contentType value to set.
     * @return the MediaStreamingConfigurationInternal object itself.
     */
    public MediaStreamingConfigurationInternal setContentType(MediaStreamingContentTypeInternal contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * Get the audioChannelType property: Audio channel type to stream, eg. unmixed audio, mixed audio.
     *
     * @return the audioChannelType value.
     */
    public MediaStreamingAudioChannelTypeInternal getAudioChannelType() {
        return this.audioChannelType;
    }

    /**
     * Set the audioChannelType property: Audio channel type to stream, eg. unmixed audio, mixed audio.
     *
     * @param audioChannelType the audioChannelType value to set.
     * @return the MediaStreamingConfigurationInternal object itself.
     */
    public MediaStreamingConfigurationInternal setAudioChannelType(
            MediaStreamingAudioChannelTypeInternal audioChannelType) {
        this.audioChannelType = audioChannelType;
        return this;
    }

    /**
     * Get the startMediaStreaming property: Determines if the media streaming should be started immediately after call
     * is answered or not.
     *
     * @return the startMediaStreaming value.
     */
    public Boolean isStartMediaStreaming() {
        return this.startMediaStreaming;
    }

    /**
     * Set the startMediaStreaming property: Determines if the media streaming should be started immediately after call
     * is answered or not.
     *
     * @param startMediaStreaming the startMediaStreaming value to set.
     * @return the MediaStreamingConfigurationInternal object itself.
     */
    public MediaStreamingConfigurationInternal setStartMediaStreaming(Boolean startMediaStreaming) {
        this.startMediaStreaming = startMediaStreaming;
        return this;
    }
}
