package com.uzykj.mall.dao;

import com.uzykj.mall.pojo.SysAuth;

public interface SysAuthMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysAuth record);

    int insertSelective(SysAuth record);

    SysAuth selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysAuth record);

    int updateByPrimaryKey(SysAuth record);
}