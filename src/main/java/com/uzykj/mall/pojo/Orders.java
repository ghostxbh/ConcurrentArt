package com.uzykj.mall.pojo;

import java.math.BigDecimal;
import java.util.Date;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public BigDecimal getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(BigDecimal totalMoney) {
        this.totalMoney = totalMoney;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus == null ? null : orderStatus.trim();
    }

    public String getBuyerShow() {
        return buyerShow;
    }

    public void setBuyerShow(String buyerShow) {
        this.buyerShow = buyerShow == null ? null : buyerShow.trim();
    }

    public String getSellerShow() {
        return sellerShow;
    }

    public void setSellerShow(String sellerShow) {
        this.sellerShow = sellerShow == null ? null : sellerShow.trim();
    }

    public String getPayFrom() {
        return payFrom;
    }

    public void setPayFrom(String payFrom) {
        this.payFrom = payFrom == null ? null : payFrom.trim();
    }

    public String getUserAreaCode() {
        return userAreaCode;
    }

    public void setUserAreaCode(String userAreaCode) {
        this.userAreaCode = userAreaCode == null ? null : userAreaCode.trim();
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress == null ? null : userAddress.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel == null ? null : userTel.trim();
    }

    public String getUserPostCode() {
        return userPostCode;
    }

    public void setUserPostCode(String userPostCode) {
        this.userPostCode = userPostCode == null ? null : userPostCode.trim();
    }

    public String getIsInvoice() {
        return isInvoice;
    }

    public void setIsInvoice(String isInvoice) {
        this.isInvoice = isInvoice == null ? null : isInvoice.trim();
    }

    public String getInvoiceClient() {
        return invoiceClient;
    }

    public void setInvoiceClient(String invoiceClient) {
        this.invoiceClient = invoiceClient == null ? null : invoiceClient.trim();
    }

    public String getInvoiceCode() {
        return invoiceCode;
    }

    public void setInvoiceCode(String invoiceCode) {
        this.invoiceCode = invoiceCode == null ? null : invoiceCode.trim();
    }

    public String getOrderRemarks() {
        return orderRemarks;
    }

    public void setOrderRemarks(String orderRemarks) {
        this.orderRemarks = orderRemarks == null ? null : orderRemarks.trim();
    }

    public BigDecimal getDeliverMoney() {
        return deliverMoney;
    }

    public void setDeliverMoney(BigDecimal deliverMoney) {
        this.deliverMoney = deliverMoney;
    }

    public String getIsRefund() {
        return isRefund;
    }

    public void setIsRefund(String isRefund) {
        this.isRefund = isRefund == null ? null : isRefund.trim();
    }

    public String getRefundRemark() {
        return refundRemark;
    }

    public void setRefundRemark(String refundRemark) {
        this.refundRemark = refundRemark == null ? null : refundRemark.trim();
    }

    public String getOrderUnique() {
        return orderUnique;
    }

    public void setOrderUnique(String orderUnique) {
        this.orderUnique = orderUnique == null ? null : orderUnique.trim();
    }

    public Integer getSettlementId() {
        return settlementId;
    }

    public void setSettlementId(Integer settlementId) {
        this.settlementId = settlementId;
    }

    public BigDecimal getRealTotalMoney() {
        return realTotalMoney;
    }

    public void setRealTotalMoney(BigDecimal realTotalMoney) {
        this.realTotalMoney = realTotalMoney;
    }

    public Float getPoundageRate() {
        return poundageRate;
    }

    public void setPoundageRate(Float poundageRate) {
        this.poundageRate = poundageRate;
    }

    public BigDecimal getPoundageMoney() {
        return poundageMoney;
    }

    public void setPoundageMoney(BigDecimal poundageMoney) {
        this.poundageMoney = poundageMoney;
    }

    public Integer getUseScore() {
        return useScore;
    }

    public void setUseScore(Integer useScore) {
        this.useScore = useScore;
    }

    public BigDecimal getScoreMoney() {
        return scoreMoney;
    }

    public void setScoreMoney(BigDecimal scoreMoney) {
        this.scoreMoney = scoreMoney;
    }

    public BigDecimal getCouponMoney() {
        return couponMoney;
    }

    public void setCouponMoney(BigDecimal couponMoney) {
        this.couponMoney = couponMoney;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getPaidTime() {
        return paidTime;
    }

    public void setPaidTime(Date paidTime) {
        this.paidTime = paidTime;
    }

    public Date getShippedTime() {
        return shippedTime;
    }

    public void setShippedTime(Date shippedTime) {
        this.shippedTime = shippedTime;
    }

    public Date getComfirmTime() {
        return comfirmTime;
    }

    public void setComfirmTime(Date comfirmTime) {
        this.comfirmTime = comfirmTime;
    }

    public Date getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
    }
}