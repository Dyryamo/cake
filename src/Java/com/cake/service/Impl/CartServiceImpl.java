package com.cake.service.Impl;

import com.cake.bean.Cart;
import com.cake.bean.CartExample;
import com.cake.dao.CartMapper;
import com.cake.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CartServiceImpl implements CartService {

    @Autowired
    CartMapper cartMapper;

    @Override
    public List<Cart> getAllCartList() {
//        System.out.println(cartMapper);
        List<Cart> cartList =  cartMapper.selectByExample(null);
        System.out.println(cartList);
        return cartList;
    }

    @Override
    public boolean alterCartListByCartList(Cart cartList) {
        cartMapper.updateByPrimaryKeySelective(cartList);
        return true;
    }

    @Override
    public void addCartList(Cart cartList) {
        cartList.setId(null);
        cartMapper.insertSelective(cartList);
    }

    @Override
    public void deleteCartList(Cart cartList){
        cartMapper.deleteByPrimaryKey(cartList.getId());
    }


    @Override
    public Cart getCartById(int id){
        return cartMapper.selectByPrimaryKey(id);
    }

    @Override
    public void alterNumberByID(int id, int number) {
//        OrderExample orderExample = new OrderExample();
//        OrderExample.Criteria criteria = orderExample.createCriteria();
//        criteria.andUseridEqualTo(id);
//        List<Order> result =  orderMapper.selectByExample(orderExample);

//        CartExample cartExample = new CartExample();
//        CartExample.Criteria criteria = cartExample.createCriteria();
//        criteria.andIdEqualTo(id);
//        criteria.

        Cart cart = cartMapper.selectByPrimaryKey(id);
        cart.setNumber(number);
        cartMapper.updateByPrimaryKey(cart);
    }
}
