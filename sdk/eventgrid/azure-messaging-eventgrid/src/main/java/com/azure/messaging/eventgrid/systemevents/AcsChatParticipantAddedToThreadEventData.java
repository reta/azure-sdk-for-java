// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Schema of the Data property of an EventGridEvent for a Microsoft.Communication.ChatThreadParticipantAdded event. */
@Fluent
public final class AcsChatParticipantAddedToThreadEventData extends AcsChatEventInThreadBaseProperties {
    /*
     * The time at which the user was added to the thread
     */
    @JsonProperty(value = "time")
    private OffsetDateTime time;

    /*
     * The communication identifier of the user who added the user
     */
    @JsonProperty(value = "addedByCommunicationIdentifier")
    private CommunicationIdentifierModel addedByCommunicationIdentifier;

    /*
     * The details of the user who was added
     */
    @JsonProperty(value = "participantAdded")
    private AcsChatThreadParticipantProperties participantAdded;

    /*
     * The version of the thread
     */
    @JsonProperty(value = "version")
    private Long version;

    /**
     * Get the time property: The time at which the user was added to the thread.
     *
     * @return the time value.
     */
    public OffsetDateTime getTime() {
        return this.time;
    }

    /**
     * Set the time property: The time at which the user was added to the thread.
     *
     * @param time the time value to set.
     * @return the AcsChatParticipantAddedToThreadEventData object itself.
     */
    public AcsChatParticipantAddedToThreadEventData setTime(OffsetDateTime time) {
        this.time = time;
        return this;
    }

    /**
     * Get the addedByCommunicationIdentifier property: The communication identifier of the user who added the user.
     *
     * @return the addedByCommunicationIdentifier value.
     */
    public CommunicationIdentifierModel getAddedByCommunicationIdentifier() {
        return this.addedByCommunicationIdentifier;
    }

    /**
     * Set the addedByCommunicationIdentifier property: The communication identifier of the user who added the user.
     *
     * @param addedByCommunicationIdentifier the addedByCommunicationIdentifier value to set.
     * @return the AcsChatParticipantAddedToThreadEventData object itself.
     */
    public AcsChatParticipantAddedToThreadEventData setAddedByCommunicationIdentifier(
            CommunicationIdentifierModel addedByCommunicationIdentifier) {
        this.addedByCommunicationIdentifier = addedByCommunicationIdentifier;
        return this;
    }

    /**
     * Get the participantAdded property: The details of the user who was added.
     *
     * @return the participantAdded value.
     */
    public AcsChatThreadParticipantProperties getParticipantAdded() {
        return this.participantAdded;
    }

    /**
     * Set the participantAdded property: The details of the user who was added.
     *
     * @param participantAdded the participantAdded value to set.
     * @return the AcsChatParticipantAddedToThreadEventData object itself.
     */
    public AcsChatParticipantAddedToThreadEventData setParticipantAdded(
            AcsChatThreadParticipantProperties participantAdded) {
        this.participantAdded = participantAdded;
        return this;
    }

    /**
     * Get the version property: The version of the thread.
     *
     * @return the version value.
     */
    public Long getVersion() {
        return this.version;
    }

    /**
     * Set the version property: The version of the thread.
     *
     * @param version the version value to set.
     * @return the AcsChatParticipantAddedToThreadEventData object itself.
     */
    public AcsChatParticipantAddedToThreadEventData setVersion(Long version) {
        this.version = version;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AcsChatParticipantAddedToThreadEventData setTransactionId(String transactionId) {
        super.setTransactionId(transactionId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AcsChatParticipantAddedToThreadEventData setThreadId(String threadId) {
        super.setThreadId(threadId);
        return this;
    }
}
