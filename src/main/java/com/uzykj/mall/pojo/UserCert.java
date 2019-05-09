package com.uzykj.mall.pojo;

import lombok.Data;

import java.util.Date;
@Data
public class UserCert {
    private Integer id;

    private Integer userId;

    private String imgPath;

    private Date createTime;
}