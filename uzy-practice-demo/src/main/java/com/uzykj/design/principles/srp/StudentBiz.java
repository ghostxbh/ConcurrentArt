package com.uzykj.design.principles.srp;

import java.util.List;

/**
 * @author ghostxbh
 * @date 2021/4/8
 * @description 负责学生的行为接口
 */
public class StudentBiz extends StudentPro {
    public boolean changePassword(String password) {
        // 业务逻辑
        return false;
    }

    public boolean deleteStudent(StudentInfo studentInfo) {
        // 业务逻辑
        return true;
    }

    public List<StudentInfo> studentList(StudentInfo studentInfo) {
        // 业务逻辑
        return null;
    }
}
