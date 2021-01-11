package com.margaridacleber.trackingMyMoney.model.serviceContractImpl.data.dao;

import com.margaridacleber.trackingMyMoney.model.businessLogic.object.User;
import com.margaridacleber.trackingMyMoney.model.serviceContract.data.dao.UserDao;
import org.hibernate.HibernateException;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.UUID;

@Repository
@Transactional
public class UserDaoImpl extends HibernateUtil implements UserDao {

    @PersistenceContext
    private EntityManager entityManger;


    public User read(String username, String password) throws Exception {
        try {
            begin();
            Query<?> query = getSession()
                    .createQuery("from User where username = '%s' and password = '%s' ".formatted(username, password));

            User user = (User) query.uniqueResult();
            commit();
            return user;
        } catch (HibernateException e) {
            rollback();
            throw new Exception("Could not get user " + username, e);
        }
    }

    public User read(String username) throws Exception {
        try {
            begin();
            Query<?> query = getSession()
                    .createQuery("from User where username = '%s' ".formatted(username));

            User user = (User) query.uniqueResult();
            commit();
            return user;
        } catch (HibernateException e) {
            rollback();
            throw new Exception("Could not get user " + username, e);
        }
    }

    public User read(UUID Id) throws Exception {
        try {
            begin();
            Query<?> query = getSession().createQuery("from User where ID = '%s' ".formatted(Id));
            User user = (User) query.uniqueResult();
            commit();
            return user;
        } catch (HibernateException e) {
            rollback();
            throw new Exception("Could not get user " + Id, e);
        }
    }

    public User create(User user) throws Exception {
        try {
            begin();
            getSession().save(user);
            commit();
            return user;

        } catch (HibernateException e) {
            rollback();
            throw new Exception("Exception while creating user: " + e.getMessage());
        }
    }

    public User update(User user) throws Exception {
        try {
            begin();
            getSession().update(user);
            commit();
            return user;

        } catch (HibernateException e) {
            rollback();
            throw new Exception("Exception while updating user: " + e.getMessage());
        }
    }

    public void delete(User user) throws Exception {
        try {
            begin();
            getSession().delete(user);
            commit();
        } catch (HibernateException e) {
            rollback();
            throw new Exception("Could not delete user " + user.getUsername(), e);
        }
    }
}

/*
* https://www.guj.com.br/t/dao-impl-com-fluent-interface/287226
* */