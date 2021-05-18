// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mariadb.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mariadb.fluent.CheckNameAvailabilitiesClient;
import com.azure.resourcemanager.mariadb.fluent.models.NameAvailabilityInner;
import com.azure.resourcemanager.mariadb.models.CheckNameAvailabilities;
import com.azure.resourcemanager.mariadb.models.NameAvailability;
import com.azure.resourcemanager.mariadb.models.NameAvailabilityRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class CheckNameAvailabilitiesImpl implements CheckNameAvailabilities {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CheckNameAvailabilitiesImpl.class);

    private final CheckNameAvailabilitiesClient innerClient;

    private final com.azure.resourcemanager.mariadb.MariaDBManager serviceManager;

    public CheckNameAvailabilitiesImpl(
        CheckNameAvailabilitiesClient innerClient, com.azure.resourcemanager.mariadb.MariaDBManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public NameAvailability execute(NameAvailabilityRequest nameAvailabilityRequest) {
        NameAvailabilityInner inner = this.serviceClient().execute(nameAvailabilityRequest);
        if (inner != null) {
            return new NameAvailabilityImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<NameAvailability> executeWithResponse(
        NameAvailabilityRequest nameAvailabilityRequest, Context context) {
        Response<NameAvailabilityInner> inner =
            this.serviceClient().executeWithResponse(nameAvailabilityRequest, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new NameAvailabilityImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private CheckNameAvailabilitiesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.mariadb.MariaDBManager manager() {
        return this.serviceManager;
    }
}
