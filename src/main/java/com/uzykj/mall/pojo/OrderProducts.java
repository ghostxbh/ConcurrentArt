package com.uzykj.mall.pojo;

import lombok.Data;

import java.math.BigDecimal;
@Data
public class OrderProducts {
    private Integer id;

    private Integer orderId;

    private String productType;

    private Integer productId;

    private Integer productNums;

    private BigDecimal productPrice;

    private String productName;

    private BigDecimal commission;
}