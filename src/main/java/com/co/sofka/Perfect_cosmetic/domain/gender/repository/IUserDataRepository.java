package com.co.sofka.Perfect_cosmetic.domain.gender.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserDataRepository extends CrudRepository<UsersData, String> {
}
