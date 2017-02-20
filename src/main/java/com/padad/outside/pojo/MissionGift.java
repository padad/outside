package com.padad.outside.pojo;

public class MissionGift {
    private String giftId;

    private String giftTitle;

    private String giftPrice;

    private Integer type;

    private Integer quantity;

    private Integer active;

    private String descGift;

    public String getGiftId() {
        return giftId;
    }

    public void setGiftId(String giftId) {
        this.giftId = giftId == null ? null : giftId.trim();
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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public String getDescGift() {
        return descGift;
    }

    public void setDescGift(String descGift) {
        this.descGift = descGift == null ? null : descGift.trim();
    }
}