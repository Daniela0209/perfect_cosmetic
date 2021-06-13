package com.co.sofka.Perfect_cosmetic.values;

import co.com.sofka.domain.generic.ValueObject;

public class Feminine implements ValueObject<String> {

    private final String value;

    public Feminine(String value){
        this.value= value;
    }

    @Override
    public String value(){
        return value;
    }
}
