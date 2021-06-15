package com.co.sofka.Perfect_cosmetic.domain.gender.useCase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import com.co.sofka.Perfect_cosmetic.domain.gender.commands.CreateComments;
import com.co.sofka.Perfect_cosmetic.domain.gender.events.CommentsCreated;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.CommentsId;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.Contents;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.UserId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



class CreatedCommentsUserCaseTest {

    @Test
    public void CreateCommentsTest(){
        var command = new CreateComments(CommentsId.of("0"),new UserId("2"), new Contents("¡Aprendí a delinearme!"));

        CommentsCreated commentsCreated = executeUseCase(command);

        Assertions.assertEquals("0", commentsCreated.CommentsId().value());

    }

    private CommentsCreated executeUseCase (CreateComments command){
        var usecase = new CreatedCommentsUserCase();

    var events = UseCaseHandler.getInstance()
            .syncExecutor(usecase, new RequestCommand<>(command))
            .orElseThrow()
            .getDomainEvents();

        var commentsCreated = (CommentsCreated) events.get(0);
        return commentsCreated;


    }


}