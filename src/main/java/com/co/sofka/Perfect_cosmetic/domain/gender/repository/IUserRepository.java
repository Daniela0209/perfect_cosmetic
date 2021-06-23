package com.co.sofka.Perfect_cosmetic.domain.gender.repository;

import com.co.sofka.Perfect_cosmetic.domain.gender.entity.Users;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.UsersId;
import org.springframework.data.repository.CrudRepository;

public interface IUserRepository extends CrudRepository<Users, UsersId> {
}
