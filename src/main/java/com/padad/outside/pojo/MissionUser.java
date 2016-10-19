package com.padad.outside.pojo;

public class MissionUser {
    private String id;

    private String mytaobao;

    private String myphone;

    private String myaddress;

    private String userId;

    private String mymoney;

    private String mylevel;

    private String myexperience;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getMytaobao() {
        return mytaobao;
    }

    public void setMytaobao(String mytaobao) {
        this.mytaobao = mytaobao == null ? null : mytaobao.trim();
    }

    public String getMyphone() {
        return myphone;
    }

    public void setMyphone(String myphone) {
        this.myphone = myphone == null ? null : myphone.trim();
    }

    public String getMyaddress() {
        return myaddress;
    }

    public void setMyaddress(String myaddress) {
        this.myaddress = myaddress == null ? null : myaddress.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getMymoney() {
        return mymoney;
    }

    public void setMymoney(String mymoney) {
        this.mymoney = mymoney == null ? null : mymoney.trim();
    }

    public String getMylevel() {
        return mylevel;
    }

    public void setMylevel(String mylevel) {
        this.mylevel = mylevel == null ? null : mylevel.trim();
    }

    public String getMyexperience() {
        return myexperience;
    }

    public void setMyexperience(String myexperience) {
        this.myexperience = myexperience == null ? null : myexperience.trim();
    }
}