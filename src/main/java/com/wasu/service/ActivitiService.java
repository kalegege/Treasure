package com.wasu.service;

import com.wasu.model.BusinessCar;
import org.activiti.engine.runtime.ProcessInstance;

import java.util.Map;

public interface ActivitiService {
    ProcessInstance startAndComplete(BusinessCar businessCar, Map<String,Object> variables) throws Exception;
}
