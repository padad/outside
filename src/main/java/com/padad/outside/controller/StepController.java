package com.padad.outside.controller;

import com.padad.outside.framework.Util;
import com.padad.outside.model.CommonList;
import com.padad.outside.model.UserRecord;
import com.padad.outside.pojo.MissionSteps;
import com.padad.outside.pojo.MissionTask;
import com.padad.outside.pojo.MissionUserinfo;
import com.padad.outside.service.StepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Admin on 16/11/30.
 */
@Controller
@RequestMapping("/step")
public class StepController extends BaseController {


    @Autowired
    private StepService stepService;
    /**
     * 获取步骤列表
     * @param request
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/stepLists.do")
    public @ResponseBody
    CommonList taskList(HttpServletRequest request)throws Exception
    {
        int page = request.getParameter("page")==null?1:Integer.valueOf(request.getParameter("page"));
        int row = request.getParameter("rows")==null?10:Integer.valueOf(request.getParameter("rows"));

        UserRecord<MissionSteps> ur = stepService.queryAllStepRecords(page,row);

        int total = ur.getCount();
        List<MissionSteps> list = ur.getUserInfo();
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
    @RequestMapping(value="/save_step.do")
    public @ResponseBody
    Map addTask(MissionSteps missionSteps, HttpServletRequest rsq,String id,String text)throws Exception {

        String str = new String(new String(text.getBytes("iso-8859-1"),"UTF-8"));

        Map<String, Object> result = new HashMap<String, Object>();


        missionSteps.setStepId("step"+ Util.initRandomId());

        missionSteps.setMissionId(id);
        missionSteps.setTaskName(str);



        int flag = stepService.insertStep(missionSteps);

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
    @RequestMapping(value="/update_step.do")
    public @ResponseBody
    Map editTask(HttpServletRequest rsq,MissionSteps missionSteps,String id )throws Exception {

        String str = new String(new String(id.getBytes("iso-8859-1"),"UTF-8"));
        if (str.contains("?")){
            str = str.split("\\?")[0];
        }

        Map<String,Object> result = new HashMap<String, Object>();

        if (!initAuth(rsq,3)){
            result.put("failure", true);
            result.put("errorMsg", "权限不足。");
            return result;
        }

        missionSteps.setStepId(str);
        int flag = stepService.updateByPrimaryKey(missionSteps);

        if (flag>0)
        {
            result.put("success", true);
        }
        else
        {

            result.put("errorMsg", "修改失败。");

            result.put("failure", true);

        }
        return result;

    }

    /**
     * 删除步骤
     * @param id
     * @return
     */
    @RequestMapping(value="/destroy_step.do")
    public @ResponseBody
    Map delTask(String id,HttpServletRequest rsq)throws Exception {




        Map<String,Object> result = new HashMap<String, Object>();

        if (!initAuth(rsq,3)){
            result.put("failure", true);
            result.put("errorMsg", "权限不足。");
            return result;
        }

        int flag = stepService.delStep(id);

        if (flag>0)
        {
            result.put("success", true);
        }
        else
        {

            result.put("errorMsg", "删除失败。");

            result.put("failure", true);

        }
        return result;

    }

    @RequestMapping(value="/searchStep.do")
    public @ResponseBody
    CommonList searchUser(String taskName)throws Exception
    {
        UserRecord<MissionSteps> ur = stepService.queryStepByName(taskName);
        int total = ur.getCount();
        List<MissionSteps> list = ur.getUserInfo();
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

}
