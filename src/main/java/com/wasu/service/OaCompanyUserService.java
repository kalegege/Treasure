package com.wasu.service;

import com.wasu.model.OaCompanyUser;

import java.util.List;

public interface OaCompanyUserService {
    List<OaCompanyUser> getItemByExample(OaCompanyUser oaCompanyUser);
}
