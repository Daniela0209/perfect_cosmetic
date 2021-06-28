package com.co.sofka.Perfect_cosmetic.domain.gender.entity;

import com.co.sofka.Perfect_cosmetic.domain.gender.values.Contents;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.UserId;

public final class CommentsBuilder {
    protected UserId userId;
    protected Contents contents;

    private CommentsBuilder() {
    }

    public static CommentsBuilder aComments() {
        return new CommentsBuilder();
    }

    public CommentsBuilder withUserId(UserId userId) {
        this.userId = userId;
        return this;
    }

    public CommentsBuilder withContents(Contents contents) {
        this.contents = contents;
        return this;
    }

    public Comments build() {
        return new Comments(null, userId, contents);
    }
}
