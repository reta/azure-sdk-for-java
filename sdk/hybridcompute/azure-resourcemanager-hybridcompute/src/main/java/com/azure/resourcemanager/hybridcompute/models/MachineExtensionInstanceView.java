// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Describes the Machine Extension Instance View.
 */
@Fluent
public final class MachineExtensionInstanceView implements JsonSerializable<MachineExtensionInstanceView> {
    /*
     * The machine extension name.
     */
    private String name;

    /*
     * Specifies the type of the extension; an example is "CustomScriptExtension".
     */
    private String type;

    /*
     * Specifies the version of the script handler.
     */
    private String typeHandlerVersion;

    /*
     * Instance view status.
     */
    private MachineExtensionInstanceViewStatus status;

    /**
     * Creates an instance of MachineExtensionInstanceView class.
     */
    public MachineExtensionInstanceView() {
    }

    /**
     * Get the name property: The machine extension name.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The machine extension name.
     * 
     * @param name the name value to set.
     * @return the MachineExtensionInstanceView object itself.
     */
    public MachineExtensionInstanceView withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: Specifies the type of the extension; an example is "CustomScriptExtension".
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: Specifies the type of the extension; an example is "CustomScriptExtension".
     * 
     * @param type the type value to set.
     * @return the MachineExtensionInstanceView object itself.
     */
    public MachineExtensionInstanceView withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the typeHandlerVersion property: Specifies the version of the script handler.
     * 
     * @return the typeHandlerVersion value.
     */
    public String typeHandlerVersion() {
        return this.typeHandlerVersion;
    }

    /**
     * Set the typeHandlerVersion property: Specifies the version of the script handler.
     * 
     * @param typeHandlerVersion the typeHandlerVersion value to set.
     * @return the MachineExtensionInstanceView object itself.
     */
    public MachineExtensionInstanceView withTypeHandlerVersion(String typeHandlerVersion) {
        this.typeHandlerVersion = typeHandlerVersion;
        return this;
    }

    /**
     * Get the status property: Instance view status.
     * 
     * @return the status value.
     */
    public MachineExtensionInstanceViewStatus status() {
        return this.status;
    }

    /**
     * Set the status property: Instance view status.
     * 
     * @param status the status value to set.
     * @return the MachineExtensionInstanceView object itself.
     */
    public MachineExtensionInstanceView withStatus(MachineExtensionInstanceViewStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (status() != null) {
            status().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("type", this.type);
        jsonWriter.writeStringField("typeHandlerVersion", this.typeHandlerVersion);
        jsonWriter.writeJsonField("status", this.status);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MachineExtensionInstanceView from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MachineExtensionInstanceView if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MachineExtensionInstanceView.
     */
    public static MachineExtensionInstanceView fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MachineExtensionInstanceView deserializedMachineExtensionInstanceView = new MachineExtensionInstanceView();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedMachineExtensionInstanceView.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedMachineExtensionInstanceView.type = reader.getString();
                } else if ("typeHandlerVersion".equals(fieldName)) {
                    deserializedMachineExtensionInstanceView.typeHandlerVersion = reader.getString();
                } else if ("status".equals(fieldName)) {
                    deserializedMachineExtensionInstanceView.status
                        = MachineExtensionInstanceViewStatus.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMachineExtensionInstanceView;
        });
    }
}
