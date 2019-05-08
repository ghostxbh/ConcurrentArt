package com.uzykj.mall.dao;

import com.uzykj.mall.pojo.UserCert;

public interface UserCertMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserCert record);

    int insertSelective(UserCert record);

    UserCert selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserCert record);

    int updateByPrimaryKey(UserCert record);
}