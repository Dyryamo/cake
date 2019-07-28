package com.cake.controller;

import com.cake.bean.Product;
import com.cake.service.AdministratorService;
import com.cake.utils.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;

@Controller
public class AdministratorController {

    @Autowired
    AdministratorService administratorService;



    @RequestMapping("/verifyAdministratorPassword")
    @ResponseBody
    public Msg VerifyAdministratorPassword(String username, String password, HttpSession session){

        System.out.println("verify");
        System.out.println(username + " " + password);
        ModelAndView modelAndView = new ModelAndView();
        if(administratorService.verifyAdminstrator(username,password)){
            session.setAttribute("admin",username);
            modelAndView.setViewName("accounts.html");
        }
        return Msg.success().add("loginStatus",true);
    }
    @RequestMapping("/getAllItem")
    @ResponseBody
    public Msg getAllItem(){
        return Msg.success().add("Items",administratorService.getAllProduct());
//        return null;
    }

    @RequestMapping("deleteProduct")
    @ResponseBody
    public Msg deleteProduct(Integer id){
        Product tpr= new Product();
        tpr.setId(id);
        administratorService.deleteProduct(tpr);
        return Msg.success().add("result",true);
    }


    @RequestMapping("/uploadBySpringMVC.do")
    public Msg uploadBySpringMVC(@RequestParam(value = "myFile",required = false) CommonsMultipartFile file,
                                 String name , String Introduce , @RequestParam(value = "Category",required = false) String Category, float price, int discount,int stock,
                                 HttpServletRequest httpServletRequest) throws IOException {
        System.out.println(file);
        System.out.println(name);

        System.out.println(Introduce);
        System.out.println(Category);
        System.out.println(price);
        System.out.println(discount);
        System.out.println(stock);

        Product product = new Product();
        product.setName(name);
        product.setPrice(price);
        product.setDiscount(discount * 10);
        product.setNumber(stock);
        product.setPhotopath(file.getOriginalFilename());
        product.setRelationid(1);
        product.setThemeid(1);
        product.setFlavourid(1);
        if(file.isEmpty()){
            return Msg.success().add("status",false);// w为空
        }

        String  path = "/home/zhong/image/" + file.getOriginalFilename();
//          String path = "120.79.249.199" + file.getOriginalFilename();
//        String path= "/home/zhong/IdeaProjects/roseTestPicture/src/main/webapp/Resource/images/UserResource/Picture/" + file.getOriginalFilename();
//        httpServletRequest.getSession().getServletContext().getRealPath("/");
//        path += httpServletRequest.getContextPath();
//        path +=  "/roseTestPicture/UserResource/Picture/" + file.getOriginalFilename();
        System.out.println(path);
        File newFile = new File(path);
        if(!newFile.exists()){
            newFile.mkdirs();
        }
        file.transferTo(newFile);
        administratorService.addProduct(product);
        return Msg.success().add("status",true);
    }
}