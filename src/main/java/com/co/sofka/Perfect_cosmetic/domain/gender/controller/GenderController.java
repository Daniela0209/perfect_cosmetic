package com.co.sofka.Perfect_cosmetic.domain.gender.controller;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import com.co.sofka.Perfect_cosmetic.domain.gender.commands.CreateGender;
import com.co.sofka.Perfect_cosmetic.domain.gender.useCase.CreatedGenderUseCase;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class GenderController {

    @Autowired
    private CreatedGenderUseCase useCase;

    @PostMapping(value = "api/{genderId}/{feminine}/{male}/{other}/{userGender}")
    public String save(@PathVariable("genderId")String genderId,
                       @PathVariable("feminine") String feminine,
                       @PathVariable("male") String male,
                       @PathVariable ("other") String other,
                       @PathVariable ("userGender")String userGender){
    var command = new CreateGender(GenderId.of(genderId),new Feminine(feminine),new Male(male),new Other(other),new UserGender(userGender));
    CreatedGenderUseCase.Response genderCreated = executedUseCase(command);
    return(genderCreated.getResponse().getFeminine().value()+" "+genderCreated.getResponse().getMale().value()+" "+genderCreated.getResponse().getOther().value()+" "+genderCreated.getResponse().getUserGender().value());

    }
    private CreatedGenderUseCase.Response executedUseCase(CreateGender command){
    var events = UseCaseHandler.getInstance()
            .syncExecutor(useCase, new RequestCommand<>(command))
            .orElseThrow();

        var GenderCreated = events;
        return GenderCreated;
    }



}
