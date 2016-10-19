package com.padad.outside.pojo;

public class MissionStar {
    private String id;

    private Integer missionStar;

    private String desc;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getMissionStar() {
        return missionStar;
    }

    public void setMissionStar(Integer missionStar) {
        this.missionStar = missionStar;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }
}