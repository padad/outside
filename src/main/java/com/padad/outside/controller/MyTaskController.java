package com.padad.outside.controller;

import com.padad.outside.model.CommonList;
import com.padad.outside.model.UserRecord;
import com.padad.outside.pojo.MissionMytask;
import com.padad.outside.pojo.MissionTask;
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

    /**
     * 编辑我的任务
     * @param
     * @return
     */
    @RequestMapping(value="/update_mytask.do")
    public @ResponseBody
    Map editTask(HttpServletRequest rsq, MissionMytask missionMytask)throws Exception {

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


        int flag = myTaskService.updateByModel(missionMytask);

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

}
