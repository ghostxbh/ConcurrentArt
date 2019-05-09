package com.uzykj.mall.pojo;

import lombok.Data;

import java.util.Date;
@Data
public class UserRanks {
    private Integer id;

    private String rankName;

    private Integer startScore;

    private Integer endScore;

    private Integer rebate;

    private Date createtime;
}