package com.uzykj.mall.pojo;

import java.util.Date;

public class LogUserLogins {
    private Integer id;

    private Integer userId;

    private Date loginTime;

    private String loginIp;

    private String loginSrc;

    private String loginRemark;

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

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp == null ? null : loginIp.trim();
    }

    public String getLoginSrc() {
        return loginSrc;
    }

    public void setLoginSrc(String loginSrc) {
        this.loginSrc = loginSrc == null ? null : loginSrc.trim();
    }

    public String getLoginRemark() {
        return loginRemark;
    }

    public void setLoginRemark(String loginRemark) {
        this.loginRemark = loginRemark == null ? null : loginRemark.trim();
    }
}