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
    private CreatedUsersUseCase useCase;

    @Autowired
    private TransformationUsersUseCase transformationUsersUseCase;

    @PostMapping(value = "api/user/{usersid}/{nameuser}/{email}")
    public String save(@PathVariable("usersId") String usersId,
                       @PathVariable("nameUser") String nameUser,
                       @PathVariable("email") String email) {

        var command = new CreateUsers(UsersId.of(usersId), new NameUser(nameUser), new Email(email));
        CreatedUsersUseCase.Response userCreated = executedUseCase(command);

        String string = "{"
                + "\"usersId\":" + "\"" + userCreated.getResponse().identity() + "\"" + ","
                + "\"nameUser\":" + "\"" + userCreated.getResponse().getNameUser().value() + "\"" + ","
                + "\"email\":" + "\"" + userCreated.getResponse().getEmail().value() + "}";
        return string;

    }

    private CreatedUsersUseCase.Response executedUseCase(CreateUsers command) {
        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow();

        var UsersCreated = events;
        return UsersCreated;
    }

    @GetMapping(value = "api/users")
    public Iterable<UsersData> save() {
        return (transformationUsersUseCase.save());
    }
}