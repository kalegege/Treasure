package com.wasu.service.Impl;

import com.wasu.dao.OaCompanyUserMapper;
import com.wasu.model.OaCompanyUser;
import com.wasu.model.OaCompanyUserExample;
import com.wasu.service.OaCompanyUserService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("OaCompanyUserService")
public class OaCompanyUserServiceImpl implements OaCompanyUserService{
    private static Logger logger = Logger.getLogger(OaCompanyUserServiceImpl.class.getName());

    @Resource
    private OaCompanyUserMapper oaCompanyUserMapper;


    @Override
    public List<OaCompanyUser> getItemByExample(OaCompanyUser oaCompanyUser) {
        OaCompanyUserExample oaCompanyUserExample=new OaCompanyUserExample();
        OaCompanyUserExample.Criteria criteria=oaCompanyUserExample.createCriteria();
        criteria.andWorkcodeEqualTo(oaCompanyUser.getWorkcode());
        return oaCompanyUserMapper.selectByExample(oaCompanyUserExample);
    }
}
