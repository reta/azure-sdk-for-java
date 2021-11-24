// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for ProtocolTypes. */
public enum ProtocolTypes {
    /** Enum value Http. */
    HTTP("Http"),

    /** Enum value Https. */
    HTTPS("Https");

    /** The actual serialized value for a ProtocolTypes instance. */
    private final String value;

    ProtocolTypes(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ProtocolTypes instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ProtocolTypes object, or null if unable to parse.
     */
    @JsonCreator
    public static ProtocolTypes fromString(String value) {
        ProtocolTypes[] items = ProtocolTypes.values();
        for (ProtocolTypes item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
