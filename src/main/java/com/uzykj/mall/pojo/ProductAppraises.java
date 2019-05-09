package com.uzykj.mall.pojo;

import lombok.Data;

import java.util.Date;
@Data
public class ProductAppraises {
    private Integer id;

    private Integer sellerId;

    private Integer orderId;

    private Integer productId;

    private Integer userId;

    private Integer productScore;

    private Integer serviceScore;

    private Integer timeScore;

    private String content;

    private String imgPaths;

    private String isShow;

    private Date createtime;
}