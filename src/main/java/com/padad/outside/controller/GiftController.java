package com.padad.outside.controller;

import com.padad.outside.model.CommonList;
import com.padad.outside.pojo.MissionAddress;
import com.padad.outside.pojo.MissionGift;
import com.padad.outside.service.IGiftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * Created by Admin on 17/2/17.
 */
@Controller
@RequestMapping("/gift")
public class GiftController extends BaseController {

    @Autowired
    private IGiftService iGiftService;

    /**
     * 获取地址列表
     * @param request
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/giftlist.do")
    public @ResponseBody
    CommonList addressList(HttpServletRequest request)throws Exception
    {

        int page = request.getParameter("page")==null?1:Integer.valueOf(request.getParameter("page"));
        int row = request.getParameter("rows")==null?10:Integer.valueOf(request.getParameter("rows"));

        CommonList commonList = iGiftService.selectInfo(page,row);
        return commonList;
    }

    /**
     * 插入礼品
     * @param request
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/save.do")
    public @ResponseBody
    Map addressSave(HttpServletRequest request, MissionGift missionGift,String value)throws Exception
    {
        String str = new String(new String(value.getBytes("iso-8859-1"),"UTF-8"));
        missionGift.setDescGift(str);
        Map map = iGiftService.addInfo(missionGift);
        return map;
    }

    /**
     * 修改礼品
     * @param request
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/update_one.do")
    public @ResponseBody
    Map update_one(HttpServletRequest request,String id, MissionGift missionGift,String value)throws Exception
    {
        String str = new String(new String(value.getBytes("iso-8859-1"),"UTF-8"));
        missionGift.setGiftId(id);
        //str = str.split("&value=")[1];
        missionGift.setDescGift(str);
        Map map = iGiftService.updateInfo(missionGift);
        return map;
    }


    /**
     * 删除礼品
     * @param request
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/destroy_one.do")
    public @ResponseBody
    Map destroy_one(HttpServletRequest request, String id)throws Exception
    {

        Map map = iGiftService.deleteInfo(id);
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
    CommonList searchList(HttpServletRequest request,String search_value)throws Exception
    {
        CommonList commonList = iGiftService.findInfo(search_value);
        return commonList;
    }

}
