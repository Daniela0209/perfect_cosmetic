package com.co.sofka.Perfect_cosmetic.domain.gender.entity;

import co.com.sofka.domain.generic.Entity;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.Contents;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.UserId;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.CommentsId;

public class comments extends Entity<CommentsId> {

 protected CommentsId commentsId;
 protected UserId userId;
 protected Contents contents;

    public comments(CommentsId entityId) {
        super(entityId);
    }
}
