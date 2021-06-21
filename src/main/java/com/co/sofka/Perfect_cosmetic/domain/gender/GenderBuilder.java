package com.co.sofka.Perfect_cosmetic.domain.gender;

import com.co.sofka.Perfect_cosmetic.domain.gender.values.Feminine;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.Male;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.Other;

public final class GenderBuilder {
    protected Feminine feminine;
    protected Male male;
    protected Other other;

    private GenderBuilder() {
    }

    public static GenderBuilder aGender() {
        return new GenderBuilder();
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

    public Gender build() {
        return new Gender(null, feminine, male, other, command.UserGender());
    }
}
