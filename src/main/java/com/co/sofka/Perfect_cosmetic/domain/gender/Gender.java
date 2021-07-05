package com.co.sofka.Perfect_cosmetic.domain.gender;


import co.com.sofka.domain.generic.AggregateRoot;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Genero")
public class Gender extends AggregateRoot<GenderId> {

    @Id
    protected String idGender;
    protected Feminine feminine;
    protected Male male;
    protected Other other;
    protected UserGender userGender;


    public Gender(GenderId entityId, Feminine feminine, Male male, Other other, UserGender userGender) {
        super(entityId);
        this.idGender = entityId.value();
        this.feminine = feminine;
        this.male = male;
        this.other = other;
        this.userGender = userGender;
    }

    public String getIdGender() {
        return idGender;
    }

    public void setIdGender(String idGender) {
        this.idGender = idGender;
    }

    public Feminine getFeminine() {
        return feminine;
    }

    public Male getMale() {
        return male;
    }

    public Other getOther() {
        return other;
    }

    public UserGender getUserGender() {
        return userGender;
    }
}
