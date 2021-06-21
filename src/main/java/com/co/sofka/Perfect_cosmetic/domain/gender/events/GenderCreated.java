package com.co.sofka.Perfect_cosmetic.domain.gender.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.*;

public class GenderCreated extends DomainEvent {

    private final GenderId genderId;
    private final Feminine feminine;
    private final Male male;
    private final Other other;
    private final UserGender userGender;

    public GenderCreated(GenderId genderId, Feminine feminine, Male male, Other other, UserGender userGender) {
        super("Perfectcosmetic.gender.create");
        this.genderId = genderId;
        this.feminine = feminine;
        this.male = male;
        this.other = other;
        this.userGender = userGender;
    }

    public GenderId GenderId() {
        return genderId;
    }

    public Feminine Feminine() {
        return feminine;
    }

    public Male Male() {
        return male;
    }

    public Other Other() {
        return other;
    }

    public UserGender UserGender() {
        return userGender;
    }
}
