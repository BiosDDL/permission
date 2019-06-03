package com.qf.dto;

import java.util.Arrays;
import java.util.List;

public class MenuDto2 {

    int[] menuIds;
    int roleId;




    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public int[] getMenuIds() {
        return menuIds;
    }

    public void setMenuIds(int[] menuIds) {
        this.menuIds = menuIds;
    }

    @Override
    public String toString() {
        return "MenuDto2{" +
                "menuIds=" + Arrays.toString(menuIds) +
                ", roleId=" + roleId +
                '}';
    }
}
