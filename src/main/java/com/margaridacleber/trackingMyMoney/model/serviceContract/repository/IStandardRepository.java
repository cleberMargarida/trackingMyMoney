package com.margaridacleber.trackingMyMoney.model.serviceContract.repository;

import com.margaridacleber.trackingMyMoney.model.businessLogic.object.StandardObj;
import java.util.List;

public interface IStandardRepository<T extends StandardObj> {

    void Create(T obj);

    List<T> Read();

    void Update(T obj);

    void Delete(T obj);
}