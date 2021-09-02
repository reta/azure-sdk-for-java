// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.BgpSettings;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.azure.resourcemanager.network.models.VpnGatewayIpConfiguration;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Parameters for VpnGateway. */
@Fluent
public final class VpnGatewayProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VpnGatewayProperties.class);

    /*
     * The VirtualHub to which the gateway belongs.
     */
    @JsonProperty(value = "virtualHub")
    private SubResource virtualHub;

    /*
     * List of all vpn connections to the gateway.
     */
    @JsonProperty(value = "connections")
    private List<VpnConnectionInner> connections;

    /*
     * Local network gateway's BGP speaker settings.
     */
    @JsonProperty(value = "bgpSettings")
    private BgpSettings bgpSettings;

    /*
     * The provisioning state of the VPN gateway resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * The scale unit for this vpn gateway.
     */
    @JsonProperty(value = "vpnGatewayScaleUnit")
    private Integer vpnGatewayScaleUnit;

    /*
     * List of all IPs configured on the gateway.
     */
    @JsonProperty(value = "ipConfigurations", access = JsonProperty.Access.WRITE_ONLY)
    private List<VpnGatewayIpConfiguration> ipConfigurations;

    /*
     * Enable BGP routes translation for NAT on this VpnGateway.
     */
    @JsonProperty(value = "enableBgpRouteTranslationForNat")
    private Boolean enableBgpRouteTranslationForNat;

    /*
     * Enable Routing Preference property for the Public IP Interface of the
     * VpnGateway.
     */
    @JsonProperty(value = "isRoutingPreferenceInternet")
    private Boolean isRoutingPreferenceInternet;

    /*
     * List of all the nat Rules associated with the gateway.
     */
    @JsonProperty(value = "natRules")
    private List<VpnGatewayNatRuleInner> natRules;

    /**
     * Get the virtualHub property: The VirtualHub to which the gateway belongs.
     *
     * @return the virtualHub value.
     */
    public SubResource virtualHub() {
        return this.virtualHub;
    }

    /**
     * Set the virtualHub property: The VirtualHub to which the gateway belongs.
     *
     * @param virtualHub the virtualHub value to set.
     * @return the VpnGatewayProperties object itself.
     */
    public VpnGatewayProperties withVirtualHub(SubResource virtualHub) {
        this.virtualHub = virtualHub;
        return this;
    }

    /**
     * Get the connections property: List of all vpn connections to the gateway.
     *
     * @return the connections value.
     */
    public List<VpnConnectionInner> connections() {
        return this.connections;
    }

    /**
     * Set the connections property: List of all vpn connections to the gateway.
     *
     * @param connections the connections value to set.
     * @return the VpnGatewayProperties object itself.
     */
    public VpnGatewayProperties withConnections(List<VpnConnectionInner> connections) {
        this.connections = connections;
        return this;
    }

    /**
     * Get the bgpSettings property: Local network gateway's BGP speaker settings.
     *
     * @return the bgpSettings value.
     */
    public BgpSettings bgpSettings() {
        return this.bgpSettings;
    }

    /**
     * Set the bgpSettings property: Local network gateway's BGP speaker settings.
     *
     * @param bgpSettings the bgpSettings value to set.
     * @return the VpnGatewayProperties object itself.
     */
    public VpnGatewayProperties withBgpSettings(BgpSettings bgpSettings) {
        this.bgpSettings = bgpSettings;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the VPN gateway resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the vpnGatewayScaleUnit property: The scale unit for this vpn gateway.
     *
     * @return the vpnGatewayScaleUnit value.
     */
    public Integer vpnGatewayScaleUnit() {
        return this.vpnGatewayScaleUnit;
    }

    /**
     * Set the vpnGatewayScaleUnit property: The scale unit for this vpn gateway.
     *
     * @param vpnGatewayScaleUnit the vpnGatewayScaleUnit value to set.
     * @return the VpnGatewayProperties object itself.
     */
    public VpnGatewayProperties withVpnGatewayScaleUnit(Integer vpnGatewayScaleUnit) {
        this.vpnGatewayScaleUnit = vpnGatewayScaleUnit;
        return this;
    }

    /**
     * Get the ipConfigurations property: List of all IPs configured on the gateway.
     *
     * @return the ipConfigurations value.
     */
    public List<VpnGatewayIpConfiguration> ipConfigurations() {
        return this.ipConfigurations;
    }

    /**
     * Get the enableBgpRouteTranslationForNat property: Enable BGP routes translation for NAT on this VpnGateway.
     *
     * @return the enableBgpRouteTranslationForNat value.
     */
    public Boolean enableBgpRouteTranslationForNat() {
        return this.enableBgpRouteTranslationForNat;
    }

    /**
     * Set the enableBgpRouteTranslationForNat property: Enable BGP routes translation for NAT on this VpnGateway.
     *
     * @param enableBgpRouteTranslationForNat the enableBgpRouteTranslationForNat value to set.
     * @return the VpnGatewayProperties object itself.
     */
    public VpnGatewayProperties withEnableBgpRouteTranslationForNat(Boolean enableBgpRouteTranslationForNat) {
        this.enableBgpRouteTranslationForNat = enableBgpRouteTranslationForNat;
        return this;
    }

    /**
     * Get the isRoutingPreferenceInternet property: Enable Routing Preference property for the Public IP Interface of
     * the VpnGateway.
     *
     * @return the isRoutingPreferenceInternet value.
     */
    public Boolean isRoutingPreferenceInternet() {
        return this.isRoutingPreferenceInternet;
    }

    /**
     * Set the isRoutingPreferenceInternet property: Enable Routing Preference property for the Public IP Interface of
     * the VpnGateway.
     *
     * @param isRoutingPreferenceInternet the isRoutingPreferenceInternet value to set.
     * @return the VpnGatewayProperties object itself.
     */
    public VpnGatewayProperties withIsRoutingPreferenceInternet(Boolean isRoutingPreferenceInternet) {
        this.isRoutingPreferenceInternet = isRoutingPreferenceInternet;
        return this;
    }

    /**
     * Get the natRules property: List of all the nat Rules associated with the gateway.
     *
     * @return the natRules value.
     */
    public List<VpnGatewayNatRuleInner> natRules() {
        return this.natRules;
    }

    /**
     * Set the natRules property: List of all the nat Rules associated with the gateway.
     *
     * @param natRules the natRules value to set.
     * @return the VpnGatewayProperties object itself.
     */
    public VpnGatewayProperties withNatRules(List<VpnGatewayNatRuleInner> natRules) {
        this.natRules = natRules;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (connections() != null) {
            connections().forEach(e -> e.validate());
        }
        if (bgpSettings() != null) {
            bgpSettings().validate();
        }
        if (ipConfigurations() != null) {
            ipConfigurations().forEach(e -> e.validate());
        }
        if (natRules() != null) {
            natRules().forEach(e -> e.validate());
        }
    }
}
