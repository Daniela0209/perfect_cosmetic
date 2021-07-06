package com.co.sofka.Perfect_cosmetic.domain.gender.values;

import co.com.sofka.domain.generic.Identity;

public class UserPageId extends Identity {
    public UserPageId(String idUsers) {
        super(idUsers);

    }
    public static UserPageId of(String idUsers){
        return new UserPageId(idUsers);
    }
}
