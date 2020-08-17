// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redis.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** The RedisCreateParameters model. */
@JsonFlatten
@Fluent
public class RedisCreateParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RedisCreateParameters.class);

    /*
     * A list of availability zones denoting where the resource needs to come
     * from.
     */
    @JsonProperty(value = "zones")
    private List<String> zones;

    /*
     * The geo-location where the resource lives
     */
    @JsonProperty(value = "location", required = true)
    private String location;

    /*
     * Resource tags.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /*
     * All Redis Settings. Few possible keys:
     * rdb-backup-enabled,rdb-storage-connection-string,rdb-backup-frequency,maxmemory-delta,maxmemory-policy,notify-keyspace-events,maxmemory-samples,slowlog-log-slower-than,slowlog-max-len,list-max-ziplist-entries,list-max-ziplist-value,hash-max-ziplist-entries,hash-max-ziplist-value,set-max-intset-entries,zset-max-ziplist-entries,zset-max-ziplist-value
     * etc.
     */
    @JsonProperty(value = "properties.redisConfiguration")
    private Map<String, String> redisConfiguration;

    /*
     * Specifies whether the non-ssl Redis server port (6379) is enabled.
     */
    @JsonProperty(value = "properties.enableNonSslPort")
    private Boolean enableNonSslPort;

    /*
     * A dictionary of tenant settings
     */
    @JsonProperty(value = "properties.tenantSettings")
    private Map<String, String> tenantSettings;

    /*
     * The number of shards to be created on a Premium Cluster Cache.
     */
    @JsonProperty(value = "properties.shardCount")
    private Integer shardCount;

    /*
     * Optional: requires clients to use a specified TLS version (or higher) to
     * connect (e,g, '1.0', '1.1', '1.2')
     */
    @JsonProperty(value = "properties.minimumTlsVersion")
    private TlsVersion minimumTlsVersion;

    /*
     * The SKU of the Redis cache to deploy.
     */
    @JsonProperty(value = "properties.sku", required = true)
    private Sku sku;

    /*
     * The full resource ID of a subnet in a virtual network to deploy the
     * Redis cache in. Example format:
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/Microsoft.{Network|ClassicNetwork}/VirtualNetworks/vnet1/subnets/subnet1
     */
    @JsonProperty(value = "properties.subnetId")
    private String subnetId;

    /*
     * Static IP address. Required when deploying a Redis cache inside an
     * existing Azure Virtual Network.
     */
    @JsonProperty(value = "properties.staticIP")
    private String staticIp;

    /**
     * Get the zones property: A list of availability zones denoting where the resource needs to come from.
     *
     * @return the zones value.
     */
    public List<String> zones() {
        return this.zones;
    }

    /**
     * Set the zones property: A list of availability zones denoting where the resource needs to come from.
     *
     * @param zones the zones value to set.
     * @return the RedisCreateParameters object itself.
     */
    public RedisCreateParameters withZones(List<String> zones) {
        this.zones = zones;
        return this;
    }

    /**
     * Get the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: The geo-location where the resource lives.
     *
     * @param location the location value to set.
     * @return the RedisCreateParameters object itself.
     */
    public RedisCreateParameters withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the tags property: Resource tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Resource tags.
     *
     * @param tags the tags value to set.
     * @return the RedisCreateParameters object itself.
     */
    public RedisCreateParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the redisConfiguration property: All Redis Settings. Few possible keys:
     * rdb-backup-enabled,rdb-storage-connection-string,rdb-backup-frequency,maxmemory-delta,maxmemory-policy,notify-keyspace-events,maxmemory-samples,slowlog-log-slower-than,slowlog-max-len,list-max-ziplist-entries,list-max-ziplist-value,hash-max-ziplist-entries,hash-max-ziplist-value,set-max-intset-entries,zset-max-ziplist-entries,zset-max-ziplist-value
     * etc.
     *
     * @return the redisConfiguration value.
     */
    public Map<String, String> redisConfiguration() {
        return this.redisConfiguration;
    }

    /**
     * Set the redisConfiguration property: All Redis Settings. Few possible keys:
     * rdb-backup-enabled,rdb-storage-connection-string,rdb-backup-frequency,maxmemory-delta,maxmemory-policy,notify-keyspace-events,maxmemory-samples,slowlog-log-slower-than,slowlog-max-len,list-max-ziplist-entries,list-max-ziplist-value,hash-max-ziplist-entries,hash-max-ziplist-value,set-max-intset-entries,zset-max-ziplist-entries,zset-max-ziplist-value
     * etc.
     *
     * @param redisConfiguration the redisConfiguration value to set.
     * @return the RedisCreateParameters object itself.
     */
    public RedisCreateParameters withRedisConfiguration(Map<String, String> redisConfiguration) {
        this.redisConfiguration = redisConfiguration;
        return this;
    }

    /**
     * Get the enableNonSslPort property: Specifies whether the non-ssl Redis server port (6379) is enabled.
     *
     * @return the enableNonSslPort value.
     */
    public Boolean enableNonSslPort() {
        return this.enableNonSslPort;
    }

    /**
     * Set the enableNonSslPort property: Specifies whether the non-ssl Redis server port (6379) is enabled.
     *
     * @param enableNonSslPort the enableNonSslPort value to set.
     * @return the RedisCreateParameters object itself.
     */
    public RedisCreateParameters withEnableNonSslPort(Boolean enableNonSslPort) {
        this.enableNonSslPort = enableNonSslPort;
        return this;
    }

    /**
     * Get the tenantSettings property: A dictionary of tenant settings.
     *
     * @return the tenantSettings value.
     */
    public Map<String, String> tenantSettings() {
        return this.tenantSettings;
    }

    /**
     * Set the tenantSettings property: A dictionary of tenant settings.
     *
     * @param tenantSettings the tenantSettings value to set.
     * @return the RedisCreateParameters object itself.
     */
    public RedisCreateParameters withTenantSettings(Map<String, String> tenantSettings) {
        this.tenantSettings = tenantSettings;
        return this;
    }

    /**
     * Get the shardCount property: The number of shards to be created on a Premium Cluster Cache.
     *
     * @return the shardCount value.
     */
    public Integer shardCount() {
        return this.shardCount;
    }

    /**
     * Set the shardCount property: The number of shards to be created on a Premium Cluster Cache.
     *
     * @param shardCount the shardCount value to set.
     * @return the RedisCreateParameters object itself.
     */
    public RedisCreateParameters withShardCount(Integer shardCount) {
        this.shardCount = shardCount;
        return this;
    }

    /**
     * Get the minimumTlsVersion property: Optional: requires clients to use a specified TLS version (or higher) to
     * connect (e,g, '1.0', '1.1', '1.2').
     *
     * @return the minimumTlsVersion value.
     */
    public TlsVersion minimumTlsVersion() {
        return this.minimumTlsVersion;
    }

    /**
     * Set the minimumTlsVersion property: Optional: requires clients to use a specified TLS version (or higher) to
     * connect (e,g, '1.0', '1.1', '1.2').
     *
     * @param minimumTlsVersion the minimumTlsVersion value to set.
     * @return the RedisCreateParameters object itself.
     */
    public RedisCreateParameters withMinimumTlsVersion(TlsVersion minimumTlsVersion) {
        this.minimumTlsVersion = minimumTlsVersion;
        return this;
    }

    /**
     * Get the sku property: The SKU of the Redis cache to deploy.
     *
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The SKU of the Redis cache to deploy.
     *
     * @param sku the sku value to set.
     * @return the RedisCreateParameters object itself.
     */
    public RedisCreateParameters withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the subnetId property: The full resource ID of a subnet in a virtual network to deploy the Redis cache in.
     * Example format:
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/Microsoft.{Network|ClassicNetwork}/VirtualNetworks/vnet1/subnets/subnet1.
     *
     * @return the subnetId value.
     */
    public String subnetId() {
        return this.subnetId;
    }

    /**
     * Set the subnetId property: The full resource ID of a subnet in a virtual network to deploy the Redis cache in.
     * Example format:
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/Microsoft.{Network|ClassicNetwork}/VirtualNetworks/vnet1/subnets/subnet1.
     *
     * @param subnetId the subnetId value to set.
     * @return the RedisCreateParameters object itself.
     */
    public RedisCreateParameters withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * Get the staticIp property: Static IP address. Required when deploying a Redis cache inside an existing Azure
     * Virtual Network.
     *
     * @return the staticIp value.
     */
    public String staticIp() {
        return this.staticIp;
    }

    /**
     * Set the staticIp property: Static IP address. Required when deploying a Redis cache inside an existing Azure
     * Virtual Network.
     *
     * @param staticIp the staticIp value to set.
     * @return the RedisCreateParameters object itself.
     */
    public RedisCreateParameters withStaticIp(String staticIp) {
        this.staticIp = staticIp;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (location() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property location in model RedisCreateParameters"));
        }
        if (sku() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property sku in model RedisCreateParameters"));
        } else {
            sku().validate();
        }
    }
}
