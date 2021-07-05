package com.co.sofka.Perfect_cosmetic.domain.gender.commands;

import co.com.sofka.domain.generic.Command;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.Email;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.NameUser;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.UsersId;


public class UpdateUsers implements Command {


    private final UsersId usersId;
    private final NameUser nameUser;
    private final Email email;

    public UpdateUsers( UsersId usersId, NameUser nameUser, Email email) {
        this.usersId = usersId;
        this.nameUser = nameUser;
        this.email = email;
    }



    public UsersId usersId() {
        return usersId;
    }

    public NameUser nameUser() {
        return nameUser;
    }

    public Email email() {
        return email;
    }
}
