package com.javaSchool.dao;

import com.javaSchool.entity.User;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao{

    private static final Logger log = LogManager.getLogger(UserDao.class);

    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public User findByUserName (String userName) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(User.class, userName);
    }

    public void updateUser (User user) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(user);
    }

    /*public List findAllUsers() {
        Session session = sessionFactory.getCurrentSession();

    }*/


    }



