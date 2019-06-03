package com.qf.control;

import com.qf.pojo.UserInfo;
import com.qf.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ThymeleftController {

    @Autowired
    UserInfoService userInfoService;

    @RequestMapping("testOne")
    public ModelAndView testOne(ModelAndView map){
        //1.ModelAndView必须设置viewName
        map.setViewName("Thymeleaf");
        //3.ModelAndView如果存值？
        map.getModelMap().put("val","超星空 你没石了");
        map.addObject("val1","cxknmsl");
        //2.如果使用MAV则必须返回其对象
        return map;
    }

    @RequestMapping("thymeleafUser2")
    public ModelAndView thymeleafUser(ModelAndView map){
        map.setViewName("thymeleafUser2");
        List<UserInfo> userInfoList = userInfoService.listAllUserInfo();
        map.addObject("userList",userInfoList);
        return map;
    }
}
