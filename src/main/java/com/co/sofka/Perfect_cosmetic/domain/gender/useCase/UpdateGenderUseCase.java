package com.co.sofka.Perfect_cosmetic.domain.gender.useCase;


import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import com.co.sofka.Perfect_cosmetic.domain.gender.Gender;
import com.co.sofka.Perfect_cosmetic.domain.gender.commands.UpdateGender;
import com.co.sofka.Perfect_cosmetic.domain.gender.repository.GenderData;
import com.co.sofka.Perfect_cosmetic.domain.gender.repository.IGenderDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateGenderUseCase extends UseCase<RequestCommand<UpdateGender>, UpdateGenderUseCase.Response> {

    @Autowired
    private IGenderDataRepository data;

    @Override
    public void executeUseCase(RequestCommand<UpdateGender> updateGenderRequestCommand) {

        UpdateGender command = updateGenderRequestCommand.getCommand();
        Gender gender = new Gender(command.genderId(), command.genderUser(), command.username());
        data.save(transform(gender));
        emit().onResponse(new Response(gender));

    }

    public GenderData transform(Gender gender) {
        GenderData genderData = new GenderData(gender.getIdGender(), gender.getGenderUser().value(), gender.getUsername().value());
        return genderData;
    }

    public static class Response implements UseCase.ResponseValues {

        private Gender response;


        public Response(Gender gender) {
            this.response = gender;
        }

        public Gender getResponse() {
            return response;
        }

        public void setResponse(Gender response) {
            this.response = response;
        }
    }
}