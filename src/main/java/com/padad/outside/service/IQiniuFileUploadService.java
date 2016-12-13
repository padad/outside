package com.padad.outside.service;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.IOException;

/**
 * Created by Admin on 16/12/5.
 */
public interface IQiniuFileUploadService {
    @PostConstruct
    void init();

    String uploadFile(byte[] data) throws IOException;

    String uploadFile(byte[] data,String dirs,String fileName,String fileSuffix) throws IOException;

    String uploadFile(File file) throws IOException;
}
