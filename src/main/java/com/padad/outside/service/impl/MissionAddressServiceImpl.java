package com.padad.outside.service.impl;

import com.padad.outside.framework.Util;
import com.padad.outside.mapper.MissionAddressMapper;
import com.padad.outside.model.CommonList;
import com.padad.outside.model.UserRecord;
import com.padad.outside.pojo.MissionAddress;
import com.padad.outside.pojo.MissionTask;
import com.padad.outside.service.IMissionAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Admin on 17/1/22.
 */
@Service
public class MissionAddressServiceImpl implements IMissionAddressService {

    @Autowired
    private MissionAddressMapper missionAddressMapper;

    public CommonList selectInfo(int page,int row) {

        CommonList commonList = new CommonList();

        try
        {
            List<MissionAddress> list = missionAddressMapper.selectInfo((page-1)*row,(page*row-1));

            commonList.setRows(list);
            commonList.setTotal(initTableRows());

        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            return commonList;
        }

    }

    public Map updateInfo(MissionAddress missionAddress) {

        Map result = new HashMap();

        try {

            int flag = missionAddressMapper.updateInfo(missionAddress);

            if (flag > 0) {
                result.put("success", true);
            } else {

                result.put("errorMsg", "修改失败。");

                result.put("failure", true);

            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            return result;
        }
    }

    public Map addInfo(MissionAddress missionAddress) {
        Map result = new HashMap();

        try {
            missionAddress.setAddressId("address" + Util.initRandomId());
            int flag = missionAddressMapper.addInfo(missionAddress);

            if (flag > 0) {
                result.put("success", true);
            } else {

                result.put("errorMsg", "添加失败。");

                result.put("failure", true);

            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            return result;
        }
    }

    public Map deleteInfo(String id) {
        Map result = new HashMap();

        try {

            int flag = missionAddressMapper.deleteInfo(id);

            if (flag > 0) {
                result.put("success", true);
            } else {

                result.put("errorMsg", "删除失败。");

                result.put("failure", true);

            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            return result;
        }
    }

    public CommonList findInfo(String search_value) {
        CommonList commonList = new CommonList();

        try
        {
            List<MissionAddress> list = missionAddressMapper.findInfo(search_value);

            commonList.setRows(list);
            commonList.setTotal(missionAddressMapper.countBySqls(search_value));

        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            return commonList;
        }
    }

    public int initTableRows(){
        int sum = 0;
        sum = missionAddressMapper.countBySql();

        return sum;
    }

}
