package com.padad.outside.model;

/**
 * Created by Admin on 16/12/2.
 */
public class TaskSearchModel {

    private String mytaskid;
    private String userid;
    private String missionid;
    private int status;
    int page;
    int row;

    public String getMytaskid() {
        return mytaskid;
    }

    public void setMytaskid(String mytaskid) {
        this.mytaskid = mytaskid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getMissionid() {
        return missionid;
    }

    public void setMissionid(String missionid) {
        this.missionid = missionid;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
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
