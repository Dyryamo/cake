package com.cake.service.Impl;

import com.cake.bean.*;
import com.cake.dao.ProductMapper;
import com.cake.dao.UserMapper;
import com.cake.service.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdminstratorServiceImpl implements AdministratorService
{

    @Autowired
    ProductMapper productMapper;

    @Autowired
    UserMapper userMapper;

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

    @Override
    public boolean verifyAdminstrator(String username, String password) {
//        UserExample userExample = new UserExample();
//
//        UserExample.Criteria criteria = userExample.createCriteria();
//        criteria.andEmailEqualTo(email).andPasswordEqualTo(pwd);
//        List<User> users = userMapper.selectByExample(userExample);
//        if (users.size() == 0)
//            return false;
//        return true;
        return true;
    }

    @Override
    public Product getProductByID(int id) {
        return productMapper.selectByPrimaryKey(id);
    }

    @Override
    public void updateByProduct(Product product) {
//        CartExample cartExample = new CartExample();
//        CartExample.Criteria criteria = cartExample.createCriteria();
//        criteria.andIdEqualTo(id);
//        ProductExample productExample = new ProductExample();
//        ProductExample.Criteria criteria = productExample.createCriteria();
//        criteria.and
        productMapper.updateByPrimaryKey(product);
    }
}
