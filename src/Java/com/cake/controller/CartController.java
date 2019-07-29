package com.cake.controller;

import com.cake.bean.Cart;
import com.cake.bean.Product;
import com.cake.bean.User;
import com.cake.service.CartService;
import com.cake.service.Impl.CartServiceImpl;
import com.cake.service.ProductService;
import com.cake.service.UserService;
import com.cake.utils.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class CartController {
    @Autowired
    CartService cartService;

    @RequestMapping("/CartData")
    @ResponseBody
    public Msg getCartData(HttpSession session){
//        cartService.addCartList();
        User user = (User) session.getAttribute("user");
//        System.out.println(u);
        if( user == null){
            return Msg.success().add("loginStatus",false);
        }
        return Msg.success().add("loginStatus",true).add("cartList",cartService.getAllCartList(user.getId()));
    }

    @RequestMapping("/addCar")
    @ResponseBody
    public String addCar(Cart cart){
        System.out.println(cart.toString());
        int userId = cart.getUserid();
        int productId = cart.getProductid();
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ProductService productService = (ProductService) applicationContext.getBean("productServiceImpl");
        UserService userService = (UserService) applicationContext.getBean("userServiceImpl");
        CartService cartService = (CartService) applicationContext.getBean("cartServiceImpl");
        Product product = productService.getTheProductById(productId);
        User user = userService.selectUserById(userId);
        cart.setProduct(product);
        cart.setUser(user);
        cartService.addCartList(cart);
        return "{\"success\":\"success\"}";
    }
}
