package com.padad.outside.mapper;

import com.padad.outside.pojo.MissionChange;
import com.padad.outside.pojo.MissionChangeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MissionChangeMapper {
    int countByExample(MissionChangeExample example);

    int deleteByExample(MissionChangeExample example);

    int deleteByPrimaryKey(String changeId);

    int insert(MissionChange record);

    int insertSelective(MissionChange record);

    List<MissionChange> selectByExampleWithBLOBs(MissionChangeExample example);

    List<MissionChange> selectByExample(MissionChangeExample example);

    MissionChange selectByPrimaryKey(String changeId);

    int updateByExampleSelective(@Param("record") MissionChange record, @Param("example") MissionChangeExample example);

    int updateByExampleWithBLOBs(@Param("record") MissionChange record, @Param("example") MissionChangeExample example);

    int updateByExample(@Param("record") MissionChange record, @Param("example") MissionChangeExample example);

    int updateByPrimaryKeySelective(MissionChange record);

    int updateByPrimaryKeyWithBLOBs(MissionChange record);

    int updateByPrimaryKey(MissionChange record);

    List<MissionChange> selectInfo(int page, int row);

    int countBySqls(int i);
}