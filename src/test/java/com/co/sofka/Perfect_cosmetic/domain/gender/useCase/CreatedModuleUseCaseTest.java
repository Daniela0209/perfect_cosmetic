package com.co.sofka.Perfect_cosmetic.domain.gender.useCase;


import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import com.co.sofka.Perfect_cosmetic.domain.gender.commands.CreateModule;
import com.co.sofka.Perfect_cosmetic.domain.gender.events.ModuleCreated;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.BannerUrl;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.ModuleId;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.NameModule;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CreatedModuleUseCaseTest {

    @Test

    public void CreateModuleTest(){

        var command = new CreateModule(ModuleId.of("0"), new NameModule("Delineados"), new BannerUrl("https://i.ytimg.com/vi/Uvp9eONR7Fg/hqdefault.jpg"));

        ModuleCreated moduleCreated = executeUseCase(command);

        Assertions.assertEquals("0", moduleCreated.ModuleId().value());

    }
    private ModuleCreated executeUseCase (CreateModule command){
        var usecase = new CreatedModuleUseCase();

        var events = UseCaseHandler.getInstance()
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getResponse();

        var moduleCreated = (ModuleCreated) events.get(0);
        return moduleCreated;
    }

}
