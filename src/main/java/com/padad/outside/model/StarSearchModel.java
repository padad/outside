package com.padad.outside.model;

/**
 * Created by Admin on 16/12/9.
 */
public class StarSearchModel {

    private String id;

    private Integer missionStar;

    private String descStar;

    private Integer activeStar;

    private int row;

    private int page;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
        this.descStar = descStar;
    }

    public Integer getActiveStar() {
        return activeStar;
    }

    public void setActiveStar(Integer activeStar) {
        this.activeStar = activeStar;
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
