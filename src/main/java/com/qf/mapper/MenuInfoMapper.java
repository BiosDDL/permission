package com.qf.mapper;

import com.qf.dto.MenuDto2;
import com.qf.dto.MenuInfoDto;

import java.util.List;

public interface MenuInfoMapper {
    List<MenuInfoDto> listMenu(int roleId);
    List<MenuInfoDto> listMenuByUserId(int userId);

    int deleteMenu(int roleId);

    int insertMenu(MenuDto2 menuDto);

}
