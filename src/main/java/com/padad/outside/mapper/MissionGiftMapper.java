package com.padad.outside.mapper;

import com.padad.outside.pojo.MissionGift;
import com.padad.outside.pojo.MissionGiftExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MissionGiftMapper {
    int countByExample(MissionGiftExample example);

    int deleteByExample(MissionGiftExample example);

    int deleteByPrimaryKey(String giftId);

    int insert(MissionGift record);

    int insertSelective(MissionGift record);

    List<MissionGift> selectByExampleWithBLOBs(MissionGiftExample example);

    List<MissionGift> selectByExample(MissionGiftExample example);

    MissionGift selectByPrimaryKey(String giftId);

    int updateByExampleSelective(@Param("record") MissionGift record, @Param("example") MissionGiftExample example);

    int updateByExampleWithBLOBs(@Param("record") MissionGift record, @Param("example") MissionGiftExample example);

    int updateByExample(@Param("record") MissionGift record, @Param("example") MissionGiftExample example);

    int updateByPrimaryKeySelective(MissionGift record);

    int updateByPrimaryKeyWithBLOBs(MissionGift record);

    int updateByPrimaryKey(MissionGift record);

    List<MissionGift> selectInfo(int page, int row);
}