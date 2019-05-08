package com.uzykj.mall.pojo;

import java.util.Date;

public class UserScores {
    private Integer id;

    private Integer userId;

    private Integer score;

    private String scoreFlag;

    private String dataSrc;

    private Integer dataId;

    private String dataRemarks;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getScoreFlag() {
        return scoreFlag;
    }

    public void setScoreFlag(String scoreFlag) {
        this.scoreFlag = scoreFlag == null ? null : scoreFlag.trim();
    }

    public String getDataSrc() {
        return dataSrc;
    }

    public void setDataSrc(String dataSrc) {
        this.dataSrc = dataSrc == null ? null : dataSrc.trim();
    }

    public Integer getDataId() {
        return dataId;
    }

    public void setDataId(Integer dataId) {
        this.dataId = dataId;
    }

    public String getDataRemarks() {
        return dataRemarks;
    }

    public void setDataRemarks(String dataRemarks) {
        this.dataRemarks = dataRemarks == null ? null : dataRemarks.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}