// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The LicenseProfileUpdatePropertiesSoftwareAssurance model.
 */
@Fluent
public final class LicenseProfileUpdatePropertiesSoftwareAssurance
    implements JsonSerializable<LicenseProfileUpdatePropertiesSoftwareAssurance> {
    /*
     * Specifies if this machine is licensed as part of a Software Assurance agreement.
     */
    private Boolean softwareAssuranceCustomer;

    /**
     * Creates an instance of LicenseProfileUpdatePropertiesSoftwareAssurance class.
     */
    public LicenseProfileUpdatePropertiesSoftwareAssurance() {
    }

    /**
     * Get the softwareAssuranceCustomer property: Specifies if this machine is licensed as part of a Software Assurance
     * agreement.
     * 
     * @return the softwareAssuranceCustomer value.
     */
    public Boolean softwareAssuranceCustomer() {
        return this.softwareAssuranceCustomer;
    }

    /**
     * Set the softwareAssuranceCustomer property: Specifies if this machine is licensed as part of a Software Assurance
     * agreement.
     * 
     * @param softwareAssuranceCustomer the softwareAssuranceCustomer value to set.
     * @return the LicenseProfileUpdatePropertiesSoftwareAssurance object itself.
     */
    public LicenseProfileUpdatePropertiesSoftwareAssurance
        withSoftwareAssuranceCustomer(Boolean softwareAssuranceCustomer) {
        this.softwareAssuranceCustomer = softwareAssuranceCustomer;
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
        jsonWriter.writeBooleanField("softwareAssuranceCustomer", this.softwareAssuranceCustomer);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of LicenseProfileUpdatePropertiesSoftwareAssurance from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of LicenseProfileUpdatePropertiesSoftwareAssurance if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the LicenseProfileUpdatePropertiesSoftwareAssurance.
     */
    public static LicenseProfileUpdatePropertiesSoftwareAssurance fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            LicenseProfileUpdatePropertiesSoftwareAssurance deserializedLicenseProfileUpdatePropertiesSoftwareAssurance
                = new LicenseProfileUpdatePropertiesSoftwareAssurance();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("softwareAssuranceCustomer".equals(fieldName)) {
                    deserializedLicenseProfileUpdatePropertiesSoftwareAssurance.softwareAssuranceCustomer
                        = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedLicenseProfileUpdatePropertiesSoftwareAssurance;
        });
    }
}
