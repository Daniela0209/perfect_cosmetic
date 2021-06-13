package com.co.sofka.Perfect_cosmetic.commands;

import co.com.sofka.domain.generic.Command;
import com.co.sofka.Perfect_cosmetic.values.Feminine;
import com.co.sofka.Perfect_cosmetic.values.GenderId;
import com.co.sofka.Perfect_cosmetic.values.Male;
import com.co.sofka.Perfect_cosmetic.values.Other;

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

