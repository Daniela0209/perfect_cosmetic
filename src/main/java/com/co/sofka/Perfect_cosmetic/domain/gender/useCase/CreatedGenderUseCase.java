package com.co.sofka.Perfect_cosmetic.domain.gender.useCase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.co.sofka.Perfect_cosmetic.domain.gender.Gender;
import com.co.sofka.Perfect_cosmetic.domain.gender.commands.CreateGender;

public class CreatedGenderUseCase extends UseCase<RequestCommand<CreateGender>, ResponseEvents> {

    @Override

    public void executeUseCase(RequestCommand<CreateGender> createGenderRequestCommand){
        var command = createGenderRequestCommand.getCommand();
        var gender = new Gender(command.GenderId(), command.Feminine(), command.Male(), command.Other());
        emit().onResponse(new ResponseEvents(gender.getUncommittedChanges()));
    }
}
