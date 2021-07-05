package com.co.sofka.Perfect_cosmetic.domain.gender.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.*;

public class UsersUpdated extends DomainEvent {

    private final GenderId genderId;
    private final Feminine feminine;
    private final Male male;
    private final Other other;
    private final UserGender userGender;


    public UsersUpdated(GenderId genderId, Feminine feminine, Male male, Other other, UserGender userGender) {
        super("users.updated");
        this.genderId = genderId;
        this.feminine = feminine;
        this.male = male;
        this.other = other;
        this.userGender = userGender;
    }

    public GenderId getGenderId() {
        return genderId;
    }

    public Feminine feminine() {
        return feminine;
    }

    public Male male() {
        return male;
    }

    public Other other() {
        return other;
    }

    public UserGender userGender() {
        return userGender;
    }
}
