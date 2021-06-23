package com.co.sofka.Perfect_cosmetic.domain.gender.useCase;


import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import com.co.sofka.Perfect_cosmetic.domain.gender.commands.CreateUsers;
import com.co.sofka.Perfect_cosmetic.domain.gender.entity.Users;
import com.co.sofka.Perfect_cosmetic.domain.gender.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreatedUsersUseCase extends UseCase<RequestCommand<CreateUsers>, CreatedUsersUseCase.Response> {

    @Autowired
    private IUserRepository iUserRepository;

    @Override
    public void executeUseCase(RequestCommand<CreateUsers> createUsersRequestCommand){
        var command = createUsersRequestCommand.getCommand();
        var users = new Users(command.UsersId(), command.NameUser(),command.Email());
        iUserRepository.save(users);
        emit().onResponse(new Response(users));
    }

    public static class Response implements UseCase.ResponseValues {

        private Users response;


        public Response(Users users) {
            this.response = users;
        }

        public Users getResponse() {
            return response;
        }

        public void setResponse(Users response) {
            this.response = response;
        }
    }

}
