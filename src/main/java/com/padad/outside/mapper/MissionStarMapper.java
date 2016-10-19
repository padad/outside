package com.padad.outside.mapper;

import com.padad.outside.pojo.MissionStar;
import com.padad.outside.pojo.MissionStarExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MissionStarMapper {
    int countByExample(MissionStarExample example);

    int deleteByExample(MissionStarExample example);

    int deleteByPrimaryKey(String id);

    int insert(MissionStar record);

    int insertSelective(MissionStar record);

    List<MissionStar> selectByExample(MissionStarExample example);

    MissionStar selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MissionStar record, @Param("example") MissionStarExample example);

    int updateByExample(@Param("record") MissionStar record, @Param("example") MissionStarExample example);

    int updateByPrimaryKeySelective(MissionStar record);

    int updateByPrimaryKey(MissionStar record);
}