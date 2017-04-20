package com.padad.outside.pojo;

public class MissionChange {
    private String changeId;

    private String giftTitle;

    private String giftPrice;

    private String changeTime;

    private String userId;

    private Integer numberChange;

    private Integer status;

    private String toId;

    private String descGift;

    public String getChangeId() {
        return changeId;
    }

    public void setChangeId(String changeId) {
        this.changeId = changeId == null ? null : changeId.trim();
    }

    public String getGiftTitle() {
        return giftTitle;
    }

    public void setGiftTitle(String giftTitle) {
        this.giftTitle = giftTitle == null ? null : giftTitle.trim();
    }

    public String getGiftPrice() {
        return giftPrice;
    }

    public void setGiftPrice(String giftPrice) {
        this.giftPrice = giftPrice == null ? null : giftPrice.trim();
    }

    public String getChangeTime() {
        return changeTime;
    }

    public void setChangeTime(String changeTime) {
        this.changeTime = changeTime == null ? null : changeTime.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Integer getNumberChange() {
        return numberChange;
    }

    public void setNumberChange(Integer numberChange) {
        this.numberChange = numberChange;
    }

    public String getDescGift() {
        return descGift;
    }

    public void setDescGift(String descGift) {
        this.descGift = descGift;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getToId() {
        return toId;
    }

    public void setToId(String toId) {
        this.toId = toId;
    }
}