package com.padad.outside.pojo;

public class MissionGifttype {
    private String id;

    private Integer type;

    private String giftTitle;

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

    public String getGiftTitle() {
        return giftTitle;
    }

    public void setGiftTitle(String giftTitle) {
        this.giftTitle = giftTitle == null ? null : giftTitle.trim();
    }
}