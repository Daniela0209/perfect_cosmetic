package com.co.sofka.Perfect_cosmetic.domain.gender.values;

import co.com.sofka.domain.generic.Identity;

public class GenderId extends Identity {
    public GenderId(String id) {
        super(id);

    }
    public static GenderId from(String id){
        return new GenderId(id);
    }
}
