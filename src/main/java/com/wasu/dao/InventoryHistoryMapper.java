package com.wasu.dao;

import com.wasu.model.InventoryHistory;
import com.wasu.model.InventoryHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InventoryHistoryMapper {
    int countByExample(InventoryHistoryExample example);

    int deleteByExample(InventoryHistoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(InventoryHistory record);

    int insertSelective(InventoryHistory record);

    List<InventoryHistory> selectByExample(InventoryHistoryExample example);

    InventoryHistory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") InventoryHistory record, @Param("example") InventoryHistoryExample example);

    int updateByExample(@Param("record") InventoryHistory record, @Param("example") InventoryHistoryExample example);

    int updateByPrimaryKeySelective(InventoryHistory record);

    int updateByPrimaryKey(InventoryHistory record);
}