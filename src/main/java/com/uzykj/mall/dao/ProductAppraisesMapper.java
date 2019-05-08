package com.uzykj.mall.dao;

import com.uzykj.mall.pojo.ProductAppraises;

public interface ProductAppraisesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProductAppraises record);

    int insertSelective(ProductAppraises record);

    ProductAppraises selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProductAppraises record);

    int updateByPrimaryKey(ProductAppraises record);
}