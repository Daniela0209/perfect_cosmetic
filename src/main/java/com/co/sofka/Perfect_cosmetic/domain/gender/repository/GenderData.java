package com.co.sofka.Perfect_cosmetic.domain.gender.repository;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Gender")
public class GenderData {

    @Id
    protected String id;
    protected String genderUser;
    protected String userName;

    public GenderData(String id, String genderUser, String userName) {
        this.id = id;
        this.genderUser = genderUser;
        this.userName = userName;
    }

    public GenderData(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGenderUser() {
        return genderUser;
    }

    public void setGenderUser(String genderUser) {
        this.genderUser = genderUser;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}


