package com.padad.outside.controller;

import com.padad.outside.model.CommonList;
import com.padad.outside.model.TaskSearchModel;
import com.padad.outside.model.UserRecord;
import com.padad.outside.pojo.MissionMytask;
import com.padad.outside.pojo.MissionMytaskExample;
import com.padad.outside.pojo.MissionTask;
import com.padad.outside.pojo.MissionUserinfo;
import com.padad.outside.service.MyTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Admin on 16/12/1.
 */
@Controller
@RequestMapping("/mytask")
public class MyTaskController extends BaseController {


    @Autowired
    private MyTaskService myTaskService;

    /**
     * 获取我的任务列表
     * @param request
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/mytaskLists.do")
    public @ResponseBody
    CommonList mytaskList(HttpServletRequest request)throws Exception
    {

        int i = 0;
        int page = request.getParameter("page")==null?1:Integer.valueOf(request.getParameter("page"));
        int row = request.getParameter("rows")==null?10:Integer.valueOf(request.getParameter("rows"));

        UserRecord<MissionMytask> ur = myTaskService.queryAllMyTaskRecords(page,row);

        int total = ur.getCount();
        List<MissionMytask> list = ur.getUserInfo();
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


    @RequestMapping(value="/searchMyTask.do")
    public @ResponseBody
    CommonList searchUser(String mytaskid,String userid,String missionid,String stat,HttpServletRequest request)throws Exception
    {

        TaskSearchModel taskSearchModel = new TaskSearchModel();
        taskSearchModel.setMytaskid(mytaskid);
        taskSearchModel.setUserid(userid);
        taskSearchModel.setMissionid(missionid);
        taskSearchModel.setStatus(Integer.valueOf(stat));

        int page = request.getParameter("page")==null?1:Integer.valueOf(request.getParameter("page"));
        int row = request.getParameter("rows")==null?10:Integer.valueOf(request.getParameter("rows"));

        taskSearchModel.setPage(page);
        taskSearchModel.setRow(row);

        UserRecord<MissionMytask> ur = myTaskService.queryMyTaskByModel(taskSearchModel);
//        MissionMytaskExample missionMytaskExample = new MissionMytaskExample();
//        missionMytaskExample.createCriteria().andStatusEqualTo(Integer.valueOf(stat));

        int total = ur.getCount();
        List<MissionMytask> list = ur.getUserInfo();
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
     * 审核任务是否通过
     * @param
     * @return
     */
    @RequestMapping(value="/update_mytask.do")
    public @ResponseBody
    Map editTask(HttpServletRequest rsq, String id) {

//        MissionTask missionTask = new MissionTask();
//        missionTask.setMissionId(id);
//        missionTask.setActive(0);
        rsq.getParameter("id").toString();
        Map<String,Object> result = new HashMap<String, Object>();

        if (!initAuth(rsq,3)){
            result.put("failure", true);
            result.put("errorMsg", "权限不足。");
            return result;
        }
        int flag = 0;
        MissionMytask missionMytask = new MissionMytask();
        missionMytask.setTaskId(id);
        missionMytask.setStatus(0);

        try {
            flag = myTaskService.updateByModel(missionMytask);
        }
        catch (Exception e){
            e.printStackTrace();
            result.put("errorMsg", "审核失败。"+ e.getMessage());
        }

        if (flag>0)
        {
            result.put("success", true);
        }
        else
        {



            result.put("failure", true);

        }
        return result;

    }

}
