// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Subscription status of the OS or Product feature.
 */
public final class LicenseProfileSubscriptionStatus extends ExpandableStringEnum<LicenseProfileSubscriptionStatus> {
    /**
     * Static value Unknown for LicenseProfileSubscriptionStatus.
     */
    public static final LicenseProfileSubscriptionStatus UNKNOWN = fromString("Unknown");

    /**
     * Static value Enabling for LicenseProfileSubscriptionStatus.
     */
    public static final LicenseProfileSubscriptionStatus ENABLING = fromString("Enabling");

    /**
     * Static value Enabled for LicenseProfileSubscriptionStatus.
     */
    public static final LicenseProfileSubscriptionStatus ENABLED = fromString("Enabled");

    /**
     * Static value Disabled for LicenseProfileSubscriptionStatus.
     */
    public static final LicenseProfileSubscriptionStatus DISABLED = fromString("Disabled");

    /**
     * Static value Disabling for LicenseProfileSubscriptionStatus.
     */
    public static final LicenseProfileSubscriptionStatus DISABLING = fromString("Disabling");

    /**
     * Static value Failed for LicenseProfileSubscriptionStatus.
     */
    public static final LicenseProfileSubscriptionStatus FAILED = fromString("Failed");

    /**
     * Creates a new instance of LicenseProfileSubscriptionStatus value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public LicenseProfileSubscriptionStatus() {
    }

    /**
     * Creates or finds a LicenseProfileSubscriptionStatus from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding LicenseProfileSubscriptionStatus.
     */
    public static LicenseProfileSubscriptionStatus fromString(String name) {
        return fromString(name, LicenseProfileSubscriptionStatus.class);
    }

    /**
     * Gets known LicenseProfileSubscriptionStatus values.
     * 
     * @return known LicenseProfileSubscriptionStatus values.
     */
    public static Collection<LicenseProfileSubscriptionStatus> values() {
        return values(LicenseProfileSubscriptionStatus.class);
    }
}
