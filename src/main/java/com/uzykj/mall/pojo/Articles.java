package com.uzykj.mall.pojo;

import lombok.Data;
import java.util.Date;

@Data
public class Articles {
    private Integer id;

    private Integer typeId;

    private String articleTitle;

    private String articleImg;

    private String isShow;

    private String articleKey;

    private Integer createrId;

    private Date createTime;

    private Integer updaterId;

    private Date updateTime;

    private String articleContent;
}