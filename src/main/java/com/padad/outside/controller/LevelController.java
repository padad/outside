package com.padad.outside.controller;

import com.padad.outside.framework.Util;
import com.padad.outside.model.CommonList;
import com.padad.outside.model.LevelSearchModel;
import com.padad.outside.model.StarSearchModel;
import com.padad.outside.pojo.MissionAuth;
import com.padad.outside.pojo.MissionLevel;
import com.padad.outside.pojo.MissionStar;
import com.padad.outside.service.ILevelService;
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
 */
@Controller
@RequestMapping("/level")
public class LevelController extends BaseController {

    @Autowired
    private ILevelService levelService;

    @RequestMapping(value="/missionAllLevel.do")
    public @ResponseBody
    CommonList searchRecords(HttpServletRequest request)throws Exception
    {

        LevelSearchModel levelSearchModel = new LevelSearchModel();


        int page = request.getParameter("page")==null?1:Integer.valueOf(request.getParameter("page"));
        int row = request.getParameter("rows")==null?10:Integer.valueOf(request.getParameter("rows"));

        levelSearchModel.setPage(page);
        levelSearchModel.setRow(row);
        levelSearchModel.setActiveLevel(1);

        CommonList cj = levelService.queryRecordByModel(levelSearchModel);



        return cj;
    }

    @RequestMapping(value="/starCombox.do")
    public @ResponseBody
    List<MissionAuth> searchRecordsList(HttpServletRequest request)throws Exception
    {

        LevelSearchModel levelSearchModel = new LevelSearchModel();


        int page = request.getParameter("page")==null?1:Integer.valueOf(request.getParameter("page"));
        int row = request.getParameter("rows")==null?10:Integer.valueOf(request.getParameter("rows"));

        levelSearchModel.setPage(page);
        levelSearchModel.setRow(row);
        levelSearchModel.setActiveLevel(1);


        CommonList cj = levelService.queryRecordByModel(levelSearchModel);



        return cj.getRows();
    }

    /**
     * 增加难度
     * @param rsq
     * @return
     */
    @RequestMapping(value="/save.do")
    public @ResponseBody
    Map addTask(MissionLevel missionLevel, HttpServletRequest rsq)throws Exception {






        missionLevel.setId("level"+ Util.initRandomId());



        Map result = levelService.insert(missionLevel);


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

        MissionLevel missionStar = new MissionLevel();
        missionStar.setId(id);
        missionStar.setActiveLevel(0);
        Map result = levelService.updateByModel(missionStar);


        return result;

    }

    /**
     * 编辑难度
     * @param
     * @return
     */
    @RequestMapping(value="/update_one.do")
    public @ResponseBody
    Map update(HttpServletRequest rsq, MissionLevel missionLevel,String id) throws Exception{



        String ids = rsq.getParameter("id").toString();

        missionLevel.setId(id);
        Map result = levelService.updateByModel(missionLevel);


        return result;

    }

}
