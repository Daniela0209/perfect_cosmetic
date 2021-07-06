package com.co.sofka.Perfect_cosmetic.domain.gender;

import com.co.sofka.Perfect_cosmetic.domain.gender.values.GenderUser;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.UserName;

public final class GenderBuilder {
    protected String idGender;
    protected GenderUser genderUser;
    protected UserName username;

    private GenderBuilder() {
    }

    public static GenderBuilder aGender() {
        return new GenderBuilder();
    }

    public GenderBuilder withIdGender(String idGender) {
        this.idGender = idGender;
        return this;
    }

    public GenderBuilder withGenderUser(GenderUser genderUser) {
        this.genderUser = genderUser;
        return this;
    }

    public GenderBuilder withUsername(UserName username) {
        this.username = username;
        return this;
    }

    public Gender build() {
        Gender gender = new Gender(null, genderUser, username);
        gender.setIdGender(idGender);
        return gender;
    }
}
