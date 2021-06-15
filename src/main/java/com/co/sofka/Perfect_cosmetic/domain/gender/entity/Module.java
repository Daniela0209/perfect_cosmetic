package com.co.sofka.Perfect_cosmetic.domain.gender.entity;

import co.com.sofka.domain.generic.Entity;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.BannerUrl;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.ModuleId;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.NameModule;

public class Module extends Entity<ModuleId> {


    private final ModuleId moduleId;
    private final NameModule nameModule;
    private final BannerUrl bannerUrl;


    public Module(ModuleId entityId, NameModule nameModule, BannerUrl bannerUrl, ModuleId moduleId, NameModule nameModule1, BannerUrl bannerUrl1) {
        super(entityId);
        this.moduleId = moduleId;
        this.nameModule = nameModule1;
        this.bannerUrl = bannerUrl1;
    }
}
