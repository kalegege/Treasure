package com.wasu.service.Impl;

import com.wasu.dao.InventoryHistoryMapper;
import com.wasu.dao.InventoryMapper;
import com.wasu.model.InventoryHistory;
import com.wasu.model.InventoryHistoryExample;
import com.wasu.service.InventoryHistoryService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("InventoryHistoryService")
public class InventoryHistoryServiceImpl implements InventoryHistoryService {
    private static Logger logger = Logger.getLogger(InventoryHistoryServiceImpl.class.getName());

    @Resource
    private InventoryHistoryMapper inventoryHistoryMapper;

    @Override
    public List<InventoryHistory> getByExample(InventoryHistory inventoryHistory) {
        InventoryHistoryExample inventoryHistoryExample=new InventoryHistoryExample();
        InventoryHistoryExample.Criteria criteria=inventoryHistoryExample.createCriteria();
        if(inventoryHistory.getInventoryUser()!= null){
            criteria.andInventoryUserEqualTo(inventoryHistory.getInventoryUser());
        }
        criteria.andDeptnameEqualTo(inventoryHistory.getDeptname());
        criteria.andInventorystateEqualTo(inventoryHistory.getInventorystate());
        List<InventoryHistory> result=inventoryHistoryMapper.selectByExample(inventoryHistoryExample);
        logger.info(inventoryHistory.getDeptname()+"部门:"+inventoryHistory.getPlace()+"盘点状态为"+inventoryHistory.getInventorystate()+"的资产一共有"+result.size()+"条");
        return result;
    }

    @Override
    public int update(InventoryHistory inventoryHistory) {
        return inventoryHistoryMapper.updateByPrimaryKeySelective(inventoryHistory);
    }
}
