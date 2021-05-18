// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.kusto.fluent.DatabasesClient;
import com.azure.resourcemanager.kusto.fluent.models.CheckNameResultInner;
import com.azure.resourcemanager.kusto.fluent.models.DatabaseInner;
import com.azure.resourcemanager.kusto.fluent.models.DatabasePrincipalInner;
import com.azure.resourcemanager.kusto.fluent.models.DatabasePrincipalListResultInner;
import com.azure.resourcemanager.kusto.models.CheckNameRequest;
import com.azure.resourcemanager.kusto.models.CheckNameResult;
import com.azure.resourcemanager.kusto.models.Database;
import com.azure.resourcemanager.kusto.models.DatabasePrincipal;
import com.azure.resourcemanager.kusto.models.DatabasePrincipalListRequest;
import com.azure.resourcemanager.kusto.models.DatabasePrincipalListResult;
import com.azure.resourcemanager.kusto.models.Databases;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class DatabasesImpl implements Databases {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DatabasesImpl.class);

    private final DatabasesClient innerClient;

    private final com.azure.resourcemanager.kusto.KustoManager serviceManager;

    public DatabasesImpl(DatabasesClient innerClient, com.azure.resourcemanager.kusto.KustoManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public CheckNameResult checkNameAvailability(
        String resourceGroupName, String clusterName, CheckNameRequest resourceName) {
        CheckNameResultInner inner =
            this.serviceClient().checkNameAvailability(resourceGroupName, clusterName, resourceName);
        if (inner != null) {
            return new CheckNameResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<CheckNameResult> checkNameAvailabilityWithResponse(
        String resourceGroupName, String clusterName, CheckNameRequest resourceName, Context context) {
        Response<CheckNameResultInner> inner =
            this
                .serviceClient()
                .checkNameAvailabilityWithResponse(resourceGroupName, clusterName, resourceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CheckNameResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<Database> listByCluster(String resourceGroupName, String clusterName) {
        PagedIterable<DatabaseInner> inner = this.serviceClient().listByCluster(resourceGroupName, clusterName);
        return Utils.mapPage(inner, inner1 -> new DatabaseImpl(inner1, this.manager()));
    }

    public PagedIterable<Database> listByCluster(String resourceGroupName, String clusterName, Context context) {
        PagedIterable<DatabaseInner> inner =
            this.serviceClient().listByCluster(resourceGroupName, clusterName, context);
        return Utils.mapPage(inner, inner1 -> new DatabaseImpl(inner1, this.manager()));
    }

    public Database get(String resourceGroupName, String clusterName, String databaseName) {
        DatabaseInner inner = this.serviceClient().get(resourceGroupName, clusterName, databaseName);
        if (inner != null) {
            return new DatabaseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Database> getWithResponse(
        String resourceGroupName, String clusterName, String databaseName, Context context) {
        Response<DatabaseInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, clusterName, databaseName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DatabaseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Database createOrUpdate(
        String resourceGroupName, String clusterName, String databaseName, DatabaseInner parameters) {
        DatabaseInner inner =
            this.serviceClient().createOrUpdate(resourceGroupName, clusterName, databaseName, parameters);
        if (inner != null) {
            return new DatabaseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Database createOrUpdate(
        String resourceGroupName, String clusterName, String databaseName, DatabaseInner parameters, Context context) {
        DatabaseInner inner =
            this.serviceClient().createOrUpdate(resourceGroupName, clusterName, databaseName, parameters, context);
        if (inner != null) {
            return new DatabaseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Database update(
        String resourceGroupName, String clusterName, String databaseName, DatabaseInner parameters) {
        DatabaseInner inner = this.serviceClient().update(resourceGroupName, clusterName, databaseName, parameters);
        if (inner != null) {
            return new DatabaseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Database update(
        String resourceGroupName, String clusterName, String databaseName, DatabaseInner parameters, Context context) {
        DatabaseInner inner =
            this.serviceClient().update(resourceGroupName, clusterName, databaseName, parameters, context);
        if (inner != null) {
            return new DatabaseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String clusterName, String databaseName) {
        this.serviceClient().delete(resourceGroupName, clusterName, databaseName);
    }

    public void delete(String resourceGroupName, String clusterName, String databaseName, Context context) {
        this.serviceClient().delete(resourceGroupName, clusterName, databaseName, context);
    }

    public PagedIterable<DatabasePrincipal> listPrincipals(
        String resourceGroupName, String clusterName, String databaseName) {
        PagedIterable<DatabasePrincipalInner> inner =
            this.serviceClient().listPrincipals(resourceGroupName, clusterName, databaseName);
        return Utils.mapPage(inner, inner1 -> new DatabasePrincipalImpl(inner1, this.manager()));
    }

    public PagedIterable<DatabasePrincipal> listPrincipals(
        String resourceGroupName, String clusterName, String databaseName, Context context) {
        PagedIterable<DatabasePrincipalInner> inner =
            this.serviceClient().listPrincipals(resourceGroupName, clusterName, databaseName, context);
        return Utils.mapPage(inner, inner1 -> new DatabasePrincipalImpl(inner1, this.manager()));
    }

    public DatabasePrincipalListResult addPrincipals(
        String resourceGroupName,
        String clusterName,
        String databaseName,
        DatabasePrincipalListRequest databasePrincipalsToAdd) {
        DatabasePrincipalListResultInner inner =
            this.serviceClient().addPrincipals(resourceGroupName, clusterName, databaseName, databasePrincipalsToAdd);
        if (inner != null) {
            return new DatabasePrincipalListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DatabasePrincipalListResult> addPrincipalsWithResponse(
        String resourceGroupName,
        String clusterName,
        String databaseName,
        DatabasePrincipalListRequest databasePrincipalsToAdd,
        Context context) {
        Response<DatabasePrincipalListResultInner> inner =
            this
                .serviceClient()
                .addPrincipalsWithResponse(
                    resourceGroupName, clusterName, databaseName, databasePrincipalsToAdd, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DatabasePrincipalListResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public DatabasePrincipalListResult removePrincipals(
        String resourceGroupName,
        String clusterName,
        String databaseName,
        DatabasePrincipalListRequest databasePrincipalsToRemove) {
        DatabasePrincipalListResultInner inner =
            this
                .serviceClient()
                .removePrincipals(resourceGroupName, clusterName, databaseName, databasePrincipalsToRemove);
        if (inner != null) {
            return new DatabasePrincipalListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DatabasePrincipalListResult> removePrincipalsWithResponse(
        String resourceGroupName,
        String clusterName,
        String databaseName,
        DatabasePrincipalListRequest databasePrincipalsToRemove,
        Context context) {
        Response<DatabasePrincipalListResultInner> inner =
            this
                .serviceClient()
                .removePrincipalsWithResponse(
                    resourceGroupName, clusterName, databaseName, databasePrincipalsToRemove, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DatabasePrincipalListResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private DatabasesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.kusto.KustoManager manager() {
        return this.serviceManager;
    }
}
