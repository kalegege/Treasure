package com.wasu.service;

import com.wasu.model.Assert;
import com.wasu.model.AssertAdd;

import java.util.List;

/**
 * Created by kale on 2017/10/25.
 */
public interface AssertService {
    public int insert(List<Assert> asserts);
    public List<AssertAdd> getByWorkCode(String assertCode);
    List<Assert> getByExample(Assert item);
    public int update(Assert a);
}
