package com.uzykj.design.principles.srp;

import java.util.List;

/**
 * @author ghostxbh
 * @date 2021/4/8
 * @description 学生信息接口
 */
public interface IStudentInfo {
    void setStudentName(String studentName);

    String getStudentName();

    void setStudentNo(String studentName);

    String getStudentNo();

    void setStudentClass(String studentClass);

    String getStudentClass();

    void setStudentGrade(String studentGrade);

    String getStudentGrade();

    boolean changePassword(String password);

    boolean deleteStudent(StudentInfo studentInfo);

    List<StudentInfo> studentList(StudentInfo studentInfo);
}
