package com.example.cloud.client;

import com.example.cloud.car.model.Car;
import com.example.cloud.component.Result;
import com.example.cloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by Administrator on 2019/1/7.
 */
@RestController
public class UserClient {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "user",method = RequestMethod.GET)
    public Result<Car> user(){
        return userService.getCar();
    }
}
