package com.padad.outside.mapper;

import com.padad.outside.pojo.MissionUser;
import com.padad.outside.pojo.MissionUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MissionUserMapper {
    int countByExample(MissionUserExample example);

    int deleteByExample(MissionUserExample example);

    int deleteByPrimaryKey(String id);

    int insert(MissionUser record);

    int insertSelective(MissionUser record);

    List<MissionUser> selectByExample(MissionUserExample example);

    MissionUser selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MissionUser record, @Param("example") MissionUserExample example);

    int updateByExample(@Param("record") MissionUser record, @Param("example") MissionUserExample example);

    int updateByPrimaryKeySelective(MissionUser record);

    int updateByPrimaryKey(MissionUser record);
}