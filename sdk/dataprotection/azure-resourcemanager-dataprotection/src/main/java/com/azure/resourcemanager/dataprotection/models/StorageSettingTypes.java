// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Gets or sets the type.
 */
public final class StorageSettingTypes extends ExpandableStringEnum<StorageSettingTypes> {
    /**
     * Static value GeoRedundant for StorageSettingTypes.
     */
    public static final StorageSettingTypes GEO_REDUNDANT = fromString("GeoRedundant");

    /**
     * Static value LocallyRedundant for StorageSettingTypes.
     */
    public static final StorageSettingTypes LOCALLY_REDUNDANT = fromString("LocallyRedundant");

    /**
     * Static value ZoneRedundant for StorageSettingTypes.
     */
    public static final StorageSettingTypes ZONE_REDUNDANT = fromString("ZoneRedundant");

    /**
     * Creates a new instance of StorageSettingTypes value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public StorageSettingTypes() {
    }

    /**
     * Creates or finds a StorageSettingTypes from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding StorageSettingTypes.
     */
    public static StorageSettingTypes fromString(String name) {
        return fromString(name, StorageSettingTypes.class);
    }

    /**
     * Gets known StorageSettingTypes values.
     * 
     * @return known StorageSettingTypes values.
     */
    public static Collection<StorageSettingTypes> values() {
        return values(StorageSettingTypes.class);
    }
}
