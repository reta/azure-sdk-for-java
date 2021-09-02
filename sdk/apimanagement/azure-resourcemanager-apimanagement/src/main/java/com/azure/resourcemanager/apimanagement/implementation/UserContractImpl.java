// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.apimanagement.fluent.models.GroupContractProperties;
import com.azure.resourcemanager.apimanagement.fluent.models.UserContractInner;
import com.azure.resourcemanager.apimanagement.fluent.models.UserIdentityContractInner;
import com.azure.resourcemanager.apimanagement.models.AppType;
import com.azure.resourcemanager.apimanagement.models.Confirmation;
import com.azure.resourcemanager.apimanagement.models.GenerateSsoUrlResult;
import com.azure.resourcemanager.apimanagement.models.UserContract;
import com.azure.resourcemanager.apimanagement.models.UserCreateParameters;
import com.azure.resourcemanager.apimanagement.models.UserIdentityContract;
import com.azure.resourcemanager.apimanagement.models.UserState;
import com.azure.resourcemanager.apimanagement.models.UserTokenParameters;
import com.azure.resourcemanager.apimanagement.models.UserTokenResult;
import com.azure.resourcemanager.apimanagement.models.UserUpdateParameters;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class UserContractImpl implements UserContract, UserContract.Definition, UserContract.Update {
    private UserContractInner innerObject;

    private final com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String firstName() {
        return this.innerModel().firstName();
    }

    public String lastName() {
        return this.innerModel().lastName();
    }

    public String email() {
        return this.innerModel().email();
    }

    public OffsetDateTime registrationDate() {
        return this.innerModel().registrationDate();
    }

    public List<GroupContractProperties> groups() {
        List<GroupContractProperties> inner = this.innerModel().groups();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public UserState state() {
        return this.innerModel().state();
    }

    public String note() {
        return this.innerModel().note();
    }

    public List<UserIdentityContract> identities() {
        List<UserIdentityContractInner> inner = this.innerModel().identities();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new UserIdentityContractImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public UserContractInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.apimanagement.ApiManagementManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String serviceName;

    private String userId;

    private Boolean createNotify;

    private String createIfMatch;

    private UserCreateParameters createParameters;

    private String updateIfMatch;

    private UserUpdateParameters updateParameters;

    public UserContractImpl withExistingService(String resourceGroupName, String serviceName) {
        this.resourceGroupName = resourceGroupName;
        this.serviceName = serviceName;
        return this;
    }

    public UserContract create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getUsers()
                .createOrUpdateWithResponse(
                    resourceGroupName, serviceName, userId, createParameters, createNotify, createIfMatch, Context.NONE)
                .getValue();
        return this;
    }

    public UserContract create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getUsers()
                .createOrUpdateWithResponse(
                    resourceGroupName, serviceName, userId, createParameters, createNotify, createIfMatch, context)
                .getValue();
        return this;
    }

    UserContractImpl(String name, com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager) {
        this.innerObject = new UserContractInner();
        this.serviceManager = serviceManager;
        this.userId = name;
        this.createNotify = null;
        this.createIfMatch = null;
        this.createParameters = new UserCreateParameters();
    }

    public UserContractImpl update() {
        this.updateIfMatch = null;
        this.updateParameters = new UserUpdateParameters();
        return this;
    }

    public UserContract apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getUsers()
                .updateWithResponse(
                    resourceGroupName, serviceName, userId, updateIfMatch, updateParameters, Context.NONE)
                .getValue();
        return this;
    }

    public UserContract apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getUsers()
                .updateWithResponse(resourceGroupName, serviceName, userId, updateIfMatch, updateParameters, context)
                .getValue();
        return this;
    }

    UserContractImpl(
        UserContractInner innerObject, com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.serviceName = Utils.getValueFromIdByName(innerObject.id(), "service");
        this.userId = Utils.getValueFromIdByName(innerObject.id(), "users");
    }

    public UserContract refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getUsers()
                .getWithResponse(resourceGroupName, serviceName, userId, Context.NONE)
                .getValue();
        return this;
    }

    public UserContract refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getUsers()
                .getWithResponse(resourceGroupName, serviceName, userId, context)
                .getValue();
        return this;
    }

    public GenerateSsoUrlResult generateSsoUrl() {
        return serviceManager.users().generateSsoUrl(resourceGroupName, serviceName, userId);
    }

    public Response<GenerateSsoUrlResult> generateSsoUrlWithResponse(Context context) {
        return serviceManager.users().generateSsoUrlWithResponse(resourceGroupName, serviceName, userId, context);
    }

    public UserTokenResult getSharedAccessToken(UserTokenParameters parameters) {
        return serviceManager.users().getSharedAccessToken(resourceGroupName, serviceName, userId, parameters);
    }

    public Response<UserTokenResult> getSharedAccessTokenWithResponse(UserTokenParameters parameters, Context context) {
        return serviceManager
            .users()
            .getSharedAccessTokenWithResponse(resourceGroupName, serviceName, userId, parameters, context);
    }

    public UserContractImpl withEmail(String email) {
        if (isInCreateMode()) {
            this.createParameters.withEmail(email);
            return this;
        } else {
            this.updateParameters.withEmail(email);
            return this;
        }
    }

    public UserContractImpl withFirstName(String firstName) {
        if (isInCreateMode()) {
            this.createParameters.withFirstName(firstName);
            return this;
        } else {
            this.updateParameters.withFirstName(firstName);
            return this;
        }
    }

    public UserContractImpl withLastName(String lastName) {
        if (isInCreateMode()) {
            this.createParameters.withLastName(lastName);
            return this;
        } else {
            this.updateParameters.withLastName(lastName);
            return this;
        }
    }

    public UserContractImpl withPassword(String password) {
        if (isInCreateMode()) {
            this.createParameters.withPassword(password);
            return this;
        } else {
            this.updateParameters.withPassword(password);
            return this;
        }
    }

    public UserContractImpl withAppType(AppType appType) {
        this.createParameters.withAppType(appType);
        return this;
    }

    public UserContractImpl withConfirmation(Confirmation confirmation) {
        this.createParameters.withConfirmation(confirmation);
        return this;
    }

    public UserContractImpl withState(UserState state) {
        if (isInCreateMode()) {
            this.createParameters.withState(state);
            return this;
        } else {
            this.updateParameters.withState(state);
            return this;
        }
    }

    public UserContractImpl withNote(String note) {
        if (isInCreateMode()) {
            this.createParameters.withNote(note);
            return this;
        } else {
            this.updateParameters.withNote(note);
            return this;
        }
    }

    public UserContractImpl withIdentities(List<UserIdentityContractInner> identities) {
        if (isInCreateMode()) {
            this.createParameters.withIdentities(identities);
            return this;
        } else {
            this.updateParameters.withIdentities(identities);
            return this;
        }
    }

    public UserContractImpl withNotify(Boolean notify) {
        this.createNotify = notify;
        return this;
    }

    public UserContractImpl withIfMatch(String ifMatch) {
        if (isInCreateMode()) {
            this.createIfMatch = ifMatch;
            return this;
        } else {
            this.updateIfMatch = ifMatch;
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
