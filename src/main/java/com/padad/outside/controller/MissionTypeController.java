package com.padad.outside.controller;

import com.padad.outside.framework.Util;
import com.padad.outside.model.CommonList;
import com.padad.outside.model.UserRecord;
import com.padad.outside.pojo.MissionTask;
import com.padad.outside.pojo.MissionTasktype;
import com.padad.outside.service.IMissionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Admin on 16/12/6.
 */
@Controller
@RequestMapping("/missiontype")
public class MissionTypeController extends BaseController {

    @Autowired
    private IMissionTypeService iMissionTypeService;

    /**
     * 获取类型列表
     * @param request
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/missionAllType.do")
    public @ResponseBody
    CommonList taskList(HttpServletRequest request)throws Exception
    {


        int page = request.getParameter("page")==null?1:Integer.valueOf(request.getParameter("page"));
        int row = request.getParameter("rows")==null?10:Integer.valueOf(request.getParameter("rows"));

        UserRecord<MissionTasktype> ur = iMissionTypeService.queryAllRecords(page,row);

        int total = ur.getCount();
        List<MissionTasktype> list = ur.getUserInfo();
        CommonList cj = new CommonList();
        try
        {
            cj.setRows(list);

            cj.setTotal(total);



        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return cj;
    }

    @RequestMapping(value="/searchType.do")
    public @ResponseBody
    CommonList searchRecord(String name)throws Exception
    {
        UserRecord<MissionTasktype> ur = iMissionTypeService.queryRecordByName(name);
        int total = ur.getCount();
        List<MissionTasktype> list = ur.getUserInfo();
        CommonList cj = new CommonList();
        try
        {
            cj.setRows(list);

            cj.setTotal(total);



        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return cj;
    }


    /**
     * 增加任务
     * @param rsq
     * @return
     */
    @RequestMapping(value="/saveType.do")
    public @ResponseBody
    Map addTask(MissionTasktype missionTasktype, HttpServletRequest rsq)throws Exception {

        Map<String, Object> result = new HashMap<String, Object>();


        missionTasktype.setId("mtype"+ Util.initRandomId());

        int count = iMissionTypeService.countBySql();
        missionTasktype.setType(count+1);
        int flag = iMissionTypeService.insertRecord(missionTasktype);

        if (flag>0)
        {
            result.put("success", true);
        }
        else
        {

            result.put("errorMsg", "添加失败。");

            result.put("failure", true);

        }
        return result;

    }

    /**
     * 删除任务
     * @param id
     * @return
     */
    @RequestMapping(value="/destroy_type.do")
    public @ResponseBody
    Map delTask(String id,HttpServletRequest rsq)throws Exception {




        Map<String,Object> result = new HashMap<String, Object>();

        if (!initAuth(rsq,4)){
            result.put("failure", true);
            result.put("errorMsg", "权限不足。");
            return result;
        }

        int flag = iMissionTypeService.deleteByPrimaryKey(id);

        if (flag>0)
        {
            result.put("success", true);
        }
        else
        {

            result.put("errorMsg", "添加失败。");

            result.put("failure", true);

        }
        return result;

    }


    /**
     * 编辑任务
     * @param
     * @return
     */
    @RequestMapping(value="/update_type.do")
    public @ResponseBody
    Map editTask(HttpServletRequest rsq,MissionTasktype missionTasktype)throws Exception {

//        MissionTask missionTask = new MissionTask();
//        missionTask.setMissionId(id);
//        missionTask.setActive(0);

        Map<String,Object> result = new HashMap<String, Object>();

        if (!initAuth(rsq,3)){
            result.put("failure", true);
            result.put("errorMsg", "权限不足。");
            return result;
        }


        int flag = iMissionTypeService.updateByPrimaryKey(missionTasktype);

        if (flag>0)
        {
            result.put("success", true);
        }
        else
        {

            result.put("errorMsg", "添加失败。");

            result.put("failure", true);

        }
        return result;

    }


    /**
     * 获取leixing列表
     * @param request
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/comboxList.do")
    public @ResponseBody
    List<MissionTasktype> taskListByActive(HttpServletRequest request)throws Exception
    {
        UserRecord<MissionTasktype> ur = iMissionTypeService.queryAllRecords(1,20);


        List<MissionTasktype> list = ur.getUserInfo();


        return list;
    }


}
