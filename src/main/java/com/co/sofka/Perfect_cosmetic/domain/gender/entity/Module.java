package com.co.sofka.Perfect_cosmetic.domain.gender.entity;

import co.com.sofka.domain.generic.Entity;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.*;

public class Module extends Entity<ModuleId> {

    protected ModuleId moduleId;
    protected NameModule nameModule;
    protected BannerUrl bannerUrl;


    public Module(ModuleId entityId, NameModule nameModule, BannerUrl bannerUrl) {
        super(entityId);
    }
}
