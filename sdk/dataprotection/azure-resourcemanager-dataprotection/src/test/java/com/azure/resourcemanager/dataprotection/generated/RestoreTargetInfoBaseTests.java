// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.models.RecoveryOption;
import com.azure.resourcemanager.dataprotection.models.RestoreTargetInfoBase;
import org.junit.jupiter.api.Assertions;

public final class RestoreTargetInfoBaseTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RestoreTargetInfoBase model = BinaryData.fromString(
            "{\"objectType\":\"RestoreTargetInfoBase\",\"recoveryOption\":\"FailIfExists\",\"restoreLocation\":\"txhp\"}")
            .toObject(RestoreTargetInfoBase.class);
        Assertions.assertEquals(RecoveryOption.FAIL_IF_EXISTS, model.recoveryOption());
        Assertions.assertEquals("txhp", model.restoreLocation());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RestoreTargetInfoBase model
            = new RestoreTargetInfoBase().withRecoveryOption(RecoveryOption.FAIL_IF_EXISTS).withRestoreLocation("txhp");
        model = BinaryData.fromObject(model).toObject(RestoreTargetInfoBase.class);
        Assertions.assertEquals(RecoveryOption.FAIL_IF_EXISTS, model.recoveryOption());
        Assertions.assertEquals("txhp", model.restoreLocation());
    }
}
