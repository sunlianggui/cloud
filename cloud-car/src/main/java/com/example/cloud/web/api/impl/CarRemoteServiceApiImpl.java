package com.example.cloud.web.api.impl;

import com.example.cloud.car.api.CarRemoteServiceApi;
import com.example.cloud.car.model.Car;
import com.example.cloud.component.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2019/1/7.
 */
@RestController
public class  CarRemoteServiceApiImpl implements CarRemoteServiceApi{

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public Response<Car> car() {
        logger.info("我要抬奔驰啦！");
        Car car = new Car("1", "奔驰");
        return new Response<>("1", car, "成功");
    }
}
