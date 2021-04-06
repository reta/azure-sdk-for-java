// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Criteria to limit import of WSDL to a subset of the document. */
@Fluent
public final class ApiCreateOrUpdatePropertiesWsdlSelector {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ApiCreateOrUpdatePropertiesWsdlSelector.class);

    /*
     * Name of service to import from WSDL
     */
    @JsonProperty(value = "wsdlServiceName")
    private String wsdlServiceName;

    /*
     * Name of endpoint(port) to import from WSDL
     */
    @JsonProperty(value = "wsdlEndpointName")
    private String wsdlEndpointName;

    /**
     * Get the wsdlServiceName property: Name of service to import from WSDL.
     *
     * @return the wsdlServiceName value.
     */
    public String wsdlServiceName() {
        return this.wsdlServiceName;
    }

    /**
     * Set the wsdlServiceName property: Name of service to import from WSDL.
     *
     * @param wsdlServiceName the wsdlServiceName value to set.
     * @return the ApiCreateOrUpdatePropertiesWsdlSelector object itself.
     */
    public ApiCreateOrUpdatePropertiesWsdlSelector withWsdlServiceName(String wsdlServiceName) {
        this.wsdlServiceName = wsdlServiceName;
        return this;
    }

    /**
     * Get the wsdlEndpointName property: Name of endpoint(port) to import from WSDL.
     *
     * @return the wsdlEndpointName value.
     */
    public String wsdlEndpointName() {
        return this.wsdlEndpointName;
    }

    /**
     * Set the wsdlEndpointName property: Name of endpoint(port) to import from WSDL.
     *
     * @param wsdlEndpointName the wsdlEndpointName value to set.
     * @return the ApiCreateOrUpdatePropertiesWsdlSelector object itself.
     */
    public ApiCreateOrUpdatePropertiesWsdlSelector withWsdlEndpointName(String wsdlEndpointName) {
        this.wsdlEndpointName = wsdlEndpointName;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
