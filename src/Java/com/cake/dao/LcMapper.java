package com.cake.dao;

import com.cake.bean.Product;

import java.util.List;

public interface LcMapper {
    public int lastUserId();
    public List<Product> limitProduct(int start, int num);
    public int allProductCount();
}
