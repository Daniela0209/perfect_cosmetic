package com.co.sofka.Perfect_cosmetic.domain.gender.controller;


import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import com.co.sofka.Perfect_cosmetic.domain.gender.commands.CreateComments;
import com.co.sofka.Perfect_cosmetic.domain.gender.commands.UpdateComments;
import com.co.sofka.Perfect_cosmetic.domain.gender.repository.CommentsData;
import com.co.sofka.Perfect_cosmetic.domain.gender.useCase.CreatedCommentsUseCase;
import com.co.sofka.Perfect_cosmetic.domain.gender.useCase.TransformationCommentsUseCase;
import com.co.sofka.Perfect_cosmetic.domain.gender.useCase.UpdateCommentsUseCase;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.CommentsId;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.Contents;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.UserId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class CommentsController {

    @Autowired
    private CreatedCommentsUseCase createdCommentsUseCase;

    @Autowired
    private UpdateCommentsUseCase updateCommentsUseCase;

    @Autowired
    private TransformationCommentsUseCase transformationCommentsUseCase;


    @PostMapping(value = "api/save/{commentsId}/{userId}/{contents}")
    public String save(@PathVariable("commentsId")String commentsId,
                       @PathVariable("userId")String userId,
                       @PathVariable("contents")String contents){

        CreateComments command = new CreateComments(CommentsId.of(commentsId),UserId.of(userId),new Contents(contents));
    CreatedCommentsUseCase.Response commentsCreated = executedUseCase(command);

        String string="{"
                + "\"commentsId\":" + "\""+commentsCreated.getResponse().identity()+"\""+ ","
                + "\"userId\":" + "\""+commentsCreated.getResponse().getUserId().value()+"\""+ ","
                + "\"contents\":" + "\""+commentsCreated.getResponse().getContents().value()
                +"}";
        return string;
    }
    private CreatedCommentsUseCase.Response executedUseCase(CreateComments command){
        CreatedCommentsUseCase.Response events = UseCaseHandler.getInstance()
                .syncExecutor(createdCommentsUseCase, new RequestCommand<>(command))
                .orElseThrow();
        CreatedCommentsUseCase.Response CommandCreated = events;
        return CommandCreated;
    }

    @PutMapping(value = "api/actualizar/{commentsId}/{userId}/{contents}")
    public String update(@PathVariable("commentsId")String commentsId,
                         @PathVariable("userId")String userId,
                         @PathVariable("contents")String contents){
        UpdateComments command = new UpdateComments(CommentsId.of(commentsId),new UserId(userId),new Contents(contents));
        UpdateCommentsUseCase.Response commentsUpdate = executedUseCase(command);

        String string="{"
                + "\"commentsId\":" + "\""+commentsUpdate.getResponse().identity()+"\""+ ","
                + "\"userId\":" + "\""+commentsUpdate.getResponse().getUserId().value()+"\""+ ","
                + "\"contents\":" + "\""+commentsUpdate.getResponse().getContents().value()
                +"}";

        return string;
    }

    private UpdateCommentsUseCase.Response executedUseCase(UpdateComments command){
        UpdateCommentsUseCase.Response events = UseCaseHandler.getInstance()
                .syncExecutor(updateCommentsUseCase, new RequestCommand<>(command))
                .orElseThrow();
        UpdateCommentsUseCase.Response CommentsUpdated = events;
        return (UpdateCommentsUseCase.Response) CommentsUpdated;

    }

    @GetMapping(value = "api/comments")
    public Iterable<CommentsData> investigate() {
        return (transformationCommentsUseCase.investigate());
    }
    @DeleteMapping(value = "api/deleteComment/{id}")
    public String delete(@PathVariable("id")String id){
        return (transformationCommentsUseCase.delete(id));
    }
}
