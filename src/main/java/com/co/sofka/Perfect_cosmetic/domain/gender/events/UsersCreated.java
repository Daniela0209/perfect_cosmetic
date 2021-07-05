package com.co.sofka.Perfect_cosmetic.domain.gender.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.UsersId;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.Email;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.NameUser;


public class UsersCreated extends DomainEvent {

    private final UsersId usersId;
    private final NameUser nameUser;
    private final Email email;

    public UsersCreated(UsersId usersId, NameUser nameUser, Email email) {
        super("users.create");
        this.usersId = usersId;
        this.nameUser = nameUser;
        this.email = email;
    }

    public UsersId usersId() {
        return usersId;
    }

    public NameUser nameUser() {
        return nameUser;
    }

    public Email email() {
        return email;
    }
}
