package com.uzykj.mall.dao;

import com.uzykj.mall.pojo.UserScores;

public interface UserScoresMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserScores record);

    int insertSelective(UserScores record);

    UserScores selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserScores record);

    int updateByPrimaryKey(UserScores record);
}