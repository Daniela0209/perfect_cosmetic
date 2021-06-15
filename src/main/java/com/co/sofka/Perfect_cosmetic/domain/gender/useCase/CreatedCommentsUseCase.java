package com.co.sofka.Perfect_cosmetic.domain.gender.useCase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.generic.DomainEvent;
import com.co.sofka.Perfect_cosmetic.domain.gender.commands.CreateComments;
import com.co.sofka.Perfect_cosmetic.domain.gender.entity.Comments;
import com.co.sofka.Perfect_cosmetic.domain.gender.events.CommentsCreated;

import java.util.ArrayList;
import java.util.List;


public class CreatedCommentsUseCase extends UseCase<RequestCommand<CreateComments>, ResponseEvents> {


    @Override
    public void executeUseCase(RequestCommand<CreateComments> createCommentsRequestCommand) {
        var command = createCommentsRequestCommand.getCommand();
         new Comments(command.CommentsId(),command.UserId(),command.Contents());
        List<DomainEvent> ListEvents;
        ListEvents = new ArrayList<>();
        ListEvents.add(new CommentsCreated(command.CommentsId(),command.UserId(),command.Contents()));
        emit().onResponse(new ResponseEvents(ListEvents));

    }
}
