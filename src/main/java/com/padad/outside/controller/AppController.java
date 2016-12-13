package com.padad.outside.controller;

import com.padad.outside.framework.QiNiu;
import com.padad.outside.model.CommonList;
import com.padad.outside.service.IQiniuFileUploadService;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Admin on 16/12/5.
 */
@Controller
@RequestMapping("/app")
public class AppController extends HttpServlet {

    @Autowired
    private IQiniuFileUploadService qiniuFileUploadService;


    @RequestMapping(value="/appSave.do")
    public @ResponseBody
    Map appRock(@RequestParam("uploadfile2") MultipartFile uploadfile2,HttpServletRequest request)throws Exception
    {
        Map<String,Object> result = new HashMap<String, Object>();
        String id = request.getParameter("id");
        String address_up = request.getParameter("address_up");
        String download_where = request.getParameter("download_where");
        String desc = request.getParameter("desc");
        String apk = request.getParameter("apk");

        String qiniuBaseUri = "https://ohqro9k82.bkt.clouddn.com/";

        if (!uploadfile2.isEmpty()) {
            try {
                int lastIndexOfDot = uploadfile2.getOriginalFilename().lastIndexOf(".");
                String fileSuffix = uploadfile2.getOriginalFilename().substring(lastIndexOfDot);
                byte[] fileContent = uploadfile2.getBytes();
                String key = qiniuFileUploadService.uploadFile(fileContent,"apk/","",fileSuffix);


                String fullPath = qiniuBaseUri + key;

                if (!StringUtils.isEmpty(fullPath))
                {
                    result.put("success", true);
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

    /**
     * 客户端上传文件到本地,然后在上传至七牛。
     * 上传成功之后返回可访问的url。
     *
     * @param file
     * @return
     */

//    @RequestMapping(value = "/upload")
//    public void upload(@RequestParam("file") MultipartFile file) {
//        //RestResponse<String> restResponse = new RestResponse<>(RestStatusEnum.SUCCESS);
//        if (!file.isEmpty()) {
//            try {
//                int lastIndexOfDot = file.getOriginalFilename().lastIndexOf(".");
//                String fileSuffix = file.getOriginalFilename().substring(lastIndexOfDot);
//                byte[] fileContent = file.getBytes();
//
//                String key = qiniuFileUploadService.uploadFile(fileContent);
//
//                /*String fileName = UUID.randomUUID().toString();
//                File tmpFile = new File("/tmp/"+fileName);
//                file.transferTo(tmpFile);
//                qiniuFileUploadService.uploadFile(tmpFile);*/
//                //tmpFile.delete();
//
//                String fullPath = qiniuBaseUri + (key+fileSuffix);
//
//
//
//                restResponse.setBody(fullPath);
//
//            } catch (Exception e) {
//
//                e.printStackTrace();
//            }
//        } else {
//            //throw new RestException(RestStatusEnum.SYSTEM_ERROR, "缺少文件。");
//        }
//        //return restResponse;
//    }




}
