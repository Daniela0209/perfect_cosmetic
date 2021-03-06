package com.co.sofka.Perfect_cosmetic.domain.gender.controller;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import com.co.sofka.Perfect_cosmetic.domain.gender.commands.CreateGender;
import com.co.sofka.Perfect_cosmetic.domain.gender.commands.UpdateGender;
import com.co.sofka.Perfect_cosmetic.domain.gender.repository.GenderData;
import com.co.sofka.Perfect_cosmetic.domain.gender.useCase.CreatedGenderUseCase;
import com.co.sofka.Perfect_cosmetic.domain.gender.useCase.TransformationGenderUseCase;
import com.co.sofka.Perfect_cosmetic.domain.gender.useCase.UpdateGenderUseCase;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class GenderController {

    @Autowired
    private CreatedGenderUseCase createdGenderUseCase;

    @Autowired
    private UpdateGenderUseCase updateGenderUseCase;

    @Autowired
    private TransformationGenderUseCase transformationGenderUseCase;

    @PostMapping(value = "api/list/{genderId}/{genderUser}/{username}")
    public String save(@PathVariable("genderId")String genderId,
                       @PathVariable("genderUser") String genderUser,
                       @PathVariable("username") String username){
        CreateGender command = new CreateGender(GenderId.of(genderId),new GenderUser(genderUser), new UserName(username));
    CreatedGenderUseCase.Response genderCreated = executedUseCase(command);

        String string = "{"
                + "\"genderId\":" + "\"" + genderCreated.getResponse().identity() + "\"" + ","
                + "\"genderUser\":" + "\"" + genderCreated.getResponse().getGenderUser().value() + "\"" + ","
                + "\"username\":" + "\"" + genderCreated.getResponse().getUsername().value()
                + "}";
        return string;

    }
    private CreatedGenderUseCase.Response executedUseCase(CreateGender command){
        CreatedGenderUseCase.Response events = UseCaseHandler.getInstance()
            .syncExecutor(createdGenderUseCase, new RequestCommand<>(command))
            .orElseThrow();

        CreatedGenderUseCase.Response GenderCreated = events;
        return GenderCreated;
    }

    @PutMapping(value = "api/update/{genderId}/{genderUser}/{username}")
    public String update(@PathVariable("genderId")String genderId,
                         @PathVariable("genderUser")String genderUser,
                         @PathVariable("username")String username){
        UpdateGender command = new UpdateGender(GenderId.of(genderId),new GenderUser(genderUser),new UserName(username));
    UpdateGenderUseCase.Response genderUpdate = executedUseCase(command);

        String string = "{"
                + "\"genderId\":" + "\"" + genderUpdate.getResponse().identity() + "\"" + ","
                + "\"genderUser\":" + "\"" + genderUpdate.getResponse().getGenderUser().value() + "\"" + ","
                + "\"username\":" + "\"" + genderUpdate.getResponse().getUsername().value()
                + "}";
        return string;
    }

    private UpdateGenderUseCase.Response executedUseCase(UpdateGender command) {
        UpdateGenderUseCase.Response events = UseCaseHandler.getInstance()
                .syncExecutor(updateGenderUseCase, new RequestCommand<>(command))
                .orElseThrow();
        UpdateGenderUseCase.Response PersonUpdated = events;
        return (UpdateGenderUseCase.Response) PersonUpdated;
    }

    @GetMapping(value = "api/gender")
    public Iterable<GenderData>select(){
        return (transformationGenderUseCase.select());
    }

}
