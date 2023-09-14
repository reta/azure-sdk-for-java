// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.signalr.fluent.models.SharedPrivateLinkResourceProperties;
import org.junit.jupiter.api.Assertions;

public final class SharedPrivateLinkResourcePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SharedPrivateLinkResourceProperties model =
            BinaryData
                .fromString(
                    "{\"groupId\":\"grjguufzd\",\"privateLinkResourceId\":\"syqtfi\",\"provisioningState\":\"Failed\",\"requestMessage\":\"otzi\",\"status\":\"Timeout\"}")
                .toObject(SharedPrivateLinkResourceProperties.class);
        Assertions.assertEquals("grjguufzd", model.groupId());
        Assertions.assertEquals("syqtfi", model.privateLinkResourceId());
        Assertions.assertEquals("otzi", model.requestMessage());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SharedPrivateLinkResourceProperties model =
            new SharedPrivateLinkResourceProperties()
                .withGroupId("grjguufzd")
                .withPrivateLinkResourceId("syqtfi")
                .withRequestMessage("otzi");
        model = BinaryData.fromObject(model).toObject(SharedPrivateLinkResourceProperties.class);
        Assertions.assertEquals("grjguufzd", model.groupId());
        Assertions.assertEquals("syqtfi", model.privateLinkResourceId());
        Assertions.assertEquals("otzi", model.requestMessage());
    }
}
