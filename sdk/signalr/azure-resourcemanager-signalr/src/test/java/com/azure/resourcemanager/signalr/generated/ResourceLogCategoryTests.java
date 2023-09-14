// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.signalr.models.ResourceLogCategory;
import org.junit.jupiter.api.Assertions;

public final class ResourceLogCategoryTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ResourceLogCategory model =
            BinaryData
                .fromString("{\"name\":\"uzhlhkjoqrv\",\"enabled\":\"aatjinrvgoupmfi\"}")
                .toObject(ResourceLogCategory.class);
        Assertions.assertEquals("uzhlhkjoqrv", model.name());
        Assertions.assertEquals("aatjinrvgoupmfi", model.enabled());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ResourceLogCategory model = new ResourceLogCategory().withName("uzhlhkjoqrv").withEnabled("aatjinrvgoupmfi");
        model = BinaryData.fromObject(model).toObject(ResourceLogCategory.class);
        Assertions.assertEquals("uzhlhkjoqrv", model.name());
        Assertions.assertEquals("aatjinrvgoupmfi", model.enabled());
    }
}
