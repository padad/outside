package com.padad.outside.mapper;

import com.padad.outside.pojo.MissionTasktype;
import com.padad.outside.pojo.MissionTasktypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MissionTasktypeMapper {
    int countByExample(MissionTasktypeExample example);

    int deleteByExample(MissionTasktypeExample example);

    int deleteByPrimaryKey(String id);

    int insert(MissionTasktype record);

    int insertSelective(MissionTasktype record);

    List<MissionTasktype> selectByExample(MissionTasktypeExample example);

    MissionTasktype selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MissionTasktype record, @Param("example") MissionTasktypeExample example);

    int updateByExample(@Param("record") MissionTasktype record, @Param("example") MissionTasktypeExample example);

    int updateByPrimaryKeySelective(MissionTasktype record);

    int updateByPrimaryKey(MissionTasktype record);
}