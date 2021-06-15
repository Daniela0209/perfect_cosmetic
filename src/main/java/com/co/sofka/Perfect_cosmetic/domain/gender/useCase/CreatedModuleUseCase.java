package com.co.sofka.Perfect_cosmetic.domain.gender.useCase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.generic.DomainEvent;
import com.co.sofka.Perfect_cosmetic.domain.gender.commands.CreateModule;
import com.co.sofka.Perfect_cosmetic.domain.gender.entity.Module;
import com.co.sofka.Perfect_cosmetic.domain.gender.events.ModuleCreated;

import java.util.ArrayList;
import java.util.List;

public class CreatedModuleUseCase extends UseCase<RequestCommand<CreateModule>, ResponseEvents> {


    @Override
    public void executeUseCase(RequestCommand<CreateModule> createModuleRequestCommand) {
        var command = createModuleRequestCommand.getCommand();
        new Module(command.ModuleId(),command.NameModule(),command.BannerUrl());
        List<DomainEvent> ListEvents;
        ListEvents = new ArrayList<>();
        ListEvents.add(new ModuleCreated(command.ModuleId(),command.NameModule(),command.BannerUrl()));
        emit().onResponse(new ResponseEvents(ListEvents));
    }
}
