package com.uzykj.mall.pojo;

import lombok.Data;

@Data
public class SysAuth {
    private Integer id;

    private String code;

    private String name;

    private String url;

    private String type;

    private String remark;

    private Integer operatorId;
}