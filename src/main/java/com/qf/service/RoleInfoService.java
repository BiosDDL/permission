package com.qf.service;

import com.qf.dto.RoleDto;
import com.qf.dto.RoleDto2;
import com.qf.pojo.RoleInfo;
import com.qf.vo.RoleInfoVo;

import java.util.List;

public interface RoleInfoService {
    List<RoleInfoVo> listAllRoleInfo();

    List<RoleDto> searchRoleInfo(RoleInfoVo roleInfoVo);

    int deleteByUserId(int userId);

    boolean insertByRoleArr(RoleDto2 roleDto2);
}
