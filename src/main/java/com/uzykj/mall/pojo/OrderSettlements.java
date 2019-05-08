package com.uzykj.mall.pojo;

import java.math.BigDecimal;
import java.util.Date;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSettlementNo() {
        return settlementNo;
    }

    public void setSettlementNo(String settlementNo) {
        this.settlementNo = settlementNo == null ? null : settlementNo.trim();
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName == null ? null : accName.trim();
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo == null ? null : accNo.trim();
    }

    public String getAccUser() {
        return accUser;
    }

    public void setAccUser(String accUser) {
        this.accUser = accUser == null ? null : accUser.trim();
    }

    public BigDecimal getOrderMoney() {
        return orderMoney;
    }

    public void setOrderMoney(BigDecimal orderMoney) {
        this.orderMoney = orderMoney;
    }

    public BigDecimal getSettlementMoney() {
        return settlementMoney;
    }

    public void setSettlementMoney(BigDecimal settlementMoney) {
        this.settlementMoney = settlementMoney;
    }

    public BigDecimal getTotalCommission() {
        return totalCommission;
    }

    public void setTotalCommission(BigDecimal totalCommission) {
        this.totalCommission = totalCommission;
    }

    public BigDecimal getPoundageMoney() {
        return poundageMoney;
    }

    public void setPoundageMoney(BigDecimal poundageMoney) {
        this.poundageMoney = poundageMoney;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getIsFinish() {
        return isFinish;
    }

    public void setIsFinish(String isFinish) {
        this.isFinish = isFinish == null ? null : isFinish.trim();
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }
}