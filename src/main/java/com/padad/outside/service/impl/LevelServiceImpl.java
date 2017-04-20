package com.padad.outside.service.impl;

import com.padad.outside.mapper.MissionLevelMapper;
import com.padad.outside.model.CommonList;
import com.padad.outside.model.LevelSearchModel;
import com.padad.outside.pojo.MissionAuth;
import com.padad.outside.pojo.MissionLevel;
import com.padad.outside.pojo.MissionStar;
import com.padad.outside.service.ILevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Admin on 16/12/9.
 */
@Service
public class LevelServiceImpl implements ILevelService {

    @Autowired
    private MissionLevelMapper missionLevelMapper;

    public CommonList queryRecordByModel(LevelSearchModel levelSearchModel) throws Exception {
        int page = levelSearchModel.getPage();
        int rows = levelSearchModel.getRow();
        levelSearchModel.setPage((page-1)*rows);
        levelSearchModel.setRow(rows);

        int total = initTableRowsByStatus(levelSearchModel.getActiveLevel());
        List<MissionLevel> list = missionLevelMapper.queryRecordByModel(levelSearchModel);


        CommonList cj = new CommonList();
        try
        {
            cj.setRows(list);

            cj.setTotal(total);



        }
        catch (Exception e)
        {
            e.printStackTrace();
        }




        return cj;
    }

    public Map insert(MissionLevel missionLevel) {
        Map<String, Object> result = new HashMap<String, Object>();

        try {
            int flag = missionLevelMapper.insert(missionLevel);

            if (flag > 0) {
                result.put("success", true);
            } else {

                result.put("errorMsg", "添加失败。");

                result.put("failure", true);

            }
        }
        catch (Exception e){
            result.put("errorMsg", e.getMessage());

            result.put("failure", true);
        }

        return result;
    }

    public Map updateByModel(MissionLevel missionLevel) throws Exception {

        int count = missionLevelMapper.updateByPrimaryKeySelective(missionLevel);

        Map<String,Object> result = new HashMap<String, Object>();



        if (count>0)
        {
            result.put("success", true);
        }
        else
        {



            result.put("failure", true);

        }

        return result;
    }

    public int initTableRowsByStatus(int status)
    {

        int sum = 0;
        sum = missionLevelMapper.countBySqlByStatus(status);

        return sum;
    }
}
