package com.padad.outside.mapper;

import com.padad.outside.pojo.MissionNotice;
import com.padad.outside.pojo.MissionNoticeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MissionNoticeMapper {
    int countByExample(MissionNoticeExample example);

    int deleteByExample(MissionNoticeExample example);

    int deleteByPrimaryKey(String noticeId);

    int insert(MissionNotice record);

    int insertSelective(MissionNotice record);

    List<MissionNotice> selectByExampleWithBLOBs(MissionNoticeExample example);

    List<MissionNotice> selectByExample(MissionNoticeExample example);

    MissionNotice selectByPrimaryKey(String noticeId);

    int updateByExampleSelective(@Param("record") MissionNotice record, @Param("example") MissionNoticeExample example);

    int updateByExampleWithBLOBs(@Param("record") MissionNotice record, @Param("example") MissionNoticeExample example);

    int updateByExample(@Param("record") MissionNotice record, @Param("example") MissionNoticeExample example);

    int updateByPrimaryKeySelective(MissionNotice record);

    int updateByPrimaryKeyWithBLOBs(MissionNotice record);

    int updateByPrimaryKey(MissionNotice record);
}