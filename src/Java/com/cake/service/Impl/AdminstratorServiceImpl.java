package com.cake.service.Impl;

import com.cake.bean.Order;
import com.cake.bean.Product;
import com.cake.dao.ProductMapper;
import com.cake.service.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdminstratorServiceImpl implements AdministratorService
{

    @Autowired
    ProductMapper productMapper;

    @Override
    public void addProduct(Product product) {
        product.setId(null);
        productMapper.insertSelective(product);
    }

    @Override
    public void deleteProduct(Product product) {
        productMapper.deleteByPrimaryKey(product.getId());
    }

    @Override
    public List<Product> getAllProduct() {
        return productMapper.selectByExample(null);
    }

    @Override
    public void deleteOrder(Order order) {

    }
}
