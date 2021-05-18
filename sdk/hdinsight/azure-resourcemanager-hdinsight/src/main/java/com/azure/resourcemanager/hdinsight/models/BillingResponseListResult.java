// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.models;

import com.azure.resourcemanager.hdinsight.fluent.models.BillingResponseListResultInner;
import java.util.List;

/** An immutable client-side representation of BillingResponseListResult. */
public interface BillingResponseListResult {
    /**
     * Gets the vmSizes property: The virtual machine sizes to include or exclude.
     *
     * @return the vmSizes value.
     */
    List<String> vmSizes();

    /**
     * Gets the vmSizesWithEncryptionAtHost property: The vm sizes which enable encryption at host.
     *
     * @return the vmSizesWithEncryptionAtHost value.
     */
    List<String> vmSizesWithEncryptionAtHost();

    /**
     * Gets the vmSizeFilters property: The virtual machine filtering mode. Effectively this can enabling or disabling
     * the virtual machine sizes in a particular set.
     *
     * @return the vmSizeFilters value.
     */
    List<VmSizeCompatibilityFilterV2> vmSizeFilters();

    /**
     * Gets the vmSizeProperties property: The vm size properties.
     *
     * @return the vmSizeProperties value.
     */
    List<VmSizeProperty> vmSizeProperties();

    /**
     * Gets the billingResources property: The billing and managed disk billing resources for a region.
     *
     * @return the billingResources value.
     */
    List<BillingResources> billingResources();

    /**
     * Gets the inner com.azure.resourcemanager.hdinsight.fluent.models.BillingResponseListResultInner object.
     *
     * @return the inner object.
     */
    BillingResponseListResultInner innerModel();
}
