package com.uzykj.mall.dao;

import com.uzykj.mall.pojo.ExpertAudit;

public interface ExpertAuditMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ExpertAudit record);

    int insertSelective(ExpertAudit record);

    ExpertAudit selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ExpertAudit record);

    int updateByPrimaryKeyWithBLOBs(ExpertAudit record);

    int updateByPrimaryKey(ExpertAudit record);
}