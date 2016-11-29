package com.padad.outside.service;

import com.padad.outside.model.UserRecord;
import com.padad.outside.pojo.MissionUserinfo;
import com.padad.outside.pojo.Userinfo;

import java.util.List;

/**
 * Created by Admin on 16/8/8.
 */
public interface UserInfoService {

    /**
     * 查找所有用户
     * @return
     * @throws Exception
     */
    List<Userinfo> findUser()throws Exception;

    MissionUserinfo login(String username, String password) throws Exception;

    //查找所有用户分页
    UserRecord queryAllUserRecords(int page, int row)throws Exception;

    //插入用户
    int insert(MissionUserinfo record)throws Exception;

    //查找用户通过名字
    int queryByName(String username)throws Exception;

    //查找用户通过名字
    UserRecord queryUserByName(String username) throws Exception;

    //删除用户
    int deleteByPrimaryKey(String userid)throws Exception;

    //编辑用户
    int updateByPrimaryKey(MissionUserinfo record) throws Exception;
}
