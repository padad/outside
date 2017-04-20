package com.padad.outside.service.impl;

import com.padad.outside.mapper.MissionAddressMapper;
import com.padad.outside.mapper.MissionBankMapper;
import com.padad.outside.mapper.MissionChangeMapper;
import com.padad.outside.model.CommonList;
import com.padad.outside.pojo.*;
import com.padad.outside.service.IMissionChangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Admin on 17/4/17.
 */
@Service
public class MissionChangeImpl implements IMissionChangeService {

    @Autowired
    private MissionChangeMapper missionChangeMapper;

    @Autowired
    private MissionBankMapper missionBankMapper;

    @Autowired
    private MissionAddressMapper missionAddressMapper;

    public CommonList selectInfo(int page, int row) {
        CommonList commonList = new CommonList();

        try
        {


            List<MissionChange> list = missionChangeMapper.selectInfo((page-1)*row,row);
            if (list!=null && list.size()>0){

                int size = list.size();
                for (int i=0;i<size;i++){

                    MissionChange missionChange = list.get(i);
                    if (missionChange!=null) {
                        String toid = missionChange.getToId();
                        if (!StringUtils.isEmpty(toid)) {
                            if (toid.contains("address")) {
                                MissionAddress missionAddress = missionAddressMapper.selectByInfo(toid);
                                toid = missionAddress.getAddressDetail() + "==" + missionAddress.getAddressName()
                                        + "==" + missionAddress.getAddressPhone() + "==" + missionAddress.getAddressCode();
                            } else {
                                MissionBank missionBank = missionBankMapper.selectByInfo(toid);
                                toid = missionBank.getBankAddress() + "==" + missionBank.getBankName();
                            }

                            missionChange.setToId(toid);
                        }
                    }
                }

            }

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

    public Map updateInfo(MissionChange missionChange) {
        Map result = new HashMap();

        try {
            missionChange.setStatus(1);
            int flag = missionChangeMapper.updateByPrimaryKeySelective(missionChange);

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

    public CommonList findInfo(String search_value) {
        return null;
    }

    public Map deleteInfo(String id) {
        MissionChange missionChange = missionChangeMapper.selectByPrimaryKey(id);
        missionChange.setStatus(1);

        Map result = new HashMap();

        try {

            int flag = missionChangeMapper.updateByPrimaryKeySelective(missionChange);

            if (flag > 0) {
                result.put("success", true);
            } else {

                result.put("errorMsg", "失败。");

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

    public int initTableRows(){
        int sum = 0;
        sum = missionChangeMapper.countBySqls(0);

        return sum;
    }
}
