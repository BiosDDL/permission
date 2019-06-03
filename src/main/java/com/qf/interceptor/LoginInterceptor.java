package com.qf.interceptor;

import com.qf.pojo.UserInfo;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor {
    //前置
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        String uri = httpServletRequest.getRequestURI();
        System.out.println(uri);
        if (uri.indexOf("login.html")>=0||uri.indexOf("reg.html")>=0){
            return true;
        }
        UserInfo userInfo = (UserInfo) httpServletRequest.getSession().getAttribute("userInfo");
        if (userInfo != null) {
            return true;
        }
        return false;
    }

    //请求操作
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    //后置
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
