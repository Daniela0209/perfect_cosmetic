package com.co.sofka.Perfect_cosmetic.domain.gender.values;

import co.com.sofka.domain.generic.Identity;
import co.com.sofka.domain.generic.ValueObject;

public class ModuleId extends Identity{
    public ModuleId(String idModule) {
        super(idModule);
    }

    public static ModuleId of(String idModule){
        return new ModuleId(idModule);
    }


}

