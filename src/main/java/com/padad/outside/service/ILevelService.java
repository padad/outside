package com.padad.outside.service;

import com.padad.outside.model.CommonList;
import com.padad.outside.model.LevelSearchModel;
import com.padad.outside.model.StarSearchModel;
import com.padad.outside.pojo.MissionLevel;
import com.padad.outside.pojo.MissionStar;

import java.util.Map;

/**
 * Created by Admin on 16/12/9.
 */
public interface ILevelService {

    //查找
    CommonList queryRecordByModel(LevelSearchModel levelSearchModel) throws  Exception;

    //增加
    Map insert(MissionLevel missionLevel);

    //禁用 逻辑删除
    Map updateByModel(MissionLevel MissionLevel) throws Exception;

}
