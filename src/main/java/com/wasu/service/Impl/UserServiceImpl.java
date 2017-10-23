package com.wasu.service.Impl;

import com.wasu.controller.MyController;
import com.wasu.dao.MyUserMapper;
import com.wasu.model.MyUser;
import com.wasu.model.MyUserExample;
import com.wasu.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by kale on 2017/10/23.
 */
@Service("UserService")
public class UserServiceImpl implements UserService {
    private static Logger logger = Logger.getLogger(UserServiceImpl.class.getName());

    @Resource
    private MyUserMapper myUserMapper;


    public List<MyUser> getAll() {
        MyUserExample myUserExample=new MyUserExample();
        MyUserExample.Criteria criteria=myUserExample.createCriteria();
        return myUserMapper.selectByExample(myUserExample);
    }
}
