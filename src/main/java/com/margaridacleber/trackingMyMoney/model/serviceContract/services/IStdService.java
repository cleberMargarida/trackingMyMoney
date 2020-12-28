package com.margaridacleber.trackingMyMoney.model.serviceContract.services;

import com.margaridacleber.trackingMyMoney.model.businessLogic.object.Standard;
import com.margaridacleber.trackingMyMoney.model.businessLogic.validation.StdValidation;
import com.margaridacleber.trackingMyMoney.model.serviceContract.data.DtoStd;
import com.margaridacleber.trackingMyMoney.model.serviceContract.repository.IStdRepository;
import com.margaridacleber.trackingMyMoney.model.serviceContractImpl.converter.StdConverter;
import com.margaridacleber.trackingMyMoney.model.serviceContractImpl.mapper.StdMap;

public interface IStdService<TObj extends Standard, TDto extends DtoStd, TMap extends StdMap<TObj>> {

    StdConverter<TObj, TDto> Converter();

    IStdRepository<TObj, TMap> Repository() throws Exception;

    StdValidation<TObj> Validation();
}
