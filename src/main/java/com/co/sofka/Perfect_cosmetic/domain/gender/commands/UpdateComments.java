package com.co.sofka.Perfect_cosmetic.domain.gender.commands;

import co.com.sofka.domain.generic.Command;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.CommentsId;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.Contents;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.UserId;

public class UpdateComments implements Command {

    private final CommentsId commentsId;
    private final UserId userId;
    private final Contents contents;

    public UpdateComments(CommentsId commentsId, UserId userId, Contents contents) {
        this.commentsId = commentsId;
        this.userId = userId;
        this.contents = contents;
    }

    public CommentsId commentsId() {
        return commentsId;
    }

    public UserId userId() {
        return userId;
    }

    public Contents contents() {
        return contents;
    }
}
