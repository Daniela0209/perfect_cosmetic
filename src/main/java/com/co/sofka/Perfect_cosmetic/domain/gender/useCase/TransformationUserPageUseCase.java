package com.co.sofka.Perfect_cosmetic.domain.gender.useCase;


import com.co.sofka.Perfect_cosmetic.domain.gender.entity.UserPage;
import com.co.sofka.Perfect_cosmetic.domain.gender.repository.IUserPageDataRepository;
import com.co.sofka.Perfect_cosmetic.domain.gender.repository.UserPageData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransformationUserPageUseCase {

    @Autowired
    private IUserPageDataRepository data;

    public UserPageData transform(UserPage userPage){
        UserPageData userPageData = new UserPageData(userPage.getIdUserPage(),userPage.getNameUser().value(),userPage.getEmail().value());
        return userPageData;
    }

    public Iterable<UserPageData> searchUsers(){
        return data.findAll();
    }
}
