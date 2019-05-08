package com.uzykj.mall.dao;

import com.uzykj.mall.pojo.CouponsUsers;

public interface CouponsUsersMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CouponsUsers record);

    int insertSelective(CouponsUsers record);

    CouponsUsers selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CouponsUsers record);

    int updateByPrimaryKey(CouponsUsers record);
}