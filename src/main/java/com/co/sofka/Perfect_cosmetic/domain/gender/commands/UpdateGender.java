package com.co.sofka.Perfect_cosmetic.domain.gender.commands;

import co.com.sofka.domain.generic.Command;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.GenderId;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.GenderUser;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.UserName;

public class UpdateGender implements Command {

    private final GenderId genderId;
    private final GenderUser genderUser;
    private final UserName username;

    public UpdateGender(GenderId genderId, GenderUser genderUser, UserName username) {
        this.genderId = genderId;
        this.genderUser = genderUser;
        this.username = username;
    }

    public GenderId genderId() {
        return genderId;
    }

    public GenderUser genderUser() {
        return genderUser;
    }

    public UserName username() {
        return username;
    }
}
