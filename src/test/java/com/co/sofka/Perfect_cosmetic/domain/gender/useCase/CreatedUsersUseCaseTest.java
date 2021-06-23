package com.co.sofka.Perfect_cosmetic.domain.gender.useCase;


import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import com.co.sofka.Perfect_cosmetic.domain.gender.commands.CreateUsers;
import com.co.sofka.Perfect_cosmetic.domain.gender.events.UsersCreated;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.Email;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.NameUser;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.UsersId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CreatedUsersUseCaseTest {

    @Test

    public void CreateUsersTest(){

        var command = new CreateUsers(UsersId.of("0"),new NameUser("Daniela"),new Email("Grajalesdaniela253@gmail.com"));

        UsersCreated usersCreated = executeUseCase(command);

        Assertions.assertEquals("0", usersCreated.UsersId().value());
    }

    private UsersCreated executeUseCase(CreateUsers command){
        var usecase = new CreatedUsersUseCase();

        var events = UseCaseHandler.getInstance()
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getResponse()
        var usersCreated =  (UsersCreated) events.get(0);
        return usersCreated;
    }

}