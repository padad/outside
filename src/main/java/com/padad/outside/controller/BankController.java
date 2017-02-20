package com.padad.outside.controller;

import com.padad.outside.model.CommonList;
import com.padad.outside.pojo.MissionAddress;
import com.padad.outside.pojo.MissionBank;
import com.padad.outside.service.IMissionAddressService;
import com.padad.outside.service.IMissionBankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * Created by Admin on 17/1/23.
 */
@Controller
@RequestMapping("/bank")
public class BankController extends BaseController{


    @Autowired
    private IMissionBankService iMissionBankService;


    /**
     * 获取卡列表
     * @param request
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/bankInfo.do")
    public @ResponseBody
    CommonList bankList(HttpServletRequest request)throws Exception
    {

        int page = request.getParameter("page")==null?1:Integer.valueOf(request.getParameter("page"));
        int row = request.getParameter("rows")==null?10:Integer.valueOf(request.getParameter("rows"));

        CommonList commonList = iMissionBankService.selectInfo(page,row);
        return commonList;
    }

    /**
     * 保存
     * @param request
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/save.do")
    public @ResponseBody
    Map addressSave(HttpServletRequest request, MissionBank missionBank)throws Exception
    {
        Map map = iMissionBankService.addInfo(missionBank);
        return map;
    }

    /**
     * 升级
     * @param request
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/update_one.do")
    public @ResponseBody
    Map addressUpdate(HttpServletRequest request, MissionBank missionBank,String id)throws Exception
    {

        missionBank.setBankId(id);
        Map map = iMissionBankService.updateInfo(missionBank);
        return map;
    }

    /**
     * 搜索
     * @param request
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/searchOne.do")
    public @ResponseBody
    CommonList addressSearchList(HttpServletRequest request,String search_value)throws Exception
    {
        CommonList commonList = iMissionBankService.findInfo(search_value);
        return commonList;
    }

    /**
     * 获取地址列表
     * @param request
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/destroy_one.do")
    public @ResponseBody
    Map addressDestory(HttpServletRequest request,String id)throws Exception
    {
        Map map = iMissionBankService.deleteInfo(id);
        return map;
    }


}
