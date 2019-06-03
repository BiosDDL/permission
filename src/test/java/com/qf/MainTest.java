package com.qf;

import com.qf.pojo.UserInfo;
import com.qf.service.UserInfoService;
import com.qf.vo.UserInfoVo;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
    @Test
    public void test1(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml", "spring-service.xml");
        UserInfoService userInfoService = context.getBean(UserInfoService.class);
        UserInfoVo userInfoVo = new UserInfoVo();
        userInfoVo.setUserName("张三");
        userInfoVo.setPassword("123");
        UserInfo userInfo = userInfoService.userLogin(userInfoVo);
        System.out.println(userInfo);
    }

    @Test
    public void test2(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml", "spring-service.xml");
        UserInfoService userInfoService = context.getBean(UserInfoService.class);
        UserInfoVo userInfoVo = new UserInfoVo();
        userInfoVo.setId(5);
        userInfoVo.setUserName("aweisile");
        userInfoVo.setPassword("1145141919810");
        int i = userInfoService.updateUser(userInfoVo);
        System.out.println(i);
    }
}
