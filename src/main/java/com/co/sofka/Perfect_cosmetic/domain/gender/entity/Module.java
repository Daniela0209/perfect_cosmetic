package com.co.sofka.Perfect_cosmetic.domain.gender.entity;

import co.com.sofka.domain.generic.Entity;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.*;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "Modulos")
public class Module extends Entity<ModuleId> {

    protected ModuleId moduleId;
    protected NameModule nameModule;
    protected BannerUrl bannerUrl;

    public Module(ModuleId moduleId, NameModule nameModule, BannerUrl bannerUrl) {
        super(moduleId);
        this.moduleId = moduleId;
        this.nameModule = nameModule;
        this.bannerUrl = bannerUrl;
    }

    public ModuleId getModuleId() {
        return moduleId;
    }

    public NameModule getNameModule() {
        return nameModule;
    }

    public BannerUrl getBannerUrl() {
        return bannerUrl;
    }
}
