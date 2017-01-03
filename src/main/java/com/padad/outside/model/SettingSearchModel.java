package com.padad.outside.model;

/**
 * Created by Admin on 16/12/12.
 */
public class SettingSearchModel {

    private String id;

    private Integer appVersion;

    private String appDesc;

    private String appAddress;

    private Integer forceSetting;

    private int row;

    private int page;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(Integer appVersion) {
        this.appVersion = appVersion;
    }

    public String getAppDesc() {
        return appDesc;
    }

    public void setAppDesc(String appDesc) {
        this.appDesc = appDesc;
    }

    public String getAppAddress() {
        return appAddress;
    }

    public void setAppAddress(String appAddress) {
        this.appAddress = appAddress;
    }

    public Integer getForceSetting() {
        return forceSetting;
    }

    public void setForceSetting(Integer forceSetting) {
        this.forceSetting = forceSetting;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
}
