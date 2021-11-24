// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for KnownSyslogDataSourceLogLevels. */
public final class KnownSyslogDataSourceLogLevels extends ExpandableStringEnum<KnownSyslogDataSourceLogLevels> {
    /** Static value Debug for KnownSyslogDataSourceLogLevels. */
    public static final KnownSyslogDataSourceLogLevels DEBUG = fromString("Debug");

    /** Static value Info for KnownSyslogDataSourceLogLevels. */
    public static final KnownSyslogDataSourceLogLevels INFO = fromString("Info");

    /** Static value Notice for KnownSyslogDataSourceLogLevels. */
    public static final KnownSyslogDataSourceLogLevels NOTICE = fromString("Notice");

    /** Static value Warning for KnownSyslogDataSourceLogLevels. */
    public static final KnownSyslogDataSourceLogLevels WARNING = fromString("Warning");

    /** Static value Error for KnownSyslogDataSourceLogLevels. */
    public static final KnownSyslogDataSourceLogLevels ERROR = fromString("Error");

    /** Static value Critical for KnownSyslogDataSourceLogLevels. */
    public static final KnownSyslogDataSourceLogLevels CRITICAL = fromString("Critical");

    /** Static value Alert for KnownSyslogDataSourceLogLevels. */
    public static final KnownSyslogDataSourceLogLevels ALERT = fromString("Alert");

    /** Static value Emergency for KnownSyslogDataSourceLogLevels. */
    public static final KnownSyslogDataSourceLogLevels EMERGENCY = fromString("Emergency");

    /** Static value * for KnownSyslogDataSourceLogLevels. */
    public static final KnownSyslogDataSourceLogLevels ASTERISK = fromString("*");

    /**
     * Creates or finds a KnownSyslogDataSourceLogLevels from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding KnownSyslogDataSourceLogLevels.
     */
    @JsonCreator
    public static KnownSyslogDataSourceLogLevels fromString(String name) {
        return fromString(name, KnownSyslogDataSourceLogLevels.class);
    }

    /** @return known KnownSyslogDataSourceLogLevels values. */
    public static Collection<KnownSyslogDataSourceLogLevels> values() {
        return values(KnownSyslogDataSourceLogLevels.class);
    }
}
