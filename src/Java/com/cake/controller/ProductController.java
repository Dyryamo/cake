package com.cake.controller;

import com.cake.bean.Product;
import com.cake.service.ProductService;
import com.cake.utils.Msg;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;


@Controller
@RequestMapping("/product")
public class ProductController {

    @RequestMapping("randomProduct")
    @ResponseBody
    public Msg randomProduct(HttpServletRequest request){
        String num = request.getParameter("num");
        if (num == null)
            return Msg.fail();
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ProductService productService = (ProductService) applicationContext.getBean("productServiceImpl");
        return Msg.success().add("products", productService.getRandomProduct(Integer.parseInt(num)));
    }

    @RequestMapping("allProduct")
    @ResponseBody
    public Msg allProduct(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ProductService productService = (ProductService) applicationContext.getBean("productServiceImpl");
        return Msg.success().add("products", productService.allProducts());
    }

    @RequestMapping("searchProduct")
    @ResponseBody
    public Msg searchProduct(HttpServletRequest request){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ProductService productService = (ProductService) applicationContext.getBean("productServiceImpl");
        String minDis = request.getParameter("minDis");
        String maxDis = request.getParameter("maxDis");
        String minPrice = request.getParameter("minPrice");
        String maxPrice = request.getParameter("maxPrice");
        return Msg.success().add("products", productService.searchProduct(Integer.parseInt(minPrice), Integer.parseInt(maxPrice), Integer.parseInt(minDis), Integer.parseInt(maxDis)));
    }
}
/*minDis : minDis,
maxDis : maxDis,
minPrice : minPrice,
maxPrice : maxPrice*/