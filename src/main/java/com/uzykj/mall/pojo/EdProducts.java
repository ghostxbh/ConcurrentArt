package com.uzykj.mall.pojo;

import lombok.Data;

import java.util.Date;
@Data
public class EdProducts {
    private Integer id;

    private Integer userId;

    private String name;

    private String title;

    private String coverImage;

    private Double price;

    private Double currentPrice;

    private Integer saleCount;

    private String details;

    private String lecturer;

    private String lecturerImage;

    private String lecturerDetail;

    private String categoryCode;

    private String isSale;

    private String isShow;

    private String delFlag;

    private Integer createrId;

    private Date createTime;

    private Integer updaterId;

    private Date updateTime;
}