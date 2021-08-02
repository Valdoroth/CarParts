package com.example.CarParts.dao;

import com.example.CarParts.entity.Wheel;

import java.util.List;

public interface WheelDAO {
    List<Wheel> findAll();
    Object findById(int wheelId);
    void saveOrUpdate(Wheel theWheel);
    void deleteById(int wheelId);
}
