package com.padad.outside.service;

import com.padad.outside.model.UserRecord;
import com.padad.outside.pojo.MissionTask;
import com.padad.outside.pojo.MissionUserinfo;

/**
 * Created by Admin on 16/11/29.
 */
public interface TaskService {

    //查找所有任务分页
    UserRecord queryAllTaskRecords(int page, int row)throws Exception;

    //查找任务
    UserRecord queryTaskByName(String taskName) throws  Exception;

    //增加任务
    int insertTask(MissionTask missionTask);

    //编辑用户,逻辑删除
    int updateByPrimaryKey(MissionTask missionTask) throws Exception;


    //查找所有激活任务
    UserRecord queryAllTaskRecordsByActive()throws Exception;

}
