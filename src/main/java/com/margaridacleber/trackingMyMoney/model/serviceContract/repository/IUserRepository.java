package com.margaridacleber.trackingMyMoney.model.serviceContract.repository;

import com.margaridacleber.trackingMyMoney.model.businessLogic.object.User;

public interface IUserRepository extends IStandardRepository<User> {

    User ReadUser(User user);

}