// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

/**
 * Samples for PartnerTopicEventSubscriptions ListByPartnerTopic.
 */
public final class PartnerTopicEventSubscriptionsListByPartnerTopicSamples {
    /*
     * x-ms-original-file: specification/eventgrid/resource-manager/Microsoft.EventGrid/preview/2024-06-01-preview/examples/PartnerTopicEventSubscriptions_ListByPartnerTopic.json
     */
    /**
     * Sample code: PartnerTopicEventSubscriptions_ListByPartnerTopic.
     * 
     * @param manager Entry point to EventGridManager.
     */
    public static void
        partnerTopicEventSubscriptionsListByPartnerTopic(com.azure.resourcemanager.eventgrid.EventGridManager manager) {
        manager.partnerTopicEventSubscriptions()
            .listByPartnerTopic("examplerg", "examplePartnerTopic1", null, null, com.azure.core.util.Context.NONE);
    }
}
