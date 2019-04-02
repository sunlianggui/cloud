package com.example.cloud.web.admin;

import com.example.cloud.car.model.Car;
import com.example.cloud.component.Response;
import com.example.cloud.service.UserService;
import com.example.cloud.user.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by Administrator on 2019/1/7.
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "user",method = RequestMethod.GET)
    public Response<Car> user(){
        return userService.getCar();
    }

    /**
     * 用户登录
     * @param userName
     * @param password
     * @return
     */
    @RequestMapping(value = "login", method = RequestMethod.GET)
    public Response<User> login(@RequestParam("userName") String userName,
                                @RequestParam("password") String password){
        return userService.login(userName, password);
    }
}
