package com.co.sofka.Perfect_cosmetic.domain.gender.useCase;


import com.co.sofka.Perfect_cosmetic.domain.gender.entity.Users;
import com.co.sofka.Perfect_cosmetic.domain.gender.repository.IUsersDataRepository;
import com.co.sofka.Perfect_cosmetic.domain.gender.repository.UsersData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransformationUsersUseCase {

    @Autowired
    public IUsersDataRepository iUsersDataRepository;

    public UsersData transform(Users users){

        UsersData usersData = new UsersData(users.getIdUsers(), users.getUsersId().value(),users.getNameUser().value(),users.getEmail().value());
        return usersData;
    }
    public Iterable<UsersData>list(){
        return iUsersDataRepository.findAll();
    }
}
