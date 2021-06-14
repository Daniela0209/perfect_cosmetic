package com.co.sofka.Perfect_cosmetic.domain.gender.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.Other;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.Feminine;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.GenderId;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.Male;

public class GenderCreated extends DomainEvent {

    private final GenderId genderId;
    private final Feminine feminine;
    private final Male male;
    private final Other other;

    public GenderCreated(GenderId genderId, Feminine feminine, Male male, Other other) {
        super("Perfectcosmetic.gender,create");
        this.genderId = genderId;
        this.feminine = feminine;
        this.male = male;
        this.other = other;
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
}
