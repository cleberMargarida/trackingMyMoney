package com.margaridacleber.trackingMyMoney.model.serviceContractImpl.services;

import com.margaridacleber.trackingMyMoney.model.businessLogic.validation.UserValidation;
import com.margaridacleber.trackingMyMoney.model.serviceContract.repository.UserRepository;
import com.margaridacleber.trackingMyMoney.model.serviceContract.services.UserService;
import com.margaridacleber.trackingMyMoney.model.serviceContractImpl.data.converter.UserConverter;
import com.margaridacleber.trackingMyMoney.model.serviceContractImpl.repository.UserRepositoryImpl;

public class UserServiceImpl implements UserService{
    @Override
    public UserConverter Converter()
    {
        return new UserConverter();
    }

    @Override
    public UserRepository Repository()
    {
        return new UserRepositoryImpl();
    }

    @Override
    public UserValidation Validations()
    {
        return new UserValidation();
    }

    @Override
    public void close() throws Exception {

    }
}
