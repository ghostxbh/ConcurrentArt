package com.uzykj.design.principles.srp;

/**
 * @author ghostxbh
 * @date 2021/4/8
 * @description
 */
public class TestStudentMain {
    public static void main(String[] args) {
        StudentPro pro = new StudentPro();

        // 设置学生的属性，一个纯粹的BO
        StudentBO bo = (StudentBO) pro;
        bo.setStudentName("Goliv");

        // 执行业务动作，一个业务逻辑类
        StudentBiz biz = (StudentBiz) pro;
        biz.changePassword("3sSAa@asda213$asdas");
    }
}
