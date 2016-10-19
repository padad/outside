package com.padad.outside.pojo;

public class MissionMytask {
    private String taskId;

    private String userId;

    private String missionId;

    private Integer status;

    private String moneyPrice;

    private Integer type;

    private Integer missionStar;

    private String missionTime;

    private String movieUrl;

    private String missionContent;

    private String kindTitle;

    private Integer dole;

    private String missionStep;

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId == null ? null : taskId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getMissionId() {
        return missionId;
    }

    public void setMissionId(String missionId) {
        this.missionId = missionId == null ? null : missionId.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMoneyPrice() {
        return moneyPrice;
    }

    public void setMoneyPrice(String moneyPrice) {
        this.moneyPrice = moneyPrice == null ? null : moneyPrice.trim();
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

    public String getMovieUrl() {
        return movieUrl;
    }

    public void setMovieUrl(String movieUrl) {
        this.movieUrl = movieUrl == null ? null : movieUrl.trim();
    }

    public String getMissionContent() {
        return missionContent;
    }

    public void setMissionContent(String missionContent) {
        this.missionContent = missionContent == null ? null : missionContent.trim();
    }

    public String getKindTitle() {
        return kindTitle;
    }

    public void setKindTitle(String kindTitle) {
        this.kindTitle = kindTitle == null ? null : kindTitle.trim();
    }

    public Integer getDole() {
        return dole;
    }

    public void setDole(Integer dole) {
        this.dole = dole;
    }

    public String getMissionStep() {
        return missionStep;
    }

    public void setMissionStep(String missionStep) {
        this.missionStep = missionStep == null ? null : missionStep.trim();
    }
}