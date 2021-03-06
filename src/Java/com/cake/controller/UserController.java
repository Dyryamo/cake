package com.cake.controller;

import com.cake.bean.Addr;
import com.cake.bean.User;
import com.cake.service.AddrService;
import com.cake.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("register")
    public String registerUser(HttpSession session, Addr addr, User user, HttpServletRequest request){
        if (user == null || user.getEmail() == null || user.getEmail().equals("") || addr == null || addr.getAddress() == null || addr.getAddress().equals("")){
            return "redirect:/index.jsp";
        }
        String vcode = request.getParameter("vcode");
        String registerCode = (String) session.getAttribute("registerVcode");
        if (!registerCode.equals(vcode)){ //
            session.setAttribute("msg","验证码错误");
            return "redirect:/account.jsp";
        }
        session.removeAttribute("registerVcode");
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) ac.getBean("userServiceImpl");
        AddrService addrService = (AddrService) ac.getBean("addrServiceImpl");
        int maxId = userService.userMaxId();
        user.setId(maxId + 1);
        addrService.addAddr(maxId+1, addr);
        userService.addUser(user);
        session.setAttribute("user", user);
        return "redirect:/index.jsp"; // 重定向
        //"forward:index.jsp"; 转发
    }

    @RequestMapping("login")
    public String login(User user, HttpServletRequest request, HttpSession session){
        if (user == null || user.getEmail() == null || user.getEmail().equals(""))
            return "redirect:/index.jsp";
        String loginVcode = (String) session.getAttribute("loginVcode");
        String vcode = request.getParameter("vcode");
        if (!loginVcode.equals(vcode)){
            session.setAttribute("msg","验证码错误");
            return "redirect:/index.jsp";
        }
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) applicationContext.getBean("userServiceImpl");
        if (!userService.loginUser(user)){
            session.setAttribute("msg","用户名密码错误");
            return "redirect:/index.jsp";
        }
        User user1 = userService.selectUserByMail(user.getEmail());
        session.removeAttribute("loginVcode");
        session.setAttribute("user", user1);
        return "redirect:/index.jsp";
//        session.removeAttribute("user");
    }

    @RequestMapping("loginOut")
    public String loginOut(HttpSession session){
        session.invalidate();
        return "redirect:/index.jsp";
    }

    @RequestMapping("forgetPwd")
    @ResponseBody
    public String forgetPwd(HttpServletRequest request, HttpSession session){
        String mail = request.getParameter("mail");
        String vcode = request.getParameter("vcode");
        String mailVcode = (String) session.getAttribute("mailVcode");
        if (mailVcode == null || !mailVcode.equals(vcode)){
            return "{error : \"error\"}";
        }
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) applicationContext.getBean("userServiceImpl");
        userService.forgetPassword(mail);
        return "{success : \"success\"}";
    }
}
