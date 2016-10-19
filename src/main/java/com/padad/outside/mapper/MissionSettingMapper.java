package com.padad.outside.mapper;

import com.padad.outside.pojo.MissionSetting;
import com.padad.outside.pojo.MissionSettingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MissionSettingMapper {
    int countByExample(MissionSettingExample example);

    int deleteByExample(MissionSettingExample example);

    int deleteByPrimaryKey(String id);

    int insert(MissionSetting record);

    int insertSelective(MissionSetting record);

    List<MissionSetting> selectByExample(MissionSettingExample example);

    MissionSetting selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MissionSetting record, @Param("example") MissionSettingExample example);

    int updateByExample(@Param("record") MissionSetting record, @Param("example") MissionSettingExample example);

    int updateByPrimaryKeySelective(MissionSetting record);

    int updateByPrimaryKey(MissionSetting record);
}