package com.padad.outside.pojo;

public class MissionTaskWithBLOBs extends MissionTask {
    private String pic;

    private String missionStep;

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    public String getMissionStep() {
        return missionStep;
    }

    public void setMissionStep(String missionStep) {
        this.missionStep = missionStep == null ? null : missionStep.trim();
    }
}