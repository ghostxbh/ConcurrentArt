package com.uzykj.enums;

/**
 * Create by xbh 2019-10-31
 */
public enum DeleteEnum {


    DELNODE(1, "删除节点"),
    DELCHILDRENNODE(2, "删除节点和叶子结点"),
    DELVERSION(3, "删除版本号节点"),
    DELGUARANT(4, "保证删除节点");

    private int code;
    private String msg;

    DeleteEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    DeleteEnum(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
