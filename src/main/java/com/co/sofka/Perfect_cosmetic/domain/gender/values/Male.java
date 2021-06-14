package com.co.sofka.Perfect_cosmetic.domain.gender.values;

import co.com.sofka.domain.generic.ValueObject;

public class Male implements ValueObject<String> {
    private final String value;

    public Male (String value){
        this.value= value;
    }

    @Override
    public String value(){
        return value;
    }
}
