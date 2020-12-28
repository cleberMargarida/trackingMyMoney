package com.margaridacleber.trackingMyMoney.model.serviceContractImpl.converter;

import com.margaridacleber.trackingMyMoney.model.businessLogic.object.Standard;
import com.margaridacleber.trackingMyMoney.model.serviceContract.data.DtoStd;

public class StdConverter<TObj extends Standard, TDto extends DtoStd>{

    public DtoStd Convert(Standard obj){
        return new DtoStd();
    }

    public Standard Convert(DtoStd dto){
        return new Standard();
    }

    public Standard ConvertFromPersistence(DtoStd dto){
        return null;
    }
}