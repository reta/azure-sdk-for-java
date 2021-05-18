// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for PrivateLinkServiceConnectionStatus. */
public enum PrivateLinkServiceConnectionStatus {
    /** Enum value Approved. */
    APPROVED("Approved"),

    /** Enum value Pending. */
    PENDING("Pending"),

    /** Enum value Rejected. */
    REJECTED("Rejected"),

    /** Enum value Disconnected. */
    DISCONNECTED("Disconnected");

    /** The actual serialized value for a PrivateLinkServiceConnectionStatus instance. */
    private final String value;

    PrivateLinkServiceConnectionStatus(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a PrivateLinkServiceConnectionStatus instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed PrivateLinkServiceConnectionStatus object, or null if unable to parse.
     */
    @JsonCreator
    public static PrivateLinkServiceConnectionStatus fromString(String value) {
        PrivateLinkServiceConnectionStatus[] items = PrivateLinkServiceConnectionStatus.values();
        for (PrivateLinkServiceConnectionStatus item : items) {
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
