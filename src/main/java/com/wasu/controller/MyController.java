package com.wasu.controller;

import com.wasu.model.BusinessCar;
import com.wasu.model.MyUser;
import com.wasu.service.ActivitiService;
import com.wasu.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by kale on 2017/10/23.
 */
@Controller
//@RequestMapping("/treasure")
public class MyController {
    private static Logger logger = Logger.getLogger(MyController.class.getName());

    @Resource
    private UserService userService;

    @Resource
    private ActivitiService activitiService;

    @RequestMapping(value = "/test")
    public Object getAlarm(Model model) throws Exception {
        logger.info("进入test接口-----------------");
//		Response responses=badiduYunUtils.createGeotable("geotable");
        List<MyUser> res=userService.getAll();
        model.addAttribute("result", "first name"+res.size());
        model.addAttribute("data",res);
//        callService.findCall();
//		System.out.println("message"+responses.getMessage()+"id"+responses.getId());
        return "test";
    }

    @RequestMapping("startAndComplete")
    @ResponseBody
    public String startAndComplete(HttpServletRequest request){
        BusinessCar businessCar=new BusinessCar();
        businessCar.setCtime(new Date());
        businessCar.setUserid("kale001");
        businessCar.setMtime(new Date());
        Map<String,Object> variables=new HashMap<String,Object>();
        variables.put("employeeName", "Kermit");
        variables.put("numberOfDays", new Integer(4));
        variables.put("vacationMotivation", "I'm really tired!");
        try {
            activitiService.startAndComplete(businessCar,variables);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "ok";
    }
}
