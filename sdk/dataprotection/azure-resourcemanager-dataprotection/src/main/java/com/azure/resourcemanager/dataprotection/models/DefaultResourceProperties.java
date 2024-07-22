// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Default source properties.
 */
@Immutable
public final class DefaultResourceProperties extends BaseResourceProperties {
    /*
     * Type of the specific object - used for deserializing
     */
    private ResourcePropertiesObjectType objectType = ResourcePropertiesObjectType.DEFAULT_RESOURCE_PROPERTIES;

    /**
     * Creates an instance of DefaultResourceProperties class.
     */
    public DefaultResourceProperties() {
    }

    /**
     * Get the objectType property: Type of the specific object - used for deserializing.
     * 
     * @return the objectType value.
     */
    @Override
    public ResourcePropertiesObjectType objectType() {
        return this.objectType;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("objectType", this.objectType == null ? null : this.objectType.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DefaultResourceProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DefaultResourceProperties if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the DefaultResourceProperties.
     */
    public static DefaultResourceProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DefaultResourceProperties deserializedDefaultResourceProperties = new DefaultResourceProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("objectType".equals(fieldName)) {
                    deserializedDefaultResourceProperties.objectType
                        = ResourcePropertiesObjectType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDefaultResourceProperties;
        });
    }
}
