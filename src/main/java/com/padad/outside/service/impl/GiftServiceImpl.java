package com.padad.outside.service.impl;

import com.padad.outside.framework.Util;
import com.padad.outside.mapper.MissionGiftMapper;
import com.padad.outside.model.CommonList;
import com.padad.outside.pojo.MissionAddress;
import com.padad.outside.pojo.MissionGift;
import com.padad.outside.pojo.MissionGiftExample;
import com.padad.outside.service.IGiftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Admin on 17/2/17.
 */
@Service
public class GiftServiceImpl implements IGiftService {


    @Autowired
    private MissionGiftMapper missionGiftMapper;

    public CommonList selectInfo(int page, int row) {
        CommonList commonList = new CommonList();

        try
        {

            List<MissionGift> list = missionGiftMapper.selectInfo((page-1)*row,(page*row-1));

            commonList.setRows(list);
            MissionGiftExample missionGiftExample = new MissionGiftExample();
            missionGiftExample.createCriteria().andActiveEqualTo(1);
            commonList.setTotal(missionGiftMapper.countByExample(missionGiftExample));

        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            return commonList;
        }
    }

    public Map addInfo(MissionGift missionGift) {
        Map result = new HashMap();

        try {
            missionGift.setGiftId("gift" + Util.initRandomId());
            int flag = missionGiftMapper.insert(missionGift);

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

    public Map updateInfo(MissionGift missionGift) {

        Map result = new HashMap();

        try {

            int flag = missionGiftMapper.updateByPrimaryKeySelective(missionGift);

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

    public Map deleteInfo(String id) {
        Map result = new HashMap();

        try {

//            MissionGiftExample missionGiftExample = new MissionGiftExample();
//            missionGiftExample.createCriteria().andGiftIdEqualTo(id);

            MissionGift missionGift = missionGiftMapper.selectByPrimaryKey(id);
            missionGift.setActive(0);


            int flag = missionGiftMapper.updateByPrimaryKeySelective(missionGift);

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
            MissionGiftExample missionGiftExample = new MissionGiftExample();
            missionGiftExample.createCriteria().andGiftTitleLike(search_value);
            List<MissionGift> list = missionGiftMapper.selectByExample(missionGiftExample);

            commonList.setRows(list);
            commonList.setTotal(missionGiftMapper.countByExample(missionGiftExample));

        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            return commonList;
        }
    }

}
