package com.qf.service;

import com.qf.dto.RoleDto;
import com.qf.pojo.UserInfo;
import com.qf.vo.UserInfoVo;

import java.util.List;

public interface UserInfoService {
    UserInfo userLogin(UserInfoVo userInfoVo);

    int updateUser(UserInfoVo userInfoVo);

    int addUserInfo(UserInfo userInfo);

    List<UserInfo> listAllUserInfo();

    UserInfo getUserInfoById(int userId);

    int updateUserInfo(UserInfo userInfo);

    int deleteUserInfo(int userId);

    List<RoleDto> findSelectRoleByUserId(int userId);

    int insertRole(int userId, int roleId);

    List<UserInfo> searchUserInfo(String value);

    boolean registerUserInfo(UserInfoVo userInfoVo);
}
