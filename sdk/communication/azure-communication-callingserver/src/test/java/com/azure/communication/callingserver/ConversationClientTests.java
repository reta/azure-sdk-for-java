// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.communication.callingserver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.net.URI;
import java.net.URISyntaxException;

import com.azure.communication.callingserver.models.CallRecordingState;
import com.azure.communication.callingserver.implementation.models.CommunicationErrorException;
import com.azure.communication.callingserver.models.GetCallRecordingStateResult;
import com.azure.communication.callingserver.models.StartCallRecordingResult;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * Set the AZURE_TEST_MODE environment variable to either PLAYBACK or RECORD to determine if tests are playback or
 * live. By default, tests are run in playback mode. The runAllClientFunctions and runAllClientFunctionsWithResponse
 * test will not run in LIVE or RECORD as they cannot get their own conversationId.
 */
public class ConversationClientTests extends CallingServerTestBase {
    private String conversationId = "aHR0cHM6Ly9jb252LXVzc2MtMDkuY29udi5za3lwZS5jb20vY29udi9LQTd3NzZVZk4wcUVKc1dOSFBwOHB3P2k9MTg5JmU9NjM3NTc4Mjc3MjE0Mzg0Njkz";

    @ParameterizedTest
    @MethodSource("com.azure.core.test.TestBase#getHttpClients")
    public void runAllClientFunctions(HttpClient httpClient) throws URISyntaxException, InterruptedException {
        ConversationClientBuilder builder = getConversationClientUsingConnectionString(httpClient);
        ConversationClient conversationAsyncClient = setupClient(builder, "runAllClientFunctions");
        String recordingId = "";        
        URI recordingStateCallbackUri = new URI("https://dev.skype.net:6448");

        try {
            StartCallRecordingResult startCallRecordingResponse = conversationAsyncClient.startRecording(conversationId, recordingStateCallbackUri);
            recordingId = startCallRecordingResponse.getRecordingId();
            validateCallRecordingState(conversationAsyncClient, conversationId, recordingId, CallRecordingState.ACTIVE);

            conversationAsyncClient.pauseRecording(conversationId, recordingId);
            validateCallRecordingState(conversationAsyncClient, conversationId, recordingId, CallRecordingState.INACTIVE);

            conversationAsyncClient.resumeRecording(conversationId, recordingId);
            validateCallRecordingState(conversationAsyncClient, conversationId, recordingId, CallRecordingState.ACTIVE);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            throw e;
        } finally {
            conversationAsyncClient.stopRecording(conversationId, recordingId);
        }
    }

    @ParameterizedTest
    @MethodSource("com.azure.core.test.TestBase#getHttpClients")
    public void runAllClientFunctionsWithResponse(HttpClient httpClient) throws URISyntaxException, InterruptedException {
        ConversationClientBuilder builder = getConversationClientUsingConnectionString(httpClient);
        ConversationClient conversationClient = setupClient(builder, "runAllClientFunctions");
        String recordingId = "";        
        URI recordingStateCallbackUri = new URI("https://dev.skype.net:6448");
        System.out.println("conversationId: " + conversationId);

        try {
            Response<StartCallRecordingResult> response = conversationClient.startRecordingWithResponse(conversationId, recordingStateCallbackUri, Context.NONE);
            assertEquals(response.getStatusCode(), 200);
            StartCallRecordingResult startCallRecordingResponse = response.getValue();
            recordingId = startCallRecordingResponse.getRecordingId();
            validateCallRecordingState(conversationClient, conversationId, recordingId, CallRecordingState.ACTIVE);

            conversationClient.pauseRecording(conversationId, recordingId);
            validateCallRecordingState(conversationClient, conversationId, recordingId, CallRecordingState.INACTIVE);

            conversationClient.resumeRecording(conversationId, recordingId);
            validateCallRecordingState(conversationClient, conversationId, recordingId, CallRecordingState.ACTIVE);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            throw e;
        } finally {
            conversationClient.stopRecording(conversationId, recordingId);
        }
    }

    @ParameterizedTest
    @MethodSource("com.azure.core.test.TestBase#getHttpClients")
    public void startRecordingFails(HttpClient httpClient) throws URISyntaxException, InterruptedException {
        ConversationClientBuilder builder = getConversationClientUsingConnectionString(httpClient);
        ConversationClient conversationClient = setupClient(builder, "runAllClientFunctions");
        var invalidConversationId = "aHR0cHM6Ly9jb252LXVzd2UtMDkuY29udi5za3lwZS5jb20vY29udi9EZVF2WEJGVVlFV1NNZkFXYno2azN3P2k9MTEmZT02Mzc1NzIyMjk0Mjc0NTI4Nzk=";       
        URI recordingStateCallbackUri = new URI("https://dev.skype.net:6448");
        System.out.println("conversationId: " + invalidConversationId);

        try {
            Response<StartCallRecordingResult> response = conversationClient.startRecordingWithResponse(invalidConversationId, recordingStateCallbackUri, Context.NONE);
            assertEquals(response.getStatusCode(), 400);
        } catch (CommunicationErrorException e) {
            assertEquals(e.getResponse().getStatusCode(), 400);
        }
    }
    
    private ConversationClient setupClient(ConversationClientBuilder builder, String testName) {
        return addLoggingPolicy(builder, testName).buildClient();
    }

    protected ConversationClientBuilder addLoggingPolicy(ConversationClientBuilder builder, String testName) {
        return builder.addPolicy((context, next) -> logHeaders(testName, next));
    }
    
    private void validateCallRecordingState(ConversationClient conversationClient, String conversationId, String recordingId, CallRecordingState expectedCallRecordingState) throws InterruptedException {
        assertNotNull(recordingId);
        assertNotNull(conversationId);

        /** 
         * There is a delay bewteen the action and when the state is available.
         * Waiting to make sure we get the updated state, when we are running
         * against a live service. 
         */
        sleepIfRunningAgainstService(6000);

        GetCallRecordingStateResult callRecordingStateResult = conversationClient.getRecordingState(conversationId, recordingId);
        assertEquals(callRecordingStateResult.getRecordingState(), expectedCallRecordingState);
    }
}
