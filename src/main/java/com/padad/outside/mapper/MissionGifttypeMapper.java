package com.padad.outside.mapper;

import com.padad.outside.pojo.MissionGifttype;
import com.padad.outside.pojo.MissionGifttypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MissionGifttypeMapper {
    int countByExample(MissionGifttypeExample example);

    int deleteByExample(MissionGifttypeExample example);

    int deleteByPrimaryKey(String id);

    int insert(MissionGifttype record);

    int insertSelective(MissionGifttype record);

    List<MissionGifttype> selectByExample(MissionGifttypeExample example);

    MissionGifttype selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MissionGifttype record, @Param("example") MissionGifttypeExample example);

    int updateByExample(@Param("record") MissionGifttype record, @Param("example") MissionGifttypeExample example);

    int updateByPrimaryKeySelective(MissionGifttype record);

    int updateByPrimaryKey(MissionGifttype record);
}