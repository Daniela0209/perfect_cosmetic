package com.co.sofka.Perfect_cosmetic.domain.gender.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.CommentsId;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.Contents;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.UserId;

public class CommentsUpdate extends DomainEvent {

    private final CommentsId commentsId;
    private final UserId userId;
    private final Contents contents;

    public CommentsUpdate(CommentsId commentsId, UserId userId, Contents contents) {
        super("comments.updated");
        this.commentsId = commentsId;
        this.userId = userId;
        this.contents = contents;
    }

    public CommentsId getCommentsId() {
        return commentsId;
    }

    public UserId userId() {
        return userId;
    }

    public Contents contents() {
        return contents;
    }
}
