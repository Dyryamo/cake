package com.cake.service.Impl;

import com.cake.bean.Product;
import com.cake.bean.ProductExample;
import com.cake.dao.LcMapper;
import com.cake.dao.ProductMapper;
import com.cake.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("productServiceImpl")
public class ProductServiceImpl implements ProductService {

    @Autowired
    LcMapper lcMapper;

    @Autowired
    ProductMapper productMapper;

    @Override
    public List<Product> getRandomProduct(int num) {
        List<Product> products = productMapper.selectByExample(null);
        List<Product> allproduct = new ArrayList<>();
        for (int i=0; i<num ; i++){
            int id = (int)(Math.random()*(products.size()-1+1));
            allproduct.add(products.get(id));
        }
        return allproduct;
    }

    @Override
    public void addProduct(Product product) {
        productMapper.insert(product);
    }

    @Override
    public void deleteProduct(int id) {
        productMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void updateProduct(Product product) {
        productMapper.updateByPrimaryKey(product);
    }

    @Override
    public List<Product> getPageProduct(int start, int num) {
        return lcMapper.limitProduct(start, num);
    }

    @Override
    public Product getTheProductById(int id) {
        return productMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Product> searchProduct(int minPrice, int maxPrice, int minDisCount, int maxIdsCount) {
        ProductExample productExample = new ProductExample();
        ProductExample.Criteria criteria = productExample.createCriteria();
        criteria.andPriceBetween(minPrice*1.0f, maxPrice*1.0f).andDiscountBetween(minDisCount, maxIdsCount);
        return productMapper.selectByExample(productExample);
    }

    @Override
    public int allProductCount() {
        return lcMapper.allProductCount();
    }

    @Override
    public List<Product> allProducts() {
        return productMapper.selectByExample(null);
    }
}
