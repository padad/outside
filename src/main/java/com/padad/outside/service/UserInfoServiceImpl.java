package com.padad.outside.service;

import com.padad.outside.mapper.MissionUserinfoMapper;
import com.padad.outside.mapper.UserinfoMapper;
import com.padad.outside.model.UserRecord;
import com.padad.outside.pojo.MissionUserinfo;
import com.padad.outside.pojo.MissionUserinfoExample;
import com.padad.outside.pojo.Userinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Admin on 16/8/8.
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private MissionUserinfoMapper missionUserinfoMapper;

    public List<Userinfo> findUser() throws Exception {

        //List<Userinfo> users = userinfoMapper.selectByExample(null);



        return null;
    }

    public MissionUserinfo login(String username,String password) throws Exception {
        return missionUserinfoMapper.login(username,password);
    }

    public UserRecord queryAllUserRecords(int page, int row) throws Exception{

        MissionUserinfoExample missionUserinfoExample = new MissionUserinfoExample();
//        String ds = "limit '"+(page-1)*row+"','"+(page*row-1)+"'";
//        String ddd = "limit "+(page-1)*row+"," + (page*row-1) + "";
//        missionUserinfoExample.setOrderByClause(ddd);

        List list = missionUserinfoMapper.queryAllUser((page-1)*row,(page*row-1));
        UserRecord<MissionUserinfo> userRecord = new UserRecord<MissionUserinfo>();
        userRecord.setUserInfo(list);
        userRecord.setCount(initTableRows());
        return userRecord;
    }

    public int initTableRows()
    {

        int sum = 0;
        sum = missionUserinfoMapper.countBySql();

        return sum;
    }

    //插入用户
    public int insert(MissionUserinfo record)throws Exception {
        return missionUserinfoMapper.insert(record);
    }

    //查询用户
    public int queryByName(String username)throws Exception {
        return missionUserinfoMapper.queryByName(username);
    }

    //删除用户
    public int deleteByPrimaryKey(String userId)throws Exception{
        return missionUserinfoMapper.deleteByPrimaryKey(userId);
    }

    //编辑用户

    public int updateByPrimaryKey(MissionUserinfo record) throws Exception {
        return missionUserinfoMapper.updateByPrimaryKey(record);
    }
}
