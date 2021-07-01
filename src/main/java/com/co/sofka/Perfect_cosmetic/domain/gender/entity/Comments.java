package com.co.sofka.Perfect_cosmetic.domain.gender.entity;
import co.com.sofka.domain.generic.Entity;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.Contents;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.UserId;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.CommentsId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "Comentarios")
public class Comments extends Entity<CommentsId> {

 @Id
 protected String idComments;
 protected UserId userId;
 protected Contents contents;


    public Comments(CommentsId entityId,UserId userId, Contents contents) {
        super(entityId);
        this.idComments =  entityId.value();
        this.userId = userId;
        this.contents = contents;

    }



    public UserId getUserId() {
        return userId;
    }

    public Contents getContents() {
        return contents;
    }

    public String getIdComments() {
        return idComments;
    }

    public void setIdComments(String idComments) {
        idComments = idComments;
    }
}
