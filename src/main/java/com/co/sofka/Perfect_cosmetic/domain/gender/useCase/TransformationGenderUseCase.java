package com.co.sofka.Perfect_cosmetic.domain.gender.useCase;


import com.co.sofka.Perfect_cosmetic.domain.gender.Gender;
import com.co.sofka.Perfect_cosmetic.domain.gender.repository.GenderData;
import com.co.sofka.Perfect_cosmetic.domain.gender.repository.IGenderDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransformationGenderUseCase {

    @Autowired
    private IGenderDataRepository data;

    public GenderData transform(Gender gender) {
        GenderData genderData = new GenderData(gender.getIdGender(), gender.getGenderUser().value(),gender.getUsername().value());
        return genderData;
    }
    public GenderData update(String id) {
        return data.findById(id).orElseThrow(RuntimeException::new);
    }
    public Iterable<GenderData> select(){
        return data.findAll();
    }

}
