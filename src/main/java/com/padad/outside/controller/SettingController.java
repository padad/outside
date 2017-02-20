package com.padad.outside.controller;

import com.padad.outside.framework.Util;
import com.padad.outside.model.CommonList;
import com.padad.outside.model.LevelSearchModel;
import com.padad.outside.model.SettingSearchModel;
import com.padad.outside.pojo.MissionAuth;
import com.padad.outside.pojo.MissionLevel;
import com.padad.outside.pojo.MissionSetting;
import com.padad.outside.service.IAppSetting;
import com.padad.outside.service.ILevelService;
import com.padad.outside.service.IQiniuFileUploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Admin on 16/12/12.
 */
@Controller
@RequestMapping("/setting")
public class SettingController extends BaseController{

    @Autowired
    private IQiniuFileUploadService qiniuFileUploadService;



    @Autowired
    private IAppSetting iAppSetting;

    @RequestMapping(value="/missionAllSetting.do")
    public @ResponseBody
    CommonList searchRecords(HttpServletRequest request)throws Exception
    {

        SettingSearchModel settingSearchModel = new SettingSearchModel();


        int page = request.getParameter("page")==null?1:Integer.valueOf(request.getParameter("page"));
        int row = request.getParameter("rows")==null?10:Integer.valueOf(request.getParameter("rows"));

        settingSearchModel.setPage(page);
        settingSearchModel.setRow(row);


        CommonList cj = iAppSetting.queryRecordByModel(settingSearchModel);



        return cj;
    }

    @RequestMapping(value="/starCombox.do")
    public @ResponseBody
    List<MissionAuth> searchRecordsList(HttpServletRequest request)throws Exception
    {

        SettingSearchModel levelSearchModel = new SettingSearchModel();


        int page = request.getParameter("page")==null?1:Integer.valueOf(request.getParameter("page"));
        int row = request.getParameter("rows")==null?10:Integer.valueOf(request.getParameter("rows"));

        levelSearchModel.setPage(page);
        levelSearchModel.setRow(row);



        CommonList cj = iAppSetting.queryRecordByModel(levelSearchModel);



        return cj.getRows();
    }



    /**
     * 删除版本
     * @param
     * @return
     */
    @RequestMapping(value="/destroy_one.do")
    public @ResponseBody
    Map destroy(HttpServletRequest rsq, String id,String address) throws Exception{



//        String ids = rsq.getParameter("id").toString();
//
//        MissionSetting missionSetting = new MissionSetting();
//        missionSetting.setId(id);
//        int lastIndexOfShu = address.json.indexOf("/apk")+1;
//        String key = address.json.substring(lastIndexOfShu);
//        int flag = qiniuFileUploadService.delete(key);

        Map result = iAppSetting.deleteByPrimaryKey(id);


        return result;

    }

    /**
     * 编辑版本
     * @param
     * @return
     */
    @RequestMapping(value="/update_one.do")
    public @ResponseBody
    Map update(@RequestParam("appAddress") MultipartFile uploadfile2,HttpServletRequest rsq, MissionSetting missionSetting,String id) throws Exception{



        String ids = rsq.getParameter("id").toString();

        missionSetting.setId(id);
        Map result = iAppSetting.updateByModel(missionSetting);


        return result;

    }


    @RequestMapping(value="/save.do")
    public @ResponseBody
    Map appRock(@RequestParam("appAddress") MultipartFile uploadfile2, HttpServletRequest request)throws Exception
    {
        Map<String,Object> result = new HashMap<String, Object>();
        //String id = request.getParameter("id");
        String force = request.getParameter("force");
        String appDesc = request.getParameter("appDesc");
        String appVersion = request.getParameter("appVersion");
        String qiniuBaseUri = "https://ohqro9k82.bkt.clouddn.com/";

        if (!uploadfile2.isEmpty()) {
            try {
                int lastIndexOfDot = uploadfile2.getOriginalFilename().lastIndexOf(".");
                int lastIndexOfShu = uploadfile2.getOriginalFilename().lastIndexOf("/")+1;
                String fileName = uploadfile2.getOriginalFilename().substring(lastIndexOfShu,lastIndexOfDot);
                String fileSuffix = uploadfile2.getOriginalFilename().substring(lastIndexOfDot);
                byte[] fileContent = uploadfile2.getBytes();
                String key = qiniuFileUploadService.uploadFile(fileContent,"apk/",fileName,fileSuffix);


                String fullPath = qiniuBaseUri + key;

                if (!StringUtils.isEmpty(fullPath))
                {
                    //result.put("success", true);
                    if (StringUtils.isEmpty(force)){
                        force = "0";
                    }
                    MissionSetting missionSetting = new MissionSetting();
                    missionSetting.setId("apk"+ Util.initRandomId());
                    missionSetting.setForceSetting(Integer.valueOf(force));
                    missionSetting.setAppAddress(fullPath);
                    missionSetting.setAppDesc(appDesc);
                    missionSetting.setAppVersion(Integer.valueOf(appVersion));



                    result = iAppSetting.insert(missionSetting);

                }


            } catch (Exception e) {
                result.put("failure", true);
                result.put("errorMsg", e.getMessage());

            }
        } else {
            result.put("errorMsg", "缺少文件");
        }

        //response.sendRedirect("app.html");
        return result;
    }

}
