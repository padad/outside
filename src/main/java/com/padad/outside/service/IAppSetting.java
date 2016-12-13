package com.padad.outside.service;

import com.padad.outside.model.CommonList;
import com.padad.outside.model.LevelSearchModel;
import com.padad.outside.model.SettingSearchModel;
import com.padad.outside.pojo.MissionLevel;
import com.padad.outside.pojo.MissionSetting;

import java.util.Map;

/**
 * Created by Admin on 16/12/12.
 */
public interface IAppSetting  {

    //查找
    CommonList queryRecordByModel(SettingSearchModel settingSearchModel) throws  Exception;

    //增加
    Map insert(MissionSetting missionSetting);

    //禁用 逻辑删除
    Map updateByModel(MissionSetting missionSetting) throws Exception;

}
