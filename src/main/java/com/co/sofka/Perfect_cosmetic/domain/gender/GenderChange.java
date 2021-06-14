package com.co.sofka.Perfect_cosmetic.domain.gender;

import co.com.sofka.domain.generic.EventChange;
import com.co.sofka.Perfect_cosmetic.domain.gender.events.GenderCreated;

public class GenderChange extends EventChange {

    public GenderChange(Gender gender) {

        apply((GenderCreated event)->{
            gender.feminine = event.Feminine();
            gender.male = event.Male();
            gender.other = event.Other();
        });
    }
}
