package com.cake.controller;

import com.cake.bean.Addr;
import com.cake.bean.User;
import com.cake.service.AddrService;
import com.cake.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("register")
    public String registerUser(HttpSession session, Addr addr, User user, HttpServletRequest request){
        String vcode = request.getParameter("vcode");
        String registerCode = (String) session.getAttribute("registerVcode");
        if (!registerCode.equals(vcode)){ //
            return "";
        }
        System.out.println(user.toString());
        System.out.println(addr.toString());
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) ac.getBean("userServiceImpl");
        AddrService addrService = (AddrService) ac.getBean("addrServiceImpl");
        int maxId = userService.userMaxId();
        user.setId(maxId + 1);
        addrService.addAddr(maxId+1, addr);
        userService.addUser(user);
        return "redirect:/index.jsp"; // 重定向
        //"forward:index.jsp"; 转发
    }

}
