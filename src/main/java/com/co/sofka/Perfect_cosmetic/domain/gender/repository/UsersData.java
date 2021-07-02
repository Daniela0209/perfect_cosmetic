package com.co.sofka.Perfect_cosmetic.domain.gender.repository;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Users")
public class UsersData {

    @Id
    protected String idUsers;
    protected String usersId;
    protected String nameUser;
    protected String email;


    public UsersData(String idUsers, String usersId, String nameUser, String email) {
        idUsers = idUsers;
        this.usersId = usersId;
        this.nameUser = nameUser;
        this.email = email;
    }


    public UsersData(){

    }

    public String getIdUsers() {
        return idUsers;
    }

    public void setIdUsers(String idUsers) {
        idUsers = idUsers;
    }

    public String getUsersId() {
        return usersId;
    }

    public void setUsersId(String usersId) {
        this.usersId = usersId;
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

