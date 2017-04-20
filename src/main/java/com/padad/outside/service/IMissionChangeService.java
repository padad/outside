package com.padad.outside.service;

import com.padad.outside.model.CommonList;
import com.padad.outside.pojo.MissionChange;
import com.padad.outside.pojo.MissionCompany;

import java.util.Map;

/**
 * Created by Admin on 17/4/17.
 */
public interface IMissionChangeService {
    CommonList selectInfo(int page, int row);

    Map updateInfo(MissionChange missionChange);

    CommonList findInfo(String search_value);

    Map deleteInfo(String id);
}
