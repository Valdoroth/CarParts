package com.example.CarParts.dao;

import com.example.CarParts.entity.Tire;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class TireDAOImpl implements TireDAO {
    private final EntityManager entityManager;

    @Autowired
    public TireDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<Tire> findAllTires() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Tire> someQuery = currentSession.createQuery("from Tire");
        return someQuery.getResultList();
    }

    @Override
    @Transactional
    public Object findById(int tireId) {
        Session currentSession = entityManager.unwrap(Session.class);
        return currentSession.get(Tire.class, tireId);
    }

    @Override
    @Transactional
    public void saveOrUpdate(Tire theTire) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(theTire);
    }

    @Override
    @Transactional
    public void deleteTire(int tireId) {
        Session currentSession = entityManager.unwrap(Session.class);
        Tire myTire = currentSession.get(Tire.class, tireId);
        currentSession.delete(myTire);
    }
}
