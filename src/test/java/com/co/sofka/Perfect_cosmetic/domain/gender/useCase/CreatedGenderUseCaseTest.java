package com.co.sofka.Perfect_cosmetic.domain.gender.useCase;//*

/*import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import com.co.sofka.Perfect_cosmetic.domain.gender.Gender;
import com.co.sofka.Perfect_cosmetic.domain.gender.commands.CreateGender;
import com.co.sofka.Perfect_cosmetic.domain.gender.events.GenderCreated;
import com.co.sofka.Perfect_cosmetic.domain.gender.repository.IGenderRepository;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import static org.mockito.ArgumentMatchers.any;


class CreatedGenderUseCaseTest {

   @Autowired
    private CreatedGenderUseCase useCase;

    @InjectMocks
    private IGenderRepository iGenderRepository;

    @InjectMocks
    private CrudRepository crudRepository;


    @Test
    public void createGenderTest(){
        Mockito.when(crudRepository.save(any())).thenReturn(new Gender(GenderId.of("23"),new Feminine("femenino"),new Male("masculino"),new Other("otro"),new UserGender("Daniela")));

        var command = new CreateGender(GenderId.of("23"), new Feminine("femenino"),new Male("masculino"),new Other("otro"),new UserGender("Daniela"));

        GenderCreated genderCreated = executedUseCase(command);

        Assertions.assertEquals("23",genderCreated.GenderId().value());
        System.out.println("Hola bienvenido");

    }

    private GenderCreated executedUseCase (CreateGender command){
        var usecase =new CreatedGenderUseCase();

        var events = UseCaseHandler.getInstance()
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getResponse();

        var genderCreated =(GenderCreated) events.get(0);
        return genderCreated;
    }
}*/
