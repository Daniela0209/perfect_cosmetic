package com.co.sofka.Perfect_cosmetic.domain.gender.commands;

import co.com.sofka.domain.generic.Command;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.CommentsId;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.Contents;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.UserId;

public class CreateComments implements Command {
    private final CommentsId commentsId;
    private final UserId userId;
    private final Contents contents;

    public CreateComments(CommentsId commentsId, UserId userId, Contents contents) {
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
