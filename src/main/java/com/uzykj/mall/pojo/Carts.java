package com.uzykj.mall.pojo;

import lombok.Data;

@Data
public class Carts {
    private Integer id;

    private Integer userId;

    private String productType;

    private Integer productId;

    private Integer productNum;

}