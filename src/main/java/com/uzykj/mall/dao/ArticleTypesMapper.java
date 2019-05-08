package com.uzykj.mall.dao;

import com.uzykj.mall.pojo.ArticleTypes;

public interface ArticleTypesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ArticleTypes record);

    int insertSelective(ArticleTypes record);

    ArticleTypes selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ArticleTypes record);

    int updateByPrimaryKey(ArticleTypes record);
}