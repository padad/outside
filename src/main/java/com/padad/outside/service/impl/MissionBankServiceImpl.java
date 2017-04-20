package com.padad.outside.service.impl;

import com.padad.outside.framework.Util;
import com.padad.outside.mapper.MissionAddressMapper;
import com.padad.outside.mapper.MissionBankMapper;
import com.padad.outside.model.CommonList;
import com.padad.outside.pojo.MissionAddress;
import com.padad.outside.pojo.MissionBank;
import com.padad.outside.service.IMissionBankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Admin on 17/1/23.
 */
@Service
public class MissionBankServiceImpl implements IMissionBankService {

    @Autowired
    private MissionBankMapper missionBankMapper;

    public CommonList selectInfo(int page,int row) {

        CommonList commonList = new CommonList();

        try
        {
            List<MissionAddress> list = missionBankMapper.selectInfo((page-1)*row,row);

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

    public Map updateInfo(MissionBank missionBank) {

        Map result = new HashMap();

        try {
            int bankflag = missionBank.getBankType();
            if (bankflag==1){
                missionBank.setBankName("支付宝");
            }
            else if (bankflag==2){
                missionBank.setBankName("微信");
            }
            else {
                missionBank.setBankName("银行卡");
            }
            int flag = missionBankMapper.updateInfo(missionBank);

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

    public Map addInfo(MissionBank missionBank) {
        Map result = new HashMap();

        try {
            missionBank.setBankId("bank" + Util.initRandomId());
            int bankflag = missionBank.getBankType();
            if (bankflag==1){
                missionBank.setBankName("支付宝");
            }
            else if (bankflag==2){
                missionBank.setBankName("微信");
            }
            else {
                missionBank.setBankName("银行卡");
            }
            int flag = missionBankMapper.addInfo(missionBank);

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

            int flag = missionBankMapper.deleteInfo(id);

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
            List<MissionBank> list = missionBankMapper.findInfo(search_value);

            commonList.setRows(list);
            commonList.setTotal(missionBankMapper.countBySqls(search_value));

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
        sum = missionBankMapper.countBySql();

        return sum;
    }
}
