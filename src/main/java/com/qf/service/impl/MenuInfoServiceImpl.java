package com.qf.service.impl;

import com.qf.dto.MenuDto2;
import com.qf.dto.MenuInfoDto;
import com.qf.dto.RoleDto2;
import com.qf.mapper.MenuInfoMapper;
import com.qf.service.MenuInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Service
public class MenuInfoServiceImpl implements MenuInfoService {
    @Autowired
    MenuInfoMapper menuInfoMapper;
    public List<MenuInfoDto> listMenu(int roleId) {
        return menuInfoMapper.listMenu(roleId);
    }

    public List<MenuInfoDto> listMenuByUserId(int userId) {
        return menuInfoMapper.listMenuByUserId(userId);
    }

    public boolean deleteMenu(int roleId) {

        int i = menuInfoMapper.deleteMenu(roleId);
        if (i!=0){
            return true;
        }
        return false;
    }

    public boolean insertMenu(MenuDto2 menuDto) {
        int i = menuInfoMapper.insertMenu(menuDto);
        if (i!=0){
            return true;
        }
        return false;
    }


}

