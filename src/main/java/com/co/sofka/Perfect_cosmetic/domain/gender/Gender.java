package com.co.sofka.Perfect_cosmetic.domain.gender;


import co.com.sofka.domain.generic.AggregateRoot;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "Genero")
public class Gender extends AggregateRoot<GenderId> {

    protected Feminine feminine;
    protected Male male;
    protected Other other;
    protected UserGender userGender;


    public Gender(GenderId genderId, Feminine feminine, Male male, Other other, UserGender userGender){
        super(genderId);
        this.feminine = feminine;
        this.male = male;
        this.other = other;
        this.userGender = this.userGender;

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
