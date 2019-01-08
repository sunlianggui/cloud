package com.example.cloud.service;

import com.example.cloud.car.model.Car;
import com.example.cloud.component.Result;

/**
 * Created by Administrator on 2019/1/7.
 */
public interface UserService {
    Result<Car> getCar();
}
