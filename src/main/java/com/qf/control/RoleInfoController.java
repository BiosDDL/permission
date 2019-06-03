package com.qf.control;

import com.qf.dto.RoleDto;
import com.qf.dto.RoleDto2;
import com.qf.pojo.RoleInfo;
import com.qf.service.RoleInfoService;
import com.qf.vo.RoleInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class RoleInfoController {
    @Autowired
    RoleInfoService roleInfoService;

    @RequestMapping("listAllRoleInfo")
    public Object listAllRoleInfo(){
        return roleInfoService.listAllRoleInfo();
    }

    @RequestMapping("searchRoleInfo")
    public Object searchRoleInfo(@RequestBody RoleInfoVo roleInfoVo){
        return roleInfoService.searchRoleInfo(roleInfoVo);
    }

    @RequestMapping("deleteRole")
    public boolean deleteRole(@RequestParam int userId){
        int id = roleInfoService.deleteByUserId(userId);
        if (id!=0){
            return true;
        }
        return false;
    }

    @RequestMapping("insertRole")
    public Object insertRole(@RequestBody RoleDto2 roleDto){
        System.out.println(roleDto.getRoleArr());
        System.out.println(roleDto.getUserId());
        int userId = roleDto.getUserId();
        int[] roleArr = roleDto.getRoleArr();
        boolean flag = roleInfoService.insertByRoleArr(roleDto);
        return flag;

    }
}
