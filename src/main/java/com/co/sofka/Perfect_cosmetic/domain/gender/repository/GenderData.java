package com.co.sofka.Perfect_cosmetic.domain.gender.repository;


import com.co.sofka.Perfect_cosmetic.domain.gender.values.Feminine;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.Male;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.Other;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.UserGender;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Gender")
public class GenderData {

    @Id
    protected String id;
    protected String feminine;
    protected String male;
    protected String other;
    protected String userGender;

    public GenderData(String id, String feminine, String male, String other, String userGender) {
        this.id = id;
        this.feminine = feminine;
        this.male = male;
        this.other = other;
        this.userGender = userGender;
    }

    public GenderData(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFeminine() {
        return feminine;
    }

    public void setFeminine(String feminine) {
        this.feminine = feminine;
    }

    public String getMale() {
        return male;
    }

    public void setMale(String male) {
        this.male = male;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }
}


