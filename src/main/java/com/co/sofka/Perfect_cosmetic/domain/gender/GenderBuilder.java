package com.co.sofka.Perfect_cosmetic.domain.gender;

import com.co.sofka.Perfect_cosmetic.domain.gender.values.Feminine;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.Male;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.Other;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.UserGender;

public final class GenderBuilder {
    protected String idGender;
    protected Feminine feminine;
    protected Male male;
    protected Other other;
    protected UserGender userGender;

    private GenderBuilder() {
    }

    public static GenderBuilder aGender() {
        return new GenderBuilder();
    }

    public GenderBuilder withIdGender(String idGender) {
        this.idGender = idGender;
        return this;
    }

    public GenderBuilder withFeminine(Feminine feminine) {
        this.feminine = feminine;
        return this;
    }

    public GenderBuilder withMale(Male male) {
        this.male = male;
        return this;
    }

    public GenderBuilder withOther(Other other) {
        this.other = other;
        return this;
    }

    public GenderBuilder withUserGender(UserGender userGender) {
        this.userGender = userGender;
        return this;
    }

    public Gender build() {
        Gender gender = new Gender(null, feminine, male, other, userGender);
        gender.setIdGender(idGender);
        return gender;
    }
}
