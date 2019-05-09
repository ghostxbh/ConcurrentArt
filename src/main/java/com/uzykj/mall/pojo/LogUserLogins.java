package com.uzykj.mall.pojo;

import lombok.Data;

import java.util.Date;
@Data
public class LogUserLogins {
    private Integer id;

    private Integer userId;

    private Date loginTime;

    private String loginIp;

    private String loginSrc;

    private String loginRemark;
}