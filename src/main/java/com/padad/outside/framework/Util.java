package com.padad.outside.framework;

/**
 * Created by Admin on 16/10/17.
 */
public class Util {

    //获取随机ID
    public static String initRandomId(){
        return System.currentTimeMillis()
                + Math.round(Math.random() * 9)
                + Math.round(Math.random() * 9)
                +Math.round(Math.random() * 9)
                + Math.round(Math.random() * 9) + "";
    }

}
