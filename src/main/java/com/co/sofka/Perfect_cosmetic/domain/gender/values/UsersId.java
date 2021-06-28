package com.co.sofka.Perfect_cosmetic.domain.gender.values;

import co.com.sofka.domain.generic.Identity;

public class UsersId extends Identity {
    public UsersId(String idUsers) {
        super(idUsers);

    }
    public static UsersId of(String idUsers){
        return new UsersId(idUsers);
    }
}
