package com.example.cloud.service.impl;

import com.example.cloud.car.model.Car;
import com.example.cloud.api.callback.CarCallBackApi;
import com.example.cloud.component.Result;
import com.example.cloud.service.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2019/1/7.
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    CarCallBackApi carCallBackApi;

    @Override
    public Result getCar() {
        return carCallBackApi.car();
    }

}
