package com.padad.outside.service;

import com.padad.outside.model.CommonList;
import com.padad.outside.pojo.MissionAddress;

import java.util.Map;

/**
 * Created by Admin on 17/1/22.
 */
public interface IMissionAddressService {

    CommonList selectInfo(int page,int row);

    Map updateInfo(MissionAddress missionAddress);

    Map addInfo(MissionAddress missionAddress);

    Map deleteInfo(String id);

    CommonList findInfo(String search_value);

}
