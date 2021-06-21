package com.co.sofka.Perfect_cosmetic.domain.gender.useCase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import com.co.sofka.Perfect_cosmetic.domain.gender.commands.CreateGender;
import com.co.sofka.Perfect_cosmetic.domain.gender.events.GenderCreated;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.Feminine;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.GenderId;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.Male;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.Other;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class CreatedGenderUseCaseTest {

    @Test
    public void createGenderTest(){
        var command = new CreateGender(GenderId.of("0"), new Feminine("Femenino"), new Male("Masculino"), new Other("Otro"), userGender);

        GenderCreated genderCreated = executeUseCase(command);

        Assertions.assertEquals("0", genderCreated.GenderId().value());

    }

    private GenderCreated executeUseCase (CreateGender command){
        var usecase =new CreatedGenderUseCase();

        var events = UseCaseHandler.getInstance()
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        var genderCreated =(GenderCreated) events.get(0);
        return genderCreated;
    }
}
