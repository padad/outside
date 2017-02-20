package com.padad.outside.pojo;

public class MissionGifttype {
    private String id;

    private Integer typeGift;

    private String giftTitle;

    private Integer activeGift;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getTypeGift() {
        return typeGift;
    }

    public void setTypeGift(Integer typeGift) {
        this.typeGift = typeGift;
    }

    public String getGiftTitle() {
        return giftTitle;
    }

    public void setGiftTitle(String giftTitle) {
        this.giftTitle = giftTitle == null ? null : giftTitle.trim();
    }

    public Integer getActiveGift() {
        return activeGift;
    }

    public void setActiveGift(Integer activeGift) {
        this.activeGift = activeGift;
    }
}