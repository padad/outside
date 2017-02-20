package com.padad.outside.controller;

import com.padad.outside.model.UserRecord;
import com.padad.outside.pojo.MissionGifttype;
import com.padad.outside.pojo.MissionTasktype;
import com.padad.outside.service.IGiftTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Admin on 17/2/17.
 */
@Controller
@RequestMapping("/gifttype")
public class GiftTypeController extends BaseController {


    @Autowired
    private IGiftTypeService iGiftTypeService;
    /**
     * 获取leixing列表
     * @param request
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/comboxList.do")
    public @ResponseBody
    List<MissionGifttype> taskListByActive(HttpServletRequest request)throws Exception
    {
        UserRecord<MissionGifttype> ur = iGiftTypeService.queryAllRecordsForCombox();


        List<MissionGifttype> list = ur.getUserInfo();


        return list;
    }

}
