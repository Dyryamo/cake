package com.cake.service;

import com.cake.bean.Product;

import java.util.List;

public interface ProductService {
    public List<Product> getRandomProduct(int num);
    public void addProduct(Product product);
    public void deleteProduct(int id);
    public void updateProduct(Product product);
    public List<Product> getPageProduct(int start, int num);
    public Product getTheProductById(int id);
    public List<Product> searchProduct(int minPrice, int maxPrice, int minDisCount, int maxIdsCountt);
    public int allProductCount();
    public List<Product> allProducts();
}
