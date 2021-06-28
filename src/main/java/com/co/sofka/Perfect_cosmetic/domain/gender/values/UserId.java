package com.co.sofka.Perfect_cosmetic.domain.gender.values;

import co.com.sofka.domain.generic.Identity;

public class UserId extends Identity {
    public UserId(String idUser) {
        super(idUser);

    }
    public static UserId of(String idUser){
        return new UserId(idUser);
    }
}
