package com.padad.outside.service;

import com.padad.outside.model.CommonList;
import com.padad.outside.pojo.MissionAddress;
import com.padad.outside.pojo.MissionBank;

import java.util.Map;

/**
 * Created by Admin on 17/1/23.
 */
public interface IMissionBankService {

    CommonList selectInfo(int page, int row);

    Map updateInfo(MissionBank missionBank);

    Map addInfo(MissionBank missionBank);

    Map deleteInfo(String id);

    CommonList findInfo(String search_value);

}
