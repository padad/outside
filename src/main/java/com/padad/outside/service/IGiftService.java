package com.padad.outside.service;

import com.padad.outside.model.CommonList;
import com.padad.outside.pojo.MissionGift;

import java.util.Map;

/**
 * Created by Admin on 17/2/17.
 */
public interface IGiftService {

    CommonList selectInfo(int page, int row);

    Map addInfo(MissionGift missionGift);

    Map updateInfo(MissionGift missionGift);

    Map deleteInfo(String id);

    CommonList findInfo(String search_value);
}
