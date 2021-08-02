package com.example.CarParts.dao;

import com.example.CarParts.entity.Wheel;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class WheelDAOImpl implements WheelDAO {
    private final EntityManager entityManager;

    @Autowired
    public WheelDAOImpl(EntityManager entityManager) {this.entityManager = entityManager;}

    @Override
    @Transactional
    public List<com.example.CarParts.entity.Wheel> findAll() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Wheel> someQuery = currentSession.createQuery("from Wheel");
        return someQuery.getResultList();
    }

    @Override
    @Transactional
    public Object findById(int wheelId) {
        Session currentSession = entityManager.unwrap(Session.class);
        return currentSession.get(Wheel.class, wheelId);
    }

    @Override
    @Transactional
    public void saveOrUpdate(Wheel theWheel) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(theWheel);
    }

    @Override
    @Transactional
    public void deleteById(int wheelId) {
        Session currentSession = entityManager.unwrap(Session.class);
        Wheel myWheel = currentSession.get(Wheel.class, wheelId);
        currentSession.delete(myWheel);
    }
}