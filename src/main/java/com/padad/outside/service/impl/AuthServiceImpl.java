package com.padad.outside.service.impl;

import com.padad.outside.mapper.MissionAuthMapper;
import com.padad.outside.model.AuthSearchModel;
import com.padad.outside.model.CommonList;
import com.padad.outside.model.UserRecord;
import com.padad.outside.pojo.MissionAuth;
import com.padad.outside.pojo.MissionMytask;
import com.padad.outside.pojo.MissionUserinfo;
import com.padad.outside.service.IAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Admin on 16/12/7.
 */
@Service
public class AuthServiceImpl implements IAuthService {

    @Autowired
    private MissionAuthMapper missionAuthMapper;

    public CommonList queryRecordByModel(AuthSearchModel authSearchModel) throws Exception {

        int page = authSearchModel.getPage();
        int rows = authSearchModel.getRow();
        authSearchModel.setPage((page-1)*rows);
        authSearchModel.setRow(page*rows-1);

        int total = initTableRowsByStatus(authSearchModel.getActiveAuth());
        List<MissionAuth> list = missionAuthMapper.queryRecordByModel(authSearchModel);


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

    public Map insert(MissionAuth missionAuth) {

        Map<String, Object> result = new HashMap<String, Object>();
        int flag = missionAuthMapper.insert(missionAuth);

        if (flag>0)
        {
            result.put("success", true);
        }
        else
        {

            result.put("errorMsg", "添加失败。");

            result.put("failure", true);

        }

        return result;
    }

    public Map updateByModel(MissionAuth missionAuth) throws Exception {


        int count = missionAuthMapper.updateByPrimaryKeySelective(missionAuth);

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
        sum = missionAuthMapper.countBySqlByStatus(status);

        return sum;
    }
}
