package com.padad.outside.pojo;

public class MissionStar {
    private String id;

    private Integer missionStar;

    private String descStar;

    private Integer activeStar;

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

    public String getDescStar() {
        return descStar;
    }

    public void setDescStar(String descStar) {
        this.descStar = descStar == null ? null : descStar.trim();
    }

    public Integer getActiveStar() {
        return activeStar;
    }

    public void setActiveStar(Integer activeStar) {
        this.activeStar = activeStar;
    }
}