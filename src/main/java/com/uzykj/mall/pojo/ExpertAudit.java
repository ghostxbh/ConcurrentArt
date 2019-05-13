package com.uzykj.mall.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class ExpertAudit {
    private Integer id;

    private Integer userId;

    private String userPhone;

    private String reqType;

    private String status;

    private Date auditTime;

    private Integer auditorId;

    private String auditRemarks;

    private Date createTime;

    private String content;
}