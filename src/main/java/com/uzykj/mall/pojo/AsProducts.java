package com.uzykj.mall.pojo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
@Data
public class AsProducts {
    private Integer id;

    private Integer expertId;

    private String name;

    private String title;

    private BigDecimal price;

    private BigDecimal currentPrice;

    private Integer saleCount;

    private String details;

    private String coverImage;

    private String type;

    private Integer days;

    private Integer createrId;

    private Date createTime;

    private Integer updaterId;

    private Date updateTime;
}