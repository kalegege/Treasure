package com.wasu.interceptor;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by kale on 2017/10/26.
 */
public class SSOInterceptor extends HandlerInterceptorAdapter {
    String[] allowUrls;
    String url;
    long sendTime=5*60*1000L;
    int MaxInactiveInterval=60*60;

    public String[] getAllowUrls() {
        return allowUrls;
    }

    public void setAllowUrls(String[] allowUrls) {
        this.allowUrls = allowUrls;
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String requestUrl=request.getRequestURI();

        for(String url:allowUrls){
            if(requestUrl.endsWith(url)){
                return true;
            }
        }
        return false;
    }
}
