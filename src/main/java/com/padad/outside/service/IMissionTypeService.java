package com.padad.outside.service;

import com.padad.outside.model.UserRecord;
import com.padad.outside.pojo.MissionTask;
import com.padad.outside.pojo.MissionTasktype;

/**
 * Created by Admin on 16/12/6.
 */
public interface IMissionTypeService {


    //查找所有类型分页
    UserRecord queryAllRecords(int page, int row)throws Exception;

    //查找类型
    UserRecord queryRecordByName(String name) throws  Exception;

    //增加类型
    int insertRecord(MissionTasktype missionTasktype);

    int  deleteByPrimaryKey(String id);

    //编辑类型,逻辑删除
    int updateByPrimaryKey(MissionTasktype missionTasktype) throws Exception;

    int countBySql();

}
