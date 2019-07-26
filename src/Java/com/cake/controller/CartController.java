package com.cake.controller;

import com.cake.service.CartService;
import com.cake.service.Impl.CartServiceImpl;
import com.cake.utils.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CartController {
    @Autowired
    CartService cartService;

    @RequestMapping("/CartData")
    @ResponseBody
    public Msg getCartData(){
//        cartService.addCartList();
        return Msg.success().add("cartList",cartService.getAllCartList());
    }
}
