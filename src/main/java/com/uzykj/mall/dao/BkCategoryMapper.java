package com.uzykj.mall.dao;

import com.uzykj.mall.pojo.BkCategory;

public interface BkCategoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BkCategory record);

    int insertSelective(BkCategory record);

    BkCategory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BkCategory record);

    int updateByPrimaryKey(BkCategory record);
}