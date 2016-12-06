package com.padad.outside.service.impl;

import com.padad.outside.mapper.MissionTasktypeMapper;
import com.padad.outside.model.UserRecord;
import com.padad.outside.pojo.MissionTask;
import com.padad.outside.pojo.MissionTasktype;
import com.padad.outside.service.IMissionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Admin on 16/12/6.
 */
@Service
public class MissionTypeImpl implements IMissionTypeService {

    @Autowired
    private MissionTasktypeMapper missionTasktypeMapper;

    public UserRecord queryAllRecords(int page, int row) throws Exception {
        List list = missionTasktypeMapper.queryAllRecords((page-1)*row,(page*row-1));
        UserRecord<MissionTasktype> userRecord = new UserRecord<MissionTasktype>();
        userRecord.setUserInfo(list);
        userRecord.setCount(initTableRows());
        return userRecord;
    }

    public UserRecord queryRecordByName(String name) throws Exception {
        List list = missionTasktypeMapper.queryRecordByName(name);
        UserRecord<MissionTask> userRecord = new UserRecord<MissionTask>();
        userRecord.setUserInfo(list);
        userRecord.setCount(list.size());
        return userRecord;
    }

    public int insertRecord(MissionTasktype missionTasktype) {
        return missionTasktypeMapper.insert(missionTasktype);
    }

    public int deleteByPrimaryKey(String id) {
        return missionTasktypeMapper.deleteByPrimaryKey(id);
    }

    public int updateByPrimaryKey(MissionTasktype missionTasktype) throws Exception {
        return missionTasktypeMapper.updateByPrimaryKey(missionTasktype);
    }

    public int countBySql() {
        return missionTasktypeMapper.countBySql();
    }

    public int initTableRows()
    {

        int sum = 0;
        sum = missionTasktypeMapper.countBySql();

        return sum;
    }
}
