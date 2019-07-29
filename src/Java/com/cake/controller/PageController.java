package com.cake.controller;

import com.cake.bean.Product;
import com.cake.service.ProductService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/")
public class PageController {

    @RequestMapping("toSingle")
    public String toSingle(HttpServletRequest request, HttpSession session){
        String productId = request.getParameter("productId");
        if (productId == null || "".equals(productId))
            return "redirect:/index.jsp";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ProductService productService = (ProductService) applicationContext.getBean("productServiceImpl");
        Product product = productService.getTheProductById(Integer.parseInt(productId));
        session.setAttribute("product", product);
        return "redirect:/single.jsp";
    }
}
