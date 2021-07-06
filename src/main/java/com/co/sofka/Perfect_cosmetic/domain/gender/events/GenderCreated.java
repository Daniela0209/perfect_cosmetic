package com.co.sofka.Perfect_cosmetic.domain.gender.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.*;

public class GenderCreated extends DomainEvent {

    private final GenderId genderId;
    private final GenderUser genderUser;
    private final UserName username;


    public GenderCreated(GenderId genderId, GenderUser genderUser, UserName username) {
        super("gender.created");
        this.genderId = genderId;
        this.genderUser = genderUser;
        this.username = username;
    }

    public GenderId getGenderId() {
        return genderId;
    }

    public GenderUser genderUser() {
        return genderUser;
    }

    public UserName username() {
        return username;
    }
}
