package com.cake.service.Impl;

import com.cake.bean.AssociateOrderAndProduct;
import com.cake.bean.Cart;
import com.cake.bean.Order;
import com.cake.bean.OrderExample;
import com.cake.dao.AssociateOrderAndProductMapper;
import com.cake.dao.CartMapper;
import com.cake.dao.OrderMapper;
import com.cake.service.CartService;
import com.cake.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

public class OrderServiceImpl implements OrderService {


    @Autowired
    OrderMapper orderMapper;

    @Autowired
    CartService cartService;


    @Autowired
    AssociateOrderAndProductMapper associateOrderAndProductMapper;

    @Override
    public void createOrder() {


    }
    @Override
    public int getLastId(){
        return orderMapper.selectLastPrimaryKey();
    }


    @Override
    public void createOrder(Object user,int addr, Map<String, String> obj) {

        for(String key : obj.keySet()){

            Cart cart = cartService.getCartById(Integer.parseInt(obj.get(key)));
            Order order = new Order();

            order.setUserid(cart.getUserid());
            order.setAddress(addr);
            order.setProducts(associateOrderAndProductMapper.selectLastID() + 1);

            orderMapper.insertSelective(order);

            AssociateOrderAndProduct associateOrderAndProduct = new AssociateOrderAndProduct();
            associateOrderAndProduct.setProductid(cart.getProductid());
            associateOrderAndProduct.setOrderid(getLastId());

            associateOrderAndProductMapper.insertSelective(associateOrderAndProduct);

//            order = orderMapper.selectByPrimaryKey(getLastId() + 1);
//            order.setProducts(associateOrderAndProductMapper.selectLastID());
//
//            orderMapper.updateByPrimaryKey(order);



        }
    }

    @Override
    public List<Order> getOrderByUserID(int id){
        OrderExample orderExample = new OrderExample();
        OrderExample.Criteria criteria = orderExample.createCriteria();
        criteria.andUseridEqualTo(id);
        List<Order> result =  orderMapper.selectByExample(orderExample);

        return result;
    }

}
