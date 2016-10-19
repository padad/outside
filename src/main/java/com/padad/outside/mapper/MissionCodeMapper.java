package com.padad.outside.mapper;

import com.padad.outside.pojo.MissionCode;
import com.padad.outside.pojo.MissionCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MissionCodeMapper {
    int countByExample(MissionCodeExample example);

    int deleteByExample(MissionCodeExample example);

    int deleteByPrimaryKey(String codeId);

    int insert(MissionCode record);

    int insertSelective(MissionCode record);

    List<MissionCode> selectByExample(MissionCodeExample example);

    MissionCode selectByPrimaryKey(String codeId);

    int updateByExampleSelective(@Param("record") MissionCode record, @Param("example") MissionCodeExample example);

    int updateByExample(@Param("record") MissionCode record, @Param("example") MissionCodeExample example);

    int updateByPrimaryKeySelective(MissionCode record);

    int updateByPrimaryKey(MissionCode record);
}