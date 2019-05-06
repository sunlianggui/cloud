package com.example.cloud.mapper;

import com.example.cloud.entity.UserEntity;

public interface UserEntityMapper {
    UserEntity getUserByUserName(String userName);
}