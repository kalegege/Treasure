package com.wasu.controller;

import com.alibaba.fastjson.JSON;
import com.dingtalk.open.client.api.model.corp.CorpUserDetail;
import com.wasu.dingding.AuthHelper;
import com.wasu.dingding.UserHelper;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by kale on 2017/10/26.
 */
@Controller
@RequestMapping("/dingdinglogin")
public class DingdingLiginController {
    private static Logger logger= Logger.getLogger(DingdingLiginController.class);
    int MaxInactiveInterval=60*60;

    @RequestMapping("test")
    public String test(Model model,HttpServletRequest request, HttpServletResponse response){
        String userid = request.getParameter("userid");
        //需要传递自己的资产，待处理数据，数量
        if(userid!=null){
            model.addAttribute("userid",userid);
        }
        return "test3";
    }

    @RequestMapping("test1")
    public String test1(Model model,HttpServletRequest request, HttpServletResponse response){
        String pandian=request.getParameter("pandian");
        model.addAttribute("pandian",pandian!=null?Integer.parseInt(pandian):0);
        return "test1";
    }

    @RequestMapping("test2")
    public String test2(Model model,HttpServletRequest request, HttpServletResponse response){
        String _config=AuthHelper.getConfig(request);
        model.addAttribute("conf",JSON.parseObject(_config));
        return "test2";
    }


    @RequestMapping("userInfo")
    @ResponseBody
    public String userInfo(HttpServletRequest request,HttpServletResponse response) throws Exception{
        // 获取免登授权码
        String code = request.getParameter("code");
        String corpId = request.getParameter("corpid");
        System.out.println("authCode:" + code + " corpid:" + corpId);
        Map<String,String> m=new HashMap<>();
        try {
            response.setContentType("text/html; charset=utf-8");

            String accessToken = AuthHelper.getAccessToken();
            m.put("accessToken",accessToken);
            System.out.println("access token:" + accessToken);
            CorpUserDetail user = UserHelper.getUser(accessToken, UserHelper.getUserInfo(accessToken, code).getUserid());

            String userJson = JSON.toJSONString(user);
            m.put("user",userJson);
            m.put("isSuccess","1");
            System.out.println("user:" + userJson);
        } catch (Exception e) {
            e.printStackTrace();
        }
//        Map<String,String> m=new HashMap<>();
//        String accessToken=AuthHelper.getAccessToken();
//        String userId=UserHelper.getUserInfo(accessToken,code).getUserid();
//        System.out.println("当前用户userid=");
//        CorpUserDetail user=(CorpUserDetail) UserHelper.getUser(accessToken,userId);
//        logger.info(JSON.toJSONString(user));
//
//        String param="oaId="+user.getJobnumber();
//        System.out.print(param);
        return JSON.toJSONString(m);
    }
}
