package com.example.CarParts.service;

import com.example.CarParts.entity.Wheel;

import java.util.List;

public interface WheelService {
    List<Wheel> findAll();
    Object findById(int wheelId);
    void saveOrUpdate(Wheel theWheel);
    void deleteById(int wheelId);
}
