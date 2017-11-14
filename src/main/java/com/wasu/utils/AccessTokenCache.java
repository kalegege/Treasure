package com.wasu.utils;

import com.wasu.dingding.AuthHelper;
import com.wasu.dingding.OApiException;

public class AccessTokenCache extends DbCache<String,String> {
    @Override
    protected String fetch(String key) {
        try {
            String accToken=AuthHelper.getAccessToken();
            super.put("access_token",accToken);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
