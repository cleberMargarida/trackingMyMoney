package com.margaridacleber.trackingMyMoney.model.serviceContract.services;

import com.margaridacleber.trackingMyMoney.model.businessLogic.object.StandardObj;
import com.margaridacleber.trackingMyMoney.model.serviceContract.data.DataTransferObject;

import java.util.List;

public interface IServiceStandard<TObj extends StandardObj, TDto extends DataTransferObject> {

    void Create(TDto dto);

    List<TDto> Read();

    void Update(TDto dto);

    void Delete(TDto dto);

    TDto ConvertIntoDto(TObj obj);

    TObj ConvertIntoObj(TDto dto);

    TObj ConvertFromPersistence(TDto dto);

}
