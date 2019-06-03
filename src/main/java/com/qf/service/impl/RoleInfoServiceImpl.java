package com.qf.service.impl;

import com.qf.dto.RoleDto;
import com.qf.dto.RoleDto2;
import com.qf.mapper.RoleInfoMapper;
import com.qf.pojo.RoleInfo;
import com.qf.service.RoleInfoService;
import com.qf.vo.RoleInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class RoleInfoServiceImpl implements RoleInfoService {
    @Autowired
    RoleInfoMapper roleInfoMapper;
    public List<RoleInfoVo> listAllRoleInfo() {
        return roleInfoMapper.listAllRoleInfo();
    }

    public List<RoleDto> searchRoleInfo(RoleInfoVo roleInfoVo) {
        return roleInfoMapper.searchRoleInfo(roleInfoVo);
    }

    public int deleteByUserId(int userId) {
        return roleInfoMapper.deleteByUserId(userId);
    }

    public boolean insertByRoleArr(RoleDto2 roleArr) {
        int b = roleInfoMapper.insertByRoleArr(roleArr);
        if (b==roleArr.getRoleArr().length){
            return true;
        }
        return false;
    }
}
