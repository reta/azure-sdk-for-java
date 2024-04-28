// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Information about the delivery for an event subscription with resource identity.
 */
@Fluent
public final class DeliveryWithResourceIdentity {
    /*
     * The identity to use when delivering events.
     */
    @JsonProperty(value = "identity")
    private EventSubscriptionIdentity identity;

    /*
     * Information about the destination where events have to be delivered for the event subscription.
     * Uses the managed identity setup on the parent resource (namely, topic or domain) to acquire the authentication tokens being used during delivery.
     */
    @JsonProperty(value = "destination")
    private EventSubscriptionDestination destination;

    /**
     * Creates an instance of DeliveryWithResourceIdentity class.
     */
    public DeliveryWithResourceIdentity() {
    }

    /**
     * Get the identity property: The identity to use when delivering events.
     * 
     * @return the identity value.
     */
    public EventSubscriptionIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The identity to use when delivering events.
     * 
     * @param identity the identity value to set.
     * @return the DeliveryWithResourceIdentity object itself.
     */
    public DeliveryWithResourceIdentity withIdentity(EventSubscriptionIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the destination property: Information about the destination where events have to be delivered for the event
     * subscription.
     * Uses the managed identity setup on the parent resource (namely, topic or domain) to acquire the authentication
     * tokens being used during delivery.
     * 
     * @return the destination value.
     */
    public EventSubscriptionDestination destination() {
        return this.destination;
    }

    /**
     * Set the destination property: Information about the destination where events have to be delivered for the event
     * subscription.
     * Uses the managed identity setup on the parent resource (namely, topic or domain) to acquire the authentication
     * tokens being used during delivery.
     * 
     * @param destination the destination value to set.
     * @return the DeliveryWithResourceIdentity object itself.
     */
    public DeliveryWithResourceIdentity withDestination(EventSubscriptionDestination destination) {
        this.destination = destination;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (identity() != null) {
            identity().validate();
        }
        if (destination() != null) {
            destination().validate();
        }
    }
}
