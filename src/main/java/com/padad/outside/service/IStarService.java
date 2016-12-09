package com.padad.outside.service;

import com.padad.outside.model.AuthSearchModel;
import com.padad.outside.model.CommonList;
import com.padad.outside.model.StarSearchModel;
import com.padad.outside.pojo.MissionAuth;
import com.padad.outside.pojo.MissionStar;

import java.util.Map;

/**
 * Created by Admin on 16/12/9.
 */
public interface IStarService {


    //查找
    CommonList queryRecordByModel(StarSearchModel authSearchModel) throws  Exception;

    //增加
    Map insert(MissionStar missionStar);

    //禁用权限
    Map updateByModel(MissionStar missionStar) throws Exception;

}
