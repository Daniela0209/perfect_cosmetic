package com.co.sofka.Perfect_cosmetic.domain.gender.useCase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import com.co.sofka.Perfect_cosmetic.domain.gender.Gender;
import com.co.sofka.Perfect_cosmetic.domain.gender.commands.CreateGender;
import com.co.sofka.Perfect_cosmetic.domain.gender.repository.GenderData;
import com.co.sofka.Perfect_cosmetic.domain.gender.repository.IGenderDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreatedGenderUseCase extends UseCase<RequestCommand<CreateGender>, CreatedGenderUseCase.Response> {

    @Autowired
    private IGenderDataRepository data;


    @Override

    public void executeUseCase(RequestCommand<CreateGender> createGenderRequestCommand){
        var command = createGenderRequestCommand.getCommand();
        var gender = new Gender(command.genderId(),command.feminine(),command.male(),command.other(),command.userGender());
        data.save(transform(gender));
        emit().onResponse(new Response(gender));
    }

        public GenderData transform(Gender gender){
                GenderData genderData = new GenderData(gender.getIdGender(),gender.getFeminine().value(),gender.getMale().value(),gender.getOther().value(),gender.getUserGender().value());
                return genderData;
        }

        public static class Response implements UseCase.ResponseValues{

        private Gender response;


        public Response(Gender gender) {
            this.response=gender;
        }

        public Gender getResponse() {
            return response;
        }

        public void setResponse(Gender response) {
            this.response = response;
        }
    }
}
