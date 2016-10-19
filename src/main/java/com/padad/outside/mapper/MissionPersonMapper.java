package com.padad.outside.mapper;

import com.padad.outside.pojo.MissionPerson;
import com.padad.outside.pojo.MissionPersonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MissionPersonMapper {
    int countByExample(MissionPersonExample example);

    int deleteByExample(MissionPersonExample example);

    int deleteByPrimaryKey(String priceId);

    int insert(MissionPerson record);

    int insertSelective(MissionPerson record);

    List<MissionPerson> selectByExample(MissionPersonExample example);

    MissionPerson selectByPrimaryKey(String priceId);

    int updateByExampleSelective(@Param("record") MissionPerson record, @Param("example") MissionPersonExample example);

    int updateByExample(@Param("record") MissionPerson record, @Param("example") MissionPersonExample example);

    int updateByPrimaryKeySelective(MissionPerson record);

    int updateByPrimaryKey(MissionPerson record);
}