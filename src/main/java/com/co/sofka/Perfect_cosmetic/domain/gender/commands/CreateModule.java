package com.co.sofka.Perfect_cosmetic.domain.gender.commands;

import co.com.sofka.domain.generic.Command;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.BannerUrl;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.ModuleId;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.NameModule;

public class CreateModule implements Command {

    private final ModuleId moduleId;
    private final NameModule nameModule;
    private final BannerUrl bannerUrl;

    public CreateModule(ModuleId moduleId, NameModule nameModule, BannerUrl bannerUrl) {
        this.moduleId = moduleId;
        this.nameModule = nameModule;
        this.bannerUrl = bannerUrl;
    }

    public ModuleId ModuleId() {
        return moduleId;
    }

    public NameModule NameModule() {
        return nameModule;
    }

    public BannerUrl BannerUrl() {
        return bannerUrl;
    }
}
