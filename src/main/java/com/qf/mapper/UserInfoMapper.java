package com.qf.mapper;

import com.qf.dto.RoleDto;
import com.qf.pojo.UserInfo;
import com.qf.vo.RoleInfoVo;
import com.qf.vo.SplitePageVo;
import com.qf.vo.UserInfoVo;

import java.util.List;

public interface UserInfoMapper {
    UserInfo userLogin(UserInfoVo userInfoVo);
    int addUser(UserInfoVo userInfoVo);
    int deleteUser(UserInfoVo userInfoVo);
    int editUser(UserInfoVo userInfoVo);

    int updateUser(UserInfoVo userInfoVo);

    List<RoleInfoVo> listRoleByUserId(int roleId);

    List<UserInfo> listUserInfoRole();

    List<UserInfo> listUserInfoSplitePage(SplitePageVo splitePageVo);

    int deleteUserById(UserInfoVo userInfoVo);

    int addUserInfo(UserInfo userInfo);

    List<UserInfo> listAllUserInfo();

    UserInfo getUserInfoById(int userId);

    int updateUserInfo(UserInfo userInfo);

    int deleteUserInfo(int userId);

    List<RoleDto> findSelectRoleByUserId(int userId);

    int insertRole(int userId, int roleId);

    List<UserInfo> searchUserInfo(String value);

    int registerUserInfo(UserInfoVo userInfoVo);
}
