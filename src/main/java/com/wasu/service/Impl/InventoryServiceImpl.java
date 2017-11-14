package com.wasu.service.Impl;

import com.wasu.dao.AssertMapper;
import com.wasu.dao.InventoryMapper;
import com.wasu.service.InventoryService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("InventoryService")
public class InventoryServiceImpl implements InventoryService {
    private static Logger logger = Logger.getLogger(InventoryServiceImpl.class.getName());

    @Resource
    private InventoryMapper inventoryMapper;
}
