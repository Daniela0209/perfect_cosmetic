package com.co.sofka.Perfect_cosmetic.domain.gender.controller;


import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import com.co.sofka.Perfect_cosmetic.domain.gender.commands.CreateUserPage;
import com.co.sofka.Perfect_cosmetic.domain.gender.repository.UserPageData;
import com.co.sofka.Perfect_cosmetic.domain.gender.useCase.CreatedUserPageUseCase;
import com.co.sofka.Perfect_cosmetic.domain.gender.useCase.TransformationUserPageUseCase;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.Email;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.NameUser;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.UserPageId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class UserPageController {

    @Autowired
    private CreatedUserPageUseCase createdUserPageUseCase;

    @Autowired
    private TransformationUserPageUseCase transformationUserPageUseCase;

    @PostMapping(value = "api/userPage/{userPageId}/{nameUser}/{email}")
    public String save(@PathVariable("userPageId") String userPageId,
                       @PathVariable("nameUser")String nameUser,
                       @PathVariable("email")String email){
        var command = new CreateUserPage(UserPageId.of(userPageId), new NameUser(nameUser),new Email(email));
        CreatedUserPageUseCase.Response userPageCreated = executedUseCase(command);

        String string = "{"
                + "\"userPageId\":" + "\""+userPageCreated.getResponse().identity()+"\"" + ","
                +"\"nameUser\":" + "\""+userPageCreated.getResponse().getNameUser().value() +"\"" + ","
                +"\"email\":" + userPageCreated.getResponse().getEmail().value()
                +"}";

        return string;
    }

    private CreatedUserPageUseCase.Response executedUseCase(CreateUserPage command){
        var events = UseCaseHandler.getInstance()
                .syncExecutor(createdUserPageUseCase, new RequestCommand<>(command))
                .orElseThrow();
        var UserPageCreated = events;
        return UserPageCreated;
    }

    @GetMapping(value = "api/userPage")
    public Iterable<UserPageData>searchUsers(){
        return(transformationUserPageUseCase.searchUsers());
    }

    }


