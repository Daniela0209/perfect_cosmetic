package com.co.sofka.Perfect_cosmetic.domain.gender.useCase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.co.sofka.Perfect_cosmetic.domain.gender.Gender;
import com.co.sofka.Perfect_cosmetic.domain.gender.commands.CreateGender;
import com.co.sofka.Perfect_cosmetic.domain.gender.repository.IGenderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreatedGenderUseCase extends UseCase<RequestCommand<CreateGender>, CreatedGenderUseCase.Response> {

    @Autowired
    private IGenderRepository iGenderRepository;


    @Override

    public void executeUseCase(RequestCommand<CreateGender> createGenderRequestCommand){
        var command = createGenderRequestCommand.getCommand();
        var gender = new Gender(command.GenderId(), command.Feminine(), command.Male(), command.Other());
        emit().onResponse(new ResponseEvents(gender.getUncommittedChanges()));
    }

    public static class Response implements UseCase.ResponseValues{

        private Gender response;


        public Response(Gender person) {
            this.response=person;
        }

        public Gender getResponse() {
            return response;
        }

        public void setResponse(Gender response) {
            this.response = response;
        }
    }
}
