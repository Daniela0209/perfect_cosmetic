package com.co.sofka.Perfect_cosmetic.domain.gender;


import co.com.sofka.domain.generic.AggregateRoot;
import co.com.sofka.domain.generic.DomainEvent;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.Feminine;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.GenderId;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.Male;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.Other;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collation = "Usuarios")
public class Gender extends AggregateRoot<GenderId> {

    protected Feminine feminine;
    protected Male male;
    protected Other other;


    public Gender(GenderId genderId, Feminine feminine, Male male, Other other){
        super(genderId);
        this.feminine = feminine;
        this.male = male;
        this.other = other;

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



}
