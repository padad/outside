package com.padad.outside.mapper;

import com.padad.outside.pojo.MissionMenu;
import com.padad.outside.pojo.MissionMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MissionMenuMapper {

    List initTreeMenuWithRole(int auth);

    int countByExample(MissionMenuExample example);

    int deleteByExample(MissionMenuExample example);

    int deleteByPrimaryKey(String menuId);

    int insert(MissionMenu record);

    int insertSelective(MissionMenu record);

    List<MissionMenu> selectByExample(MissionMenuExample example);

    MissionMenu selectByPrimaryKey(String menuId);

    int updateByExampleSelective(@Param("record") MissionMenu record, @Param("example") MissionMenuExample example);

    int updateByExample(@Param("record") MissionMenu record, @Param("example") MissionMenuExample example);

    int updateByPrimaryKeySelective(MissionMenu record);

    int updateByPrimaryKey(MissionMenu record);
}