// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver;

import com.azure.core.util.Context;

/** Samples for FirewallRules Delete. */
public final class FirewallRulesDeleteSamples {
    /*
     * operationId: FirewallRules_Delete
     * api-version: 2021-06-01
     * x-ms-examples: FirewallRuleDelete
     */
    /**
     * Sample code: FirewallRuleDelete.
     *
     * @param manager Entry point to PostgreSqlManager.
     */
    public static void firewallRuleDelete(
        com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager manager) {
        manager.firewallRules().delete("testrg", "testserver", "rule1", Context.NONE);
    }
}
