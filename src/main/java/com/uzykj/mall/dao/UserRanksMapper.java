package com.uzykj.mall.dao;

import com.uzykj.mall.pojo.UserRanks;

public interface UserRanksMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserRanks record);

    int insertSelective(UserRanks record);

    UserRanks selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserRanks record);

    int updateByPrimaryKey(UserRanks record);
}