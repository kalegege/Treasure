package com.wasu.service;

import com.wasu.model.ActivitDO;
import org.activiti.engine.runtime.ProcessInstance;

import java.util.Map;

public interface ActivitiService {
    ProcessInstance startAndComplete(ActivitDO activitDO,Map<String,Object> variables) throws Exception;
}
