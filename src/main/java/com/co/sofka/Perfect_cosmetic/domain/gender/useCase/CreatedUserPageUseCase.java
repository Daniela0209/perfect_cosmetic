package com.co.sofka.Perfect_cosmetic.domain.gender.useCase;



import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import com.co.sofka.Perfect_cosmetic.domain.gender.commands.CreateUserPage;
import com.co.sofka.Perfect_cosmetic.domain.gender.entity.UserPage;
import com.co.sofka.Perfect_cosmetic.domain.gender.repository.IUserPageDataRepository;
import com.co.sofka.Perfect_cosmetic.domain.gender.repository.UserPageData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreatedUserPageUseCase extends UseCase<RequestCommand<CreateUserPage>, CreatedUserPageUseCase.Response> {

    @Autowired
    private IUserPageDataRepository data;


   @Override
    public void executeUseCase(RequestCommand<CreateUserPage> createUserPageRequestCommand) {
        var command = createUserPageRequestCommand.getCommand();
        var userPage = new UserPage(command.userPageId(),command.nameUser(),command.email());
        data.save(transform(userPage));
        emit().onResponse(new Response(userPage));

    }
    public UserPageData transform(UserPage userPage){
        UserPageData userPageData = new UserPageData(userPage.getIdUserPage(), userPage.getNameUser().value(),userPage.getEmail().value());
        return userPageData;
    }

    public static class Response implements UseCase.ResponseValues{

        private UserPage response;


        public Response(UserPage userPage) {
            this.response=userPage;
        }

        public UserPage getResponse() {
            return response;
        }

        public void setResponse(UserPage response) {
            this.response = response;
        }
    }
}
