package com.padad.outside.mapper;

import com.padad.outside.pojo.TreeMenu;
import com.padad.outside.pojo.TreeMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TreeMenuMapper {
    int countByExample(TreeMenuExample example);

    int deleteByExample(TreeMenuExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TreeMenu record);

    int insertSelective(TreeMenu record);

    List<TreeMenu> selectByExample(TreeMenuExample example);

    TreeMenu selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TreeMenu record, @Param("example") TreeMenuExample example);

    int updateByExample(@Param("record") TreeMenu record, @Param("example") TreeMenuExample example);

    int updateByPrimaryKeySelective(TreeMenu record);

    int updateByPrimaryKey(TreeMenu record);
}