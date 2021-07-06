package com.co.sofka.Perfect_cosmetic.domain.gender.repository;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection = "UserPage")
public class UserPageData {

    @Id
    protected String id;
    protected String nameUser;
    protected String email;

    public UserPageData(String id, String nameUser, String email) {
        this.id = id;
        this.nameUser = nameUser;
        this.email = email;
    }

    public UserPageData(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
