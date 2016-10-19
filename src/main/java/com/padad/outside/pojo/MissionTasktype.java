package com.padad.outside.pojo;

public class MissionTasktype {
    private String id;

    private Integer type;

    private String missionTitle;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getMissionTitle() {
        return missionTitle;
    }

    public void setMissionTitle(String missionTitle) {
        this.missionTitle = missionTitle == null ? null : missionTitle.trim();
    }
}