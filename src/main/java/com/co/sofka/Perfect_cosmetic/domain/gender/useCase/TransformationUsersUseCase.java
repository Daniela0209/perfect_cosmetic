package com.co.sofka.Perfect_cosmetic.domain.gender.useCase;


import com.co.sofka.Perfect_cosmetic.domain.gender.entity.Users;
import com.co.sofka.Perfect_cosmetic.domain.gender.repository.IUsersDataRepository;
import com.co.sofka.Perfect_cosmetic.domain.gender.repository.UsersData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransformationUsersUseCase {

    @Autowired
    public IUsersDataRepository data;

    public UsersData transform(Users users) {

        UsersData usersData = new UsersData(users.getIdUsers(), users.getUsersId().value(), users.getNameUser().value(), users.getEmail().value());
        return usersData;
    }

    public Iterable<UsersData> list() {
        return data.findAll();
    }

    public UsersData listUser(String id) {
        return data.findById(id).orElseThrow(RuntimeException::new);
    }

    public String delete(String id) {

        try {
            data.deleteById(id);
            return "Se elimino correctamente";
        } catch (Exception e) {
            return "No se pudo eliminar correctamente";
        }
    }
}
