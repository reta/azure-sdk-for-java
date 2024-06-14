// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.ai.translation.document;

import com.azure.core.util.ServiceVersion;

/**
 * Service version of DocumentTranslationClient.
 */
public enum DocumentTranslationServiceVersion implements ServiceVersion {
    /**
     * Enum value 2024-05-01.
     */
    V2024_05_01("2024-05-01");

    private final String version;

    DocumentTranslationServiceVersion(String version) {
        this.version = version;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getVersion() {
        return this.version;
    }

    /**
     * Gets the latest service version supported by this client library.
     * 
     * @return The latest {@link DocumentTranslationServiceVersion}.
     */
    public static DocumentTranslationServiceVersion getLatest() {
        return V2024_05_01;
    }
}
