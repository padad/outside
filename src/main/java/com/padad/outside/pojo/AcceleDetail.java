package com.padad.outside.pojo;

public class AcceleDetail {
    private Integer id;

    private Integer uid;

    private String acceleratorname;

    private Double accelerationrate;

    private Integer duration;

    private String date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getAcceleratorname() {
        return acceleratorname;
    }

    public void setAcceleratorname(String acceleratorname) {
        this.acceleratorname = acceleratorname == null ? null : acceleratorname.trim();
    }

    public Double getAccelerationrate() {
        return accelerationrate;
    }

    public void setAccelerationrate(Double accelerationrate) {
        this.accelerationrate = accelerationrate;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date == null ? null : date.trim();
    }
}