// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcompute.fluent.models.SettingsInner;
import org.junit.jupiter.api.Assertions;

public final class SettingsInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SettingsInner model = BinaryData.fromString(
            "{\"properties\":{\"tenantId\":\"odhkha\",\"gatewayProperties\":{\"gatewayResourceId\":\"hnzbonl\"}},\"id\":\"toego\",\"name\":\"dwbwhkszzcmrvexz\",\"type\":\"vbtqgsfraoyzk\"}")
            .toObject(SettingsInner.class);
        Assertions.assertEquals("hnzbonl", model.gatewayResourceId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SettingsInner model = new SettingsInner().withGatewayResourceId("hnzbonl");
        model = BinaryData.fromObject(model).toObject(SettingsInner.class);
        Assertions.assertEquals("hnzbonl", model.gatewayResourceId());
    }
}
