package com.margaridacleber.trackingMyMoney.model.userModel;

import java.util.UUID;

public class User {
    private UUID Id;
    private String Email;
    private String Password;

    public UUID getId() {
        return Id;
    }

    public void setId(UUID id) {
        Id = id;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
