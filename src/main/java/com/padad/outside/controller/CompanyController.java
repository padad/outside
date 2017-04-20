package com.padad.outside.controller;

import com.padad.outside.model.CommonList;
import com.padad.outside.pojo.MissionBank;
import com.padad.outside.pojo.MissionCompany;
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
@RequestMapping("/company")
public class CompanyController extends BaseController{

    @Autowired
    private IMissionCompanyService iMissionCompanyService;

    /**
     * 获取公司列表
     * @param request
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/companyInfo.do")
    public @ResponseBody
    CommonList infoList(HttpServletRequest request)throws Exception
    {

        int page = request.getParameter("page")==null?1:Integer.valueOf(request.getParameter("page"));
        int row = request.getParameter("rows")==null?10:Integer.valueOf(request.getParameter("rows"));

        CommonList commonList = iMissionCompanyService.selectInfo(page,row);
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
        Map map = iMissionCompanyService.addInfo(missionCompany);
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
    Map infoUpdate(HttpServletRequest request, MissionCompany missionCompany,String id)throws Exception
    {

        missionCompany.setCompanyId(id);
        Map map = iMissionCompanyService.updateInfo(missionCompany);
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
        CommonList commonList = iMissionCompanyService.findInfo(search_value);
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
        Map map = iMissionCompanyService.deleteInfo(id);
        return map;
    }

}
