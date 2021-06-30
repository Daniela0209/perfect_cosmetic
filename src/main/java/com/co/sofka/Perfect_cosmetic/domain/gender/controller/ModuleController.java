/*package com.co.sofka.Perfect_cosmetic.domain.gender.controller;



import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import com.co.sofka.Perfect_cosmetic.domain.gender.commands.CreateModule;
import com.co.sofka.Perfect_cosmetic.domain.gender.useCase.CreatedModuleUseCase;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.BannerUrl;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.ModuleId;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.NameModule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class ModuleController {

    @Autowired
    private CreatedModuleUseCase useCase;

    @PostMapping(value = "api/{moduleId}/{nameModule}/{bannerUrl}")
    public String save(@PathVariable("moduleId")String moduleId,
                       @PathVariable("nameModule")String nameModule,
                       @PathVariable("bannerUrl")String bannerUrl){
        var command = new CreateModule(ModuleId.of(moduleId),new NameModule(nameModule),new BannerUrl(bannerUrl));
        CreatedModuleUseCase.Response moduleCreated = executedUseCase(command);
        return (moduleCreated.getResponse().getModuleId().value()+""+moduleCreated.getResponse().getNameModule().value()+""+moduleCreated.getResponse().getBannerUrl());


    }
    private CreatedModuleUseCase.Response executedUseCase(CreateModule command){
        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow();

        var ModuleCreated = events;
        return ModuleCreated;
    }
}*/
