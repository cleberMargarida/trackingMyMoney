package com.margaridacleber.trackingMyMoney.model.serviceContract.data.dao;

import com.margaridacleber.trackingMyMoney.model.businessLogic.object.User;

import java.util.UUID;

public interface UserDao {

    User read(String username, String password) throws Exception;

    User read(UUID Id) throws Exception;

    User read(String Username) throws Exception;

    User create(User user) throws Exception;

    User update(User user) throws Exception;

    void delete(User user) throws Exception;
}
