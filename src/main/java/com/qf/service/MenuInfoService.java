package com.qf.service;

import com.qf.dto.MenuDto2;
import com.qf.dto.MenuInfoDto;

import java.util.List;

public interface MenuInfoService {
    List<MenuInfoDto> listMenu(int roleId);
    List<MenuInfoDto> listMenuByUserId(int userId);

    boolean deleteMenu(int roleId);

    boolean insertMenu(MenuDto2 menuDto);
}
