// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The kind of the service. */
public final class ServiceKind extends ExpandableStringEnum<ServiceKind> {
    /** Static value SignalR for ServiceKind. */
    public static final ServiceKind SIGNALR = fromString("SignalR");

    /** Static value RawWebSockets for ServiceKind. */
    public static final ServiceKind RAW_WEB_SOCKETS = fromString("RawWebSockets");

    /**
     * Creates a new instance of ServiceKind value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ServiceKind() {
    }

    /**
     * Creates or finds a ServiceKind from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ServiceKind.
     */
    @JsonCreator
    public static ServiceKind fromString(String name) {
        return fromString(name, ServiceKind.class);
    }

    /**
     * Gets known ServiceKind values.
     *
     * @return known ServiceKind values.
     */
    public static Collection<ServiceKind> values() {
        return values(ServiceKind.class);
    }
}
