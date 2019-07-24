package com.cake.service.Impl;

import com.cake.bean.Cart;
import com.cake.dao.CartMapper;
import com.cake.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("CartServiceImpl")
public class CartServiceImpl implements CartService {

    @Autowired
    CartMapper cartMapper;

    @Override
    public List<Cart> getAllCartList() {
        List<Cart> cartList =  cartMapper.selectByExample(null);
        return cartList;
    }
}
