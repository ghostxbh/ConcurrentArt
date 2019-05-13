package com.uzykj.mall.dao;

import com.uzykj.mall.pojo.EdProducts;

public interface EdProductsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EdProducts record);

    int insertSelective(EdProducts record);

    EdProducts selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EdProducts record);

    int updateByPrimaryKey(EdProducts record);
}