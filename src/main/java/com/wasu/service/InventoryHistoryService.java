package com.wasu.service;

import com.wasu.model.InventoryHistory;
import com.wasu.model.InventoryHistoryExample;

import java.util.List;

public interface InventoryHistoryService {
    List<InventoryHistory> getByExample(InventoryHistory inventoryHistory);
}
