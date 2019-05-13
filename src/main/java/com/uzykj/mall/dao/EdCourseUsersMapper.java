package com.uzykj.mall.dao;

import com.uzykj.mall.pojo.EdCourseUsers;

public interface EdCourseUsersMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EdCourseUsers record);

    int insertSelective(EdCourseUsers record);

    EdCourseUsers selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EdCourseUsers record);

    int updateByPrimaryKey(EdCourseUsers record);
}