// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.models.BasePolicyRule;
import org.junit.jupiter.api.Assertions;

public final class BasePolicyRuleTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BasePolicyRule model = BinaryData.fromString("{\"objectType\":\"BasePolicyRule\",\"name\":\"vjayvblmhvkzu\"}")
            .toObject(BasePolicyRule.class);
        Assertions.assertEquals("vjayvblmhvkzu", model.name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BasePolicyRule model = new BasePolicyRule().withName("vjayvblmhvkzu");
        model = BinaryData.fromObject(model).toObject(BasePolicyRule.class);
        Assertions.assertEquals("vjayvblmhvkzu", model.name());
    }
}
