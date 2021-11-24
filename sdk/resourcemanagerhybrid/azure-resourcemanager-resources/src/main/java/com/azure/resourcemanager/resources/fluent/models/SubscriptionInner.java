// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.resources.models.SubscriptionPolicies;
import com.azure.resourcemanager.resources.models.SubscriptionState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Subscription information. */
@Fluent
public final class SubscriptionInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SubscriptionInner.class);

    /*
     * The fully qualified ID for the subscription. For example,
     * /subscriptions/00000000-0000-0000-0000-000000000000.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * The subscription ID.
     */
    @JsonProperty(value = "subscriptionId", access = JsonProperty.Access.WRITE_ONLY)
    private String subscriptionId;

    /*
     * The subscription display name.
     */
    @JsonProperty(value = "displayName", access = JsonProperty.Access.WRITE_ONLY)
    private String displayName;

    /*
     * The subscription state. Possible values are Enabled, Warned, PastDue,
     * Disabled, and Deleted.
     */
    @JsonProperty(value = "state", access = JsonProperty.Access.WRITE_ONLY)
    private SubscriptionState state;

    /*
     * The subscription policies.
     */
    @JsonProperty(value = "subscriptionPolicies")
    private SubscriptionPolicies subscriptionPolicies;

    /*
     * The authorization source of the request. Valid values are one or more
     * combinations of Legacy, RoleBased, Bypassed, Direct and Management. For
     * example, 'Legacy, RoleBased'.
     */
    @JsonProperty(value = "authorizationSource")
    private String authorizationSource;

    /**
     * Get the id property: The fully qualified ID for the subscription. For example,
     * /subscriptions/00000000-0000-0000-0000-000000000000.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the subscriptionId property: The subscription ID.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Get the displayName property: The subscription display name.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Get the state property: The subscription state. Possible values are Enabled, Warned, PastDue, Disabled, and
     * Deleted.
     *
     * @return the state value.
     */
    public SubscriptionState state() {
        return this.state;
    }

    /**
     * Get the subscriptionPolicies property: The subscription policies.
     *
     * @return the subscriptionPolicies value.
     */
    public SubscriptionPolicies subscriptionPolicies() {
        return this.subscriptionPolicies;
    }

    /**
     * Set the subscriptionPolicies property: The subscription policies.
     *
     * @param subscriptionPolicies the subscriptionPolicies value to set.
     * @return the SubscriptionInner object itself.
     */
    public SubscriptionInner withSubscriptionPolicies(SubscriptionPolicies subscriptionPolicies) {
        this.subscriptionPolicies = subscriptionPolicies;
        return this;
    }

    /**
     * Get the authorizationSource property: The authorization source of the request. Valid values are one or more
     * combinations of Legacy, RoleBased, Bypassed, Direct and Management. For example, 'Legacy, RoleBased'.
     *
     * @return the authorizationSource value.
     */
    public String authorizationSource() {
        return this.authorizationSource;
    }

    /**
     * Set the authorizationSource property: The authorization source of the request. Valid values are one or more
     * combinations of Legacy, RoleBased, Bypassed, Direct and Management. For example, 'Legacy, RoleBased'.
     *
     * @param authorizationSource the authorizationSource value to set.
     * @return the SubscriptionInner object itself.
     */
    public SubscriptionInner withAuthorizationSource(String authorizationSource) {
        this.authorizationSource = authorizationSource;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (subscriptionPolicies() != null) {
            subscriptionPolicies().validate();
        }
    }
}
