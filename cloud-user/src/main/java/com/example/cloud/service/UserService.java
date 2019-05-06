package com.example.cloud.service;

import com.example.cloud.car.model.Car;
import com.example.cloud.component.Response;
import com.example.cloud.entity.UserEntity;
import com.example.cloud.user.model.User;

/**
 * Created by Administrator on 2019/1/7.
 */
public interface UserService {
    Response<Car> getCar();

    Response<User> login(String userName, String password);
}
