package com.zeng.web.controller;

import com.zeng.dao.entity.Module;
import com.zeng.dao.entity.RoleDetail;
import com.zeng.dao.entity.User;
import com.zeng.web.service.ModuleService;
import com.zeng.web.service.RoleDetailService;
import com.zeng.web.service.UserService;
import com.zeng.web.vo.UserVo;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/10/13.
 */
@Aspect
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private RoleDetailService roleDetailService;

    @Autowired
    private ModuleService moduleService;

        @Pointcut("execution(public String com.zeng.web.controller.UserController.toindex())")
        public void myMethod(){}


//    @Before("execution(public String com.zeng.web.controller.UserController.login(User user)")
    @Before("execution(public java.lang.String com.zeng.web.controller.UserController.toindex())")
    public void beforeMethod()
    {
        System.out.println("save start......");
    }

    @RequestMapping("/login")
    public String login(User user,HttpSession session) {
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        System.out.println("userService:"+userService);
        System.out.println(this);
        if(user==null) {
            return "redirect:/index.html";
        }
        if(user.getUsername()==null||user.getUsername()=="") {
            return "redirect:/index.html";
        }
        if(user.getPassword()==null||user.getPassword()=="") {
            return "redirect:/index.html";
        }
        List<User> list = userService.findUserByUser(user);
        if(list!=null&&list.size()==1) {
            StringBuffer sb;
            User u = list.get(0);
            RoleDetail roleDetail = new RoleDetail();
            roleDetail.setRoleId(u.getRoleId());
            List<RoleDetail> roleDetailList = roleDetailService.findRoleDetailByRoleDetail(roleDetail);
            UserVo userVo = new UserVo();
            List<Module> moduleList = new ArrayList<Module>();
            for(RoleDetail rd:roleDetailList) {
                Module modul = new Module();
                modul.setModuleId(rd.getModuleId());
                List<Module> moduleList2 = moduleService.findModuleByModule(modul);
                moduleList.add(moduleList2.get(0));
            }
            userVo.setUser(u);
            userVo.setList(moduleList);
            session.setAttribute("user",userVo);
            System.out.println(userVo.getList());
            return "redirect:/toindex";
        }
        return "redirect:/index.html";
    }



    @RequestMapping("/toindex")
    public String toindex() {
        return "index";
    }
}
