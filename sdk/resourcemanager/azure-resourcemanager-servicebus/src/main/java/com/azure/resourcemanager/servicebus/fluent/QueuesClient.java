// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.servicebus.fluent.models.SBAuthorizationRuleInner;
import com.azure.resourcemanager.servicebus.fluent.models.SBQueueInner;
import com.azure.resourcemanager.servicebus.fluent.models.AccessKeysInner;
import com.azure.resourcemanager.servicebus.models.AccessRights;
import com.azure.resourcemanager.servicebus.models.RegenerateAccessKeyParameters;
import java.util.List;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in QueuesClient. */
public interface QueuesClient {
    /**
     * Gets all authorization rules for a queue.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param queueName The queue name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all authorization rules for a queue.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<SBAuthorizationRuleInner> listAuthorizationRulesAsync(
        String resourceGroupName, String namespaceName, String queueName);

    /**
     * Gets all authorization rules for a queue.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param queueName The queue name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all authorization rules for a queue.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SBAuthorizationRuleInner> listAuthorizationRules(
        String resourceGroupName, String namespaceName, String queueName);

    /**
     * Gets all authorization rules for a queue.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param queueName The queue name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all authorization rules for a queue.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SBAuthorizationRuleInner> listAuthorizationRules(
        String resourceGroupName, String namespaceName, String queueName, Context context);

    /**
     * Creates an authorization rule for a queue.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param queueName The queue name.
     * @param authorizationRuleName The authorization rule name.
     * @param rights The rights associated with the rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of a namespace authorization rule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<SBAuthorizationRuleInner>> createOrUpdateAuthorizationRuleWithResponseAsync(
        String resourceGroupName,
        String namespaceName,
        String queueName,
        String authorizationRuleName,
        List<AccessRights> rights);

    /**
     * Creates an authorization rule for a queue.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param queueName The queue name.
     * @param authorizationRuleName The authorization rule name.
     * @param rights The rights associated with the rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of a namespace authorization rule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<SBAuthorizationRuleInner> createOrUpdateAuthorizationRuleAsync(
        String resourceGroupName,
        String namespaceName,
        String queueName,
        String authorizationRuleName,
        List<AccessRights> rights);

    /**
     * Creates an authorization rule for a queue.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param queueName The queue name.
     * @param authorizationRuleName The authorization rule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of a namespace authorization rule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<SBAuthorizationRuleInner> createOrUpdateAuthorizationRuleAsync(
        String resourceGroupName, String namespaceName, String queueName, String authorizationRuleName);

    /**
     * Creates an authorization rule for a queue.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param queueName The queue name.
     * @param authorizationRuleName The authorization rule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of a namespace authorization rule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SBAuthorizationRuleInner createOrUpdateAuthorizationRule(
        String resourceGroupName, String namespaceName, String queueName, String authorizationRuleName);

    /**
     * Creates an authorization rule for a queue.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param queueName The queue name.
     * @param authorizationRuleName The authorization rule name.
     * @param rights The rights associated with the rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of a namespace authorization rule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SBAuthorizationRuleInner> createOrUpdateAuthorizationRuleWithResponse(
        String resourceGroupName,
        String namespaceName,
        String queueName,
        String authorizationRuleName,
        List<AccessRights> rights,
        Context context);

    /**
     * Deletes a queue authorization rule.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param queueName The queue name.
     * @param authorizationRuleName The authorization rule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Void>> deleteAuthorizationRuleWithResponseAsync(
        String resourceGroupName, String namespaceName, String queueName, String authorizationRuleName);

    /**
     * Deletes a queue authorization rule.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param queueName The queue name.
     * @param authorizationRuleName The authorization rule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAuthorizationRuleAsync(
        String resourceGroupName, String namespaceName, String queueName, String authorizationRuleName);

    /**
     * Deletes a queue authorization rule.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param queueName The queue name.
     * @param authorizationRuleName The authorization rule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void deleteAuthorizationRule(
        String resourceGroupName, String namespaceName, String queueName, String authorizationRuleName);

    /**
     * Deletes a queue authorization rule.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param queueName The queue name.
     * @param authorizationRuleName The authorization rule name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteAuthorizationRuleWithResponse(
        String resourceGroupName,
        String namespaceName,
        String queueName,
        String authorizationRuleName,
        Context context);

    /**
     * Gets an authorization rule for a queue by rule name.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param queueName The queue name.
     * @param authorizationRuleName The authorization rule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an authorization rule for a queue by rule name.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<SBAuthorizationRuleInner>> getAuthorizationRuleWithResponseAsync(
        String resourceGroupName, String namespaceName, String queueName, String authorizationRuleName);

    /**
     * Gets an authorization rule for a queue by rule name.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param queueName The queue name.
     * @param authorizationRuleName The authorization rule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an authorization rule for a queue by rule name.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<SBAuthorizationRuleInner> getAuthorizationRuleAsync(
        String resourceGroupName, String namespaceName, String queueName, String authorizationRuleName);

    /**
     * Gets an authorization rule for a queue by rule name.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param queueName The queue name.
     * @param authorizationRuleName The authorization rule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an authorization rule for a queue by rule name.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SBAuthorizationRuleInner getAuthorizationRule(
        String resourceGroupName, String namespaceName, String queueName, String authorizationRuleName);

    /**
     * Gets an authorization rule for a queue by rule name.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param queueName The queue name.
     * @param authorizationRuleName The authorization rule name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an authorization rule for a queue by rule name.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SBAuthorizationRuleInner> getAuthorizationRuleWithResponse(
        String resourceGroupName,
        String namespaceName,
        String queueName,
        String authorizationRuleName,
        Context context);

    /**
     * Primary and secondary connection strings to the queue.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param queueName The queue name.
     * @param authorizationRuleName The authorization rule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return namespace/ServiceBus Connection String.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<AccessKeysInner>> listKeysWithResponseAsync(
        String resourceGroupName, String namespaceName, String queueName, String authorizationRuleName);

    /**
     * Primary and secondary connection strings to the queue.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param queueName The queue name.
     * @param authorizationRuleName The authorization rule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return namespace/ServiceBus Connection String.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<AccessKeysInner> listKeysAsync(
        String resourceGroupName, String namespaceName, String queueName, String authorizationRuleName);

    /**
     * Primary and secondary connection strings to the queue.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param queueName The queue name.
     * @param authorizationRuleName The authorization rule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return namespace/ServiceBus Connection String.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AccessKeysInner listKeys(String resourceGroupName, String namespaceName, String queueName, String authorizationRuleName);

    /**
     * Primary and secondary connection strings to the queue.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param queueName The queue name.
     * @param authorizationRuleName The authorization rule name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return namespace/ServiceBus Connection String.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AccessKeysInner> listKeysWithResponse(
        String resourceGroupName,
        String namespaceName,
        String queueName,
        String authorizationRuleName,
        Context context);

    /**
     * Regenerates the primary or secondary connection strings to the queue.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param queueName The queue name.
     * @param authorizationRuleName The authorization rule name.
     * @param parameters Parameters supplied to regenerate the authorization rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return namespace/ServiceBus Connection String.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<AccessKeysInner>> regenerateKeysWithResponseAsync(
        String resourceGroupName,
        String namespaceName,
        String queueName,
        String authorizationRuleName,
        RegenerateAccessKeyParameters parameters);

    /**
     * Regenerates the primary or secondary connection strings to the queue.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param queueName The queue name.
     * @param authorizationRuleName The authorization rule name.
     * @param parameters Parameters supplied to regenerate the authorization rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return namespace/ServiceBus Connection String.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<AccessKeysInner> regenerateKeysAsync(
        String resourceGroupName,
        String namespaceName,
        String queueName,
        String authorizationRuleName,
        RegenerateAccessKeyParameters parameters);

    /**
     * Regenerates the primary or secondary connection strings to the queue.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param queueName The queue name.
     * @param authorizationRuleName The authorization rule name.
     * @param parameters Parameters supplied to regenerate the authorization rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return namespace/ServiceBus Connection String.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AccessKeysInner regenerateKeys(
        String resourceGroupName,
        String namespaceName,
        String queueName,
        String authorizationRuleName,
        RegenerateAccessKeyParameters parameters);

    /**
     * Regenerates the primary or secondary connection strings to the queue.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param queueName The queue name.
     * @param authorizationRuleName The authorization rule name.
     * @param parameters Parameters supplied to regenerate the authorization rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return namespace/ServiceBus Connection String.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AccessKeysInner> regenerateKeysWithResponse(
        String resourceGroupName,
        String namespaceName,
        String queueName,
        String authorizationRuleName,
        RegenerateAccessKeyParameters parameters,
        Context context);

    /**
     * Gets the queues within a namespace.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param skip Skip is only used if a previous operation returned a partial result. If a previous response contains
     *     a nextLink element, the value of the nextLink element will include a skip parameter that specifies a starting
     *     point to use for subsequent calls.
     * @param top May be used to limit the number of results to the most recent N usageDetails.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the queues within a namespace.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<SBQueueInner> listByNamespaceAsync(
        String resourceGroupName, String namespaceName, Integer skip, Integer top);

    /**
     * Gets the queues within a namespace.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the queues within a namespace.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<SBQueueInner> listByNamespaceAsync(String resourceGroupName, String namespaceName);

    /**
     * Gets the queues within a namespace.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the queues within a namespace.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SBQueueInner> listByNamespace(String resourceGroupName, String namespaceName);

    /**
     * Gets the queues within a namespace.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param skip Skip is only used if a previous operation returned a partial result. If a previous response contains
     *     a nextLink element, the value of the nextLink element will include a skip parameter that specifies a starting
     *     point to use for subsequent calls.
     * @param top May be used to limit the number of results to the most recent N usageDetails.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the queues within a namespace.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SBQueueInner> listByNamespace(
        String resourceGroupName, String namespaceName, Integer skip, Integer top, Context context);

    /**
     * Creates or updates a Service Bus queue. This operation is idempotent.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param queueName The queue name.
     * @param parameters Parameters supplied to create or update a queue resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of queue Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<SBQueueInner>> createOrUpdateWithResponseAsync(
        String resourceGroupName, String namespaceName, String queueName, SBQueueInner parameters);

    /**
     * Creates or updates a Service Bus queue. This operation is idempotent.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param queueName The queue name.
     * @param parameters Parameters supplied to create or update a queue resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of queue Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<SBQueueInner> createOrUpdateAsync(
        String resourceGroupName, String namespaceName, String queueName, SBQueueInner parameters);

    /**
     * Creates or updates a Service Bus queue. This operation is idempotent.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param queueName The queue name.
     * @param parameters Parameters supplied to create or update a queue resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of queue Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SBQueueInner createOrUpdate(
        String resourceGroupName, String namespaceName, String queueName, SBQueueInner parameters);

    /**
     * Creates or updates a Service Bus queue. This operation is idempotent.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param queueName The queue name.
     * @param parameters Parameters supplied to create or update a queue resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of queue Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SBQueueInner> createOrUpdateWithResponse(
        String resourceGroupName, String namespaceName, String queueName, SBQueueInner parameters, Context context);

    /**
     * Deletes a queue from the specified namespace in a resource group.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param queueName The queue name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Void>> deleteWithResponseAsync(String resourceGroupName, String namespaceName, String queueName);

    /**
     * Deletes a queue from the specified namespace in a resource group.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param queueName The queue name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String namespaceName, String queueName);

    /**
     * Deletes a queue from the specified namespace in a resource group.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param queueName The queue name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String namespaceName, String queueName);

    /**
     * Deletes a queue from the specified namespace in a resource group.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param queueName The queue name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(
        String resourceGroupName, String namespaceName, String queueName, Context context);

    /**
     * Returns a description for the specified queue.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param queueName The queue name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of queue Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<SBQueueInner>> getWithResponseAsync(String resourceGroupName, String namespaceName, String queueName);

    /**
     * Returns a description for the specified queue.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param queueName The queue name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of queue Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<SBQueueInner> getAsync(String resourceGroupName, String namespaceName, String queueName);

    /**
     * Returns a description for the specified queue.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param queueName The queue name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of queue Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SBQueueInner get(String resourceGroupName, String namespaceName, String queueName);

    /**
     * Returns a description for the specified queue.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param queueName The queue name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of queue Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SBQueueInner> getWithResponse(
        String resourceGroupName, String namespaceName, String queueName, Context context);
}
