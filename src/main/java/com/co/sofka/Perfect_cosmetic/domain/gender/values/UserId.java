package com.co.sofka.Perfect_cosmetic.domain.gender.values;

import co.com.sofka.domain.generic.Identity;

public class UserId extends Identity {
    public UserId(String id) {
        super(id);

    }
    public static UserId of(String id){
        return new UserId(id);
    }
}
