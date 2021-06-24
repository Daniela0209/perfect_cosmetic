package com.co.sofka.Perfect_cosmetic.domain.gender.values;

import co.com.sofka.domain.generic.Identity;
import co.com.sofka.domain.generic.ValueObject;

public class ModuleId extends Identity{
    public ModuleId(String id) {
        super(id);
    }

    public static ModuleId of(String id){
        return new ModuleId(id);
    }


}

