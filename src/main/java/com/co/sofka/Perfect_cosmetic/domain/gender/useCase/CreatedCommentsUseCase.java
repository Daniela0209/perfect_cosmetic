package com.co.sofka.Perfect_cosmetic.domain.gender.useCase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.generic.DomainEvent;
import com.co.sofka.Perfect_cosmetic.domain.gender.Gender;
import com.co.sofka.Perfect_cosmetic.domain.gender.commands.CreateComments;
import com.co.sofka.Perfect_cosmetic.domain.gender.entity.Comments;
import com.co.sofka.Perfect_cosmetic.domain.gender.events.CommentsCreated;
import com.co.sofka.Perfect_cosmetic.domain.gender.repository.ICommentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CreatedCommentsUseCase extends UseCase<RequestCommand<CreateComments>, CreatedCommentsUseCase.Response> {


    @Autowired
    private ICommentsRepository iCommentsRepository;

    @Override
    public void executeUseCase(RequestCommand<CreateComments> createCommentsRequestCommand) {
        var command = createCommentsRequestCommand.getCommand();
        var comments = new Comments(command.CommentsId(), command.UserId(), command.Contents());
        iCommentsRepository.save(comments);
        emit().onResponse(new Response(comments));

    }

    public static class Response implements UseCase.ResponseValues {

        private Comments response;

        public Response(Comments comments) {
            this.response = comments;
        }

        public Comments getResponse() {
            return response;
        }

        public void setResponse(Comments response) {
            this.response = response;
        }
    }
}
