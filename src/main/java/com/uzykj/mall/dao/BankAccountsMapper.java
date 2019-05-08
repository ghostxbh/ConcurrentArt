package com.uzykj.mall.dao;

import com.uzykj.mall.pojo.BankAccounts;

public interface BankAccountsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BankAccounts record);

    int insertSelective(BankAccounts record);

    BankAccounts selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BankAccounts record);

    int updateByPrimaryKey(BankAccounts record);
}