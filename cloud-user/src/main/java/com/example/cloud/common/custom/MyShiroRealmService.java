package com.example.cloud.common.custom;

import com.example.cloud.entity.ModuleEntity;
import com.example.cloud.entity.RoleEntity;
import com.example.cloud.entity.UserEntity;
import com.example.cloud.mapper.UserEntityMapper;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by Administrator on 2019/4/11.
 */
public class MyShiroRealmService extends AuthorizingRealm {

    @Autowired
    UserEntityMapper userEntityMapper;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        UserEntity user = (UserEntity) principals.fromRealm(this.getClass().getName()).iterator().next();
        List<String> permissions = new ArrayList<>();
        Set<RoleEntity> roles = user.getRoles();
        if(roles.size() > 0){
            for (RoleEntity role: roles) {
                Set<ModuleEntity> modules = role.getModules();
                if(modules.size() > 0){
                    for (ModuleEntity module: modules) {
                        permissions.add(module.getMname());
                    }
                }
            }
        }
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        info.addStringPermissions(permissions);
        return info;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        UsernamePasswordToken utoken = (UsernamePasswordToken) token;
        String uName = utoken.getUsername();
        UserEntity user = userEntityMapper.getUserByUserName(uName);
        if(user == null){
            return null;
        }
        return new SimpleAuthenticationInfo(user, user.getPassword(), this.getClass().getName());
    }
}
