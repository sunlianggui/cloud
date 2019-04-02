package com.example.cloud.service.impl;

import com.example.cloud.entity.UserEntity;
import com.example.cloud.mapper.UserEntityMapper;
import com.example.cloud.user.model.User;
import com.example.cloud.web.api.callback.CarCallBackApi;
import com.example.cloud.component.Response;
import com.example.cloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2019/1/7.
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    CarCallBackApi carCallBackApi;
    @Autowired
    UserEntityMapper userEntityMapper;

    @Override
    public Response getCar() {
        return carCallBackApi.car();
    }

    @Override
    public Response<User> login(String userName, String password) {
        if(userName != null && password != null){
            UserEntity userEntity = userEntityMapper.selectByPrimaryKey(1);
            User user = new User(userEntity.getUsername(), userEntity.getAge(), userEntity.getSex());
            return new Response<>(Response.success, user, "登录成功");
        }

        return new Response<>(Response.error, null, "用户名或密码不正确");
    }
}
