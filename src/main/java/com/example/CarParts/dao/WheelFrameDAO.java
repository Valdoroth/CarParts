package com.example.CarParts.dao;

import com.example.CarParts.entity.WheelFrame;

import java.util.List;

public interface WheelFrameDAO {
    List<WheelFrame> findAll();
    Object findById(int wheelFrameId);
    void saveOrUpdate(WheelFrame wheelFrame);
    void deleteById(int wheelFrameId);
}
