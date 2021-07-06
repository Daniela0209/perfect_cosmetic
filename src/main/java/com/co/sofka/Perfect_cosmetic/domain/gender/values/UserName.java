package com.co.sofka.Perfect_cosmetic.domain.gender.values;

import co.com.sofka.domain.generic.ValueObject;

public class UserName implements ValueObject<String> {

    private final String value;

    public UserName (String value){
        this.value= value;
    }

    @Override
    public String value(){
        return value;
    }
}
