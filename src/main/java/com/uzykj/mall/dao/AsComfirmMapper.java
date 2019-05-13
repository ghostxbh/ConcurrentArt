package com.uzykj.mall.dao;

import com.uzykj.mall.pojo.AsComfirm;

public interface AsComfirmMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AsComfirm record);

    int insertSelective(AsComfirm record);

    AsComfirm selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AsComfirm record);

    int updateByPrimaryKey(AsComfirm record);
}