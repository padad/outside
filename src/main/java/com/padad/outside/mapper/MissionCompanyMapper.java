package com.padad.outside.mapper;

import com.padad.outside.pojo.MissionBank;
import com.padad.outside.pojo.MissionCompany;

import java.util.List;

/**
 * Created by Admin on 17/4/17.
 */
public interface MissionCompanyMapper {

    List<MissionCompany> selectInfo(int page, int row);

    int addInfo(MissionCompany missionCompany);

    int updateInfo(MissionCompany missionCompany);

    MissionCompany queryInfo(String id);

    List<MissionBank> findInfo(String search_value);

    int countBySqls(int search_value);

    int countBySql();

    MissionCompany selectByPrimaryKey(String companyId);
}
