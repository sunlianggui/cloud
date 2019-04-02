package com.example.cloud.mapper;

import com.example.cloud.entity.UserEntity;

public interface UserEntityMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(UserEntity record);

    int insertSelective(UserEntity record);

    UserEntity selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(UserEntity record);

    int updateByPrimaryKey(UserEntity record);
}