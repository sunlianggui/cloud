package com.example.cloud.car.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2019/1/7.
 */
public class Car implements Serializable{

    private String carId;
    private String carName;

    public Car(String carId, String carName) {
        this.carId = carId;
        this.carName = carName;
    }

    public Car() {
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }
}
