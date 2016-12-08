package com.padad.outside.service;

import com.padad.outside.model.AuthSearchModel;
import com.padad.outside.model.CommonList;
import com.padad.outside.pojo.MissionAuth;
import com.padad.outside.pojo.MissionMytask;

import java.util.Map;

/**
 * Created by Admin on 16/12/7.
 */
public interface IAuthService {

    //查找
    CommonList queryRecordByModel(AuthSearchModel authSearchModel) throws  Exception;

    //增加
    Map insert(MissionAuth missionAuth);

    //禁用权限
    Map updateByModel(MissionAuth missionAuth) throws Exception;

}
