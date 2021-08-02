package com.example.CarParts.service;

import com.example.CarParts.dao.CarModelDAO;
import com.example.CarParts.entity.CarModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarModelServiceImpl implements CarModelService {
    private final CarModelDAO carModelDAO;

    @Autowired
    public CarModelServiceImpl(CarModelDAO carModelDAO) {
        this.carModelDAO = carModelDAO;
    }

    @Override
    public List<CarModel> findAllCars() {
        return this.carModelDAO.findAllCars();
    }

    @Override
    public Object findById(int carModelID) {
        return this.carModelDAO.findById(carModelID);
    }

    @Override
    public void saveOrUpdate(CarModel carModel) {
        this.carModelDAO.saveOrUpdate(carModel);
    }

    @Override
    public void deleteCarModel(int carModelID) {
        this.carModelDAO.deleteCarModel(carModelID);
    }
}
