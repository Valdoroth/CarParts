package com.example.CarParts.dao;

import com.example.CarParts.entity.AdditionalFeatures;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class AdditionalFeaturesDAOImpl implements AdditionalFeaturesDAO {
    private final EntityManager entityManager;

    @Autowired
    public AdditionalFeaturesDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<AdditionalFeatures> findAdditionalFeatures() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<AdditionalFeatures> theQuery = currentSession.createQuery("from AdditionalFeatures");
        return theQuery.getResultList();
    }

    @Override
    @Transactional
    public Object findById(int featuresID) {
        Session currentSession = entityManager.unwrap(Session.class);
        return currentSession.get(AdditionalFeatures.class, featuresID);
    }

    @Override
    @Transactional
    public void saveOrUpdate(AdditionalFeatures addedFeatures) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(addedFeatures);
    }

    @Override
    @Transactional
    public void deleteFeature(int featuresID) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.delete(featuresID);
    }
}
