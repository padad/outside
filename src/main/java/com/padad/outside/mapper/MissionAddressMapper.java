package com.padad.outside.mapper;

import com.padad.outside.pojo.MissionAddress;

import java.util.List;

/**
 * Created by Admin on 17/1/22.
 */
public interface MissionAddressMapper {

    List<MissionAddress> selectInfo(int page, int row);

    int countBySql();

    int countBySqls(String userId);

    int updateInfo(MissionAddress missionAddress);

    int addInfo(MissionAddress missionAddress);

    int deleteInfo(String id);

    List<MissionAddress> findInfo(String search_value);

    MissionAddress selectByInfo(String toid);
}
