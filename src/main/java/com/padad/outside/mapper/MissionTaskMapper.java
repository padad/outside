package com.padad.outside.mapper;

import com.padad.outside.pojo.MissionTask;
import com.padad.outside.pojo.MissionTaskExample;
import com.padad.outside.pojo.MissionTaskWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MissionTaskMapper {
    int countByExample(MissionTaskExample example);

    int deleteByExample(MissionTaskExample example);

    int deleteByPrimaryKey(String missionId);

    int insert(MissionTaskWithBLOBs record);

    int insertSelective(MissionTaskWithBLOBs record);

    List<MissionTaskWithBLOBs> selectByExampleWithBLOBs(MissionTaskExample example);

    List<MissionTask> selectByExample(MissionTaskExample example);

    MissionTaskWithBLOBs selectByPrimaryKey(String missionId);

    int updateByExampleSelective(@Param("record") MissionTaskWithBLOBs record, @Param("example") MissionTaskExample example);

    int updateByExampleWithBLOBs(@Param("record") MissionTaskWithBLOBs record, @Param("example") MissionTaskExample example);

    int updateByExample(@Param("record") MissionTask record, @Param("example") MissionTaskExample example);

    int updateByPrimaryKeySelective(MissionTaskWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(MissionTaskWithBLOBs record);

    int updateByPrimaryKey(MissionTask record);
}