package com.co.sofka.Perfect_cosmetic.domain.gender.values;

import co.com.sofka.domain.generic.ValueObject;

public class UserId implements ValueObject<String> {
    private final String value;

    public UserId(String value){
        this.value= value;
    }

    @Override
    public String value(){
        return value;
    }
}
