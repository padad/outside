package com.padad.outside.controller;

import com.padad.outside.model.CommonList;
import com.padad.outside.pojo.MissionChange;
import com.padad.outside.pojo.MissionCompany;
import com.padad.outside.service.IMissionChangeService;
import com.padad.outside.service.IMissionCompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * Created by Admin on 17/4/17.
 */
@Controller
@RequestMapping("/change")
public class GiftChangeController extends BaseController {

    @Autowired
    private IMissionChangeService iMissionChangeService;

    /**
     * 获取公司列表
     * @param request
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/changeInfo.do")
    public @ResponseBody
    CommonList infoList(HttpServletRequest request)throws Exception
    {

        int page = request.getParameter("page")==null?1:Integer.valueOf(request.getParameter("page"));
        int row = request.getParameter("rows")==null?10:Integer.valueOf(request.getParameter("rows"));

        CommonList commonList = iMissionChangeService.selectInfo(page,row);
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
    Map infoSave(HttpServletRequest request, MissionCompany missionCompany)throws Exception
    {
        //Map map = iMissionChangeService.addInfo(missionCompany);
        return null;
    }

    /**
     * 升级
     * @param request
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/update_one.do")
    public @ResponseBody
    Map infoUpdate(HttpServletRequest request, MissionChange missionChange, String id)throws Exception
    {

        missionChange.setChangeId(id);
        Map map = iMissionChangeService.updateInfo(missionChange);
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
    CommonList infoSearchList(HttpServletRequest request,String search_value)throws Exception
    {
        CommonList commonList = iMissionChangeService.findInfo(search_value);
        return commonList;
    }

    /**
     * 删除
     * @param request
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/destroy_one.do")
    public @ResponseBody
    Map infoDestory(HttpServletRequest request,String id)throws Exception
    {
        Map map = iMissionChangeService.deleteInfo(id);
        return map;
    }

}
