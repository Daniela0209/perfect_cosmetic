package com.co.sofka.Perfect_cosmetic.domain.gender.values;

import co.com.sofka.domain.generic.Identity;
import co.com.sofka.domain.generic.ValueObject;

public class ModuleId extends Identity implements ValueObject<String> {

    private final String value;

    public ModuleId (String value){
        this.value= value;
    }

    @Override
    public String value(){
        return value;
    }
}

