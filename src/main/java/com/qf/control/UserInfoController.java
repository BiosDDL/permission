package com.qf.control;

import com.qf.dto.RoleDto;
import com.qf.pojo.UserInfo;
import com.qf.service.UserInfoService;
import com.qf.vo.UserInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@Controller
public class UserInfoController {
    @Autowired
    UserInfoService userInfoService;

    /*@RequestMapping("init")
    public String init(@RequestBody UserInfoVo userInfoVo){
        System.out.println("Hello World! "+ userInfoVo.getUserName()+" : "+userInfoVo.getPassword());
        if (userInfoService.userLogin(userInfoVo)) {
            System.out.println("登录成功");
        } else {
            System.out.println("登录失败");
        }
        return "test";
    }
*/

    /*@RequestMapping("register")
    public String register(@RequestBody UserInfo userInfo){
        if (userInfoService.addUserInfo(userInfo)){
            System.out.println("注册成功");
            return "index";
        } else {
            System.out.println("注册失败");
            return "login1";
        }
    }*/

    @ResponseBody
    @RequestMapping("listAllUserInfo")
    public Object listAllUserInfo(){
        return userInfoService.listAllUserInfo();
    }

    /*@RequestMapping("userLogin")
    public String userLogin(@RequestBody UserInfoVo userInfoVo){
        userInfoService.userLogin(userInfoVo)
        if(){
            return "main";
        } else {
            return "login1";
        }
    }*/
    @ResponseBody
    @RequestMapping("searchUserInfo")
    public Object searchUserInfo(@RequestParam String value){
        return userInfoService.searchUserInfo(value);
    }

    @ResponseBody
    @RequestMapping("loginController")
    public Object loginController(@RequestBody UserInfoVo userInfoVo, HttpSession httpSession){
        UserInfo userInfo = userInfoService.userLogin(userInfoVo);
        if (userInfo!=null){
            System.out.println("success");
            httpSession.setAttribute("userInfo",userInfo);
            return true;
        } else{
            System.out.println("error");
            return false;
        }
    }

    @ResponseBody
    @RequestMapping("getUserInfoById")
    public Object getUserInfoById(@RequestParam int userId){
        System.out.println(userId);
        return userInfoService.getUserInfoById(userId);
    }

    @ResponseBody
    @RequestMapping("updateUserInfo")
    public boolean updateUserInfo(@RequestBody UserInfo userInfo){
        if (userInfoService.updateUserInfo(userInfo)!=0){
            return true;
        }
        return false;
    }

    @ResponseBody
    @RequestMapping("addUserInfo")
    public boolean addUserInfo(@RequestBody UserInfo userInfo){
        if (userInfoService.addUserInfo(userInfo)!=0) {
            return true;
        }
        return false;
    }


    @RequestMapping("deleteUserInfo")
    public boolean deleteUserInfo(@RequestParam int userId){
        System.out.println(userId);
        if (userInfoService.deleteUserInfo(userId)!=0) {
            return true;
        }
        return false;
    }

    @ResponseBody
    @RequestMapping("findSelectRoleByUserId")
    public Object findSelectRoleByUserId(@RequestParam int userId){
        return userInfoService.findSelectRoleByUserId(userId);
    }

    @ResponseBody
    @RequestMapping("registerUserInfo")
    public boolean registerUserInfo(@RequestBody UserInfoVo userInfoVo){
        return userInfoService.registerUserInfo(userInfoVo);
    }




}
