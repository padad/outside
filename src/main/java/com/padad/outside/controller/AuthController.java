package com.padad.outside.controller;

import com.padad.outside.framework.Util;
import com.padad.outside.model.AuthSearchModel;
import com.padad.outside.model.CommonList;
import com.padad.outside.model.TaskSearchModel;
import com.padad.outside.model.UserRecord;
import com.padad.outside.pojo.MissionAuth;
import com.padad.outside.pojo.MissionMytask;
import com.padad.outside.pojo.MissionSteps;
import com.padad.outside.pojo.MissionUserinfo;
import com.padad.outside.service.IAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Admin on 16/12/7.
 */
@Controller
@RequestMapping("/auth")
public class AuthController extends BaseController{

    @Autowired
    private IAuthService iAuthService;

    @RequestMapping(value="/missionAllAuth.do")
    public @ResponseBody
    CommonList searchRecords(String id, String text, String value, HttpServletRequest request)throws Exception
    {

        AuthSearchModel authSearchModel = new AuthSearchModel();


        int page = request.getParameter("page")==null?1:Integer.valueOf(request.getParameter("page"));
        int row = request.getParameter("rows")==null?10:Integer.valueOf(request.getParameter("rows"));

        authSearchModel.setPage(page);
        authSearchModel.setRow(row);
        authSearchModel.setActiveAuth(1);

        CommonList cj = iAuthService.queryRecordByModel(authSearchModel);



        return cj;
    }

    @RequestMapping(value="/authCombox.do")
    public @ResponseBody
    List<MissionAuth> searchRecords(HttpServletRequest request)throws Exception
    {

        AuthSearchModel authSearchModel = new AuthSearchModel();


        int page = request.getParameter("page")==null?1:Integer.valueOf(request.getParameter("page"));
        int row = request.getParameter("rows")==null?10:Integer.valueOf(request.getParameter("rows"));

        authSearchModel.setPage(page);
        authSearchModel.setRow(row);
        authSearchModel.setActiveAuth(1);


        CommonList cj = iAuthService.queryRecordByModel(authSearchModel);



        return cj.getRows();
    }

    /**
     * 增加权限
     * @param rsq
     * @return
     */
    @RequestMapping(value="/save.do")
    public @ResponseBody
    Map addTask(MissionAuth missionAuth, HttpServletRequest rsq)throws Exception {






        missionAuth.setAuthId("auth"+Util.initRandomId());



        Map result = iAuthService.insert(missionAuth);


        return result;

    }

    /**
     * 审核任务是否通过
     * @param
     * @return
     */
    @RequestMapping(value="/destroy_one.do")
    public @ResponseBody
    Map destroy(HttpServletRequest rsq, String id) throws Exception{



        String ids = rsq.getParameter("id").toString();

        MissionAuth missionAuth = new MissionAuth();
        missionAuth.setAuthId(id);
        missionAuth.setActiveAuth(0);
        Map result = iAuthService.updateByModel(missionAuth);


        return result;

    }

}
