package com.co.sofka.Perfect_cosmetic.domain.gender.commands;

import co.com.sofka.domain.generic.Command;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.GenderId;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.Male;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.Other;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.Feminine;

public class CreateGender implements Command {

    private final GenderId genderId;
    private final Feminine feminine;
    private final Male male;
    private final Other other;

    public CreateGender(GenderId genderId, Feminine feminine, Male male, Other other) {
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

