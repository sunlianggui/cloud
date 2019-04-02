package com.example.cloud.mapper;

import com.example.cloud.entity.UserRoleEntity;

public interface UserRoleEntityMapper {
    int insert(UserRoleEntity record);

    int insertSelective(UserRoleEntity record);
}