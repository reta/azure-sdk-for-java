// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for InternetEnum. */
public final class InternetEnum extends ExpandableStringEnum<InternetEnum> {
    /** Static value Enabled for InternetEnum. */
    public static final InternetEnum ENABLED = fromString("Enabled");

    /** Static value Disabled for InternetEnum. */
    public static final InternetEnum DISABLED = fromString("Disabled");

    /**
     * Creates or finds a InternetEnum from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding InternetEnum.
     */
    @JsonCreator
    public static InternetEnum fromString(String name) {
        return fromString(name, InternetEnum.class);
    }

    /** @return known InternetEnum values. */
    public static Collection<InternetEnum> values() {
        return values(InternetEnum.class);
    }
}
