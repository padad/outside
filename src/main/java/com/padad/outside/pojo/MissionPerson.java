package com.padad.outside.pojo;

public class MissionPerson {
    private String priceId;

    private String priceValue;

    public String getPriceId() {
        return priceId;
    }

    public void setPriceId(String priceId) {
        this.priceId = priceId == null ? null : priceId.trim();
    }

    public String getPriceValue() {
        return priceValue;
    }

    public void setPriceValue(String priceValue) {
        this.priceValue = priceValue == null ? null : priceValue.trim();
    }
}