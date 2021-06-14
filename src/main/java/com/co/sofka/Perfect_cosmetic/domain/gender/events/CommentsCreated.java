package com.co.sofka.Perfect_cosmetic.domain.gender.events;

import co.com.sofka.domain.generic.DomainEvent;

import java.util.UUID;

public class CommentsCreated extends DomainEvent {
    public CommentsCreated(String type, String aggregateRootId, UUID uuid) {
        super(type, aggregateRootId, uuid);
    }
}
