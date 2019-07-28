package com.cake.service;

import com.cake.bean.Order;
import com.cake.bean.Product;

import java.util.List;

public interface AdministratorService {


    // 对product进行操作
    public void addProduct(Product product);
    public void deleteProduct(Product product);
    public List<Product> getAllProduct();

    // 对user进行管理

    // 对订单进行管理
    public void deleteOrder(Order order);
    public boolean verifyAdminstrator(String username,String password);

}
