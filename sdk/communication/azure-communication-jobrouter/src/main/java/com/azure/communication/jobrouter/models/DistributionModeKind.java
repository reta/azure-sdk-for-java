// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.communication.jobrouter.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Discriminators for supported distribution mode types.
 */
public final class DistributionModeKind extends ExpandableStringEnum<DistributionModeKind> {

    /**
     * Discriminator value for BestWorkerMode.
     */
    @Generated
    public static final DistributionModeKind BEST_WORKER = fromString("bestWorker");

    /**
     * Discriminator value for LongestIdleMode.
     */
    @Generated
    public static final DistributionModeKind LONGEST_IDLE = fromString("longestIdle");

    /**
     * Discriminator value for RoundRobinMode.
     */
    @Generated
    public static final DistributionModeKind ROUND_ROBIN = fromString("roundRobin");

    /**
     * Creates a new instance of DistributionModeKind value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public DistributionModeKind() {
    }

    /**
     * Creates or finds a DistributionModeKind from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DistributionModeKind.
     */
    @Generated
    public static DistributionModeKind fromString(String name) {
        return fromString(name, DistributionModeKind.class);
    }

    /**
     * Gets known DistributionModeKind values.
     *
     * @return known DistributionModeKind values.
     */
    @Generated
    public static Collection<DistributionModeKind> values() {
        return values(DistributionModeKind.class);
    }
}
