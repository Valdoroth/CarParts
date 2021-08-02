package com.example.CarParts.dao;

import com.example.CarParts.entity.CarModel;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class CarModelDAOImpl implements CarModelDAO {
    private final EntityManager entityManager;

    @Autowired
    public CarModelDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<CarModel> findAllCars() {
        Session session = entityManager.unwrap(Session.class);
        Query<CarModel> query = session.createQuery("from CarModel");
        return query.getResultList();
    }

    @Override
    @Transactional
    public Object findById(int carModelID) {
        Session session = entityManager.unwrap(Session.class);
        return session.get(CarModel.class, carModelID);
    }

    @Override
    @Transactional
    public void saveOrUpdate(CarModel carModel) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(carModel);
    }

    @Override
    @Transactional
    public void deleteCarModel(int carModelID) {
        Session session = entityManager.unwrap(Session.class);
        session.delete(carModelID);
    }
}
