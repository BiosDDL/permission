package com.qf.mapper;

import com.qf.dto.RoleDto;
import com.qf.dto.RoleDto2;
import com.qf.vo.RoleInfoVo;

import java.util.List;

public interface RoleInfoMapper {
    List<RoleInfoVo> listAllRoleInfo();

    List<RoleDto> searchRoleInfo(RoleInfoVo roleInfoVo);

    int deleteByUserId(int userId);

    int insertByRoleArr(RoleDto2 roleArr);
}
