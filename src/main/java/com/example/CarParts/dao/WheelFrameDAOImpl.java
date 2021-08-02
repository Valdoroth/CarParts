package com.example.CarParts.dao;

import com.example.CarParts.entity.WheelFrame;

import javax.persistence.EntityManager;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class WheelFrameDAOImpl implements WheelFrameDAO{
    private final EntityManager entityManager;

    public WheelFrameDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<WheelFrame> findAll() {
        Session session = entityManager.unwrap(Session.class);
        Query<WheelFrame> someQuery = session.createQuery("from WheelFrame");
        return someQuery.getResultList();
    }

    @Override
    public Object findById(int wheelFrameId) {
        Session session = entityManager.unwrap(Session.class);
        return session.get(WheelFrame.class, wheelFrameId);
    }

    @Override
    public void saveOrUpdate(WheelFrame wheelFrame) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(wheelFrame);
    }

    @Override
    public void deleteById(int wheelFrameId) {
        Session session = entityManager.unwrap(Session.class);
        WheelFrame wheelFrame = session.get(WheelFrame.class, wheelFrameId);
        session.delete(wheelFrame);
    }
}
