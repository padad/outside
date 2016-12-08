package com.padad.outside.controller;

import com.padad.outside.framework.TimeUtil;
import com.padad.outside.framework.Util;
import com.padad.outside.model.CommonList;
import com.padad.outside.model.UserRecord;
import com.padad.outside.pojo.MissionUser;
import com.padad.outside.pojo.MissionUserinfo;
import com.padad.outside.pojo.Userinfo;
import com.padad.outside.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.GsonFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Admin on 16/8/8.
 */
@Controller
@RequestMapping("/user")
public class UserInfoController extends BaseController{

    @Autowired
    private UserInfoService userInfoService;


    @RequestMapping("/login.do")
    public @ResponseBody MissionUserinfo login(HttpServletRequest rsq, String userName, String passWord) throws Exception{

        MissionUserinfo info = userInfoService.login(userName,passWord);
        if (info!=null){
            rsq.getSession().removeAttribute("userinfo");
            rsq.getSession().setAttribute("userinfo", info);
        }

        return info;
    }


    @RequestMapping(value="/userLists.do")
    public @ResponseBody
    CommonList userCheck2(HttpServletRequest request)throws Exception
    {


        int page = request.getParameter("page")==null?1:Integer.valueOf(request.getParameter("page"));
        int row = request.getParameter("rows")==null?10:Integer.valueOf(request.getParameter("rows"));

        UserRecord<MissionUserinfo> ur = userInfoService.queryAllUserRecords(page,row);

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

    @RequestMapping(value="/search.do")
    public @ResponseBody
    CommonList searchUser(String username)throws Exception
    {
        UserRecord<MissionUserinfo> ur = userInfoService.queryUserByName(username);
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
     * 查找所用用户控制器方法
     * @return
     * @throws Exception
     */
    @RequestMapping("/user/findUsers")
    public ModelAndView findUsers()throws Exception{
        ModelAndView modelAndView = new ModelAndView();

        //调用service方法得到用户列表
        List<Userinfo> users = userInfoService.findUser();
        //将得到的用户列表内容添加到ModelAndView中
        modelAndView.addObject("users",users);
        //设置响应的jsp视图
        modelAndView.setViewName("findUsers");

        return modelAndView;
    }

    @RequestMapping("/user/jsonUser")
    public @ResponseBody  List<Userinfo> jsonUser() throws Exception{




        List<Userinfo> users = userInfoService.findUser();


        return users;


    }


    @RequestMapping("/user/findUser")
    public  ModelAndView allUser()throws Exception{
        //ModelAndView modelAndView = new ModelAndView();

//        //调用service方法得到用户列表
//        List<Userinfo> users = userInfoService.findUser();
//
//
//        return users;


        ModelAndView modelAndView = new ModelAndView();

        //调用service方法得到用户列表
        List<Userinfo> users = userInfoService.findUser();
        //将得到的用户列表内容添加到ModelAndView中
        modelAndView.addObject("users",users);
        //设置响应的jsp视图
        modelAndView.setViewName("findUser");

        return modelAndView;

    }


    /**
     * 增加用户
     * @param rsq
     * @return
     */
    @RequestMapping(value="/save_user.do")
    public @ResponseBody
    Map addUser(HttpServletRequest rsq)throws Exception
    {
        String userName = rsq.getParameter("username");
        int flag = 0;
        int count = userInfoService.queryByName(userName);
        Map<String,Object> result = new HashMap<String,Object>();
        if (count<1){

            String passWord = rsq.getParameter("password");
            String userNick = rsq.getParameter("nick");
            int role = Integer.valueOf(rsq.getParameter("auth"));
            int status = Integer.valueOf(rsq.getParameter("status"));

            MissionUserinfo userInfo = new MissionUserinfo();

            userInfo.setUserId(Util.initRandomId());
            userInfo.setAuth(role);
            userInfo.setAvatar("");
            userInfo.setContinueTime(0);
            userInfo.setDeviceid(Util.initRandomId());
            userInfo.setStatus(status);
            userInfo.setExperience("0");
            userInfo.setRegisterTime(TimeUtil.getStringDateShort());
            userInfo.setLastTime(TimeUtil.getStringDateShort());
            userInfo.setLevel(1);
            userInfo.setMachine("pc");
            userInfo.setPhone(userName);
            userInfo.setNick(userNick);
            userInfo.setUsername(userName);
            userInfo.setPassword(passWord);
            userInfo.setPrice("0");
            flag = userInfoService.insert(userInfo);
        }
        if (flag>0 && count<1)
        {
            result.put("success", true);
        }
        else
        {
            if (count<1){
                result.put("errorMsg", "有同名请更换。");
            }
            else {
                result.put("errorMsg", "添加失败。");
            }
            result.put("failure", true);

        }
        return result;
    }


    /**
     * 删除用户
     * @param rsq
     * @return
     */
    @RequestMapping(value="/destroy_user.do")
    public @ResponseBody Map deleteUserByLogic(HttpServletRequest rsq)
    {

        Map<String, Object> result = new HashMap<String, Object>();
        try {
            String userid = rsq.getParameter("id").trim();
            int flag = userInfoService.deleteByPrimaryKey(userid);
            if (flag>0)
            {
                result.put("success", true);
            }
            else
            {
                result.put("failure", true);
                result.put("errorMsg", "删除失败。");
            }
        }
        catch (Exception e){
            e.printStackTrace();
            result.put("errorMsg", "删除失败。" + e.toString());
        }
        finally {
            return result;
        }

        //return result;
    }

    @RequestMapping(value="/update_user.do")
    public @ResponseBody Map updateUser(HttpServletRequest rsq,MissionUserinfo missionUserinfo)
    {
        Map<String, Object> result = new HashMap<String, Object>();
        if (!initAuth(rsq,3)){
            result.put("failure", true);
            result.put("errorMsg", "权限不足。");
            return result;
        }

        try {
            String id = rsq.getParameter("id");
            //String userId = rsq.getParameter("userId");
            String userName = rsq.getParameter("username");
            String userPhone = rsq.getParameter("username");
            String passWord = rsq.getParameter("password");
            String userNick = rsq.getParameter("nick");

            int role = Integer.valueOf(rsq.getParameter("auth"));
            String registerTime = rsq.getParameter("registerTime");
            String lastTime = rsq.getParameter("lastTime");
            String experience = rsq.getParameter("experience");
            String level = rsq.getParameter("level");
            String continue_time = rsq.getParameter("continueTime");

            String price = rsq.getParameter("price");
            String status = rsq.getParameter("status");


            MissionUserinfo userInfo = new MissionUserinfo();

            userInfo.setUserId(id);
            userInfo.setAuth(role);
            userInfo.setAvatar("");
            //userInfo.setContinueTime(Integer.valueOf(continue_time));

            userInfo.setStatus(Integer.valueOf(status));
            //userInfo.setExperience(experience);
            //userInfo.setRegisterTime(registerTime);
            //userInfo.setLastTime(lastTime);
            //userInfo.setLevel(Integer.valueOf(level));
            //userInfo.setMachine("pc");
            userInfo.setPhone(userName);
            userInfo.setNick(userNick);
            userInfo.setUsername(userName);
            userInfo.setPassword(passWord);
            userInfo.setPrice(price);

            int flag = userInfoService.updateByPrimaryKey(userInfo);


            if (flag>0)
            {
                result.put("success", true);
            }
            else
            {
                result.put("failure", true);
                result.put("errorMsg", "删除失败。");
            }
        }
        catch (Exception e){
            e.printStackTrace();
            result.put("errorMsg", "删除失败。" + e.toString());
        }
        finally {
            return result;
        }



    }

}
