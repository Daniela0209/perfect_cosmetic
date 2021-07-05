package com.co.sofka.Perfect_cosmetic.domain.gender.controller;


import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import com.co.sofka.Perfect_cosmetic.domain.gender.commands.CreateUsers;
import com.co.sofka.Perfect_cosmetic.domain.gender.repository.UsersData;
import com.co.sofka.Perfect_cosmetic.domain.gender.useCase.CreatedUsersUseCase;
import com.co.sofka.Perfect_cosmetic.domain.gender.useCase.TransformationUsersUseCase;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.Email;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.NameUser;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.UsersId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class UsersController {

    @Autowired
    private CreatedUsersUseCase createdUsersUseCase;

    @Autowired
    private TransformationUsersUseCase transformationUsersUseCase;


    @PostMapping(value = "api/list/{usersId}/{nameUser}/{email}")
    public String list(@PathVariable("usersId") String usersId,
                       @PathVariable("nameUser") String nameUser,
                       @PathVariable("email") String email){

        var command = new CreateUsers(UsersId.of(usersId), new NameUser(nameUser), new Email(email));
        CreatedUsersUseCase.Response usersCreated = executedUseCase(command);


        String string="{"
                + "\"usersId\":" + "\""+usersCreated.getResponse().identity()+"\""+ ","
                + "\"nameUser\":" + "\""+usersCreated.getResponse().getNameUser().value()+"\""+ ","
                + "\"email\":" + "\""+usersCreated.getResponse().getEmail().value()
                +"}";
        return string;
    }

    private CreatedUsersUseCase.Response executedUseCase(CreateUsers command){
        var events = UseCaseHandler.getInstance()
                .syncExecutor(createdUsersUseCase, new RequestCommand<>(command))
                .orElseThrow();
        var UsersCreated = events;
        return UsersCreated;
    }
    @GetMapping(value = "api/users")
    public Iterable<UsersData>list(){
        return (transformationUsersUseCase.list());
    }

    }

