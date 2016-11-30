package com.padad.outside.mapper;

import com.padad.outside.pojo.MissionSteps;
import com.padad.outside.pojo.MissionTask;

import java.util.List;

/**
 * Created by Admin on 16/11/30.
 */
public interface MissionStepsMapper {

    int updateByPrimaryKey(MissionSteps record);

    int insertStep(MissionSteps record);

    List queryAllStep(int page, int row);

    List queryStepByName(String taskName);

    int countBySql();

    int delStep(String stepId);

}
