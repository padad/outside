package com.padad.outside.service;

import com.padad.outside.model.AuthSearchModel;
import com.padad.outside.model.CommonList;

/**
 * Created by Admin on 16/12/7.
 */
public interface IAuthService {

    //查找我的任务
    CommonList queryRecordByModel(AuthSearchModel authSearchModel) throws  Exception;

}
