package com.wasu.service;

import com.wasu.model.InventoryHistory;

import java.util.List;

public interface InventoryHistoryService {
    List<InventoryHistory> getByExample(InventoryHistory inventoryHistory);
    int update(InventoryHistory inventoryHistory);
}
