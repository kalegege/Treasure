package com.wasu.dao;

import com.wasu.model.OaCompanyUser;
import com.wasu.model.OaCompanyUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OaCompanyUserMapper {
    int countByExample(OaCompanyUserExample example);

    int deleteByExample(OaCompanyUserExample example);

    int insert(OaCompanyUser record);

    int insertSelective(OaCompanyUser record);

    List<OaCompanyUser> selectByExample(OaCompanyUserExample example);

    int updateByExampleSelective(@Param("record") OaCompanyUser record, @Param("example") OaCompanyUserExample example);

    int updateByExample(@Param("record") OaCompanyUser record, @Param("example") OaCompanyUserExample example);

}