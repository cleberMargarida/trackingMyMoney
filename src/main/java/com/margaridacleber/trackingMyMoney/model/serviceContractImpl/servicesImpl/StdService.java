package com.margaridacleber.trackingMyMoney.model.serviceContractImpl.servicesImpl;

import com.margaridacleber.trackingMyMoney.model.businessLogic.object.Standard;
import com.margaridacleber.trackingMyMoney.model.businessLogic.validation.StdValidation;
import com.margaridacleber.trackingMyMoney.model.serviceContract.data.DtoStd;
import com.margaridacleber.trackingMyMoney.model.serviceContract.repository.IStdRepository;
import com.margaridacleber.trackingMyMoney.model.serviceContract.services.IStdService;
import com.margaridacleber.trackingMyMoney.model.serviceContractImpl.converter.StdConverter;
import com.margaridacleber.trackingMyMoney.model.serviceContractImpl.mapper.StdMap;
import com.margaridacleber.trackingMyMoney.model.serviceContractImpl.repositoryImpl.StdRepository;

public class StdService<TObj extends Standard, TDto extends DtoStd, TMap extends StdMap<TObj>>
        implements IStdService<TObj, TDto, TMap> {

    @Override
    public StdConverter<TObj,TDto> Converter() {
        return new StdConverter<>();
    }

    @Override
    public IStdRepository<TObj, TMap> Repository() {
        return new StdRepository<>();
    }

    @Override
    public StdValidation<TObj> Validation() {
        return new StdValidation<>();
    }
}
