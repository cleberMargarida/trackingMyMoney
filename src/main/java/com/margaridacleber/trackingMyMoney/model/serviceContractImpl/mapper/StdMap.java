package com.margaridacleber.trackingMyMoney.model.serviceContractImpl.mapper;

import com.margaridacleber.trackingMyMoney.model.businessLogic.object.Standard;
import java.lang.reflect.InvocationTargetException;

public class StdMap<TEntity extends Standard> {

    private StringBuilder query;
    final String tableName;

    public StdMap(TEntity obj) {
        this.tableName = obj.getClass().getSimpleName();
    }

    public String Create (TEntity obj){
        query.append("INSERT INTO ").append(tableName);
        query.append("VALUES (").append(obj.getId()).append(");");
        query.append("ALTER TABLE ").append(tableName).append("ADD PRIMARY KEY (ID); ");

        return query.toString();
    }

    public String Read (TEntity obj){
        query.append("SELECT * FROM").append(tableName);

        return query.toString();
    }

    public String Update (TEntity obj, String collumn ) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        query.append("UPDATE ").append(tableName).append(" SET ");
        query.append(collumn).append("=").append(obj.GetValueByPropertiesName(collumn).toString());
        query.append("WHERE ID = ").append(obj.getId());

        return query.toString();
    }

    public String Delete (TEntity obj){
        query.append("DELETE FROM ").append(tableName);
        query.append("WHERE ID = ").append(obj.getId()).append(");");

        return query.toString();
    }
}
