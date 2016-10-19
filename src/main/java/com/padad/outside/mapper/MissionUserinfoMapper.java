package com.padad.outside.mapper;

import com.padad.outside.pojo.MissionUserinfo;
import com.padad.outside.pojo.MissionUserinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MissionUserinfoMapper {

    MissionUserinfo login(String username,String password);

    int queryByName(String username);

    int countByExample(MissionUserinfoExample example);

    int deleteByExample(MissionUserinfoExample example);

    int deleteByPrimaryKey(String userId);

    int insert(MissionUserinfo record);

    int insertSelective(MissionUserinfo record);

    List queryAllUser(int page,int row);

    List<MissionUserinfo> selectByExample(MissionUserinfoExample example);

    MissionUserinfo selectByPrimaryKey(String userId);

    int updateByExampleSelective(@Param("record") MissionUserinfo record, @Param("example") MissionUserinfoExample example);

    int updateByExample(@Param("record") MissionUserinfo record, @Param("example") MissionUserinfoExample example);

    int updateByPrimaryKeySelective(MissionUserinfo record);

    int updateByPrimaryKey(MissionUserinfo record);

    int countBySql();
}