package com.padad.outside.mapper;

import com.padad.outside.model.LevelSearchModel;
import com.padad.outside.model.StarSearchModel;
import com.padad.outside.pojo.MissionAuth;
import com.padad.outside.pojo.MissionLevel;
import com.padad.outside.pojo.MissionLevelExample;
import java.util.List;

import com.padad.outside.pojo.MissionStar;
import org.apache.ibatis.annotations.Param;

public interface MissionLevelMapper {
    int countByExample(MissionLevelExample example);

    int deleteByExample(MissionLevelExample example);

    int deleteByPrimaryKey(String id);

    int insert(MissionLevel record);

    int insertSelective(MissionLevel record);

    List<MissionLevel> selectByExample(MissionLevelExample example);

    MissionLevel selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MissionLevel record, @Param("example") MissionLevelExample example);

    int updateByExample(@Param("record") MissionLevel record, @Param("example") MissionLevelExample example);

    int updateByPrimaryKeySelective(MissionLevel record);

    int updateByPrimaryKey(MissionLevel record);

    List<MissionLevel> queryRecordByModel(LevelSearchModel starSearchModel);
    int countBySqlByStatus(int status);
}