package com.uzykj.mall.dao;

import com.uzykj.mall.pojo.Coupons;

public interface CouponsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Coupons record);

    int insertSelective(Coupons record);

    Coupons selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Coupons record);

    int updateByPrimaryKey(Coupons record);
}