package com.padad.outside.mapper;

import com.padad.outside.pojo.MissionMytask;
import com.padad.outside.pojo.MissionMytaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MissionMytaskMapper {
    int countByExample(MissionMytaskExample example);

    int deleteByExample(MissionMytaskExample example);

    int deleteByPrimaryKey(String taskId);

    int insert(MissionMytask record);

    int insertSelective(MissionMytask record);

    List<MissionMytask> selectByExampleWithBLOBs(MissionMytaskExample example);

    List<MissionMytask> selectByExample(MissionMytaskExample example);

    MissionMytask selectByPrimaryKey(String taskId);

    int updateByExampleSelective(@Param("record") MissionMytask record, @Param("example") MissionMytaskExample example);

    int updateByExampleWithBLOBs(@Param("record") MissionMytask record, @Param("example") MissionMytaskExample example);

    int updateByExample(@Param("record") MissionMytask record, @Param("example") MissionMytaskExample example);

    int updateByPrimaryKeySelective(MissionMytask record);

    int updateByPrimaryKeyWithBLOBs(MissionMytask record);

    int updateByPrimaryKey(MissionMytask record);

    List queryAllMyTask(int page,int row);

    int countBySql();
}