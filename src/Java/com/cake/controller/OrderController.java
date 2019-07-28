package com.cake.controller;

import com.cake.bean.*;
import com.cake.dao.AssociateOrderAndProductMapper;
import com.cake.service.OrderService;
import com.cake.utils.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.mail.Session;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller

public class OrderController {

    @Autowired
    OrderService orderService;


    @Autowired
    AssociateOrderAndProductMapper associateOrderAndProductMapper;

    @RequestMapping("/createOrderController")
    @ResponseBody
    public Msg createOrderController(@RequestBody Map<String,String> Obj, HttpSession session){
        /*
        *
        *   测试json 数据
        * */
        Msg msg = Msg.success();

        for(String key : Obj.keySet()) {
            System.out.println(key + " " + Obj.get(key));
        }

        User user = (User) session.getAttribute("user");
        //  用户尚未登录
        if(session.getAttribute("user") == null){
            msg.add("UserExist","false");
        }else{
            msg.add("UserExist","true").add("OrderList",orderService.getOrderByUserID(user.getId()));
        }

        return msg;
    }
    @RequestMapping("/getOrderInformation")
    @ResponseBody
    public Msg getOrderInformation(HttpSession session){

        System.out.println("hello");

        User user = new User();
        user.setId(1);
        System.out.println(user);
        List<Order> orders = orderService.getOrderByUserID(user.getId());

        for(Order order : orders){
            AssociateOrderAndProductExample associateOrderAndProductExample = new AssociateOrderAndProductExample();
            AssociateOrderAndProductExample.Criteria criteria = associateOrderAndProductExample.createCriteria();
            criteria.andProductidEqualTo(order.getId());
            List<AssociateOrderAndProduct> result = associateOrderAndProductMapper.selectByExample(associateOrderAndProductExample);
            List<Product> products = new ArrayList<>();
            for(AssociateOrderAndProduct associateOrderAndProduct : result){
                products.add(associateOrderAndProduct.getProduct());
            }
            order.setProductsEntity(products);
        }
        System.out.println(orders.get(orders.size() - 1));
        return Msg.success().add("order",orders.get(orders.size() - 1));
    }


    @RequestMapping("/sendCartListAndCreateOrder")
    @ResponseBody
    public Msg sendCartListAndCreateOrder(@RequestParam("checkList") String checkList,HttpSession session){
        System.out.println(checkList);
        checkList.split(" ");
        User user = (User) session.getAttribute("user");
        Map<String,String >obj = new HashMap<>();
        orderService.createOrder(user,1,obj);
        for(String a : checkList.split(" ")){

            obj.put(a,a);
        }
        orderService.createOrder(user,1,obj);
        return Msg.success();
    }
}
