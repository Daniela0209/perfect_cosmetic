package com.co.sofka.Perfect_cosmetic.domain.gender.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.CommentsId;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.Contents;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.UserId;


public class CommentsCreated extends DomainEvent {

    private final CommentsId commentsId;
    private final UserId userId;
    private final Contents contents;


    public CommentsCreated(CommentsId commentsId, UserId userId, Contents contents) {
        super("comments.create");
        this.commentsId = commentsId;
        this.userId = userId;
        this.contents = contents;
    }

    public CommentsId CommentsId() {
        return commentsId;
    }

    public UserId UserId() {
        return userId;
    }

    public Contents Contents() {
        return contents;
    }
}
