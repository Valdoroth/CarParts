package com.example.CarParts.dao;

import com.example.CarParts.entity.CarModel;

import java.util.List;

public interface CarModelDAO {
    List<CarModel> findAllCars();
    Object findById(int carModelID);
    void saveOrUpdate(CarModel carModel);
    void deleteCarModel(int carModelID);
}
