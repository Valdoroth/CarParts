package com.example.CarParts.dao;

import com.example.CarParts.entity.Tire;

import java.util.List;

public interface TireDAO {
    List<Tire> findAllTires();
    Object findById(int tiresId);
    void saveOrUpdate(Tire theTire);
    void deleteTire(int tiresId);
}
