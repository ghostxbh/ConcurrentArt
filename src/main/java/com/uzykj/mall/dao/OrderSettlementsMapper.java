package com.uzykj.mall.dao;

import com.uzykj.mall.pojo.OrderSettlements;

public interface OrderSettlementsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderSettlements record);

    int insertSelective(OrderSettlements record);

    OrderSettlements selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderSettlements record);

    int updateByPrimaryKey(OrderSettlements record);
}