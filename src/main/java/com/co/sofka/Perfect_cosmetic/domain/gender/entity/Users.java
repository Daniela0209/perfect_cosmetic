package com.co.sofka.Perfect_cosmetic.domain.gender.entity;

import co.com.sofka.domain.generic.Entity;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.Email;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.NameUser;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.UsersId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Usuarios")
public class Users extends Entity<UsersId> {

    @Id
    protected String idUsers;
    protected UsersId usersId;
    protected NameUser nameUser;
    protected Email email;


    public Users(UsersId entityId, NameUser nameUser, Email email) {
        super(entityId);
        this.idUsers = entityId.value();
        this.usersId = usersId;
        this.nameUser = nameUser;
        this.email = email;

    }

    public String getIdUsers() {
        return idUsers;
    }

    public UsersId getUsersId() {
        return usersId;
    }

    public NameUser getNameUser() {
        return nameUser;
    }

    public Email getEmail() {
        return email;
    }

    public void setIdUsers(String idUsers) {
        idUsers = idUsers;
    }
}

