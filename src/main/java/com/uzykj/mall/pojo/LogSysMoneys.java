package com.uzykj.mall.pojo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
@Data
public class LogSysMoneys {
    private Integer id;

    private String targetType;

    private Integer targetId;

    private String dataSrc;

    private Integer dataId;

    private String remark;

    private BigDecimal money;

    private String flag;

    private Date createTime;
}