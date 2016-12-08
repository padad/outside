package com.padad.outside.mapper;

import com.padad.outside.model.AuthSearchModel;
import com.padad.outside.pojo.MissionAuth;
import com.padad.outside.pojo.MissionAuthExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MissionAuthMapper {
    int countByExample(MissionAuthExample example);

    int deleteByExample(MissionAuthExample example);

    int deleteByPrimaryKey(String authId);

    int insert(MissionAuth record);

    int insertSelective(MissionAuth record);

    List<MissionAuth> selectByExample(MissionAuthExample example);

    MissionAuth selectByPrimaryKey(String authId);

    int updateByExampleSelective(@Param("record") MissionAuth record, @Param("example") MissionAuthExample example);

    int updateByExample(@Param("record") MissionAuth record, @Param("example") MissionAuthExample example);

    int updateByPrimaryKeySelective(MissionAuth record);

    int updateByPrimaryKey(MissionAuth record);


    List<MissionAuth> queryRecordByModel(AuthSearchModel authSearchModel);
    int countBySqlByStatus(int status);
}