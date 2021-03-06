package com.cake.controller;

import com.cake.bean.Order;
import com.cake.bean.Product;
import com.cake.service.AdministratorService;
import com.cake.service.OrderService;
import com.cake.service.UserService;
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
import java.util.List;

@Controller
public class AdministratorController {

    @Autowired
    AdministratorService administratorService;

    @Autowired
    UserService userService;
//    @Autowired
//    OrderService orderService;

    @RequestMapping("/verifyAdministratorPassword")
    @ResponseBody
    public Msg VerifyAdministratorPassword(String username, String password, HttpSession session) {

        System.out.println("verify");
        System.out.println(username + " " + password);
        ModelAndView modelAndView = new ModelAndView();
        if (administratorService.verifyAdminstrator(username, password)) {
            session.setAttribute("admin", username);
            modelAndView.setViewName("accounts.html");
        }
        return Msg.success().add("loginStatus", true);
    }

    @RequestMapping("/getAllItem")
    @ResponseBody
    public Msg getAllItem() {
        return Msg.success().add("Items", administratorService.getAllProduct());
//        return null;
    }

    @RequestMapping("deleteProduct")
    @ResponseBody
    public Msg deleteProduct(Integer id) {
        Product tpr = new Product();
        tpr.setId(id);
        administratorService.deleteProduct(tpr);
        return Msg.success().add("result", true);
    }


    @RequestMapping("/uploadBySpringMVC.do")
    @ResponseBody
    public Msg uploadBySpringMVC(@RequestParam(value = "myFile", required = false) CommonsMultipartFile file,
                                 String name, String Introduce, @RequestParam(value = "Category", required = false) String Category, float price, int discount, int stock,
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
        if (file.isEmpty()) {
            return Msg.success().add("status", false);// w为空
        }

        String path = "/home/zhong/image/" + file.getOriginalFilename();
//          String path = "120.79.249.199" + file.getOriginalFilename();
//        String path= "/home/zhong/IdeaProjects/roseTestPicture/src/main/webapp/Resource/images/UserResource/Picture/" + file.getOriginalFilename();
//        httpServletRequest.getSession().getServletContext().getRealPath("/");
//        path += httpServletRequest.getContextPath();
//        path +=  "/roseTestPicture/UserResource/Picture/" + file.getOriginalFilename();
        System.out.println(path);
        File newFile = new File(path);
        if (!newFile.exists()) {
            newFile.mkdirs();
        }
        file.transferTo(newFile);
        administratorService.addProduct(product);
        return Msg.success().add("status", true).add("photoPath", file.getOriginalFilename());
    }

    @RequestMapping("getAllUserInfo")
    @ResponseBody
    public Msg getAllUserInfo() {
        System.out.println("getUserInfo");
        return Msg.success().add("UserInfo", userService.allUserInfo());
    }

    @RequestMapping("getUserByID")
    @ResponseBody
    public Msg getUserByID(Integer id) {
//        System.out.println("getUserByID");
//        List<Order> order = orderService.getOrderByUserID(id);
        return Msg.success().add("UserInfo", userService.selectUserById(id));
    }


    @RequestMapping("saveEditCurrentID")
    @ResponseBody
    public Msg saveEditCurrentID(Integer EditUserID, HttpSession session) {
        session.setAttribute("EditID", EditUserID);
        System.out.println("user" + session.getAttribute("EditID"));
        return Msg.success();
    }

    @RequestMapping("getEditCurrentInfo")
    @ResponseBody
    public Msg getEditCurrentInfo(HttpSession session) {

        Integer id = (Integer) session.getAttribute("EditID");
        System.out.println(id);
//        return null;
        return Msg.success().add("UserInfo", administratorService.getProductByID(id));
    }

    @RequestMapping("alterProductInfo")
    @ResponseBody
    public Msg alterProductInfo(@RequestParam(value = "myFile", required = false) CommonsMultipartFile file,
                                String name, String Introduce, @RequestParam(value = "Category", required = false) String Category, float price, int discount, int stock,
                                HttpSession session) throws IOException {

        System.out.println("------------------------------------");
        Integer id = (Integer) session.getAttribute("EditID");
        System.out.println("alterProduct");
        Product product = administratorService.getProductByID(id);

        product.setName(name);
        product.setPrice(price);
        product.setDiscount(discount * 10);
        product.setNumber(stock);
        product.setPhotopath(file.getOriginalFilename());
        product.setRelationid(1);
        product.setThemeid(1);
        product.setFlavourid(1);


        if (file.isEmpty()) {
            return Msg.success().add("status", false);// w为空
        }

        String path = "/home/zhong/image/" + file.getOriginalFilename();

        System.out.println(path);
        File newFile = new File(path);
        if (!newFile.exists()) {
            newFile.mkdirs();
        }

        file.transferTo(newFile);
        administratorService.updateByProduct(product);
        return Msg.success().add("status", true).add("photoPath", file.getOriginalFilename());

    }
}