package com.padad.outside.service.impl;

import com.padad.outside.mapper.MissionAuthMapper;
import com.padad.outside.mapper.MissionStarMapper;
import com.padad.outside.model.AuthSearchModel;
import com.padad.outside.model.CommonList;
import com.padad.outside.model.StarSearchModel;
import com.padad.outside.pojo.MissionAuth;
import com.padad.outside.pojo.MissionStar;
import com.padad.outside.service.IStarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Admin on 16/12/9.
 */
@Service
public class StarServiceImpl implements IStarService {

    @Autowired
    private MissionStarMapper missionStarMapper;

    public CommonList queryRecordByModel(StarSearchModel starSearchModel) throws Exception {

        int page = starSearchModel.getPage();
        int rows = starSearchModel.getRow();
        starSearchModel.setPage((page-1)*rows);
        starSearchModel.setRow(page*rows-1);

        int total = initTableRowsByStatus(starSearchModel.getActiveStar());
        List<MissionAuth> list = missionStarMapper.queryRecordByModel(starSearchModel);


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

    public Map insert(MissionStar missionAuth) {

        Map<String, Object> result = new HashMap<String, Object>();

        try {
            int flag = missionStarMapper.insert(missionAuth);

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

    public Map updateByModel(MissionStar missionStar) throws Exception {


        int count = missionStarMapper.updateByPrimaryKeySelective(missionStar);

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
        sum = missionStarMapper.countBySqlByStatus(status);

        return sum;
    }

}
