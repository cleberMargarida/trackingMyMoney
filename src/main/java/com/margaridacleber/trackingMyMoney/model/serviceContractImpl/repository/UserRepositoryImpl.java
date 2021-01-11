package com.margaridacleber.trackingMyMoney.model.serviceContractImpl.repository;

import com.margaridacleber.trackingMyMoney.model.businessLogic.object.User;
import com.margaridacleber.trackingMyMoney.model.serviceContract.data.dao.UserDao;
import com.margaridacleber.trackingMyMoney.model.serviceContract.repository.UserRepository;
import com.margaridacleber.trackingMyMoney.model.serviceContractImpl.data.dao.UserDaoImpl;

import java.util.UUID;

public class UserRepositoryImpl implements UserRepository {

    private final UserDao dao = new UserDaoImpl();

    @Override
    public void CreateUser(User user) throws Exception {
        dao.create(user);
    }

    @Override
    public void DeleteUser(User user) throws Exception {
        dao.delete(user);
    }

    @Override
    public void ChangePassword(User user, String newPassword) throws Exception {
        user.setPassword(newPassword);
        dao.update(user);
    }

    @Override
    public User GetUser(UUID Id) throws Exception {
        return dao.read(Id);
    }

    @Override
    public User GetUser(String username, String password) throws Exception {
        return dao.read(username, password);
    }

    @Override
    public User GetUser(String username) throws Exception {
        return dao.read(username);
    }
}
