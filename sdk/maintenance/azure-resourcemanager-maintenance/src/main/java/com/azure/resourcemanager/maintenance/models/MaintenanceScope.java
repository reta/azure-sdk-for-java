// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maintenance.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for MaintenanceScope. */
public final class MaintenanceScope extends ExpandableStringEnum<MaintenanceScope> {
    /** Static value Host for MaintenanceScope. */
    public static final MaintenanceScope HOST = fromString("Host");

    /** Static value OSImage for MaintenanceScope. */
    public static final MaintenanceScope OSIMAGE = fromString("OSImage");

    /** Static value Extension for MaintenanceScope. */
    public static final MaintenanceScope EXTENSION = fromString("Extension");

    /** Static value InGuestPatch for MaintenanceScope. */
    public static final MaintenanceScope IN_GUEST_PATCH = fromString("InGuestPatch");

    /** Static value SQLDB for MaintenanceScope. */
    public static final MaintenanceScope SQLDB = fromString("SQLDB");

    /** Static value SQLManagedInstance for MaintenanceScope. */
    public static final MaintenanceScope SQLMANAGED_INSTANCE = fromString("SQLManagedInstance");

    /**
     * Creates or finds a MaintenanceScope from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MaintenanceScope.
     */
    @JsonCreator
    public static MaintenanceScope fromString(String name) {
        return fromString(name, MaintenanceScope.class);
    }

    /** @return known MaintenanceScope values. */
    public static Collection<MaintenanceScope> values() {
        return values(MaintenanceScope.class);
    }
}
