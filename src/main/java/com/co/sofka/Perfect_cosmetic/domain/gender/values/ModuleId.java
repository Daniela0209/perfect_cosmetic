package com.co.sofka.Perfect_cosmetic.domain.gender.values;

import co.com.sofka.domain.generic.ValueObject;

public class ModuleId implements ValueObject<String> {

    private final String value;

    public ModuleId (String value){
        this.value= value;
    }

    @Override
    public String value(){
        return value;
    }
}

