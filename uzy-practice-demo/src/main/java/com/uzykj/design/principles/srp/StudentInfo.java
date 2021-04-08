package com.uzykj.design.principles.srp;

import lombok.Data;

/**
 * @author ghostxbh
 * @date 2021/4/8
 * @description 学生类
 */
@Data
public class StudentInfo {
    /**
     * ID
     */
    private Integer studentId;
    /**
     * 名字
     */
    private String studentName;
    /**
     * 学号
     */
    private String studentNo;
    /**
     * 班级
     */
    private String studentClass;
    /**
     * 年级
     */
    private String studentGrade;
    /**
     * 密码
     */
    private String studentPassword;
}
