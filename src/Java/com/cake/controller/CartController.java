package com.cake.controller;

import com.cake.service.CartService;
import com.cake.service.Impl.CartServiceImpl;
import com.cake.utils.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CartController {
    @Autowired
    CartService cartService;

    @RequestMapping("/CartData")
    @ResponseBody
    public Msg getCartData(){
        return Msg.success().add("cartList",cartService.getAllCartList());
    }
    @RequestMapping("/alterOrderNumberByID")
    @ResponseBody
    public Msg alterOrderNumberByIdController(@RequestParam("id") int id,@RequestParam("number") int number){

        cartService.alterNumberByID(id,number);
        return null;
    }

}
