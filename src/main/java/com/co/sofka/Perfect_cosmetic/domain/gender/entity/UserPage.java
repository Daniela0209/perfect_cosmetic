package com.co.sofka.Perfect_cosmetic.domain.gender.entity;


import co.com.sofka.domain.generic.Entity;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.Email;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.NameUser;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.UserPageId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "UserPage")
public class UserPage extends Entity<UserPageId> {

    @Id
    protected String idUserPage;

    protected NameUser nameUser;
    protected Email email;

    public UserPage(UserPageId entityId, NameUser nameUser, Email email) {
        super(entityId);
        this.idUserPage = idUserPage;
        this.nameUser = nameUser;
        this.email = email;
    }


    public void setIdUserPage(String idUserPage) {
        this.idUserPage = idUserPage;
    }

    public String getIdUserPage() {
        return idUserPage;
    }

    public NameUser getNameUser() {
        return nameUser;
    }

    public Email getEmail() {
        return email;
    }
}
