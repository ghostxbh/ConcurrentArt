package com.uzykj.mall.pojo;

import lombok.Data;

import java.util.Date;
@Data
public class UserAddress {
    private Integer id;

    private Integer userId;

    private String userName;

    private String userPhone;

    private String userTel;

    private String userAreaCode;

    private String userAddress;

    private String userPostCode;

    private String isDefault;

    private Date createTime;

    private Date updateTime;
}