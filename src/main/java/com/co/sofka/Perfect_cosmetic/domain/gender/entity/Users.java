package com.co.sofka.Perfect_cosmetic.domain.gender.entity;

import co.com.sofka.domain.generic.Entity;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.Email;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.NameUser;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.UsersId;

public class Users extends Entity<UsersId> {

    protected UsersId usersId;
    protected NameUser nameUser;
    protected Email email;

    public Users(UsersId entityId, NameUser nameUser, Email email) {
        super(entityId);
        this.usersId = entityId;
        this.nameUser = nameUser;
        this.email = email;
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
}
