package com.padad.outside.model;

/**
 * Created by Admin on 16/12/7.
 */
public class AuthSearchModel {

    private String authId;
    private int auth;
    private String timeSetting;
    private String descAuth;
    private int activeAuth;
    int page;
    int row;

    public String getAuthId() {
        return authId;
    }

    public void setAuthId(String authId) {
        this.authId = authId;
    }

    public int getAuth() {
        return auth;
    }

    public void setAuth(int auth) {
        this.auth = auth;
    }

    public String getTimeSetting() {
        return timeSetting;
    }

    public void setTimeSetting(String timeSetting) {
        this.timeSetting = timeSetting;
    }

    public String getDescAuth() {
        return descAuth;
    }

    public void setDescAuth(String descAuth) {
        this.descAuth = descAuth;
    }

    public int getActiveAuth() {
        return activeAuth;
    }

    public void setActiveAuth(int activeAuth) {
        this.activeAuth = activeAuth;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }
}
