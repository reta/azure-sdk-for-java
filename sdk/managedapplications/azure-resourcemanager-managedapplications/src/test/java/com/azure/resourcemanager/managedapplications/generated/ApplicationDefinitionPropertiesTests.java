// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managedapplications.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managedapplications.fluent.models.ApplicationDefinitionProperties;
import com.azure.resourcemanager.managedapplications.models.ApplicationArtifact;
import com.azure.resourcemanager.managedapplications.models.ApplicationArtifactType;
import com.azure.resourcemanager.managedapplications.models.ApplicationLockLevel;
import com.azure.resourcemanager.managedapplications.models.ApplicationProviderAuthorization;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ApplicationDefinitionPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ApplicationDefinitionProperties model =
            BinaryData
                .fromString(
                    "{\"lockLevel\":\"ReadOnly\",\"displayName\":\"ujysvle\",\"isEnabled\":\"vfqawrlyxwjkcpr\",\"authorizations\":[{\"principalId\":\"wbxgjvt\",\"roleDefinitionId\":\"vpys\"},{\"principalId\":\"zdn\",\"roleDefinitionId\":\"uj\"},{\"principalId\":\"guhmuouqfpr\",\"roleDefinitionId\":\"zw\"},{\"principalId\":\"nguitnwuizgazxu\",\"roleDefinitionId\":\"izuckyfihrfidfvz\"}],\"artifacts\":[{\"name\":\"htymw\",\"uri\":\"dkfthwxmnt\",\"type\":\"Custom\"},{\"name\":\"opvkmijcm\",\"uri\":\"dcuf\",\"type\":\"Template\"},{\"name\":\"pymzidnsezcxtbzs\",\"uri\":\"yc\",\"type\":\"Custom\"},{\"name\":\"wmdwzjeiachboo\",\"uri\":\"lnrosfqp\",\"type\":\"Custom\"}],\"description\":\"zzvypyqrimzinp\",\"packageFileUri\":\"wjdk\",\"mainTemplate\":\"datasoodqxhcrmnoh\",\"createUiDefinition\":\"datackwhds\"}")
                .toObject(ApplicationDefinitionProperties.class);
        Assertions.assertEquals(ApplicationLockLevel.READ_ONLY, model.lockLevel());
        Assertions.assertEquals("ujysvle", model.displayName());
        Assertions.assertEquals("vfqawrlyxwjkcpr", model.isEnabled());
        Assertions.assertEquals("wbxgjvt", model.authorizations().get(0).principalId());
        Assertions.assertEquals("vpys", model.authorizations().get(0).roleDefinitionId());
        Assertions.assertEquals("htymw", model.artifacts().get(0).name());
        Assertions.assertEquals("dkfthwxmnt", model.artifacts().get(0).uri());
        Assertions.assertEquals(ApplicationArtifactType.CUSTOM, model.artifacts().get(0).type());
        Assertions.assertEquals("zzvypyqrimzinp", model.description());
        Assertions.assertEquals("wjdk", model.packageFileUri());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ApplicationDefinitionProperties model =
            new ApplicationDefinitionProperties()
                .withLockLevel(ApplicationLockLevel.READ_ONLY)
                .withDisplayName("ujysvle")
                .withIsEnabled("vfqawrlyxwjkcpr")
                .withAuthorizations(
                    Arrays
                        .asList(
                            new ApplicationProviderAuthorization()
                                .withPrincipalId("wbxgjvt")
                                .withRoleDefinitionId("vpys"),
                            new ApplicationProviderAuthorization().withPrincipalId("zdn").withRoleDefinitionId("uj"),
                            new ApplicationProviderAuthorization()
                                .withPrincipalId("guhmuouqfpr")
                                .withRoleDefinitionId("zw"),
                            new ApplicationProviderAuthorization()
                                .withPrincipalId("nguitnwuizgazxu")
                                .withRoleDefinitionId("izuckyfihrfidfvz")))
                .withArtifacts(
                    Arrays
                        .asList(
                            new ApplicationArtifact()
                                .withName("htymw")
                                .withUri("dkfthwxmnt")
                                .withType(ApplicationArtifactType.CUSTOM),
                            new ApplicationArtifact()
                                .withName("opvkmijcm")
                                .withUri("dcuf")
                                .withType(ApplicationArtifactType.TEMPLATE),
                            new ApplicationArtifact()
                                .withName("pymzidnsezcxtbzs")
                                .withUri("yc")
                                .withType(ApplicationArtifactType.CUSTOM),
                            new ApplicationArtifact()
                                .withName("wmdwzjeiachboo")
                                .withUri("lnrosfqp")
                                .withType(ApplicationArtifactType.CUSTOM)))
                .withDescription("zzvypyqrimzinp")
                .withPackageFileUri("wjdk")
                .withMainTemplate("datasoodqxhcrmnoh")
                .withCreateUiDefinition("datackwhds");
        model = BinaryData.fromObject(model).toObject(ApplicationDefinitionProperties.class);
        Assertions.assertEquals(ApplicationLockLevel.READ_ONLY, model.lockLevel());
        Assertions.assertEquals("ujysvle", model.displayName());
        Assertions.assertEquals("vfqawrlyxwjkcpr", model.isEnabled());
        Assertions.assertEquals("wbxgjvt", model.authorizations().get(0).principalId());
        Assertions.assertEquals("vpys", model.authorizations().get(0).roleDefinitionId());
        Assertions.assertEquals("htymw", model.artifacts().get(0).name());
        Assertions.assertEquals("dkfthwxmnt", model.artifacts().get(0).uri());
        Assertions.assertEquals(ApplicationArtifactType.CUSTOM, model.artifacts().get(0).type());
        Assertions.assertEquals("zzvypyqrimzinp", model.description());
        Assertions.assertEquals("wjdk", model.packageFileUri());
    }
}
