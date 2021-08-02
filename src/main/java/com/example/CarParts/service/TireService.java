package com.example.CarParts.service;

import com.example.CarParts.entity.Tire;

import java.util.List;

public interface TireService {
    List<Tire> findAllTires();
    Object findById(int tireId);
    void saveOrUpdate(Tire theTire);
    void deleteTire(int tireId);
}
