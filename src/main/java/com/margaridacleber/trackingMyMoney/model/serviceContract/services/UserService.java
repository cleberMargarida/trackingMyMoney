package com.margaridacleber.trackingMyMoney.model.serviceContract.services;

import com.margaridacleber.trackingMyMoney.model.businessLogic.object.User;
import com.margaridacleber.trackingMyMoney.model.businessLogic.validation.UserValidation;
import com.margaridacleber.trackingMyMoney.model.serviceContract.data.dto.UserDto;
import com.margaridacleber.trackingMyMoney.model.serviceContract.repository.UserRepository;
import com.margaridacleber.trackingMyMoney.model.serviceContractImpl.data.converter.UserConverter;

public interface UserService extends AutoCloseable{
    UserConverter Converter();

    UserRepository Repository();

    UserValidation Validations();
}