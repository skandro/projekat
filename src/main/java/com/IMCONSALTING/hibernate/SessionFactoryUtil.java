package com.IMCONSALTING.hibernate;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryUtil {
    private static SessionFactory sessionFactory = null;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration().configure();
                configuration.configure();
                sessionFactory = configuration.buildSessionFactory();
            } catch (HibernateException e) {
                System.err.println(e.getMessage());
            }
        }
        return sessionFactory;
    }
}