package com.co.sofka.Perfect_cosmetic.domain.gender.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.GenderId;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.GenderUser;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.UserName;

public class GenderUpdate extends DomainEvent {

    private final GenderId genderId;
    private final GenderUser genderUser;
    private final UserName username;

    public GenderUpdate(GenderId genderId, GenderUser genderUser, UserName username) {
        super("gender.updated");
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
