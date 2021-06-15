package com.co.sofka.Perfect_cosmetic.domain.gender.useCase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.co.sofka.Perfect_cosmetic.domain.gender.commands.CreateModule;

public class CreatedModuleUseCase extends UseCase<RequestCommand<CreateModule>, ResponseEvents> {


    @Override
    public void executeUseCase(RequestCommand<CreateModule> createModuleRequestCommand) {
        var module = createModuleRequestCommand.getCommand();


    }
}
