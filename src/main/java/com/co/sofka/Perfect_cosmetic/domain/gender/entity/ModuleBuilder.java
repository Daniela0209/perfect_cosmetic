package com.co.sofka.Perfect_cosmetic.domain.gender.entity;

import com.co.sofka.Perfect_cosmetic.domain.gender.values.BannerUrl;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.NameModule;

public final class ModuleBuilder {
    protected NameModule nameModule;
    protected BannerUrl bannerUrl;

    private ModuleBuilder() {
    }

    public static ModuleBuilder aModule() {
        return new ModuleBuilder();
    }

    public ModuleBuilder withNameModule(NameModule nameModule) {
        this.nameModule = nameModule;
        return this;
    }

    public ModuleBuilder withBannerUrl(BannerUrl bannerUrl) {
        this.bannerUrl = bannerUrl;
        return this;
    }

    public Module build() {
        return new Module(null, nameModule, bannerUrl);
    }
}
