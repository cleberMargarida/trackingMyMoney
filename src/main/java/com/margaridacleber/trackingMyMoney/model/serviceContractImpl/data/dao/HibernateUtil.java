package com.margaridacleber.trackingMyMoney.model.serviceContractImpl.data.dao;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

@Repository
public class HibernateUtil {

    private static final Logger log = Logger.getAnonymousLogger();

    private static final ThreadLocal<Session> sessionThread = new ThreadLocal<>();
    private static final SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

    public HibernateUtil() {
    }

    protected static Session getSession()
    {
        Session session = HibernateUtil.sessionThread.get();

        if (session == null)
        {
            session = sessionFactory.openSession();
            HibernateUtil.sessionThread.set(session);
        }
        return session;
    }

    protected void begin() {
        getSession().beginTransaction();
    }

    protected void commit() {
        getSession().getTransaction().commit();
    }

    protected void rollback() {
        try {
            getSession().getTransaction().rollback();
        } catch (HibernateException e) {
            log.log(Level.WARNING, "Cannot rollback", e);
        }
        try {
            getSession().close();
        } catch (HibernateException e) {
            log.log(Level.WARNING, "Cannot close", e);
        }
        HibernateUtil.sessionThread.set(null);
    }

    public static void close() {
        getSession().close();
        HibernateUtil.sessionThread.set(null);
    }
}