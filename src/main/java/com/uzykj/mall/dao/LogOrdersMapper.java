package com.uzykj.mall.dao;

import com.uzykj.mall.pojo.LogOrders;

public interface LogOrdersMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LogOrders record);

    int insertSelective(LogOrders record);

    LogOrders selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LogOrders record);

    int updateByPrimaryKey(LogOrders record);
}