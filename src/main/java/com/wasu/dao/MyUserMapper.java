package com.wasu.dao;

import com.wasu.model.MyUser;
import com.wasu.model.MyUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MyUserMapper {
    int countByExample(MyUserExample example);

    int deleteByExample(MyUserExample example);

    int insert(MyUser record);

    int insertSelective(MyUser record);

    List<MyUser> selectByExample(MyUserExample example);

    int updateByExampleSelective(@Param("record") MyUser record, @Param("example") MyUserExample example);

    int updateByExample(@Param("record") MyUser record, @Param("example") MyUserExample example);
}