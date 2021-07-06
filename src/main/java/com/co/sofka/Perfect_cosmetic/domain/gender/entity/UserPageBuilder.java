package com.co.sofka.Perfect_cosmetic.domain.gender.entity;

import com.co.sofka.Perfect_cosmetic.domain.gender.values.Email;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.NameUser;

public final class UserPageBuilder {
    protected String idUserPage;
    protected NameUser nameUser;
    protected Email email;

    private UserPageBuilder() {
    }

    public static UserPageBuilder anUserPage() {
        return new UserPageBuilder();
    }

    public UserPageBuilder withIdUserPage(String idUserPage) {
        this.idUserPage = idUserPage;
        return this;
    }

    public UserPageBuilder withNameUser(NameUser nameUser) {
        this.nameUser = nameUser;
        return this;
    }

    public UserPageBuilder withEmail(Email email) {
        this.email = email;
        return this;
    }

    public UserPage build() {
        UserPage userPage = new UserPage(null, nameUser, email);
        userPage.setIdUserPage(idUserPage);
        return userPage;
    }
}
