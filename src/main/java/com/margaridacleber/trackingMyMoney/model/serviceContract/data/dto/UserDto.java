package com.margaridacleber.trackingMyMoney.model.serviceContract.data.dto;

import java.util.UUID;

public class UserDto {

    private String Username;
    private String Password;

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
}
