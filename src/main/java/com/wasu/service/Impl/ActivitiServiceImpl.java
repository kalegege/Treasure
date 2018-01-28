package com.wasu.service.Impl;

import com.wasu.model.ActivitDO;
import com.wasu.service.ActivitiService;
import org.activiti.engine.IdentityService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.runtime.ProcessInstance;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

public class ActivitiServiceImpl implements ActivitiService{
    private static Logger logger = Logger.getLogger(ActivitiServiceImpl.class.getName());

    @Autowired
    private RuntimeService runtimeService;

    @Autowired
    private IdentityService identityService;

    @Override
    public ProcessInstance startAndComplete(ActivitDO activitDO,Map<String,Object> variables) throws Exception {

        leaveDao.saveLeave(entity);
        logger.debug("save entity: {}", activitDO);
        String businessKey = activitDO.getId().toString();

        ProcessInstance processInstance = null;
        try {
            // 用来设置启动流程的人员ID，引擎会自动把用户ID保存到activiti:initiator中
            identityService.setAuthenticatedUserId(activitDO.getUserId());

            processInstance = runtimeService.startProcessInstanceByKey("leave", businessKey, variables);
            String processInstanceId = processInstance.getId();
            activitDO.setProcessInstanceId(processInstanceId);
            leaveDao.update(entity);
            logger.debug("start process of {key={}, bkey={}, pid={}, variables={}}",
                    new Object[] { "leave", businessKey, processInstanceId, variables });
        } finally {
            identityService.setAuthenticatedUserId(null);
        }
        return processInstance;
    }
}
