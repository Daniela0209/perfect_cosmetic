package com.co.sofka.Perfect_cosmetic.domain.gender.useCase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.generic.DomainEvent;
import com.co.sofka.Perfect_cosmetic.domain.gender.commands.CreateUsers;
import com.co.sofka.Perfect_cosmetic.domain.gender.entity.Users;
import com.co.sofka.Perfect_cosmetic.domain.gender.events.UsersCreated;

import java.util.ArrayList;
import java.util.List;

public class CreatedUsersUseCase extends UseCase<RequestCommand<CreateUsers>, ResponseEvents> {


    @Override
    public void executeUseCase(RequestCommand<CreateUsers> createUsersRequestCommand) {
        var command = createUsersRequestCommand.getCommand();
        new Users (command.UsersId(),command.NameUser(),command.Email());
        List<DomainEvent> ListEvents;
        ListEvents = new ArrayList<>();
        ListEvents.add(new UsersCreated(command.UsersId(),command.NameUser(),command.Email()));
        emit().onResponse(new ResponseEvents(ListEvents));
    }
}
