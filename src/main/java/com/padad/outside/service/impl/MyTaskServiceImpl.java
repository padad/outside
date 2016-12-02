package com.padad.outside.service.impl;

import com.padad.outside.mapper.MissionMytaskMapper;
import com.padad.outside.model.UserRecord;
import com.padad.outside.pojo.MissionMytask;
import com.padad.outside.pojo.MissionTask;
import com.padad.outside.service.MyTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Admin on 16/12/1.
 */
@Service
public class MyTaskServiceImpl implements MyTaskService {

    @Autowired
    private MissionMytaskMapper missionMytaskMapper;

    public UserRecord queryAllMyTaskRecords(int page, int row) throws Exception {
        List list = missionMytaskMapper.queryAllMyTask((page-1)*row,(page*row-1));
        UserRecord<MissionMytask> userRecord = new UserRecord<MissionMytask>();
        userRecord.setUserInfo(list);
        userRecord.setCount(initTableRows());
        return userRecord;
    }

    public UserRecord queryMyTaskByModel(MissionMytask missionMytask) throws Exception {
        return null;
    }

    public int updateByModel(MissionMytask missionMytask) throws Exception {
        return missionMytaskMapper.updateByModel(missionMytask);
    }

    public int initTableRows()
    {

        int sum = 0;
        sum = missionMytaskMapper.countBySql();

        return sum;
    }
}
