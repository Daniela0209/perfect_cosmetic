package com.co.sofka.Perfect_cosmetic.domain.gender.repository;

import com.co.sofka.Perfect_cosmetic.domain.gender.entity.Module;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.ModuleId;
import org.springframework.data.repository.CrudRepository;

public interface IModuleRepository extends CrudRepository<Module, ModuleId> {
}
