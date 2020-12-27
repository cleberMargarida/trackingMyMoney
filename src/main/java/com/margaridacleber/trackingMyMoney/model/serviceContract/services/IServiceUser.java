package com.margaridacleber.trackingMyMoney.model.serviceContract.services;

import com.margaridacleber.trackingMyMoney.model.businessLogic.object.User;
import com.margaridacleber.trackingMyMoney.model.serviceContract.data.DtoUser;

public interface IServiceUser extends IServiceStandard<User, DtoUser> {

    Boolean CheckCredentials (DtoUser dto);

}