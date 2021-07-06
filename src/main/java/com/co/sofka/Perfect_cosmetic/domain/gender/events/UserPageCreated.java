package com.co.sofka.Perfect_cosmetic.domain.gender.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.Email;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.NameUser;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.UserPageId;

public class UserPageCreated extends DomainEvent {

    private final UserPageId userPageId;
    private final NameUser nameUser;
    private final Email email;

    public UserPageCreated(UserPageId userPageId, NameUser nameUser, Email email) {
        super("userpage.created");
        this.userPageId = userPageId;
        this.nameUser = nameUser;
        this.email = email;
    }

    public UserPageId getUserPageId() {
        return userPageId;
    }

    public NameUser nameUser() {
        return nameUser;
    }

    public Email email() {
        return email;
    }
}
