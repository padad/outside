package com.padad.outside.controller;

import com.padad.outside.pojo.MissionUserinfo;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Admin on 16/10/19.
 */
public class BaseController {

    public boolean initAuth(HttpServletRequest request,int need){

        MissionUserinfo missionUserinfo = (MissionUserinfo) request.getSession().getAttribute("userinfo");
        if (missionUserinfo==null)
        {
            return false;
        }
        else {
            if (missionUserinfo.getAuth() >= need){
                return true;
            }
            else {
                return false;
            }
        }

    }

}
