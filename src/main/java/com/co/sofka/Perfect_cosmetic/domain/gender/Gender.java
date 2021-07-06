package com.co.sofka.Perfect_cosmetic.domain.gender;

import co.com.sofka.domain.generic.AggregateRoot;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.GenderId;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.GenderUser;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.UserName;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Gender")
public class Gender extends AggregateRoot<GenderId> {

    @Id
    protected String idGender;
    protected GenderUser genderUser;
    protected UserName username;

    public Gender(GenderId entityId, GenderUser genderUser, UserName username) {
        super(entityId);
        this.idGender = entityId.value();
        this.genderUser = genderUser;
        this.username = username;
    }

    public String getIdGender() {
        return idGender;
    }

    public void setIdGender(String idGender) {
        this.idGender = idGender;
    }

    public GenderUser getGenderUser() {
        return genderUser;
    }

    public UserName getUsername() {
        return username;
    }
}
