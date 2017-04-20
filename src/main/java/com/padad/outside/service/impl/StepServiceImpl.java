package com.padad.outside.service.impl;

import com.padad.outside.mapper.MissionStepsMapper;
import com.padad.outside.model.UserRecord;
import com.padad.outside.pojo.MissionSteps;
import com.padad.outside.pojo.MissionTask;
import com.padad.outside.service.StepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Admin on 16/11/30.
 */
@Service
public class StepServiceImpl implements StepService{

    @Autowired
    private MissionStepsMapper missionStepsMapper;

    //https://itunes.apple.com/cn/app/id789758903?mt=8
    //https://itunes.apple.com/us/app/hai-rong-yi/id982486696?l=zh&ls=1&mt=8

    public UserRecord queryAllStepRecords(int page, int row) throws Exception {
        List list = missionStepsMapper.queryAllStep((page-1)*row,row);
        UserRecord<MissionSteps> userRecord = new UserRecord<MissionSteps>();
        userRecord.setUserInfo(list);
        userRecord.setCount(initTableRows());
        return userRecord;
    }

    public UserRecord queryStepByName(String taskName) throws Exception {
        List list = missionStepsMapper.queryStepByName(taskName);
        UserRecord<MissionSteps> userRecord = new UserRecord<MissionSteps>();
        userRecord.setUserInfo(list);
        userRecord.setCount(list.size());
        return userRecord;
    }

    public int insertStep(MissionSteps missionSteps) {
        return missionStepsMapper.insertStep(missionSteps);
    }

    public int updateByPrimaryKey(MissionSteps missionSteps) throws Exception {
        return missionStepsMapper.updateByPrimaryKey(missionSteps);
    }

    public int delStep(String stepid) throws Exception {
        return missionStepsMapper.delStep(stepid);
    }

    public int initTableRows()
    {

        int sum = 0;
        sum = missionStepsMapper.countBySql();

        return sum;
    }
}
