package com.co.sofka.Perfect_cosmetic.domain.gender.values;

import co.com.sofka.domain.generic.Identity;

public class UsersId extends Identity {
    public UsersId(String id) {
        super(id);

    }
    public static UsersId of(String id){
        return new UsersId(id);
    }
}
