package com.co.sofka.Perfect_cosmetic.domain.gender.repository;

import com.co.sofka.Perfect_cosmetic.domain.gender.Gender;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.GenderId;
import org.springframework.data.repository.CrudRepository;

public interface IGenderRepository extends CrudRepository<Gender, GenderId> {
}