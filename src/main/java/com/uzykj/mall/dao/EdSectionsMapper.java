package com.uzykj.mall.dao;

import com.uzykj.mall.pojo.EdSections;

public interface EdSectionsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EdSections record);

    int insertSelective(EdSections record);

    EdSections selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EdSections record);

    int updateByPrimaryKey(EdSections record);
}