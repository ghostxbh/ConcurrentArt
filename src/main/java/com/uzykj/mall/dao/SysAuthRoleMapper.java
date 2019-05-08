package com.uzykj.mall.dao;

import com.uzykj.mall.pojo.SysAuthRole;

public interface SysAuthRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysAuthRole record);

    int insertSelective(SysAuthRole record);

    SysAuthRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysAuthRole record);

    int updateByPrimaryKey(SysAuthRole record);
}