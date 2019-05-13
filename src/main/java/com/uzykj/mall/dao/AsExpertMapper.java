package com.uzykj.mall.dao;

import com.uzykj.mall.pojo.AsExpert;

public interface AsExpertMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AsExpert record);

    int insertSelective(AsExpert record);

    AsExpert selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AsExpert record);

    int updateByPrimaryKey(AsExpert record);
}