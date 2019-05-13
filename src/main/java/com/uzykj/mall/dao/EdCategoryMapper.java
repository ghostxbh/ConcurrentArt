package com.uzykj.mall.dao;

import com.uzykj.mall.pojo.EdCategory;

public interface EdCategoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EdCategory record);

    int insertSelective(EdCategory record);

    EdCategory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EdCategory record);

    int updateByPrimaryKey(EdCategory record);
}