package com.padad.outside.mapper;

import com.padad.outside.pojo.AcceleDetail;
import com.padad.outside.pojo.AcceleDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AcceleDetailMapper {
    int countByExample(AcceleDetailExample example);

    int deleteByExample(AcceleDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AcceleDetail record);

    int insertSelective(AcceleDetail record);

    List<AcceleDetail> selectByExample(AcceleDetailExample example);

    AcceleDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AcceleDetail record, @Param("example") AcceleDetailExample example);

    int updateByExample(@Param("record") AcceleDetail record, @Param("example") AcceleDetailExample example);

    int updateByPrimaryKeySelective(AcceleDetail record);

    int updateByPrimaryKey(AcceleDetail record);
}