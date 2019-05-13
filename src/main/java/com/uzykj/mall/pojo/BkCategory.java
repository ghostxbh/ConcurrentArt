package com.uzykj.mall.pojo;

import lombok.Data;

@Data
public class BkCategory {
    private Integer id;

    private String code;

    private String name;

    private String parentCode;
}