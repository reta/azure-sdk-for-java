// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Routing rules for ramp up testing. This rule allows to redirect static traffic % to a slot or to gradually change
 * routing % based on performance.
 */
@Fluent
public final class RampUpRule {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RampUpRule.class);

    /*
     * Hostname of a slot to which the traffic will be redirected if decided
     * to. E.g. myapp-stage.azurewebsites.net.
     */
    @JsonProperty(value = "actionHostName")
    private String actionHostname;

    /*
     * Percentage of the traffic which will be redirected to
     * <code>ActionHostName</code>.
     */
    @JsonProperty(value = "reroutePercentage")
    private Double reroutePercentage;

    /*
     * In auto ramp up scenario this is the step to add/remove from
     * <code>ReroutePercentage</code> until it reaches
     * <code>MinReroutePercentage</code> or <code>MaxReroutePercentage</code>.
     * Site metrics are checked every N minutes specified in
     * <code>ChangeIntervalInMinutes</code>.
     * Custom decision algorithm can be provided in TiPCallback site extension
     * which URL can be specified in <code>ChangeDecisionCallbackUrl</code>.
     */
    @JsonProperty(value = "changeStep")
    private Double changeStep;

    /*
     * Specifies interval in minutes to reevaluate ReroutePercentage.
     */
    @JsonProperty(value = "changeIntervalInMinutes")
    private Integer changeIntervalInMinutes;

    /*
     * Specifies lower boundary above which ReroutePercentage will stay.
     */
    @JsonProperty(value = "minReroutePercentage")
    private Double minReroutePercentage;

    /*
     * Specifies upper boundary below which ReroutePercentage will stay.
     */
    @JsonProperty(value = "maxReroutePercentage")
    private Double maxReroutePercentage;

    /*
     * Custom decision algorithm can be provided in TiPCallback site extension
     * which URL can be specified. See TiPCallback site extension for the
     * scaffold and contracts.
     * https://www.siteextensions.net/packages/TiPCallback/
     */
    @JsonProperty(value = "changeDecisionCallbackUrl")
    private String changeDecisionCallbackUrl;

    /*
     * Name of the routing rule. The recommended name would be to point to the
     * slot which will receive the traffic in the experiment.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Get the actionHostname property: Hostname of a slot to which the traffic will be redirected if decided to. E.g.
     * myapp-stage.azurewebsites.net.
     *
     * @return the actionHostname value.
     */
    public String actionHostname() {
        return this.actionHostname;
    }

    /**
     * Set the actionHostname property: Hostname of a slot to which the traffic will be redirected if decided to. E.g.
     * myapp-stage.azurewebsites.net.
     *
     * @param actionHostname the actionHostname value to set.
     * @return the RampUpRule object itself.
     */
    public RampUpRule withActionHostname(String actionHostname) {
        this.actionHostname = actionHostname;
        return this;
    }

    /**
     * Get the reroutePercentage property: Percentage of the traffic which will be redirected to
     * &lt;code&gt;ActionHostName&lt;/code&gt;.
     *
     * @return the reroutePercentage value.
     */
    public Double reroutePercentage() {
        return this.reroutePercentage;
    }

    /**
     * Set the reroutePercentage property: Percentage of the traffic which will be redirected to
     * &lt;code&gt;ActionHostName&lt;/code&gt;.
     *
     * @param reroutePercentage the reroutePercentage value to set.
     * @return the RampUpRule object itself.
     */
    public RampUpRule withReroutePercentage(Double reroutePercentage) {
        this.reroutePercentage = reroutePercentage;
        return this;
    }

    /**
     * Get the changeStep property: In auto ramp up scenario this is the step to add/remove from
     * &lt;code&gt;ReroutePercentage&lt;/code&gt; until it reaches &lt;code&gt;MinReroutePercentage&lt;/code&gt; or
     * &lt;code&gt;MaxReroutePercentage&lt;/code&gt;. Site metrics are checked every N minutes specified in
     * &lt;code&gt;ChangeIntervalInMinutes&lt;/code&gt;. Custom decision algorithm can be provided in TiPCallback site
     * extension which URL can be specified in &lt;code&gt;ChangeDecisionCallbackUrl&lt;/code&gt;.
     *
     * @return the changeStep value.
     */
    public Double changeStep() {
        return this.changeStep;
    }

    /**
     * Set the changeStep property: In auto ramp up scenario this is the step to add/remove from
     * &lt;code&gt;ReroutePercentage&lt;/code&gt; until it reaches &lt;code&gt;MinReroutePercentage&lt;/code&gt; or
     * &lt;code&gt;MaxReroutePercentage&lt;/code&gt;. Site metrics are checked every N minutes specified in
     * &lt;code&gt;ChangeIntervalInMinutes&lt;/code&gt;. Custom decision algorithm can be provided in TiPCallback site
     * extension which URL can be specified in &lt;code&gt;ChangeDecisionCallbackUrl&lt;/code&gt;.
     *
     * @param changeStep the changeStep value to set.
     * @return the RampUpRule object itself.
     */
    public RampUpRule withChangeStep(Double changeStep) {
        this.changeStep = changeStep;
        return this;
    }

    /**
     * Get the changeIntervalInMinutes property: Specifies interval in minutes to reevaluate ReroutePercentage.
     *
     * @return the changeIntervalInMinutes value.
     */
    public Integer changeIntervalInMinutes() {
        return this.changeIntervalInMinutes;
    }

    /**
     * Set the changeIntervalInMinutes property: Specifies interval in minutes to reevaluate ReroutePercentage.
     *
     * @param changeIntervalInMinutes the changeIntervalInMinutes value to set.
     * @return the RampUpRule object itself.
     */
    public RampUpRule withChangeIntervalInMinutes(Integer changeIntervalInMinutes) {
        this.changeIntervalInMinutes = changeIntervalInMinutes;
        return this;
    }

    /**
     * Get the minReroutePercentage property: Specifies lower boundary above which ReroutePercentage will stay.
     *
     * @return the minReroutePercentage value.
     */
    public Double minReroutePercentage() {
        return this.minReroutePercentage;
    }

    /**
     * Set the minReroutePercentage property: Specifies lower boundary above which ReroutePercentage will stay.
     *
     * @param minReroutePercentage the minReroutePercentage value to set.
     * @return the RampUpRule object itself.
     */
    public RampUpRule withMinReroutePercentage(Double minReroutePercentage) {
        this.minReroutePercentage = minReroutePercentage;
        return this;
    }

    /**
     * Get the maxReroutePercentage property: Specifies upper boundary below which ReroutePercentage will stay.
     *
     * @return the maxReroutePercentage value.
     */
    public Double maxReroutePercentage() {
        return this.maxReroutePercentage;
    }

    /**
     * Set the maxReroutePercentage property: Specifies upper boundary below which ReroutePercentage will stay.
     *
     * @param maxReroutePercentage the maxReroutePercentage value to set.
     * @return the RampUpRule object itself.
     */
    public RampUpRule withMaxReroutePercentage(Double maxReroutePercentage) {
        this.maxReroutePercentage = maxReroutePercentage;
        return this;
    }

    /**
     * Get the changeDecisionCallbackUrl property: Custom decision algorithm can be provided in TiPCallback site
     * extension which URL can be specified. See TiPCallback site extension for the scaffold and contracts.
     * https://www.siteextensions.net/packages/TiPCallback/.
     *
     * @return the changeDecisionCallbackUrl value.
     */
    public String changeDecisionCallbackUrl() {
        return this.changeDecisionCallbackUrl;
    }

    /**
     * Set the changeDecisionCallbackUrl property: Custom decision algorithm can be provided in TiPCallback site
     * extension which URL can be specified. See TiPCallback site extension for the scaffold and contracts.
     * https://www.siteextensions.net/packages/TiPCallback/.
     *
     * @param changeDecisionCallbackUrl the changeDecisionCallbackUrl value to set.
     * @return the RampUpRule object itself.
     */
    public RampUpRule withChangeDecisionCallbackUrl(String changeDecisionCallbackUrl) {
        this.changeDecisionCallbackUrl = changeDecisionCallbackUrl;
        return this;
    }

    /**
     * Get the name property: Name of the routing rule. The recommended name would be to point to the slot which will
     * receive the traffic in the experiment.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the routing rule. The recommended name would be to point to the slot which will
     * receive the traffic in the experiment.
     *
     * @param name the name value to set.
     * @return the RampUpRule object itself.
     */
    public RampUpRule withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
