// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.dataprotection.DataProtectionManager;
import com.azure.resourcemanager.dataprotection.models.ClientDiscoveryValueForSingleApi;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class DataProtectionOperationsListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"display\":{\"description\":\"zzp\",\"operation\":\"a\",\"provider\":\"sdzhezww\",\"resource\":\"iqyuvvfo\"},\"name\":\"p\",\"isDataAction\":false,\"origin\":\"ikvylauya\",\"properties\":{\"serviceSpecification\":{\"logSpecifications\":[{\"blobDuration\":\"csttijfybvpoekr\",\"displayName\":\"sgbdhuz\",\"name\":\"njdgkynscliq\"},{\"blobDuration\":\"vhxnk\",\"displayName\":\"tkubotppn\",\"name\":\"xz\"},{\"blobDuration\":\"ihfrbbcevqa\",\"displayName\":\"ltd\",\"name\":\"fkqojpy\"},{\"blobDuration\":\"gtrd\",\"displayName\":\"ifmzzsd\",\"name\":\"brn\"}]}}}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        DataProtectionManager manager = DataProtectionManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<ClientDiscoveryValueForSingleApi> response
            = manager.dataProtectionOperations().list(com.azure.core.util.Context.NONE);

        Assertions.assertEquals("zzp", response.iterator().next().display().description());
        Assertions.assertEquals("a", response.iterator().next().display().operation());
        Assertions.assertEquals("sdzhezww", response.iterator().next().display().provider());
        Assertions.assertEquals("iqyuvvfo", response.iterator().next().display().resource());
        Assertions.assertEquals("p", response.iterator().next().name());
        Assertions.assertEquals(false, response.iterator().next().isDataAction());
        Assertions.assertEquals("ikvylauya", response.iterator().next().origin());
        Assertions.assertEquals("csttijfybvpoekr",
            response.iterator().next().properties().serviceSpecification().logSpecifications().get(0).blobDuration());
        Assertions.assertEquals("sgbdhuz",
            response.iterator().next().properties().serviceSpecification().logSpecifications().get(0).displayName());
        Assertions.assertEquals("njdgkynscliq",
            response.iterator().next().properties().serviceSpecification().logSpecifications().get(0).name());
    }
}
