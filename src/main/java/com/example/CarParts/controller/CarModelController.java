package com.example.CarParts.controller;

import com.example.CarParts.entity.CarModel;
import com.example.CarParts.service.CarModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarModelController {
    private final CarModelService carModelService;

    @Autowired
    public CarModelController(@Qualifier("carModelServiceImpl") CarModelService carModelService) {
        this.carModelService = carModelService;
    }

    @GetMapping("/retrieveAllCars")
    public List<CarModel> findAllCars() {
        return carModelService.findAllCars();
    }

    @PostMapping("/addCarModel")
    public CarModel addCarModel(@RequestBody CarModel carModel) {
        carModel.setCarID(0);
        carModelService.saveOrUpdate(carModel);
        return carModel;
    }

    @PutMapping("/updateCarModel")
    public CarModel updateCarModel(@RequestBody CarModel updateCarModel) {
        carModelService.saveOrUpdate(updateCarModel);
        return updateCarModel;
    }

    @DeleteMapping("/deleteCarModel")
    public String deleteCarModel(@PathVariable int carModelID) {
        carModelService.deleteCarModel(carModelID);
        return "Deleted car model with ID: " + carModelID;
    }

}
