package com.padad.outside.controller;

import com.padad.outside.model.CommonList;
import com.padad.outside.pojo.MissionAddress;
import com.padad.outside.service.IMissionAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * Created by Admin on 17/1/22.
 */
@Controller
@RequestMapping("/address")
public class AddressController extends BaseController {

    @Autowired
    private IMissionAddressService iMissionAddressService;


    /**
     * 获取地址列表
     * @param request
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/missionAddress.do")
    public @ResponseBody
    CommonList addressList(HttpServletRequest request)throws Exception
    {

        int page = request.getParameter("page")==null?1:Integer.valueOf(request.getParameter("page"));
        int row = request.getParameter("rows")==null?10:Integer.valueOf(request.getParameter("rows"));

        CommonList commonList = iMissionAddressService.selectInfo(page,row);
        return commonList;
    }

    /**
     * 获取地址列表
     * @param request
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/save.do")
    public @ResponseBody
    Map addressSave(HttpServletRequest request,MissionAddress missionAddress)throws Exception
    {
        Map map = iMissionAddressService.addInfo(missionAddress);
        return map;
    }

    /**
     * 获取地址列表
     * @param request
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/update_one.do")
    public @ResponseBody
    Map addressUpdate(HttpServletRequest request, MissionAddress missionAddress,String id)throws Exception
    {
        String addressId = request.getParameter("id");
        missionAddress.setAddressId(id);
        Map map = iMissionAddressService.updateInfo(missionAddress);
        return map;
    }

    /**
     * 获取地址列表
     * @param request
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/searchOne.do")
    public @ResponseBody
    CommonList addressSearchList(HttpServletRequest request,String search_value)throws Exception
    {
        CommonList commonList = iMissionAddressService.findInfo(search_value);
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
        Map map = iMissionAddressService.deleteInfo(id);
        return map;
    }

}
