package com.co.sofka.Perfect_cosmetic.domain.gender.controller;


import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import com.co.sofka.Perfect_cosmetic.domain.gender.commands.CreateComments;
import com.co.sofka.Perfect_cosmetic.domain.gender.events.CommentsCreated;
import com.co.sofka.Perfect_cosmetic.domain.gender.useCase.CreatedCommentsUseCase;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.CommentsId;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.Contents;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.UserId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class CommentsController {

    @Autowired
    private CreatedCommentsUseCase useCase;

    @PostMapping(value = "api/{commentsId}/{userId}/{contents}")
    public String save(@PathVariable("commentsId")String commentsId,
                       @PathVariable("userId")String userId,
                       @PathVariable("contents")String contents){

    var command = new CreateComments(CommentsId.of(commentsId),new UserId(userId),new Contents(contents));
    CreatedCommentsUseCase.Response commentsCreated = executedUseCase(command);
    return (commentsCreated.getResponse().getCommentsId().value()+" "+commentsCreated.getResponse().getUserId().value()+" "+commentsCreated.getResponse().getContents().value());

    }
    private CreatedCommentsUseCase.Response executedUseCase(CreateComments command){
        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow();

        var CommandCreated = events;
        return CommandCreated;
    }
}
