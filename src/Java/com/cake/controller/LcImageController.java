package com.cake.controller;

import com.cake.utils.SendMail;
import com.cake.utils.Vcode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.imageio.ImageIO;
import javax.mail.MessagingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@RequestMapping("/image")
@Controller
public class LcImageController {

    @RequestMapping("loginVcode")
    public @ResponseBody void getLoginVcode(HttpSession session, HttpServletResponse response){
        try {
            Vcode vcode = new Vcode();
            String code = vcode.getText();
            ImageIO.write(vcode.getBufferedImage(), "PNG", response.getOutputStream());
            session.setAttribute("loginVcode", code);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("registerVcode")
    public @ResponseBody void getRegisterVcode(HttpSession session, HttpServletResponse response){
        try {
            Vcode vcode = new Vcode();
            String code = vcode.getText();
            ImageIO.write(vcode.getBufferedImage(), "PNG", response.getOutputStream());
            session.setAttribute("registerVcode", code);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("sendMail")
    public @ResponseBody void sendMail(HttpSession session, HttpServletRequest request){
        try {
            String mail = request.getParameter("email");
            if (mail == null)
                return;
            SendMail sendMail = new SendMail();
            String mailCode = sendMail.getText();
            sendMail.SendYourMail(mail);
            session.setAttribute("mailVcode", mailCode);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
