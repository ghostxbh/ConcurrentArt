package com.uzykj.mall.pojo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
@Data
public class Orders {
    private Integer id;

    private String orderNo;

    private Integer sellerId;

    private Integer userId;

    private BigDecimal totalMoney;

    private String orderStatus;

    private String buyerShow;

    private String sellerShow;

    private String payFrom;

    private String userAreaCode;

    private String userAddress;

    private String userName;

    private String userPhone;

    private String userTel;

    private String userPostCode;

    private String isInvoice;

    private String invoiceClient;

    private String invoiceCode;

    private String orderRemarks;

    private BigDecimal deliverMoney;

    private String isRefund;

    private String refundRemark;

    private String orderUnique;

    private Integer settlementId;

    private BigDecimal realTotalMoney;

    private Float poundageRate;

    private BigDecimal poundageMoney;

    private Integer useScore;

    private BigDecimal scoreMoney;

    private BigDecimal couponMoney;

    private Date createTime;

    private Date paidTime;

    private Date shippedTime;

    private Date comfirmTime;

    private Date closeTime;

}