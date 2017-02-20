package com.padad.outside.service.impl;

import com.padad.outside.mapper.MissionGifttypeMapper;
import com.padad.outside.model.UserRecord;
import com.padad.outside.pojo.MissionGifttype;
import com.padad.outside.pojo.MissionTasktype;
import com.padad.outside.service.IGiftTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Admin on 17/2/17.
 */
@Service
public class GiftTypeServiceImpl implements IGiftTypeService {

    @Autowired
    private MissionGifttypeMapper missionGifttypeMapper;

    public UserRecord queryAllRecordsForCombox() {
        List list = missionGifttypeMapper.selectByExample(null);
        UserRecord<MissionGifttype> userRecord = new UserRecord<MissionGifttype>();
        userRecord.setUserInfo(list);
        userRecord.setCount(0);
        return userRecord;
    }

}
