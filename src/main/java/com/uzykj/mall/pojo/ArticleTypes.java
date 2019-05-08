package com.uzykj.mall.pojo;

import lombok.Data;

@Data
public class ArticleTypes {
    private Integer id;

    private String name;

    private Integer parentId;

    private String isShow;

    private String dataFlag;
}