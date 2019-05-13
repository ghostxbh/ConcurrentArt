package com.uzykj.mall.dao;

import com.uzykj.mall.pojo.BkProducts;

public interface BkProductsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BkProducts record);

    int insertSelective(BkProducts record);

    BkProducts selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BkProducts record);

    int updateByPrimaryKey(BkProducts record);
}