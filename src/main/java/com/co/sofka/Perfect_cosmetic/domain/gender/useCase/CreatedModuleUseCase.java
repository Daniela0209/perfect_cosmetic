package com.co.sofka.Perfect_cosmetic.domain.gender.useCase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import com.co.sofka.Perfect_cosmetic.domain.gender.commands.CreateModule;
import com.co.sofka.Perfect_cosmetic.domain.gender.entity.Module;
import com.co.sofka.Perfect_cosmetic.domain.gender.repository.IModuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CreatedModuleUseCase extends UseCase<RequestCommand<CreateModule>, CreatedModuleUseCase.Response>  {

    @Autowired
    private IModuleRepository iModuleRepository;

    @Override
    public void executeUseCase(RequestCommand<CreateModule> createModuleRequestCommand){
        var command = createModuleRequestCommand.getCommand();
        var module = new Module(command.ModuleId(),command.NameModule(),command.BannerUrl());
        iModuleRepository.equals(module);
        emit().onResponse(new Response(module));


    }
    public static class Response implements UseCase.ResponseValues{

        private Module response;

        public Response(Module module) {
            this.response = module;
        }

        public Module getResponse() {
            return response;
        }

        public void setResponse(Module response) {
            this.response = response;
        }
    }
}
