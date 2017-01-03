package com.padad.outside.pojo;

public class MissionSetting {
    private String id;

    private Integer appVersion;

    private String appDesc;

    private String appAddress;

    private Integer forceSetting;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
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
        this.appDesc = appDesc == null ? null : appDesc.trim();
    }

    public String getAppAddress() {
        return appAddress;
    }

    public void setAppAddress(String appAddress) {
        this.appAddress = appAddress == null ? null : appAddress.trim();
    }

    public Integer getForceSetting() {
        return forceSetting;
    }

    public void setForceSetting(Integer forceSetting) {
        this.forceSetting = forceSetting;
    }
}