package com.uzykj.mall.pojo;

import lombok.Data;

@Data
public class BankAccounts {
    private Integer id;

    private Integer userId;

    private String bankName;

    private String bankAccount;

    private String bankFlag;
}