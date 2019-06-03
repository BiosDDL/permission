package com.qf.service.impl;

import com.qf.dto.RoleDto;
import com.qf.mapper.UserInfoMapper;
import com.qf.pojo.UserInfo;
import com.qf.service.UserInfoService;
import com.qf.tool.MD5Utils;
import com.qf.vo.UserInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    UserInfoMapper userInfoMapper;
    //如何用返回list的dao方法判断返回是否登录成功
    public UserInfo userLogin(UserInfoVo userInfoVo) {
        String str = userInfoVo.getPassword();
        str = MD5Utils.getMD5String(str);
        str = MD5Utils.getMD5String(str.substring(5,15));
        str=MD5Utils.getMD5String(str.substring(2,29));
        userInfoVo.setPassword(str);
        UserInfo userInfos = userInfoMapper.userLogin(userInfoVo);
            return userInfos;
    }

    public List<UserInfo> searchUserInfo(String value) {
        return userInfoMapper.searchUserInfo(value);
    }

    public boolean registerUserInfo(UserInfoVo userInfoVo) {
        String str = userInfoVo.getPassword();
        str = MD5Utils.getMD5String(str);
        str = MD5Utils.getMD5String(str.substring(5,15));
        str=MD5Utils.getMD5String(str.substring(2,29));
        userInfoVo.setPassword(str);
        int i = userInfoMapper.registerUserInfo(userInfoVo);
        if (i!=0){
            return true;
        }
        return false;
    }

    public int updateUser(UserInfoVo userInfoVo) {
        int i = userInfoMapper.updateUser(userInfoVo);
        return i;
    }

    public int addUserInfo(UserInfo userInfo) {
        return userInfoMapper.addUserInfo(userInfo);
    }

    public List<UserInfo> listAllUserInfo() {
        List<UserInfo> userInfoList = userInfoMapper.listAllUserInfo();
        return userInfoList;
    }

    public int deleteUserInfoById(UserInfoVo userInfoVo){
        int count1 = userInfoMapper.updateUser(userInfoVo);
        int count2 = userInfoMapper.deleteUserById(userInfoVo);
        return count1+count2;
    }

    public UserInfo getUserInfoById(int userId) {
        return userInfoMapper.getUserInfoById(userId);
    }

    public int updateUserInfo(UserInfo userInfo) {
        return userInfoMapper.updateUserInfo(userInfo);
    }

    public int deleteUserInfo(int userId) {
        return userInfoMapper.deleteUserInfo(userId);
    }

    public int insertRole(int userId, int roleId) {
        return userInfoMapper.insertRole(userId,roleId);
    }

    public List<RoleDto> findSelectRoleByUserId(int userId) {
        return userInfoMapper.findSelectRoleByUserId(userId);
    }
}
