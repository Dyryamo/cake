package com.cake.controller;

import com.cake.bean.Order;
import com.cake.bean.User;
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

        User user = (User) session.getAttribute("user");
        System.out.println(user);
        List<Order> orders = orderService.getOrderByUserID(user.getId());

        System.out.println(orders);
        return Msg.success();
    }


    @RequestMapping("/sendCartListAndCreateOrder")
    @ResponseBody
    public Msg sendCartListAndCreateOrder(@RequestParam("checkList") String checkList,HttpSession session){
        System.out.println(checkList);
        checkList.split(" ");
        User user = (User) session.getAttribute("user");
        Map<String,String >obj = new HashMap<>();
//        obj.put("1","1");
        orderService.createOrder(user,1,obj);
        for(String a : checkList.split(" ")){
//            System.out.println(a);
//            orderList.add(Integer.parseInt(a));
            obj.put(a,a);
//            orderService.createOrder(user,1,obj);
        }
        orderService.createOrder(user,1,obj);
        return Msg.success();
    }
}
