package com.padad.outside.service;

import com.padad.outside.model.CommonList;
import com.padad.outside.pojo.MissionBank;
import com.padad.outside.pojo.MissionCompany;

import java.util.Map;

/**
 * Created by Admin on 17/4/17.
 */
public interface IMissionCompanyService {

    CommonList selectInfo(int page,int row);

    Map addInfo(MissionCompany missionCompany);

    Map updateInfo(MissionCompany missionBank);

    CommonList findInfo(String search_value);

    Map deleteInfo(String id);
}
