package com.cake.bean;

import java.util.List;

public class AssociateOrderAndProduct {
    private Integer id;

    private Integer productid;

    private Integer orderid;

    private Product product;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    @Override
    public String toString() {
        return "AssociateOrderAndProduct{" +
                "id=" + id +
                ", productid=" + productid +
                ", orderid=" + orderid +
                ", product=" + product +
                '}';
    }
}