// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.communication.jobrouter;

import com.azure.communication.jobrouter.models.AcceptJobOfferResult;
import com.azure.communication.jobrouter.models.CancelJobOptions;
import com.azure.communication.jobrouter.models.CreateDistributionPolicyOptions;
import com.azure.communication.jobrouter.models.CreateJobOptions;
import com.azure.communication.jobrouter.models.CreateQueueOptions;
import com.azure.communication.jobrouter.models.CreateWorkerOptions;
import com.azure.communication.jobrouter.models.DistributionPolicy;
import com.azure.communication.jobrouter.models.LabelOperator;
import com.azure.communication.jobrouter.models.LongestIdleMode;
import com.azure.communication.jobrouter.models.RouterChannel;
import com.azure.communication.jobrouter.models.RouterJob;
import com.azure.communication.jobrouter.models.RouterJobNote;
import com.azure.communication.jobrouter.models.RouterJobOffer;
import com.azure.communication.jobrouter.models.RouterQueue;
import com.azure.communication.jobrouter.models.RouterQueueStatistics;
import com.azure.communication.jobrouter.models.RouterValue;
import com.azure.communication.jobrouter.models.RouterWorker;
import com.azure.communication.jobrouter.models.RouterWorkerSelector;
import com.azure.communication.jobrouter.models.UnassignJobResult;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.time.Duration;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RouterJobAsyncLiveTests extends JobRouterTestBase {

    @ParameterizedTest
    @MethodSource("com.azure.core.test.TestBase#getHttpClients")
    public void unassignJob(HttpClient httpClient) {
        // Setup
        JobRouterAsyncClient jobRouterAsyncClient = getRouterAsyncClient(httpClient);
        JobRouterAdministrationAsyncClient administrationAsyncClient = getRouterAdministrationAsyncClient(httpClient);
        String testName = "unassign-job-async-test";

        String distributionPolicyId = String.format("%s-%s-DistributionPolicy", JAVA_LIVE_TESTS, testName);
        DistributionPolicy distributionPolicy = administrationAsyncClient.createDistributionPolicy(
            new CreateDistributionPolicyOptions(distributionPolicyId, Duration.ofSeconds(100), new LongestIdleMode())).block();

        String queueId = String.format("%s-%s-Queue", JAVA_LIVE_TESTS, testName);
        RouterQueue jobQueue = administrationAsyncClient.createQueue(new CreateQueueOptions(queueId, distributionPolicy.getId())).block();
        String workerId = String.format("%s-%s-Worker", JAVA_LIVE_TESTS, testName);
        String channelId = String.format("%s-%s-Channel", JAVA_LIVE_TESTS, testName);

        RouterWorker createdWorker = jobRouterAsyncClient.createWorker(new CreateWorkerOptions(workerId, 10)
            .setLabels(new HashMap<String, RouterValue>() {
                {
                    put("IntKey", new RouterValue(4));
                    put("BoolKey", new RouterValue(true));
                    put("StringLabel", new RouterValue("test"));
                }
            })
            .setTags(new HashMap<String, RouterValue>() {
                {
                    put("IntTag", new RouterValue(5));
                    put("BoolTag", new RouterValue(false));
                    put("StringTag", new RouterValue("test2"));
                }
            })
            .setAvailableForOffers(true)
            .setChannels(Collections.singletonList(new RouterChannel(channelId, 1)))
            .setQueues(Collections.singletonList(jobQueue.getId())))
            .block();

        String jobId = String.format("%s-%s-Job", JAVA_LIVE_TESTS, testName);
        CreateJobOptions createJobOptions = new CreateJobOptions(jobId, channelId, queueId)
            .setLabels(new HashMap<String, RouterValue>() {
                {
                    put("IntLabel", new RouterValue(10));
                    put("BoolLabel", new RouterValue(true));
                    put("StringLabel", new RouterValue("test"));
                    put("DoubleValue", new RouterValue(5.3));
                }
            })
            .setTags(new HashMap<String, RouterValue>() {
                {
                    put("IntTag", new RouterValue(5));
                    put("BoolTag", new RouterValue(false));
                    put("StringTag", new RouterValue("test2"));
                }
            })
            .setRequestedWorkerSelectors(Arrays.asList(
                new RouterWorkerSelector("IntKey", LabelOperator.GREATER_THAN, new RouterValue(2))
                    .setExpedite(true).setExpiresAfter(Duration.ofSeconds(100)),
                new RouterWorkerSelector("BoolKey", LabelOperator.EQUAL, new RouterValue(true))))
            .setNotes(Collections.singletonList(new RouterJobNote("Note1")))
            .setDispositionCode("code1")
            .setChannelReference("ref")
            .setPriority(5);

        RouterJob job = jobRouterAsyncClient.createJob(createJobOptions).block();

        // Verify
        assertEquals(jobId, job.getId());
        assertNotNull(job.getEtag());
        assertEquals(4, job.getLabels().size());
        assertEquals(3, job.getTags().size());
        assertEquals(1, job.getNotes().size());
        assertEquals("code1", job.getDispositionCode());
        assertEquals("ref", job.getChannelReference());
        assertEquals(5, job.getPriority());
        assertEquals(2, job.getRequestedWorkerSelectors().size());
        assertEquals(Duration.ofSeconds(100), job.getRequestedWorkerSelectors().get(0).getExpiresAfter());

        Response<BinaryData> jobResponse = jobRouterAsyncClient.getJobWithResponse(job.getId(), null).block();
        RouterJob jobDeserialized = jobResponse.getValue().toObject(RouterJob.class);

        // Verify
        assertEquals(jobId, jobDeserialized.getId());
        assertNotNull(jobDeserialized.getEtag());
        assertEquals(4, jobDeserialized.getLabels().size());
        assertEquals(3, jobDeserialized.getTags().size());
        assertEquals(1, jobDeserialized.getNotes().size());
        assertEquals("code1", jobDeserialized.getDispositionCode());
        assertEquals("ref", jobDeserialized.getChannelReference());
        assertEquals(5, jobDeserialized.getPriority());
        assertEquals(2, jobDeserialized.getRequestedWorkerSelectors().size());
        assertEquals(Duration.ofSeconds(100), jobDeserialized.getRequestedWorkerSelectors().get(0).getExpiresAfter());

        sleepIfRunningAgainstService(2000);

        jobDeserialized.setPriority(10);
        RouterJob updatedJob = jobRouterAsyncClient.updateJob(jobId, jobDeserialized).block();

        // Verify
        assertEquals(jobId, updatedJob.getId());
        assertNotNull(updatedJob.getEtag());
        assertEquals(4, updatedJob.getLabels().size());
        assertEquals(3, updatedJob.getTags().size());
        assertEquals(1, updatedJob.getNotes().size());
        assertEquals("code1", updatedJob.getDispositionCode());
        assertEquals("ref", updatedJob.getChannelReference());
        assertEquals(10, updatedJob.getPriority());
        assertEquals(2, updatedJob.getRequestedWorkerSelectors().size());
        assertEquals(Duration.ofSeconds(100), updatedJob.getRequestedWorkerSelectors().get(0).getExpiresAfter());

        jobRouterAsyncClient.listJobs(null, queueId, channelId, null, null, null)
            .subscribe(listJob -> {
                assertEquals(jobId, listJob.getId());
                assertNotNull(listJob.getEtag());
                assertEquals(4, listJob.getLabels().size());
                assertEquals(3, listJob.getTags().size());
                assertEquals(1, listJob.getNotes().size());
                assertEquals("code1", listJob.getDispositionCode());
                assertEquals("ref", listJob.getChannelReference());
                assertEquals(10, listJob.getPriority());
                assertEquals(2, listJob.getRequestedWorkerSelectors().size());
                assertEquals(Duration.ofSeconds(100), listJob.getRequestedWorkerSelectors().get(0).getExpiresAfter());
            });

        List<RouterJobOffer> jobOffers;
        long startTimeMillis = System.currentTimeMillis();
        while (true) {
            RouterWorker worker = jobRouterAsyncClient.getWorker(workerId).block();
            jobOffers = worker.getOffers();
            if (!jobOffers.isEmpty() || System.currentTimeMillis() - startTimeMillis > 10000) {
                break;
            }
        }

        assertEquals(1, jobOffers.size());

        RouterJobOffer offer = jobOffers.get(0);

        AcceptJobOfferResult acceptJobOfferResult = jobRouterAsyncClient.acceptJobOffer(workerId, offer.getOfferId()).block();

        String assignmentId = acceptJobOfferResult.getAssignmentId();

        // Action
        UnassignJobResult unassignJobResult = jobRouterAsyncClient.unassignJob(jobId, assignmentId).block();

        // Verify
        assertTrue(unassignJobResult.getUnassignmentCount() > 0);

        sleepIfRunningAgainstService(5000);

        RouterQueueStatistics queueStatistics = jobRouterAsyncClient.getQueueStatistics(queueId).block();

        // Verify
        assertEquals(queueId, queueStatistics.getQueueId());
        assertEquals(1, queueStatistics.getLength());
        assertTrue(queueStatistics.getLongestJobWaitTimeMinutes() > 0);
        assertTrue(queueStatistics.getEstimatedWaitTime().get(10).getSeconds() > 0);

        RouterQueueStatistics deserialized = jobRouterAsyncClient.getQueueStatisticsWithResponse(queueId, null)
            .block().getValue().toObject(RouterQueueStatistics.class);
        assertEquals(queueId, deserialized.getQueueId());
        assertEquals(1, deserialized.getLength());
        assertTrue(deserialized.getLongestJobWaitTimeMinutes() > 0);
        assertTrue(deserialized.getEstimatedWaitTime().get(10).getSeconds() > 0);

        RequestOptions requestOptions = new RequestOptions();
        CancelJobOptions cancelJobOptions = new CancelJobOptions()
            .setDispositionCode("dispositionCode")
            .setNote("note");
        requestOptions.setBody(BinaryData.fromObject(cancelJobOptions));

        // Cleanup
        jobRouterAsyncClient.cancelJob(jobId, requestOptions).block();
        jobRouterAsyncClient.deleteJob(jobId).block();
        jobRouterAsyncClient.deleteWorker(workerId).block();
        sleepIfRunningAgainstService(5000);
        administrationAsyncClient.deleteQueue(queueId).block();
        administrationAsyncClient.deleteDistributionPolicy(distributionPolicyId).block();
    }
}
