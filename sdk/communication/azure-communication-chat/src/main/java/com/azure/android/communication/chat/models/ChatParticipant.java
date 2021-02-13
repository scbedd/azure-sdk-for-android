// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.android.communication.chat.models;

import com.azure.android.communication.common.CommunicationUserIdentifier;
import com.azure.android.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.threeten.bp.OffsetDateTime;

/**
 * The ChatParticipant model.
 */
@Fluent
public final class ChatParticipant {
    /*
     * The id of the chat participant.
     */
    @JsonProperty(value = "id", required = true)
    private CommunicationUserIdentifier id;

    /*
     * Identifies a participant in Azure Communication services. A participant
     * is, for example, a phone number or an Azure communication user. This
     * model must be interpreted as a union: Apart from rawId, at most one
     * further property may be set.
     */
    @JsonProperty(value = "identifier")
    private CommunicationIdentifierModel identifier;

    /*
     * Display name for the chat participant.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * Time from which the chat history is shared with the participant. The
     * timestamp is in RFC3339 format: `yyyy-MM-ddTHH:mm:ssZ`.
     */
    @JsonProperty(value = "shareHistoryTime")
    private OffsetDateTime shareHistoryTime;

    /**
     * Get the id property: The id of the chat participant.
     *
     * @return the id value.
     */
    public CommunicationUserIdentifier getId() {
        return this.id;
    }

    /**
     * Set the id property: The id of the chat participant.
     *
     * @param id the id value to set.
     * @return the ChatParticipant object itself.
     */
    public ChatParticipant setId(CommunicationUserIdentifier id) {
        this.id = id;
        return this;
    }

    /**
     * Get the identifier property: Identifies a participant in Azure
     * Communication services. A participant is, for example, a phone number or
     * an Azure communication user. This model must be interpreted as a union:
     * Apart from rawId, at most one further property may be set.
     * 
     * @return the identifier value.
     */
    public CommunicationIdentifierModel getIdentifier() {
        return this.identifier;
    }

    /**
     * Set the identifier property: Identifies a participant in Azure
     * Communication services. A participant is, for example, a phone number or
     * an Azure communication user. This model must be interpreted as a union:
     * Apart from rawId, at most one further property may be set.
     * 
     * @param identifier the identifier value to set.
     * @return the ChatParticipant object itself.
     */
    public ChatParticipant setIdentifier(CommunicationIdentifierModel identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * Get the displayName property: Display name for the chat participant.
     *
     * @return the displayName value.
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Display name for the chat participant.
     *
     * @param displayName the displayName value to set.
     * @return the ChatParticipant object itself.
     */
    public ChatParticipant setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the shareHistoryTime property: Time from which the chat history is
     * shared with the participant. The timestamp is in RFC3339 format:
     * `yyyy-MM-ddTHH:mm:ssZ`.
     *
     * @return the shareHistoryTime value.
     */
    public OffsetDateTime getShareHistoryTime() {
        return this.shareHistoryTime;
    }

    /**
     * Set the shareHistoryTime property: Time from which the chat history is
     * shared with the participant. The timestamp is in RFC3339 format:
     * `yyyy-MM-ddTHH:mm:ssZ`.
     *
     * @param shareHistoryTime the shareHistoryTime value to set.
     * @return the ChatParticipant object itself.
     */
    public ChatParticipant setShareHistoryTime(OffsetDateTime shareHistoryTime) {
        this.shareHistoryTime = shareHistoryTime;
        return this;
    }
}
