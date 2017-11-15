package com.wasu.dao;

import com.wasu.model.Assert;
import com.wasu.model.AssertExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AssertMapper {
    int countByExample(AssertExample example);

    int deleteByExample(AssertExample example);

    int deleteByPrimaryKey(String assetcode);

    int insert(Assert record);

    int insertSelective(Assert record);

    List<Assert> selectByExample(AssertExample example);

    Assert selectByPrimaryKey(String assetcode);

    int updateByExampleSelective(@Param("record") Assert record, @Param("example") AssertExample example);

    int updateByExample(@Param("record") Assert record, @Param("example") AssertExample example);

    int updateByPrimaryKeySelective(Assert record);

    int updateByPrimaryKey(Assert record);

    List<Assert> getAssertbyCode(String workcode);
}