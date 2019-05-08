package com.uzykj.mall.pojo;

import java.util.Date;

public class LogOrders {
    private Integer id;

    private Integer orderId;

    private String logContent;

    private Integer logUserId;

    private Date logTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getLogContent() {
        return logContent;
    }

    public void setLogContent(String logContent) {
        this.logContent = logContent == null ? null : logContent.trim();
    }

    public Integer getLogUserId() {
        return logUserId;
    }

    public void setLogUserId(Integer logUserId) {
        this.logUserId = logUserId;
    }

    public Date getLogTime() {
        return logTime;
    }

    public void setLogTime(Date logTime) {
        this.logTime = logTime;
    }
}