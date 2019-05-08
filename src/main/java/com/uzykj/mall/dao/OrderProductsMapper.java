package com.uzykj.mall.dao;

import com.uzykj.mall.pojo.OrderProducts;

public interface OrderProductsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderProducts record);

    int insertSelective(OrderProducts record);

    OrderProducts selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderProducts record);

    int updateByPrimaryKey(OrderProducts record);
}