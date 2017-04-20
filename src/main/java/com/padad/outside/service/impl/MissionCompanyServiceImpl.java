package com.padad.outside.service.impl;

import com.padad.outside.framework.Util;
import com.padad.outside.mapper.MissionCompanyMapper;
import com.padad.outside.mapper.MissionUserinfoMapper;
import com.padad.outside.model.CommonList;
import com.padad.outside.pojo.MissionAddress;
import com.padad.outside.pojo.MissionBank;
import com.padad.outside.pojo.MissionCompany;
import com.padad.outside.pojo.MissionUserinfo;
import com.padad.outside.service.IMissionCompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.*;

/**
 * Created by Admin on 17/4/17.
 */
@Service
public class MissionCompanyServiceImpl  implements IMissionCompanyService {

    @Autowired
    private MissionCompanyMapper missionCompanyMapper;

    @Autowired
    private MissionUserinfoMapper missionUserinfoMapper;

    public CommonList selectInfo(int page, int row) {
        CommonList commonList = new CommonList();

        try
        {
            List<MissionCompany> list = missionCompanyMapper.selectInfo((page-1)*row,row);
            if (list!=null && list.size()>0){

                int size = list.size();
                for (int i=0;i<size;i++){

                    MissionCompany missionCompany = list.get(i);
                    String[] peoples = missionCompany.getCompanyPeople().split(",");
                    List<String> b = Arrays.asList(peoples);
                    float price = 0;

                    for (int j=0;j<b.size();j++){

                        List<MissionUserinfo> missionUserinfoList = missionUserinfoMapper.queryUserByName(b.get(j));
                        if (missionUserinfoList!=null && missionUserinfoList.size()>0) {
                            price += Float.valueOf(missionUserinfoList.get(0) == null ? "0" : missionUserinfoList.get(0).getPrice());
                        }

                    }

                    missionCompany.setCompanySumprice(price+"");


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

    public Map addInfo(MissionCompany missionCompany) {
        Map result = new HashMap();

        try {
            missionCompany.setCompanyId("company" + Util.initRandomId());
            missionCompany.setCompanyStatus(1);
            missionCompany.setCompanySumprice("0");

            int peoples = 0;

            if (!StringUtils.isEmpty(missionCompany.getCompanyLeader())){
                peoples++;
            }

            if (!StringUtils.isEmpty(missionCompany.getCompanyPeople())){
                String[] pe = missionCompany.getCompanyPeople().split(",");
                peoples += pe.length;
            }

            missionCompany.setCompanySum(peoples+"");

            int flag = missionCompanyMapper.addInfo(missionCompany);

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

    public Map updateInfo(MissionCompany missionCompany) {
        Map result = new HashMap();

        try {

            MissionCompany missionCompanys = missionCompanyMapper.selectByPrimaryKey(missionCompany.getCompanyId());

            int peoples = 0;

            if (!StringUtils.isEmpty(missionCompany.getCompanyLeader())){
                peoples++;
            }

            if (!StringUtils.isEmpty(missionCompany.getCompanyPeople())){
                String[] pe = missionCompany.getCompanyPeople().split(",");
                peoples += pe.length;
            }

            missionCompany.setCompanySum(peoples+"");
            missionCompany.setCompanyStatus(missionCompanys.getCompanyStatus());

            int flag = missionCompanyMapper.updateInfo(missionCompany);

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
        CommonList commonList = new CommonList();

        try
        {
            List<MissionBank> list = missionCompanyMapper.findInfo(search_value);

            commonList.setRows(list);
            commonList.setTotal(missionCompanyMapper.countBySqls(1));

        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            return commonList;
        }
    }

    public Map deleteInfo(String id) {

        MissionCompany missionCompany = missionCompanyMapper.selectByPrimaryKey(id);
        missionCompany.setCompanyStatus(0);

        Map result = new HashMap();

        try {

            int flag = missionCompanyMapper.updateInfo(missionCompany);

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

    public int initTableRows(){
        int sum = 0;
        sum = missionCompanyMapper.countBySqls(1);

        return sum;
    }

}
