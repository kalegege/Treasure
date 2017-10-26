package com.wasu.controller;

import com.wasu.model.Assert;
import com.wasu.service.AssertService;
import com.wasu.utils.MyUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by kale on 2017/10/24.
 */
@Controller
@RequestMapping("/")
public class BaseController {
    private static Logger logger = Logger.getLogger(BaseController.class.getName());

    @Resource
    private AssertService assertService;

    @RequestMapping(value = "login")
    public Object getAlarm(Model model, String userId, String passwd) throws Exception {
        logger.info("进入test接口-----------------userId=" + userId + "passwd=" + passwd);
//		Response responses=badiduYunUtils.createGeotable("geotable");
//        List<Assert> result = MyUtils.readExcel();
//        int num = assertService.insert(result);
        model.addAttribute("result", "first name" );
//        callService.findCall();
//		System.out.println("message"+responses.getMessage()+"id"+responses.getId());
        return "index";
    }
}
