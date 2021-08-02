package com.example.CarParts.service;

import com.example.CarParts.entity.WheelFrame;
import org.springframework.stereotype.Service;

import java.util.List;


public interface WheelFrameService {
    List<WheelFrame> findAll();
    Object findByID(int wheelFrameId);
    void saveOrUpdate(WheelFrame wheelFrame);
    void deleteById(int wheelFrameId);
}
