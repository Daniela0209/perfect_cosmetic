package com.co.sofka.Perfect_cosmetic.domain.gender.useCase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import com.co.sofka.Perfect_cosmetic.domain.gender.commands.CreateComments;
import com.co.sofka.Perfect_cosmetic.domain.gender.entity.Comments;
import com.co.sofka.Perfect_cosmetic.domain.gender.repository.CommentsData;
import com.co.sofka.Perfect_cosmetic.domain.gender.repository.ICommentsDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreatedCommentsUseCase extends UseCase<RequestCommand<CreateComments>, CreatedCommentsUseCase.Response> {


    @Autowired
    private ICommentsDataRepository data;

    @Override
    public void executeUseCase(RequestCommand<CreateComments> createCommentsRequestCommand) {
        CreateComments command = createCommentsRequestCommand.getCommand();
        Comments comments = new Comments(command.CommentsId(),command.UserId(),command.Contents());
        data.save(transform(comments));
        emit().onResponse(new Response(comments));

    }
    public CommentsData transform(Comments comments) {
        CommentsData commentsData = new CommentsData(comments.getIdComments(), comments.getUserId().value(), comments.getContents().value());
        return commentsData;
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
