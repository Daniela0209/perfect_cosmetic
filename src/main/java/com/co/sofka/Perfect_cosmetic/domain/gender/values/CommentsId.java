package com.co.sofka.Perfect_cosmetic.domain.gender.values;

import co.com.sofka.domain.generic.Identity;


public class CommentsId extends Identity {

    public CommentsId(String idComments) {
        super(idComments);
    }

    public static CommentsId of(String idComments){
        return new CommentsId(idComments);
    }
}
