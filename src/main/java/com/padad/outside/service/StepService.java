package com.padad.outside.service;

import com.padad.outside.model.UserRecord;
import com.padad.outside.pojo.MissionSteps;
import com.padad.outside.pojo.MissionTask;

/**
 * Created by Admin on 16/11/30.
 */
public interface StepService {

    //查找所有步骤分页
    UserRecord queryAllStepRecords(int page, int row)throws Exception;

    //查找步骤
    UserRecord queryStepByName(String taskName) throws  Exception;

    //增加步骤
    int insertStep(MissionSteps missionSteps);

    //编辑步骤,逻辑删除
    int updateByPrimaryKey(MissionSteps missionSteps) throws Exception;


    //删除
    int delStep(String stepid) throws Exception;

}
