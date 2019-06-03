package com.qf.dto;

public class RoleDto {
     private int roleId;
     private int isnull;
     private String roleName;
     private String shortName;

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public int getIsnull() {
        return isnull;
    }

    public void setIsnull(int isnull) {
        this.isnull = isnull;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    @Override
    public String toString() {
        return "RoleDto{" +
                "roleId=" + roleId +
                ", isnull=" + isnull +
                ", roleName='" + roleName + '\'' +
                ", shortName='" + shortName + '\'' +
                '}';
    }
}
