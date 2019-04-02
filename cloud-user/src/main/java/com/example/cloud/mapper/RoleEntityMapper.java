package com.example.cloud.mapper;

import com.example.cloud.entity.RoleEntity;

public interface RoleEntityMapper {
    int deleteByPrimaryKey(Integer rid);

    int insert(RoleEntity record);

    int insertSelective(RoleEntity record);

    RoleEntity selectByPrimaryKey(Integer rid);

    int updateByPrimaryKeySelective(RoleEntity record);

    int updateByPrimaryKey(RoleEntity record);
}