package com.example.CarParts.service;

import com.example.CarParts.dao.WheelDAO;
import com.example.CarParts.entity.Wheel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WheelServiceImpl implements WheelService {
    private final WheelDAO wheelDAO;

    @Autowired
    public WheelServiceImpl(WheelDAO wheelDAO) {
        this.wheelDAO = wheelDAO;
    }

    @Override
    public List<Wheel> findAll() {
        return wheelDAO.findAll();
    }

    @Override
    public Object findById(int wheelId) {
        return wheelDAO.findById(wheelId);
    }

    @Override
    public void saveOrUpdate(Wheel theWheel) {
        wheelDAO.saveOrUpdate(theWheel);
    }

    @Override
    public void deleteById(int wheelId) {
        wheelDAO.deleteById(wheelId);
    }
}
