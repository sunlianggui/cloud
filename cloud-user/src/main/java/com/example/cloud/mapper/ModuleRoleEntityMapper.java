package com.example.cloud.mapper;

import com.example.cloud.entity.ModuleRoleEntity;

public interface ModuleRoleEntityMapper {
    int insert(ModuleRoleEntity record);

    int insertSelective(ModuleRoleEntity record);
}