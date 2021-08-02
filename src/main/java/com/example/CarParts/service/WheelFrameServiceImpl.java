package com.example.CarParts.service;

import com.example.CarParts.dao.WheelFrameDAO;
import com.example.CarParts.entity.WheelFrame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class WheelFrameServiceImpl implements WheelFrameService{
    private final WheelFrameDAO wheelFrameDAO;

    @Autowired
    public WheelFrameServiceImpl(WheelFrameDAO wheelFrameDAO) {
        this.wheelFrameDAO = wheelFrameDAO;
    }

    @Override
    @Transactional
    public List<WheelFrame> findAll() {
        return wheelFrameDAO.findAll();
    }

    @Override
    @Transactional
    public Object findByID(int wheelFrameId) {
        return wheelFrameDAO.findById(wheelFrameId);
    }

    @Override
    @Transactional
    public void saveOrUpdate(WheelFrame wheelFrame) {
        wheelFrameDAO.saveOrUpdate(wheelFrame);
    }

    @Override
    @Transactional
    public void deleteById(int wheelFrameId) {
        wheelFrameDAO.deleteById(wheelFrameId);
    }
}
