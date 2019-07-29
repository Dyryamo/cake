package com.cake.bean;

public class OrderTmp {
    int id;
    int productid;
    int orderid;
    private Product product;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "OrderTmp{" +
                "id=" + id +
                ", productid=" + productid +
                ", orderid=" + orderid +
                ", product=" + product +
                '}';
    }
}
