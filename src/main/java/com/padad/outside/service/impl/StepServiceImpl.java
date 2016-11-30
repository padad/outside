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


    public UserRecord queryAllStepRecords(int page, int row) throws Exception {
        List list = missionStepsMapper.queryAllStep((page-1)*row,(page*row-1));
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
