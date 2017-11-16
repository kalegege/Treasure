package com.wasu.service.Impl;

import com.wasu.dao.AssertMapper;
import com.wasu.model.Assert;
import com.wasu.model.AssertExample;
import com.wasu.service.AssertService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by kale on 2017/10/25.
 */
@Service("AssertService")
public class AssertServiceImpl implements AssertService {
    private static Logger logger = Logger.getLogger(AssertServiceImpl.class.getName());

    @Resource
    private AssertMapper assertMapper;

    @Override
    public int insert(List<Assert> assertList) {
        int result = 0;
        for (int i = 0; i < assertList.size(); i++) {
            if (assertMapper.insert(assertList.get(i)) != 0) {
                result++;
                logger.info("插入成功" + i);
            }

        }
        return result;
    }

    @Override
    public List<Assert> getByWorkCode(String workCode) {
        return assertMapper.getAssertbyCode(workCode);
    }

    @Override
    public List<Assert> getByExample(Assert item) {
        AssertExample assertExample=new AssertExample();
        AssertExample.Criteria criteria=assertExample.createCriteria();
        criteria.andAssetcodeEqualTo(item.getAssetcode());
        return assertMapper.selectByExample(assertExample);
    }

    @Override
    public int update(Assert a) {
        return assertMapper.updateByPrimaryKeySelective(a);
    }
}
