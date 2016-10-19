package com.padad.outside.pojo;

public class MissionTask {
    private String missionId;

    private String taskName;

    private Integer type;

    private Integer missionStar;

    private String missionTime;

    private String moneyPrice;

    private Integer active;

    private String missionContent;

    private String taskApi;

    private String movieUrl;

    private String kindTitle;

    public String getMissionId() {
        return missionId;
    }

    public void setMissionId(String missionId) {
        this.missionId = missionId == null ? null : missionId.trim();
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName == null ? null : taskName.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getMissionStar() {
        return missionStar;
    }

    public void setMissionStar(Integer missionStar) {
        this.missionStar = missionStar;
    }

    public String getMissionTime() {
        return missionTime;
    }

    public void setMissionTime(String missionTime) {
        this.missionTime = missionTime == null ? null : missionTime.trim();
    }

    public String getMoneyPrice() {
        return moneyPrice;
    }

    public void setMoneyPrice(String moneyPrice) {
        this.moneyPrice = moneyPrice == null ? null : moneyPrice.trim();
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public String getMissionContent() {
        return missionContent;
    }

    public void setMissionContent(String missionContent) {
        this.missionContent = missionContent == null ? null : missionContent.trim();
    }

    public String getTaskApi() {
        return taskApi;
    }

    public void setTaskApi(String taskApi) {
        this.taskApi = taskApi == null ? null : taskApi.trim();
    }

    public String getMovieUrl() {
        return movieUrl;
    }

    public void setMovieUrl(String movieUrl) {
        this.movieUrl = movieUrl == null ? null : movieUrl.trim();
    }

    public String getKindTitle() {
        return kindTitle;
    }

    public void setKindTitle(String kindTitle) {
        this.kindTitle = kindTitle == null ? null : kindTitle.trim();
    }
}