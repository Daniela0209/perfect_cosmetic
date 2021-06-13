package com.co.sofka.Perfect_cosmetic;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.co.sofka.Perfect_cosmetic.events.GenderCreated;
import com.co.sofka.Perfect_cosmetic.values.Feminine;
import com.co.sofka.Perfect_cosmetic.values.GenderId;
import com.co.sofka.Perfect_cosmetic.values.Male;
import com.co.sofka.Perfect_cosmetic.values.Other;

import java.util.List;

public class Gender extends AggregateEvent<GenderId> {

    protected Feminine feminine;
    protected Male male;
    protected Other other;

    private Gender(GenderId genderId) {
        super(genderId);
        subscribe(new GenderChange(this));
    }
    public Gender(GenderId genderId, Feminine feminine, Male male, Other other){
        super(genderId);
        this.feminine = feminine;
        this.male = male;
        this.other = other;

        appendChange(new GenderCreated(entityId,feminine,male,other)).apply();
    }

    public static Gender from(GenderId genderId, List<DomainEvent> events){
        var gender = new Gender(genderId);

        events.forEach(gender::applyEvent);
        return gender;
    }
}
