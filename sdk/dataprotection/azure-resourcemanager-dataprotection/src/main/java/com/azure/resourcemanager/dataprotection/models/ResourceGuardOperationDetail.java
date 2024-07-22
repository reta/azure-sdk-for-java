// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * VaultCritical Operation protected by a resource guard.
 */
@Fluent
public final class ResourceGuardOperationDetail implements JsonSerializable<ResourceGuardOperationDetail> {
    /*
     * The vaultCriticalOperation property.
     */
    private String vaultCriticalOperation;

    /*
     * The defaultResourceRequest property.
     */
    private String defaultResourceRequest;

    /**
     * Creates an instance of ResourceGuardOperationDetail class.
     */
    public ResourceGuardOperationDetail() {
    }

    /**
     * Get the vaultCriticalOperation property: The vaultCriticalOperation property.
     * 
     * @return the vaultCriticalOperation value.
     */
    public String vaultCriticalOperation() {
        return this.vaultCriticalOperation;
    }

    /**
     * Set the vaultCriticalOperation property: The vaultCriticalOperation property.
     * 
     * @param vaultCriticalOperation the vaultCriticalOperation value to set.
     * @return the ResourceGuardOperationDetail object itself.
     */
    public ResourceGuardOperationDetail withVaultCriticalOperation(String vaultCriticalOperation) {
        this.vaultCriticalOperation = vaultCriticalOperation;
        return this;
    }

    /**
     * Get the defaultResourceRequest property: The defaultResourceRequest property.
     * 
     * @return the defaultResourceRequest value.
     */
    public String defaultResourceRequest() {
        return this.defaultResourceRequest;
    }

    /**
     * Set the defaultResourceRequest property: The defaultResourceRequest property.
     * 
     * @param defaultResourceRequest the defaultResourceRequest value to set.
     * @return the ResourceGuardOperationDetail object itself.
     */
    public ResourceGuardOperationDetail withDefaultResourceRequest(String defaultResourceRequest) {
        this.defaultResourceRequest = defaultResourceRequest;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("vaultCriticalOperation", this.vaultCriticalOperation);
        jsonWriter.writeStringField("defaultResourceRequest", this.defaultResourceRequest);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ResourceGuardOperationDetail from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ResourceGuardOperationDetail if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ResourceGuardOperationDetail.
     */
    public static ResourceGuardOperationDetail fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ResourceGuardOperationDetail deserializedResourceGuardOperationDetail = new ResourceGuardOperationDetail();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("vaultCriticalOperation".equals(fieldName)) {
                    deserializedResourceGuardOperationDetail.vaultCriticalOperation = reader.getString();
                } else if ("defaultResourceRequest".equals(fieldName)) {
                    deserializedResourceGuardOperationDetail.defaultResourceRequest = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedResourceGuardOperationDetail;
        });
    }
}
