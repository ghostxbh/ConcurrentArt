package com.uzykj.mall.dao;

import com.uzykj.mall.pojo.AsCategory;

public interface AsCategoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AsCategory record);

    int insertSelective(AsCategory record);

    AsCategory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AsCategory record);

    int updateByPrimaryKey(AsCategory record);
}