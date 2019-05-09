package com.uzykj.mall.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class UserScores {
    private Integer id;

    private Integer userId;

    private Integer score;

    private String scoreFlag;

    private String dataSrc;

    private Integer dataId;

    private String dataRemarks;

    private Date createTime;
}