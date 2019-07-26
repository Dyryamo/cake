package com.cake.controller;

import com.cake.utils.Vcode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.imageio.ImageIO;
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
            System.out.println("loginVcode = " + code);
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
            System.out.println("registerVcode = " + code);
            ImageIO.write(vcode.getBufferedImage(), "PNG", response.getOutputStream());
            session.setAttribute("registerVcode", code);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
