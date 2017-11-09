package com.wasu.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.dingtalk.open.client.api.model.corp.CorpUserDetail;
import com.wasu.dingding.AuthHelper;
import com.wasu.dingding.UserHelper;
import org.apache.log4j.Logger;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * Created by kale on 2017/10/26.
 */
@Controller
@RequestMapping("/dingdinglogin")
public class DingdingLiginController {
    private static Logger logger= Logger.getLogger(DingdingLiginController.class);
    int MaxInactiveInterval=60*60;

    @RequestMapping("index")
    public ModelAndView login( HttpServletRequest request){
        ModelAndView mv=new ModelAndView();
        Cookie[] cookies=request.getCookies();
        JSONObject js=JSON.parseObject(AuthHelper.getConfig(request));
        mv.addObject("conf",js);
        mv.setViewName("dingdinglogin");

        return mv;
    }

    @RequestMapping("test")
    public String test(HttpServletRequest request, HttpServletResponse response){
        return "test3";
    }

    @RequestMapping("test1")
    public String test1(Model model,HttpServletRequest request, HttpServletResponse response){
        String pandian=request.getParameter("pandian");
        model.addAttribute("pandian",pandian!=null?Integer.parseInt(pandian):0);
        return "test1";
    }

    @RequestMapping("test2")
    public String test2(HttpServletRequest request, HttpServletResponse response){
        return "test2";
    }


    @RequestMapping("userInfo")
    @ResponseBody
    public String userInfo(String corpId,String code,HttpServletRequest request,HttpServletResponse response) throws Exception{
        Map<String,String> m=new HashMap<>();
        String accessToken=AuthHelper.getAccessToken();
        String userId=UserHelper.getUserInfo(accessToken,code).getUserid();
        System.out.println("当前用户userid=");
        CorpUserDetail user=(CorpUserDetail) UserHelper.getUser(accessToken,userId);
        logger.info(JSON.toJSONString(user));

//        ClassPathResource res=new ClassPathResource("/config.properties",this.getClass());
//        Properties prop=new Properties();
//        try {
//            prop.load(res.getInputStream());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        String url_db=prop.getProperty("url_db");

        String param="oaId="+user.getJobnumber();
        System.out.print(param);

        return "success";
    }
}
