package com.cake.bean;

public class Cart {

    /*
    *
    *  自己写的
    *
    * */
    private User user;

    private Product product;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Product getProduct() {
        return product;
    }

    /*
     * ********************/
    private Integer id;

    private Integer userid;

    private Integer productid;

    private Integer number;



    public void setProduct(Product product) {
        this.product = product;
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

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "user=" + user +
                ", product=" + product +
                ", id=" + id +
                ", userid=" + userid +
                ", productid=" + productid +
                ", number=" + number +
                '}';
    }
}