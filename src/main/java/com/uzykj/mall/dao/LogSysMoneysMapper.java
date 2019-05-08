package com.uzykj.mall.dao;

import com.uzykj.mall.pojo.LogSysMoneys;

public interface LogSysMoneysMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LogSysMoneys record);

    int insertSelective(LogSysMoneys record);

    LogSysMoneys selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LogSysMoneys record);

    int updateByPrimaryKey(LogSysMoneys record);
}