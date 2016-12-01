package com.padad.outside.service;

import com.padad.outside.model.UserRecord;
import com.padad.outside.pojo.MissionMytask;
import com.padad.outside.pojo.MissionSteps;

/**
 * Created by Admin on 16/12/1.
 */
public interface MyTaskService {

    //查找所有我的任务分页
    UserRecord queryAllMyTaskRecords(int page, int row)throws Exception;

    //查找我的任务
    UserRecord queryMyTaskByModel(MissionMytask missionMytask) throws  Exception;

    //编辑我的任务
    int updateByModel(MissionMytask missionMytask) throws Exception;



}
