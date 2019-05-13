package com.uzykj.mall.dao;

import com.uzykj.mall.pojo.AsIndustry;

public interface AsIndustryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AsIndustry record);

    int insertSelective(AsIndustry record);

    AsIndustry selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AsIndustry record);

    int updateByPrimaryKey(AsIndustry record);
}