package com.wasu.service.Impl;

import com.wasu.dao.BusinessCarMapper;
import com.wasu.model.BusinessCar;
import com.wasu.model.BusinessCarExample;
import com.wasu.service.ActivitiService;
import org.activiti.engine.IdentityService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.runtime.ProcessInstance;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service("ActivitiService")
public class ActivitiServiceImpl implements ActivitiService{
    private static Logger logger = Logger.getLogger(ActivitiServiceImpl.class.getName());

    @Autowired
    private RuntimeService runtimeService;

    @Autowired
    private IdentityService identityService;

    @Autowired
    private BusinessCarMapper businessCarMapper;

    @Autowired
    private TaskService taskService;

    @Override
    public ProcessInstance startAndComplete(BusinessCar businessCar, Map<String,Object> variables) throws Exception {
        int id=businessCarMapper.insert(businessCar);
        logger.debug("save entity: {}"+ businessCar);

        BusinessCarExample businessCarExample=new BusinessCarExample();
        BusinessCarExample.Criteria criteria=businessCarExample.createCriteria();
        criteria.andIdEqualTo(id+0L);

        String businessKey = businessCar.getId().toString();

        ProcessInstance processInstance = null;
        try {
            // 用来设置启动流程的人员ID，引擎会自动把用户ID保存到activiti:initiator中
            identityService.setAuthenticatedUserId(businessCar.getUserid());

            //启动工作流
            processInstance = runtimeService.startProcessInstanceByKey("test001", businessKey, variables);

            String processInstanceId = processInstance.getId();
            businessCar.setProcessinstanceid(processInstanceId);
            businessCarMapper.updateByExample(businessCar,businessCarExample);
            logger.debug("start process of {key={}, bkey={}, pid={}, variables={}}"+
                    new Object[] { "leave", businessKey, processInstanceId, variables });

            //结束流程
            Map<String, Object> taskVariables = new HashMap<String, Object>();
            taskVariables.put("vacationApproved", "false");
            taskVariables.put("managerMotivation", "We have a tight deadline!");
            taskService.complete(processInstanceId, taskVariables);
        } finally {
            identityService.setAuthenticatedUserId(null);
        }
        return processInstance;
    }
}
