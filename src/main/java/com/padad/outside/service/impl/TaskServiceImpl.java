package com.padad.outside.service.impl;

import com.padad.outside.mapper.MissionTaskMapper;
import com.padad.outside.model.UserRecord;
import com.padad.outside.pojo.MissionTask;
import com.padad.outside.pojo.MissionTaskWithBLOBs;
import com.padad.outside.pojo.MissionUserinfo;
import com.padad.outside.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Admin on 16/11/29.
 */
@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private MissionTaskMapper missionTaskMapper;

    public UserRecord queryAllTaskRecords(int page, int row) throws Exception {
        List list = missionTaskMapper.queryAllTask((page-1)*row,(page*row-1));
        UserRecord<MissionTask> userRecord = new UserRecord<MissionTask>();
        userRecord.setUserInfo(list);
        userRecord.setCount(initTableRows());
        return userRecord;
    }

    public UserRecord queryTaskByName(String taskName) throws Exception {


        List list = missionTaskMapper.queryTaskByName(taskName);
        UserRecord<MissionTask> userRecord = new UserRecord<MissionTask>();
        userRecord.setUserInfo(list);
        userRecord.setCount(list.size());
        return userRecord;

    }

    public int insertTask(MissionTask missionTask) {

        return missionTaskMapper.insertTask(missionTask);
    }

    public int updateByPrimaryKey(MissionTask missionTask) throws Exception {
        return missionTaskMapper.updateByPrimaryKey(missionTask);
    }

    public UserRecord queryAllTaskRecordsByActive() throws Exception {
        List list = missionTaskMapper.queryTaskByActive(1);
        UserRecord<MissionTask> userRecord = new UserRecord<MissionTask>();
        userRecord.setUserInfo(list);
        userRecord.setCount(list.size());
        return userRecord;
    }

    public int initTableRows()
    {

        int sum = 0;
        sum = missionTaskMapper.countBySql();

        return sum;
    }
}
