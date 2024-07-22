// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Specifies the current protection state of the resource.
 */
public final class CurrentProtectionState extends ExpandableStringEnum<CurrentProtectionState> {
    /**
     * Static value Invalid for CurrentProtectionState.
     */
    public static final CurrentProtectionState INVALID = fromString("Invalid");

    /**
     * Static value NotProtected for CurrentProtectionState.
     */
    public static final CurrentProtectionState NOT_PROTECTED = fromString("NotProtected");

    /**
     * Static value ConfiguringProtection for CurrentProtectionState.
     */
    public static final CurrentProtectionState CONFIGURING_PROTECTION = fromString("ConfiguringProtection");

    /**
     * Static value ProtectionConfigured for CurrentProtectionState.
     */
    public static final CurrentProtectionState PROTECTION_CONFIGURED = fromString("ProtectionConfigured");

    /**
     * Static value BackupSchedulesSuspended for CurrentProtectionState.
     */
    public static final CurrentProtectionState BACKUP_SCHEDULES_SUSPENDED = fromString("BackupSchedulesSuspended");

    /**
     * Static value RetentionSchedulesSuspended for CurrentProtectionState.
     */
    public static final CurrentProtectionState RETENTION_SCHEDULES_SUSPENDED
        = fromString("RetentionSchedulesSuspended");

    /**
     * Static value ProtectionStopped for CurrentProtectionState.
     */
    public static final CurrentProtectionState PROTECTION_STOPPED = fromString("ProtectionStopped");

    /**
     * Static value ProtectionError for CurrentProtectionState.
     */
    public static final CurrentProtectionState PROTECTION_ERROR = fromString("ProtectionError");

    /**
     * Static value ConfiguringProtectionFailed for CurrentProtectionState.
     */
    public static final CurrentProtectionState CONFIGURING_PROTECTION_FAILED
        = fromString("ConfiguringProtectionFailed");

    /**
     * Static value SoftDeleting for CurrentProtectionState.
     */
    public static final CurrentProtectionState SOFT_DELETING = fromString("SoftDeleting");

    /**
     * Static value SoftDeleted for CurrentProtectionState.
     */
    public static final CurrentProtectionState SOFT_DELETED = fromString("SoftDeleted");

    /**
     * Static value UpdatingProtection for CurrentProtectionState.
     */
    public static final CurrentProtectionState UPDATING_PROTECTION = fromString("UpdatingProtection");

    /**
     * Creates a new instance of CurrentProtectionState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public CurrentProtectionState() {
    }

    /**
     * Creates or finds a CurrentProtectionState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding CurrentProtectionState.
     */
    public static CurrentProtectionState fromString(String name) {
        return fromString(name, CurrentProtectionState.class);
    }

    /**
     * Gets known CurrentProtectionState values.
     * 
     * @return known CurrentProtectionState values.
     */
    public static Collection<CurrentProtectionState> values() {
        return values(CurrentProtectionState.class);
    }
}
