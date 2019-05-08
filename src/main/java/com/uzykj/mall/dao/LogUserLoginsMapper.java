package com.uzykj.mall.dao;

import com.uzykj.mall.pojo.LogUserLogins;

public interface LogUserLoginsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LogUserLogins record);

    int insertSelective(LogUserLogins record);

    LogUserLogins selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LogUserLogins record);

    int updateByPrimaryKey(LogUserLogins record);
}