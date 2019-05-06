package com.example.cloud.service.impl;

import com.example.cloud.Utils.ModelAndEntity;
import com.example.cloud.entity.UserEntity;
import com.example.cloud.mapper.UserEntityMapper;
import com.example.cloud.user.model.User;
import com.example.cloud.web.api.callback.CarCallBackApi;
import com.example.cloud.component.Response;
import com.example.cloud.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by Administrator on 2019/1/7.
 */
@Service
public class UserServiceImpl implements UserService{

    Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    CarCallBackApi carCallBackApi;
    @Autowired
    UserEntityMapper userEntityMapper;

    @Override
    public Response getCar() {
        return carCallBackApi.car();
    }


    /**
     * login
     * @param userName
     * @param password
     * @return
     */
    @Override
    public Response<User> login(String userName, String password) {

        UsernamePasswordToken token = new UsernamePasswordToken(userName, password);
        Subject subject = SecurityUtils.getSubject();
        String msg = "登录成功";
        try {
            subject.login(token);
            UserEntity userEntity = (UserEntity) subject.getPrincipal();
            User user = new User();
            user = (User) ModelAndEntity.populate(userEntity, user);
            return new Response<>(Response.success, user, msg);
        }catch (UnknownAccountException e){
            log.info("{}", "账号不存在");
            msg = "账号不存在";
        }catch (IncorrectCredentialsException e){
            log.info("{}", "密码不正确");
            msg = "密码不正确";
        }catch (AuthenticationException e){
            log.info("{}", "用户验证失败");
            msg = "用户验证失败";
        }
        return new Response<>(Response.error, null, msg);
    }
}
