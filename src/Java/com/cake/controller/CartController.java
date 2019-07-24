package com.cake.controller;

import com.cake.service.CartService;
import com.cake.service.Impl.CartServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class CartController {
    @Autowired
    CartServiceImpl cartService;

}
