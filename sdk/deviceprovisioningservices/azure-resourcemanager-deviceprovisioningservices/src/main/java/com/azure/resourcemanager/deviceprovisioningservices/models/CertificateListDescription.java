// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceprovisioningservices.models;

import com.azure.resourcemanager.deviceprovisioningservices.fluent.models.CertificateListDescriptionInner;
import java.util.List;

/** An immutable client-side representation of CertificateListDescription. */
public interface CertificateListDescription {
    /**
     * Gets the value property: The array of Certificate objects.
     *
     * @return the value value.
     */
    List<CertificateResponse> value();

    /**
     * Gets the inner com.azure.resourcemanager.deviceprovisioningservices.fluent.models.CertificateListDescriptionInner
     * object.
     *
     * @return the inner object.
     */
    CertificateListDescriptionInner innerModel();
}
