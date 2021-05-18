// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.models.DetectorAbnormalTimePeriod;
import com.azure.resourcemanager.appservice.models.DiagnosticMetricSet;
import com.azure.resourcemanager.appservice.models.NameValuePair;
import com.azure.resourcemanager.appservice.models.ProxyOnlyResource;
import com.azure.resourcemanager.appservice.models.ResponseMetadata;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Class representing Response from Diagnostic Detectors. */
@JsonFlatten
@Fluent
public class DiagnosticDetectorResponseInner extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DiagnosticDetectorResponseInner.class);

    /*
     * Start time of the period
     */
    @JsonProperty(value = "properties.startTime")
    private OffsetDateTime startTime;

    /*
     * End time of the period
     */
    @JsonProperty(value = "properties.endTime")
    private OffsetDateTime endTime;

    /*
     * Flag representing Issue was detected.
     */
    @JsonProperty(value = "properties.issueDetected")
    private Boolean issueDetected;

    /*
     * Detector's definition
     */
    @JsonProperty(value = "properties.detectorDefinition")
    private DetectorDefinitionInner detectorDefinition;

    /*
     * Metrics provided by the detector
     */
    @JsonProperty(value = "properties.metrics")
    private List<DiagnosticMetricSet> metrics;

    /*
     * List of Correlated events found by the detector
     */
    @JsonProperty(value = "properties.abnormalTimePeriods")
    private List<DetectorAbnormalTimePeriod> abnormalTimePeriods;

    /*
     * Additional Data that detector wants to send.
     */
    @JsonProperty(value = "properties.data")
    private List<List<NameValuePair>> data;

    /*
     * Meta Data
     */
    @JsonProperty(value = "properties.responseMetaData")
    private ResponseMetadata responseMetadata;

    /**
     * Get the startTime property: Start time of the period.
     *
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: Start time of the period.
     *
     * @param startTime the startTime value to set.
     * @return the DiagnosticDetectorResponseInner object itself.
     */
    public DiagnosticDetectorResponseInner withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the endTime property: End time of the period.
     *
     * @return the endTime value.
     */
    public OffsetDateTime endTime() {
        return this.endTime;
    }

    /**
     * Set the endTime property: End time of the period.
     *
     * @param endTime the endTime value to set.
     * @return the DiagnosticDetectorResponseInner object itself.
     */
    public DiagnosticDetectorResponseInner withEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get the issueDetected property: Flag representing Issue was detected.
     *
     * @return the issueDetected value.
     */
    public Boolean issueDetected() {
        return this.issueDetected;
    }

    /**
     * Set the issueDetected property: Flag representing Issue was detected.
     *
     * @param issueDetected the issueDetected value to set.
     * @return the DiagnosticDetectorResponseInner object itself.
     */
    public DiagnosticDetectorResponseInner withIssueDetected(Boolean issueDetected) {
        this.issueDetected = issueDetected;
        return this;
    }

    /**
     * Get the detectorDefinition property: Detector's definition.
     *
     * @return the detectorDefinition value.
     */
    public DetectorDefinitionInner detectorDefinition() {
        return this.detectorDefinition;
    }

    /**
     * Set the detectorDefinition property: Detector's definition.
     *
     * @param detectorDefinition the detectorDefinition value to set.
     * @return the DiagnosticDetectorResponseInner object itself.
     */
    public DiagnosticDetectorResponseInner withDetectorDefinition(DetectorDefinitionInner detectorDefinition) {
        this.detectorDefinition = detectorDefinition;
        return this;
    }

    /**
     * Get the metrics property: Metrics provided by the detector.
     *
     * @return the metrics value.
     */
    public List<DiagnosticMetricSet> metrics() {
        return this.metrics;
    }

    /**
     * Set the metrics property: Metrics provided by the detector.
     *
     * @param metrics the metrics value to set.
     * @return the DiagnosticDetectorResponseInner object itself.
     */
    public DiagnosticDetectorResponseInner withMetrics(List<DiagnosticMetricSet> metrics) {
        this.metrics = metrics;
        return this;
    }

    /**
     * Get the abnormalTimePeriods property: List of Correlated events found by the detector.
     *
     * @return the abnormalTimePeriods value.
     */
    public List<DetectorAbnormalTimePeriod> abnormalTimePeriods() {
        return this.abnormalTimePeriods;
    }

    /**
     * Set the abnormalTimePeriods property: List of Correlated events found by the detector.
     *
     * @param abnormalTimePeriods the abnormalTimePeriods value to set.
     * @return the DiagnosticDetectorResponseInner object itself.
     */
    public DiagnosticDetectorResponseInner withAbnormalTimePeriods(
        List<DetectorAbnormalTimePeriod> abnormalTimePeriods) {
        this.abnormalTimePeriods = abnormalTimePeriods;
        return this;
    }

    /**
     * Get the data property: Additional Data that detector wants to send.
     *
     * @return the data value.
     */
    public List<List<NameValuePair>> data() {
        return this.data;
    }

    /**
     * Set the data property: Additional Data that detector wants to send.
     *
     * @param data the data value to set.
     * @return the DiagnosticDetectorResponseInner object itself.
     */
    public DiagnosticDetectorResponseInner withData(List<List<NameValuePair>> data) {
        this.data = data;
        return this;
    }

    /**
     * Get the responseMetadata property: Meta Data.
     *
     * @return the responseMetadata value.
     */
    public ResponseMetadata responseMetadata() {
        return this.responseMetadata;
    }

    /**
     * Set the responseMetadata property: Meta Data.
     *
     * @param responseMetadata the responseMetadata value to set.
     * @return the DiagnosticDetectorResponseInner object itself.
     */
    public DiagnosticDetectorResponseInner withResponseMetadata(ResponseMetadata responseMetadata) {
        this.responseMetadata = responseMetadata;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DiagnosticDetectorResponseInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (detectorDefinition() != null) {
            detectorDefinition().validate();
        }
        if (metrics() != null) {
            metrics().forEach(e -> e.validate());
        }
        if (abnormalTimePeriods() != null) {
            abnormalTimePeriods().forEach(e -> e.validate());
        }
        if (data() != null) {
            data().forEach(e -> e.forEach(e1 -> e1.validate()));
        }
        if (responseMetadata() != null) {
            responseMetadata().validate();
        }
    }
}
