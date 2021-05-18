// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Server properties for Oracle, MySQL type source. */
@Immutable
public final class ServerProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ServerProperties.class);

    /*
     * Name of the server platform
     */
    @JsonProperty(value = "serverPlatform", access = JsonProperty.Access.WRITE_ONLY)
    private String serverPlatform;

    /*
     * Name of the server
     */
    @JsonProperty(value = "serverName", access = JsonProperty.Access.WRITE_ONLY)
    private String serverName;

    /*
     * Version of the database server
     */
    @JsonProperty(value = "serverVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String serverVersion;

    /*
     * Edition of the database server
     */
    @JsonProperty(value = "serverEdition", access = JsonProperty.Access.WRITE_ONLY)
    private String serverEdition;

    /*
     * Version of the operating system
     */
    @JsonProperty(value = "serverOperatingSystemVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String serverOperatingSystemVersion;

    /*
     * Number of databases in the server
     */
    @JsonProperty(value = "serverDatabaseCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer serverDatabaseCount;

    /**
     * Get the serverPlatform property: Name of the server platform.
     *
     * @return the serverPlatform value.
     */
    public String serverPlatform() {
        return this.serverPlatform;
    }

    /**
     * Get the serverName property: Name of the server.
     *
     * @return the serverName value.
     */
    public String serverName() {
        return this.serverName;
    }

    /**
     * Get the serverVersion property: Version of the database server.
     *
     * @return the serverVersion value.
     */
    public String serverVersion() {
        return this.serverVersion;
    }

    /**
     * Get the serverEdition property: Edition of the database server.
     *
     * @return the serverEdition value.
     */
    public String serverEdition() {
        return this.serverEdition;
    }

    /**
     * Get the serverOperatingSystemVersion property: Version of the operating system.
     *
     * @return the serverOperatingSystemVersion value.
     */
    public String serverOperatingSystemVersion() {
        return this.serverOperatingSystemVersion;
    }

    /**
     * Get the serverDatabaseCount property: Number of databases in the server.
     *
     * @return the serverDatabaseCount value.
     */
    public Integer serverDatabaseCount() {
        return this.serverDatabaseCount;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
