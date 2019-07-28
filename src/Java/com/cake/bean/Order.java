package com.cake.bean;

import java.util.List;

public class Order {
    private Integer id;

    private Integer userid;


    private Integer products;

    private Integer address;

    private Addr addr;

    public void setUser(User user) {
        this.user = user;
    }

    private User user;

    private List<Product> productsEntity;

    public List<Product> getProductsEntity() {
        return productsEntity;
    }

    public void setProductsEntity(List<Product> productsEntity) {
        this.productsEntity = productsEntity;
    }

    public Addr getAddr() {
        return addr;
    }

    public void setAddr(Addr addr) {
        this.addr = addr;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getProducts() {
        return products;
    }

    public void setProducts(Integer products) {
        this.products = products;
    }

    public Integer getAddress() {
        return address;
    }

    public void setAddress(Integer address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", userid=" + userid +
                ", products=" + products +
                ", address=" + address +
                ", addr=" + addr +
                ", user=" + user +
                ", productsEntity=" + productsEntity +
                '}';
    }
}