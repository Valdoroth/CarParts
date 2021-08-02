package com.example.CarParts.entity;

import javax.persistence.*;

@Entity
@Table(name = "car_model")
public class CarModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int carId;

    @Column(name = "make")
    private String carMake;

    @Column(name = "model")
    private String carModel;

    @Column(name = "color")
    private String carColor;

    public CarModel() {

    }

    public CarModel(String carMake, String carModel, String carColor) {
        this.carMake = carMake;
        this.carModel = carModel;
        this.carColor = carColor;
    }

    public int getCarID() {
        return carId;
    }
    public void setCarID(int carId) {
        this.carId = carId;
    }

    public String getCarMake() {
        return carMake;
    }
    public void setCarMake(String carMake) {
        this.carMake = carMake;
    }

    public String getCarModel() {
        return carModel;
    }
    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarColor() {
        return carColor;
    }
    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    @Override
    public String toString() {
        return "CarModel{" +
                "carId=" + carId +
                ", carMake='" + carMake + '\'' +
                ", carModel='" + carModel + '\'' +
                ", carColor='" + carColor + '\'' +
                '}';
    }
}
