package com.margaridacleber.trackingMyMoney.model.serviceContract.repository;

import com.margaridacleber.trackingMyMoney.model.businessLogic.object.Standard;
import com.margaridacleber.trackingMyMoney.model.serviceContractImpl.mapper.StdMap;
import java.lang.reflect.InvocationTargetException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface IStdRepository<TEntity extends Standard, TMap extends StdMap<TEntity>> {

    void Create(TEntity obj);

    List<TEntity> Read(TEntity obj) throws SQLException, InstantiationException, IllegalAccessException;

    void Update(TEntity obj) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException;

    void Delete(TEntity obj);

    void FillTheFields(ResultSet rs, TEntity item, int i) throws SQLException;

}