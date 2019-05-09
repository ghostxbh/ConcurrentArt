package com.uzykj.mall.pojo;

import lombok.Data;

import java.util.Date;
@Data
public class CouponsUsers {
    private Integer id;

    private Integer couponId;

    private Integer userId;

    private Date receiveTime;

    private String couponStatus;

    private String dataFlag;
}