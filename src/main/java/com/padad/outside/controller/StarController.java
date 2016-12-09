package com.padad.outside.controller;

import com.padad.outside.framework.Util;
import com.padad.outside.model.AuthSearchModel;
import com.padad.outside.model.CommonList;
import com.padad.outside.model.StarSearchModel;
import com.padad.outside.pojo.MissionAuth;
import com.padad.outside.pojo.MissionStar;
import com.padad.outside.service.IAuthService;
import com.padad.outside.service.IStarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * Created by Admin on 16/12/9.
 * 难度页面增删改查
 */
@Controller
@RequestMapping("/star")
public class StarController extends BaseController{

    @Autowired
    private IStarService iStarService;

    @RequestMapping(value="/missionAllStar.do")
    public @ResponseBody
    CommonList searchRecords(String id, String text, String value, HttpServletRequest request)throws Exception
    {

        StarSearchModel starSearchModel = new StarSearchModel();


        int page = request.getParameter("page")==null?1:Integer.valueOf(request.getParameter("page"));
        int row = request.getParameter("rows")==null?10:Integer.valueOf(request.getParameter("rows"));

        starSearchModel.setPage(page);
        starSearchModel.setRow(row);
        starSearchModel.setActiveStar(1);

        CommonList cj = iStarService.queryRecordByModel(starSearchModel);



        return cj;
    }

    @RequestMapping(value="/starCombox.do")
    public @ResponseBody
    List<MissionAuth> searchRecords(HttpServletRequest request)throws Exception
    {

        StarSearchModel starSearchModel = new StarSearchModel();


        int page = request.getParameter("page")==null?1:Integer.valueOf(request.getParameter("page"));
        int row = request.getParameter("rows")==null?10:Integer.valueOf(request.getParameter("rows"));

        starSearchModel.setPage(page);
        starSearchModel.setRow(row);
        starSearchModel.setActiveStar(1);


        CommonList cj = iStarService.queryRecordByModel(starSearchModel);



        return cj.getRows();
    }

    /**
     * 增加难度
     * @param rsq
     * @return
     */
    @RequestMapping(value="/save.do")
    public @ResponseBody
    Map addTask(MissionStar missionStar, HttpServletRequest rsq)throws Exception {






        missionStar.setId("star"+ Util.initRandomId());



        Map result = iStarService.insert(missionStar);


        return result;

    }

    /**
     * 删除难度
     * @param
     * @return
     */
    @RequestMapping(value="/destroy_one.do")
    public @ResponseBody
    Map destroy(HttpServletRequest rsq, String id) throws Exception{



        String ids = rsq.getParameter("id").toString();

        MissionStar missionStar = new MissionStar();
        missionStar.setId(id);
        missionStar.setActiveStar(0);
        Map result = iStarService.updateByModel(missionStar);


        return result;

    }

    /**
     * 编辑难度
     * @param
     * @return
     */
    @RequestMapping(value="/update_one.do")
    public @ResponseBody
    Map update(HttpServletRequest rsq, MissionStar missionStar,String id) throws Exception{



        String ids = rsq.getParameter("id").toString();

        missionStar.setId(id);
        Map result = iStarService.updateByModel(missionStar);


        return result;

    }



}
