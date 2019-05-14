package com.uzykj.mall.dao;

import com.uzykj.mall.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    int deleteOne(String uuid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateOne(User record);

    int updateByPrimaryKey(User record);

    User findOne(String uuid);

    List<User> findAll(Integer page, Integer size);
}