package com.example.CarParts.service;

import com.example.CarParts.entity.CarModel;

import java.util.List;

public interface CarModelService {
    List<CarModel> findAllCars();
    Object findById(int carModelID);
    void saveOrUpdate(CarModel carModel);
    void deleteCarModel(int carModelID);
}
