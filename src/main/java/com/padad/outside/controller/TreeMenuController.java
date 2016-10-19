package com.padad.outside.controller;

import com.padad.outside.model.SmartJsonMenuTree;
import com.padad.outside.pojo.MissionMenu;
import com.padad.outside.pojo.MissionUserinfo;
import com.padad.outside.service.ITreeMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 16/10/18.
 */
@Controller
@RequestMapping("tree_menu")
public class TreeMenuController {

    @Autowired
    ITreeMenuService iTreeMenuService;


    //读取菜单
    @RequestMapping(value="/treemenu.do")
    public @ResponseBody
    List initTreeMenu(HttpServletRequest req)
    {
        MissionUserinfo user = (MissionUserinfo)req.getSession().getAttribute("userinfo");
        List list = iTreeMenuService.initTreeMenuWithRole(user.getAuth());

        int size = list.size();
        List menuList = new ArrayList();
        for (int i=0;i<size;i++){
            MissionMenu missionMenu = (MissionMenu) list.get(i);
            SmartJsonMenuTree smartJsonMenuTree = new SmartJsonMenuTree();
            smartJsonMenuTree.setIconCls("");
            smartJsonMenuTree.setId(missionMenu.getMenuId());
            smartJsonMenuTree.setLeaf(true);
            smartJsonMenuTree.setParentid("");
            smartJsonMenuTree.setText(missionMenu.getMenuTitle());
            smartJsonMenuTree.setUrl(missionMenu.getMenuAddress());
            menuList.add(smartJsonMenuTree);
        }

        return menuList;
    }

}
