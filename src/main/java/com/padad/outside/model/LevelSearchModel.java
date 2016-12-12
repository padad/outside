package com.padad.outside.model;

/**
 * Created by Admin on 16/12/9.
 */
public class LevelSearchModel {

    private String id;

    private Integer levelNum;

    private String experience;

    private Integer activeLevel;

    private int row;

    private int page;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getLevelNum() {
        return levelNum;
    }

    public void setLevelNum(Integer level) {
        this.levelNum = levelNum;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public Integer getActiveLevel() {
        return activeLevel;
    }

    public void setActiveLevel(Integer activeLevel) {
        this.activeLevel = activeLevel;
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
