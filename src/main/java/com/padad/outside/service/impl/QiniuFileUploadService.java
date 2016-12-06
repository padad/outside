package com.padad.outside.service.impl;

import com.padad.outside.service.IQiniuFileUploadService;
import com.qiniu.common.QiniuException;
import com.qiniu.common.Zone;
import com.qiniu.http.Response;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.UploadManager;
import com.qiniu.util.Auth;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * @Author huayi
 */
@Service
public class QiniuFileUploadService implements IQiniuFileUploadService {



//    @Value("${qiniu.accesskey}")
    private String accessKey = "aC1PC0GTJ4F0HXobMQFo7c91t7M8RwDHcMgCF7Tp";   //账户的accessKey

//    @Value("${qiniu.secretkey}")
    private String secretKey = "dkHjwh6N7_ZAvzSZl-svQ3F0c4W5vv_ZoPWQdns0";   //账户的secretKey

//    @Value("${qiniu.bucketname}")
    private String bucketName = "padad";  //要上传的空间

    //private String recordPath = "hdtrecord";  //断点记录的文件保存的文件夹或文件对象

    private Auth auth ;             //秘钥配置
    //private String uploadToken;     //token

    private UploadManager uploadManager;
    //private FileRecorder fileRecorder;

    private String directory = "image/";


    @PostConstruct
    public void init(){ //不使用断点续传

        Zone z = Zone.autoZone();
        Configuration c = new Configuration(z);

        auth = Auth.create(accessKey,secretKey);
        uploadManager = new UploadManager(c);

        //uploadManager = new UploadManager(fileRecorder);
        //uploadToken = auth.uploadToken(bucketName);
    }


    /**
     * 文件上传成功之后返回可访问的url
     *
     * @return      返回可访问的http完整的url
     * @throws IOException
     */
    public String uploadFile(byte[] data) throws IOException{
        try{
            String key = getKey();
            Response response = uploadManager.put(data,key,auth.uploadToken(bucketName,key));

            return key;
        }catch (QiniuException e){
            Response r = e.response;
            try {
                //响应的文本信息
//                logger.info("七牛文件上传失败:{}",r.bodyString());
            } catch (Exception e1) {
                //ignore
            }
        }
        return null;
    }


    /**
     * 文件上传成功之后返回可访问的url
     *
     * @return      返回可访问的http完整的url
     * @throws IOException
     */
    public String uploadFile(File file) throws IOException{
        try{
            String key = getKey();
            Response response = uploadManager.put(file,key,auth.uploadToken(bucketName,key));
            //logger.info("qiniu fileupload response:{}",response.bodyString());
            return key;
        }catch (QiniuException e){
            Response r = e.response;
            try {
                //响应的文本信息
                //logger.info("七牛文件上传失败:{}",r.bodyString());
            } catch (Exception e1) {
                //ignore
            }
        }
        return null;
    }




    private String getKey(){
        return directory+UUID.randomUUID().toString().replaceAll("-","");
    }

}
