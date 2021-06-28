package com.co.sofka.Perfect_cosmetic.domain.gender.entity;
import co.com.sofka.domain.generic.Entity;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.Contents;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.UserId;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.CommentsId;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collation = "Comentarios")
public class Comments extends Entity<CommentsId> {

 protected CommentsId commentsId;
 protected UserId userId;
 protected Contents contents;


    public Comments(CommentsId commentsId, UserId userId, Contents contents) {
        super(commentsId);
        this.commentsId = commentsId;
        this.userId = userId;
        this.contents = contents;
    }

    public CommentsId getCommentsId() {
        return commentsId;
    }

    public UserId getUserId() {
        return userId;
    }

    public Contents getContents() {
        return contents;
    }
}
