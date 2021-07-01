package com.co.sofka.Perfect_cosmetic.domain.gender.repository;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Comments")
public class CommentsData {

    @Id
    protected String idComments;
    protected String userId;
    protected String contents;


    public CommentsData(String idComments, String userId, String contents) {
        idComments = idComments;
        this.userId = userId;
        this.contents = contents;
    }



    public CommentsData(){

    }

    public String getIdComments() {
        return idComments;
    }

    public void setIdComments(String idComments) {
        idComments = idComments;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }


}
