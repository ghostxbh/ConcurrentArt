package com.uzykj.mall.pojo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
@Data
public class OrderSettlements {
    private Integer id;

    private String settlementNo;

    private Integer orderId;

    private Integer sellerId;

    private String accName;

    private String accNo;

    private String accUser;

    private BigDecimal orderMoney;

    private BigDecimal settlementMoney;

    private BigDecimal totalCommission;

    private BigDecimal poundageMoney;

    private Date createTime;

    private String isFinish;

    private Date finishTime;

}