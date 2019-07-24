package com.cake.service;

import com.cake.bean.Cart;

import java.util.List;

public interface CartService {

    public List<Cart> getAllCartList();
    public boolean alterCartListByCartList(Cart cartList);
    public void addCartList(Cart cartList);
    public void deleteCartList(Cart cartList);
}
