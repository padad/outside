package com.padad.outside.service.impl;

import com.padad.outside.mapper.MissionMenuMapper;
import com.padad.outside.service.ITreeMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Admin on 16/10/18.
 */
@Service
public class TreeMenuServiceImpl implements ITreeMenuService {

    @Autowired
    private MissionMenuMapper missionMenuMapper;

    public List initTreeMenuWithRole(int auth) {
        return missionMenuMapper.initTreeMenuWithRole(auth);
    }
}
