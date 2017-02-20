package com.padad.outside.pojo;

/**
 * Created by Admin on 17/1/23.
 */
public class MissionBank {

    private String bankId;

    private String bankAddress;

    private int bankType;

    private int bankDefault;

    private String userId;

    private String bankName;


    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId;
    }

    public String getBankAddress() {
        return bankAddress;
    }

    public void setBankAddress(String bankAddress) {
        this.bankAddress = bankAddress;
    }

    public int getBankType() {
        return bankType;
    }

    public void setBankType(int bankType) {
        this.bankType = bankType;
    }

    public int getBankDefault() {
        return bankDefault;
    }

    public void setBankDefault(int bankDefault) {
        this.bankDefault = bankDefault;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

}
