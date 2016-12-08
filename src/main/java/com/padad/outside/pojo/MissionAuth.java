package com.padad.outside.pojo;

public class MissionAuth {
    private String authId;

    private Integer auth;

    private String timeSetting;

    private String descAuth;

    private Integer activeAuth;

    public Integer getActiveAuth() {
        return activeAuth;
    }

    public void setActiveAuth(Integer activeAuth) {
        this.activeAuth = activeAuth;
    }

    public String getAuthId() {
        return authId;
    }

    public void setAuthId(String authId) {
        this.authId = authId == null ? null : authId.trim();
    }

    public Integer getAuth() {
        return auth;
    }

    public void setAuth(Integer auth) {
        this.auth = auth;
    }

    public String getTimeSetting() {
        return timeSetting;
    }

    public void setTimeSetting(String timeSetting) {
        this.timeSetting = timeSetting == null ? null : timeSetting.trim();
    }

    public String getDescAuth() {
        return descAuth;
    }

    public void setDescAuth(String descAuth) {
        this.descAuth = descAuth == null ? null : descAuth.trim();
    }
}