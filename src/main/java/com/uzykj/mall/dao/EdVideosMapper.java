package com.uzykj.mall.dao;

import com.uzykj.mall.pojo.EdVideos;

public interface EdVideosMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EdVideos record);

    int insertSelective(EdVideos record);

    EdVideos selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EdVideos record);

    int updateByPrimaryKey(EdVideos record);
}