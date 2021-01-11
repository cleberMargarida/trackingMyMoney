package com.margaridacleber.trackingMyMoney.model.serviceContract.repository;

import com.margaridacleber.trackingMyMoney.model.businessLogic.object.User;

import java.util.UUID;

public interface UserRepository {
    void CreateUser(User user) throws Exception;

    void DeleteUser(User user) throws Exception;

    void ChangePassword(User user, String newPassword) throws Exception;

    User GetUser(UUID Id) throws Exception;

    User GetUser(String username, String password) throws Exception;

    User GetUser(String username) throws Exception;
}
