package com.uzykj.mall.pojo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
@Data
public class BillCustomers {
    private Integer id;

    private String code;

    private Integer orderId;

    private Integer sellerId;

    private BigDecimal money;

    private BigDecimal scale;

    private BigDecimal actualMoney;

    private String status;

    private Date createTime;
}