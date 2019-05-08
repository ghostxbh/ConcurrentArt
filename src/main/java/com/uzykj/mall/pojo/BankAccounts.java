package com.uzykj.mall.pojo;

public class BankAccounts {
    private Integer id;

    private Integer userId;

    private String bankName;

    private String bankAccount;

    private String bankFlag;

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

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount == null ? null : bankAccount.trim();
    }

    public String getBankFlag() {
        return bankFlag;
    }

    public void setBankFlag(String bankFlag) {
        this.bankFlag = bankFlag == null ? null : bankFlag.trim();
    }
}