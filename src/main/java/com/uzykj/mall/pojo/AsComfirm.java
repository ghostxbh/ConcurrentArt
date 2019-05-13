package com.uzykj.mall.pojo;

import lombok.Data;

import java.util.Date;
@Data
public class AsComfirm {
    private Integer id;

    private Integer userId;

    private Integer expertId;

    private Date startTime;

    private Date endTime;

    private Integer companyId;

    private Integer orderId;

    private String userConfirm;

    private String expertConfirm;
}