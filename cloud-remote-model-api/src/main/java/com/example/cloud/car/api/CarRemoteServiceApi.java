package com.example.cloud.car.api;

import com.example.cloud.car.model.Car;
import com.example.cloud.component.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2019/1/7.
 */
public interface CarRemoteServiceApi {

    @RequestMapping(value = "car", method = RequestMethod.GET)
    public Result<Car> car();
}
