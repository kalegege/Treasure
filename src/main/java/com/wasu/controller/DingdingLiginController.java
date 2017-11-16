package com.wasu.controller;

import com.alibaba.fastjson.JSON;
import com.dingtalk.open.client.api.model.corp.CorpUserDetail;
import com.wasu.dingding.AuthHelper;
import com.wasu.dingding.UserHelper;
import com.wasu.model.Assert;
import com.wasu.model.InventoryHistory;
import com.wasu.model.InventoryHistoryExample;
import com.wasu.service.AssertService;
import com.wasu.service.InventoryHistoryService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by kale on 2017/10/26.
 */
@Controller
@RequestMapping("/dingdinglogin")
public class DingdingLiginController {
    private static Logger logger= Logger.getLogger(DingdingLiginController.class);

    @Resource
    private AssertService assertService;

    @Resource
    private InventoryHistoryService inventoryHistoryService;

    @RequestMapping("test")
    public String test(Model model,HttpServletRequest request, HttpServletResponse response){
        String userid = request.getParameter("userid");
        //需要传递自己的资产，待处理数据，数量
        if(userid!=null){
//            model.addAttribute("userid",userid);
            List<Assert> result=assertService.getByWorkCode(userid);
            InventoryHistory inventoryHistory=new InventoryHistory();
            inventoryHistory.setDeptname(result.get(0).getDeptname());
            inventoryHistory.setInventoryUser(result.get(0).getPlace());
            inventoryHistory.setInventorystate(-1L);

            List<InventoryHistory> historys=inventoryHistoryService.getByExample(inventoryHistory);
            if(!result.isEmpty()){
                model.addAttribute("items",result);
            }
            if(!historys.isEmpty()){
                model.addAttribute("historys",historys);
                model.addAttribute("hsize",historys.size());
            }
        }
        return "test3";
    }

    @RequestMapping("test1")
    public String test1(Model model,HttpServletRequest request, HttpServletResponse response){
        String assetcode=request.getParameter("assetcode");
        if(assetcode!=null){
            Assert a=new Assert();
            a.setAssetcode(assetcode);
            List<Assert> result=assertService.getByExample(a);
            model.addAttribute("a",result.get(0));
        }
        return "test1";
    }

    @RequestMapping("test2")
    public String test2(Model model,HttpServletRequest request, HttpServletResponse response){
        String assetcode=request.getParameter("assetcode");
        String _config=AuthHelper.getConfig(request);
        model.addAttribute("conf",JSON.parseObject(_config));
        model.addAttribute("assetcode",assetcode);

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
