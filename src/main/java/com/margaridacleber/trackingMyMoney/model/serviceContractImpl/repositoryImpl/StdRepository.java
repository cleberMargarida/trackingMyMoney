package com.margaridacleber.trackingMyMoney.model.serviceContractImpl.repositoryImpl;

import com.margaridacleber.trackingMyMoney.model.businessLogic.object.Standard;
import com.margaridacleber.trackingMyMoney.model.serviceContract.repository.IStdRepository;
import com.margaridacleber.trackingMyMoney.model.serviceContractImpl.mapper.StdMap;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.util.UUID;

public class StdRepository<TEntity extends Standard, TMap extends StdMap<TEntity>>
        implements IStdRepository<TEntity, TMap> {

    private Connection conn;
    private TMap map;

    public StdRepository() {
        ConnectToServer();
    }

    public Connection getConn() { return conn; }

    public void setMap(TMap map) { this.map = map; }

    @Override
    public void Create(TEntity obj) {
        String sql = map.Create(obj);
        ExecuteQuery(sql);
    }

    @Override
    public List<TEntity> Read(TEntity entity) throws SQLException, InstantiationException, IllegalAccessException {
        String sql = map.Read(entity);
        ResultSet rs = ExecuteQuery(sql);

        List<TEntity> list = new ArrayList<>();

        while (rs.next()) {
            //TODO: Find a way to create a generic instance
            TEntity item = createContents(null);
            for (int i = 0 ; i < entity.GetPropertiesName().size() ; i++){
                FillTheFields(rs, item, i);
            }
            list.add(item);
        }

        return list;
    }

    @Override
    public void Update(TEntity obj) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        for(String name : obj.GetPropertiesName()){
            String sql = map.Update(obj,name);
            ExecuteQuery(sql);
        }
    }

    @Override
    public void Delete(TEntity obj) {
        String sql = map.Delete(obj);
        ExecuteQuery(sql);
    }

    @Override
    public void FillTheFields(ResultSet rs, TEntity item, int i) throws SQLException {
        item.setId(UUID.fromString(rs.getString(i)));
    }

    private TEntity createContents(Class<TEntity> aClass) throws IllegalAccessException, InstantiationException {
        return aClass.newInstance();
    }

    private void ConnectToServer() {

        try {
            String url = "jdbc:sqlserver://localhost\\sqlexpress";
            conn = DriverManager.getConnection(url);
        }
        catch (SQLException e) {
            throw new Error("Error when opening connection", e);
        }
        finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            }
            catch (SQLException ex) {
                throw new Error("Error when closing connection", ex);
            }
        }
    }

    private ResultSet ExecuteQuery(String query) {
        try{
            Statement statement = conn.createStatement();
            return statement.executeQuery(query);
        }
        catch (Exception e){
            throw new Error("Error during db transaction", e);
        }
    }
}

/*
* https://www.codejava.net/java-se/jdbc/connect-to-microsoft-sql-server-via-jdbc
* https://docs.microsoft.com/en-us/sql/connect/jdbc/connection-url-sample?view=sql-server-ver15
* https://www.codejava.net/java-se/jdbc/jdbc-tutorial-sql-insert-select-update-and-delete-examples
*
*
 * */
