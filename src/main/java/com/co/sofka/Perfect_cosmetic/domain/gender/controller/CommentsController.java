package com.co.sofka.Perfect_cosmetic.domain.gender.controller;


import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import com.co.sofka.Perfect_cosmetic.domain.gender.commands.CreateComments;
import com.co.sofka.Perfect_cosmetic.domain.gender.repository.CommentsData;
import com.co.sofka.Perfect_cosmetic.domain.gender.useCase.CreatedCommentsUseCase;
import com.co.sofka.Perfect_cosmetic.domain.gender.useCase.TransformationCommentsUseCase;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.CommentsId;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.Contents;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.UserId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class CommentsController {

    @Autowired
    private CreatedCommentsUseCase useCase;

    @Autowired
    private TransformationCommentsUseCase transformationCommentsUseCase;

    @PostMapping(value = "api/save/{commentsId}/{userId}/{contents}")
    public String save(@PathVariable("CommentsId")String commentsId,
                       @PathVariable("UserId")String userId,
                       @PathVariable("Contents")String contents){

    var command = new CreateComments(CommentsId.of(commentsId),UserId.of(userId),new Contents(contents));
    CreatedCommentsUseCase.Response commentsCreated = executedUseCase(command);

        String string="{"
                + "\"commentsId\":" + "\""+commentsCreated.getResponse().identity()+"\""+ ","
                + "\"userId\":" + "\""+commentsCreated.getResponse().getUserId()+"\""+ ","
                + "\"contents\":" + "\""+commentsCreated.getResponse().getContents()
                +"}";
        return string;
    }
    private CreatedCommentsUseCase.Response executedUseCase(CreateComments command){
        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow();
        var CommandCreated = events;
        return CommandCreated;
    }

    @GetMapping(value = "api/comments")
    public Iterable<CommentsData> investigate() {
        return (transformationCommentsUseCase.investigate());
    }
}
