package com.padad.outside.mapper;

import com.padad.outside.pojo.MissionAddress;
import com.padad.outside.pojo.MissionBank;

import java.util.List;

/**
 * Created by Admin on 17/1/23.
 */
public interface MissionBankMapper {

    List<MissionAddress> selectInfo(int page, int row);

    int countBySql();

    int countBySqls(String userId);

    int updateInfo(MissionBank missionBank);

    int addInfo(MissionBank missionBank);

    int deleteInfo(String id);

    List<MissionBank> findInfo(String search_value);

}
