package com.padad.outside.service.impl;

import com.padad.outside.mapper.MissionSettingMapper;
import com.padad.outside.model.CommonList;
import com.padad.outside.model.SettingSearchModel;
import com.padad.outside.pojo.MissionLevel;
import com.padad.outside.pojo.MissionSetting;
import com.padad.outside.service.IAppSetting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Admin on 16/12/12.
 */
@Service
public class AppSettingImpl implements IAppSetting {

    @Autowired
    private MissionSettingMapper missionSettingMapper;

    public CommonList queryRecordByModel(SettingSearchModel settingSearchModel) throws Exception {
        int page = settingSearchModel.getPage();
        int rows = settingSearchModel.getRow();
        settingSearchModel.setPage((page-1)*rows);
        settingSearchModel.setRow(page*rows);

        int total = initTableRowsByStatus(1);
        List<MissionSetting> list = missionSettingMapper.queryRecordByModel(settingSearchModel);


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

    public Map insert(MissionSetting missionSetting) {

        Map result = new HashMap();

        try {
            int flag = missionSettingMapper.insert(missionSetting);

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

    public Map updateByModel(MissionSetting missionSetting) {

        Map result = new HashMap();

        try {
            int flag = missionSettingMapper.updateByPrimaryKeySelective(missionSetting);

            if (flag > 0) {
                result.put("success", true);
            } else {

                result.put("errorMsg", "修改失败。");

                result.put("failure", true);

            }
        }
        catch (Exception e){
            result.put("errorMsg", e.getMessage());

            result.put("failure", true);
        }

        return result;


    }

    public int initTableRowsByStatus(int status)
    {

        int sum = 0;
        sum = missionSettingMapper.countBySqlByStatus(status);

        return sum;
    }
}
