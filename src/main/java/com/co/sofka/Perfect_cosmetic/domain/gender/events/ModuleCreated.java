package com.co.sofka.Perfect_cosmetic.domain.gender.events;


import co.com.sofka.domain.generic.DomainEvent;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.BannerUrl;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.ModuleId;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.NameModule;

public class ModuleCreated extends DomainEvent {

    private final ModuleId moduleId;
    private final NameModule nameModule;
    private final BannerUrl bannerUrl;


    public ModuleCreated(ModuleId moduleId, NameModule nameModule, BannerUrl bannerUrl) {
        super("Perfectcosmetic.module.create");
        this.moduleId = moduleId;
        this.nameModule = nameModule;
        this.bannerUrl = bannerUrl;
    }
}
