package com.uzykj.mall.pojo;

import lombok.Data;

import java.util.Date;
@Data
public class LogOrders {
    private Integer id;

    private Integer orderId;

    private String logContent;

    private Integer logUserId;

    private Date logTime;
}