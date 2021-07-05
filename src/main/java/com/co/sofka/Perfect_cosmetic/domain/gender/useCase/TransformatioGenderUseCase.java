package com.co.sofka.Perfect_cosmetic.domain.gender.useCase;


import com.co.sofka.Perfect_cosmetic.domain.gender.Gender;
import com.co.sofka.Perfect_cosmetic.domain.gender.repository.GenderData;
import com.co.sofka.Perfect_cosmetic.domain.gender.repository.IGenderDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransformatioGenderUseCase {

    @Autowired
    private IGenderDataRepository data;

    public GenderData transform(Gender gender) {
        GenderData genderData = new GenderData(gender.getIdGender(), gender.getFeminine().value(), gender.getMale().value(), gender.getOther().value(), gender.getUserGender().value());
        return (genderData);
    }
    public Iterable<GenderData> select(){
        return data.findAll();
    }

}
