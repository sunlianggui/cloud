package com.example.cloud.mapper;

import com.example.cloud.entity.ModuleEntity;

public interface ModuleEntityMapper {
    int deleteByPrimaryKey(Integer mid);

    int insert(ModuleEntity record);

    int insertSelective(ModuleEntity record);

    ModuleEntity selectByPrimaryKey(Integer mid);

    int updateByPrimaryKeySelective(ModuleEntity record);

    int updateByPrimaryKey(ModuleEntity record);
}