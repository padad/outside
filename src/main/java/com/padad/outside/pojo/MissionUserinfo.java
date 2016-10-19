package com.padad.outside.pojo;

public class MissionUserinfo {
    private String userId;

    private String username;

    private String password;

    private String avatar;

    private String nick;

    private String phone;

    private String registerTime;

    private String lastTime;

    private Integer level;

    private Integer auth;

    private String price;

    private String experience;

    private String deviceid;

    private String machine;

    private Integer continueTime;

    private Integer status;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick == null ? null : nick.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(String registerTime) {
        this.registerTime = registerTime == null ? null : registerTime.trim();
    }

    public String getLastTime() {
        return lastTime;
    }

    public void setLastTime(String lastTime) {
        this.lastTime = lastTime == null ? null : lastTime.trim();
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getAuth() {
        return auth;
    }

    public void setAuth(Integer auth) {
        this.auth = auth;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience == null ? null : experience.trim();
    }

    public String getDeviceid() {
        return deviceid;
    }

    public void setDeviceid(String deviceid) {
        this.deviceid = deviceid == null ? null : deviceid.trim();
    }

    public String getMachine() {
        return machine;
    }

    public void setMachine(String machine) {
        this.machine = machine == null ? null : machine.trim();
    }

    public Integer getContinueTime() {
        return continueTime;
    }

    public void setContinueTime(Integer continueTime) {
        this.continueTime = continueTime;
    }

//    public String getRegister_time() {
//        return register_time;
//    }
//
//    public void setRegister_time(String register_time) {
//        this.register_time = register_time;
//    }
//
//    public String getLast_time() {
//        return last_time;
//    }
//
//    public void setLast_time(String last_time) {
//        this.last_time = last_time;
//    }
//
//    public Integer getContinue_time() {
//        return continue_time;
//    }
//
//    public void setContinue_time(Integer continue_time) {
//        this.continue_time = continue_time;
//    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}