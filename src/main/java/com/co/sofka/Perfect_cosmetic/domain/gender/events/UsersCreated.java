package com.co.sofka.Perfect_cosmetic.domain.gender.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.Email;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.NameUser;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.UsersId;

public class UsersCreated extends DomainEvent {

    private final UsersId usersId;
    private final NameUser nameUser;
    private final Email email;

    public UsersCreated(UsersId usersId, NameUser nameUser, Email email) {
        super("Perfectcosmetic.users.create");
        this.usersId = usersId;
        this.nameUser = nameUser;
        this.email = email;
    }

    public UsersId UsersId() {
        return usersId;
    }

    public NameUser NameUser() {
        return nameUser;
    }

    public Email Email() {
        return email;
    }
}
