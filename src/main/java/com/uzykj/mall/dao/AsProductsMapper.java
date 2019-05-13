package com.uzykj.mall.dao;

import com.uzykj.mall.pojo.AsProducts;

public interface AsProductsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AsProducts record);

    int insertSelective(AsProducts record);

    AsProducts selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AsProducts record);

    int updateByPrimaryKey(AsProducts record);
}