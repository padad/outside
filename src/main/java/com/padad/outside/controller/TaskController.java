package com.padad.outside.controller;

import com.padad.outside.framework.Util;
import com.padad.outside.model.CommonList;
import com.padad.outside.model.UserRecord;
import com.padad.outside.pojo.MissionTask;
import com.padad.outside.pojo.MissionUserinfo;
import com.padad.outside.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Admin on 16/11/29.
 */
@Controller
@RequestMapping("/task")
public class TaskController extends BaseController{

    @Autowired
    private TaskService taskService;

    /**
     * 获取任务列表
     * @param request
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/taskLists.do")
    public @ResponseBody
    CommonList taskList(HttpServletRequest request)throws Exception
    {


        int page = request.getParameter("page")==null?1:Integer.valueOf(request.getParameter("page"));
        int row = request.getParameter("rows")==null?10:Integer.valueOf(request.getParameter("rows"));

        UserRecord<MissionTask> ur = taskService.queryAllTaskRecords(page,row);

        int total = ur.getCount();
        List<MissionTask> list = ur.getUserInfo();
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
     * 获取任务列表
     * @param request
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/taskListAllByActive.do")
    public @ResponseBody
    List<MissionTask> taskListByActive(HttpServletRequest request)throws Exception
    {
        UserRecord<MissionTask> ur = taskService.queryAllTaskRecordsByActive();


        List<MissionTask> list = ur.getUserInfo();


        return list;
    }





    @RequestMapping(value="/searchTask.do")
    public @ResponseBody
    CommonList searchUser(String taskName)throws Exception
    {
        UserRecord<MissionUserinfo> ur = taskService.queryTaskByName(taskName);
        int total = ur.getCount();
        List<MissionUserinfo> list = ur.getUserInfo();
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
    @RequestMapping(value="/save_task.do")
    public @ResponseBody
    Map addTask(MissionTask missionTask,HttpServletRequest rsq)throws Exception {

        Map<String, Object> result = new HashMap<String, Object>();
        String text = rsq.getParameter("text")==null?"":rsq.getParameter("text");
        String value = rsq.getParameter("value")==null?"":rsq.getParameter("value");
        //MissionTask missionTask = new MissionTask();
        String str = new String(new String(text.getBytes("iso-8859-1"),"UTF-8"));
        missionTask.setMissionId("task"+Util.initRandomId());

        missionTask.setKindTitle(str);
        missionTask.setType(Integer.valueOf(value));

        int flag = taskService.insertTask(missionTask);

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
    @RequestMapping(value="/destroy_task.do")
    public @ResponseBody
    Map delTask(String id,HttpServletRequest rsq)throws Exception {

        MissionTask missionTask = new MissionTask();
        missionTask.setMissionId(id);
        missionTask.setActive(0);

        Map<String,Object> result = new HashMap<String, Object>();

        if (!initAuth(rsq,3)){
            result.put("failure", true);
            result.put("errorMsg", "权限不足。");
            return result;
        }

        int flag = taskService.updateByPrimaryKey(missionTask);

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
    @RequestMapping(value="/update_task.do")
    public @ResponseBody
    Map editTask(HttpServletRequest rsq,MissionTask missionTask,String text)throws Exception {

//        MissionTask missionTask = new MissionTask();
//        missionTask.setMissionId(id);
//        missionTask.setActive(0);
        rsq.getQueryString();
        String ggg = rsq.getRequestURL().toString();
        String texts = rsq.getParameter("text");
        String id = rsq.getParameter("id");
        String str = new String(new String(text.getBytes("iso-8859-1"),"UTF-8"));
        Map<String,Object> result = new HashMap<String, Object>();

        if (!initAuth(rsq,3)){
            result.put("failure", true);
            result.put("errorMsg", "权限不足。");
            return result;
        }

        missionTask.setMissionId(id);
        missionTask.setKindTitle(str);
        int flag = taskService.updateByPrimaryKey(missionTask);

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




//    private String initKindTitle(int type){
//
//        if (1 == type){
//            return "高级任务";
//        }
//        else if (2 ==type){
//            return "参与活动";
//        }
//        else if (3 == type){
//            return "试用App";
//        }
//        else if (4 == type){
//            return "发朋友圈";
//        }
//        else {
//            return "看视频";
//        }
//
//    }

}
