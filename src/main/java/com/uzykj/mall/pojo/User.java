package com.uzykj.mall.pojo;

import lombok.Data;

import java.util.Date;
@Data
public class User {
    private Integer id;

    private String name;

    private String code;

    private String password;

    private String phone;

    private String weixinId;

    private String email;

    private String idcard;

    private Boolean sex;

    private Date born;

    private String headimg;

    private Integer score;

    private Boolean status;

    private String lastIp;

    private Date lastTime;

    private Integer createrId;

    private String createTime;

    private Integer updaterId;

    private Date updateTime;
}