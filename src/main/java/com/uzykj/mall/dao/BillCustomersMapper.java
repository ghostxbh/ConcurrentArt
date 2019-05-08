package com.uzykj.mall.dao;

import com.uzykj.mall.pojo.BillCustomers;

public interface BillCustomersMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BillCustomers record);

    int insertSelective(BillCustomers record);

    BillCustomers selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BillCustomers record);

    int updateByPrimaryKey(BillCustomers record);
}