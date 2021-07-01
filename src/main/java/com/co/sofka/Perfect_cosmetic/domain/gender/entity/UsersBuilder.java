package com.co.sofka.Perfect_cosmetic.domain.gender.entity;

import com.co.sofka.Perfect_cosmetic.domain.gender.values.Email;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.NameUser;

public final class UsersBuilder {
    protected String idUsers;
    protected NameUser nameUser;
    protected Email email;

    private UsersBuilder() {
    }

    public static UsersBuilder anUsers() {
        return new UsersBuilder();
    }

    public UsersBuilder withIdUsers(String idUsers) {
        this.idUsers = idUsers;
        return this;
    }

    public UsersBuilder withNameUser(NameUser nameUser) {
        this.nameUser = nameUser;
        return this;
    }

    public UsersBuilder withEmail(Email email) {
        this.email = email;
        return this;
    }

    public Users build() {
        Users users = new Users(null, nameUser, email);
        users.setIdUsers(idUsers);
        return users;
    }
}