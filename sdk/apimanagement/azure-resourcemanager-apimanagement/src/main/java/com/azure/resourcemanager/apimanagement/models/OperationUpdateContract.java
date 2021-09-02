// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.apimanagement.fluent.models.OperationUpdateContractProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Api Operation Update Contract details. */
@Fluent
public final class OperationUpdateContract {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OperationUpdateContract.class);

    /*
     * Properties of the API Operation entity that can be updated.
     */
    @JsonProperty(value = "properties")
    private OperationUpdateContractProperties innerProperties;

    /**
     * Get the innerProperties property: Properties of the API Operation entity that can be updated.
     *
     * @return the innerProperties value.
     */
    private OperationUpdateContractProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the displayName property: Operation Name.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.innerProperties() == null ? null : this.innerProperties().displayName();
    }

    /**
     * Set the displayName property: Operation Name.
     *
     * @param displayName the displayName value to set.
     * @return the OperationUpdateContract object itself.
     */
    public OperationUpdateContract withDisplayName(String displayName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new OperationUpdateContractProperties();
        }
        this.innerProperties().withDisplayName(displayName);
        return this;
    }

    /**
     * Get the method property: A Valid HTTP Operation Method. Typical Http Methods like GET, PUT, POST but not limited
     * by only them.
     *
     * @return the method value.
     */
    public String method() {
        return this.innerProperties() == null ? null : this.innerProperties().method();
    }

    /**
     * Set the method property: A Valid HTTP Operation Method. Typical Http Methods like GET, PUT, POST but not limited
     * by only them.
     *
     * @param method the method value to set.
     * @return the OperationUpdateContract object itself.
     */
    public OperationUpdateContract withMethod(String method) {
        if (this.innerProperties() == null) {
            this.innerProperties = new OperationUpdateContractProperties();
        }
        this.innerProperties().withMethod(method);
        return this;
    }

    /**
     * Get the urlTemplate property: Relative URL template identifying the target resource for this operation. May
     * include parameters. Example: /customers/{cid}/orders/{oid}/?date={date}.
     *
     * @return the urlTemplate value.
     */
    public String urlTemplate() {
        return this.innerProperties() == null ? null : this.innerProperties().urlTemplate();
    }

    /**
     * Set the urlTemplate property: Relative URL template identifying the target resource for this operation. May
     * include parameters. Example: /customers/{cid}/orders/{oid}/?date={date}.
     *
     * @param urlTemplate the urlTemplate value to set.
     * @return the OperationUpdateContract object itself.
     */
    public OperationUpdateContract withUrlTemplate(String urlTemplate) {
        if (this.innerProperties() == null) {
            this.innerProperties = new OperationUpdateContractProperties();
        }
        this.innerProperties().withUrlTemplate(urlTemplate);
        return this;
    }

    /**
     * Get the templateParameters property: Collection of URL template parameters.
     *
     * @return the templateParameters value.
     */
    public List<ParameterContract> templateParameters() {
        return this.innerProperties() == null ? null : this.innerProperties().templateParameters();
    }

    /**
     * Set the templateParameters property: Collection of URL template parameters.
     *
     * @param templateParameters the templateParameters value to set.
     * @return the OperationUpdateContract object itself.
     */
    public OperationUpdateContract withTemplateParameters(List<ParameterContract> templateParameters) {
        if (this.innerProperties() == null) {
            this.innerProperties = new OperationUpdateContractProperties();
        }
        this.innerProperties().withTemplateParameters(templateParameters);
        return this;
    }

    /**
     * Get the description property: Description of the operation. May include HTML formatting tags.
     *
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: Description of the operation. May include HTML formatting tags.
     *
     * @param description the description value to set.
     * @return the OperationUpdateContract object itself.
     */
    public OperationUpdateContract withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new OperationUpdateContractProperties();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the request property: An entity containing request details.
     *
     * @return the request value.
     */
    public RequestContract request() {
        return this.innerProperties() == null ? null : this.innerProperties().request();
    }

    /**
     * Set the request property: An entity containing request details.
     *
     * @param request the request value to set.
     * @return the OperationUpdateContract object itself.
     */
    public OperationUpdateContract withRequest(RequestContract request) {
        if (this.innerProperties() == null) {
            this.innerProperties = new OperationUpdateContractProperties();
        }
        this.innerProperties().withRequest(request);
        return this;
    }

    /**
     * Get the responses property: Array of Operation responses.
     *
     * @return the responses value.
     */
    public List<ResponseContract> responses() {
        return this.innerProperties() == null ? null : this.innerProperties().responses();
    }

    /**
     * Set the responses property: Array of Operation responses.
     *
     * @param responses the responses value to set.
     * @return the OperationUpdateContract object itself.
     */
    public OperationUpdateContract withResponses(List<ResponseContract> responses) {
        if (this.innerProperties() == null) {
            this.innerProperties = new OperationUpdateContractProperties();
        }
        this.innerProperties().withResponses(responses);
        return this;
    }

    /**
     * Get the policies property: Operation Policies.
     *
     * @return the policies value.
     */
    public String policies() {
        return this.innerProperties() == null ? null : this.innerProperties().policies();
    }

    /**
     * Set the policies property: Operation Policies.
     *
     * @param policies the policies value to set.
     * @return the OperationUpdateContract object itself.
     */
    public OperationUpdateContract withPolicies(String policies) {
        if (this.innerProperties() == null) {
            this.innerProperties = new OperationUpdateContractProperties();
        }
        this.innerProperties().withPolicies(policies);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
