package com.padad.outside.pojo;

public class MissionMenu {
    private String menuId;

    private String menuTitle;

    private String menuAddress;

    private Integer auth;

    private Integer status;

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId == null ? null : menuId.trim();
    }

    public String getMenuTitle() {
        return menuTitle;
    }

    public void setMenuTitle(String menuTitle) {
        this.menuTitle = menuTitle == null ? null : menuTitle.trim();
    }

    public String getMenuAddress() {
        return menuAddress;
    }

    public void setMenuAddress(String menuAddress) {
        this.menuAddress = menuAddress == null ? null : menuAddress.trim();
    }

    public Integer getAuth() {
        return auth;
    }

    public void setAuth(Integer auth) {
        this.auth = auth;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}