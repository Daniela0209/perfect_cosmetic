package com.co.sofka.Perfect_cosmetic.domain.gender.values;

import co.com.sofka.domain.generic.Identity;


public class CommentsId extends Identity {

    public CommentsId(String id) {
        super(id);
    }

    public static CommentsId of(String id){
        return new CommentsId(id);
    }
}
