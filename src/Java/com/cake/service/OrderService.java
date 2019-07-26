package com.cake.service;

import com.cake.bean.Order;

import java.util.List;
import java.util.Map;

public interface OrderService {
    public void createOrder();
    public void createOrder(Object user,int addr, Map<String, String> obj);
    public List<Order> getOrderByUserID(int id);
    public  int getLastId();
}
