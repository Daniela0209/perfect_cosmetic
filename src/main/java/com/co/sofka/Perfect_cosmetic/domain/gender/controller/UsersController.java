/*package com.co.sofka.Perfect_cosmetic.domain.gender.controller;


import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import com.co.sofka.Perfect_cosmetic.domain.gender.commands.CreateUsers;
import com.co.sofka.Perfect_cosmetic.domain.gender.useCase.CreatedUsersUseCase;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.Email;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.NameUser;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.UsersId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class UsersController {

    @Autowired
    private CreatedUsersUseCase useCase;

    @PostMapping(value = "api/{usersId}/{nameUser}/{email}")
    public String save(@PathVariable("usersId")String usersId,
                        @PathVariable("nameUser")String nameUser,
                        @PathVariable("email")String email){
        var command = new CreateUsers(UsersId.of(usersId),new NameUser(nameUser),new Email(email));
        System.out.println("*********"+ nameUser);
        CreatedUsersUseCase.Response userCreated = executedUseCase(command);
        return (userCreated.getResponse().getUsersId().value()+" "+userCreated.getResponse().getNameUser().value()+" "+userCreated.getResponse().getEmail().value());
    }

    private CreatedUsersUseCase.Response executedUseCase(CreateUsers command){
        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow();

        var UsersCreated = events;
        return UsersCreated;
    }
}*/
