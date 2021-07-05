package com.co.sofka.Perfect_cosmetic.domain.gender.commands;

import co.com.sofka.domain.generic.Command;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.Feminine;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.GenderId;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.Male;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.Other;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.UserGender;


public class CreateGender implements Command {

    private final GenderId genderId;
    private final Feminine feminine;
    private final Male male;
    private final Other other;
    private final UserGender userGender;


    public CreateGender(GenderId genderId, Feminine feminine, Male male, Other other, UserGender userGender) {
        this.genderId = genderId;
        this.feminine = feminine;
        this.male = male;
        this.other = other;
        this.userGender = userGender;
    }

    public GenderId genderId() {
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

