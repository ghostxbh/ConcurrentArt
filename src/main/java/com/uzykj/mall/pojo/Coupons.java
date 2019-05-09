package com.uzykj.mall.pojo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
@Data
public class Coupons {
    private Integer id;

    private String couponCode;

    private String couponName;

    private String couponType;

    private BigDecimal couponMoney;

    private BigDecimal spendMoney;

    private Integer rebate;

    private String couponDes;

    private Integer sendNum;

    private Integer receiveNum;

    private Date sendStartTime;

    private Date sendEndTime;

    private Date validStartTime;

    private Date validEndTime;

    private Date createTime;

    private String dataFlag;
}