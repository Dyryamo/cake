package com.cake.bean;

public class Product {

    private Integer id;

    private String name;

    private Float price;

    private Integer size;

    private Integer discount;

    private Integer relationid;

    private Integer flavourid;

    private Integer themeid;

    private Integer type;

    private String photopath;

    private Integer star;

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", size=" + size +
                ", discount=" + discount +
                ", relationid=" + relationid +
                ", flavourid=" + flavourid +
                ", themeid=" + themeid +
                ", type=" + type +
                ", photopath='" + photopath + '\'' +
                ", star=" + star +
                ", number=" + number +
                '}';
    }

    private Integer number;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public Integer getRelationid() {
        return relationid;
    }

    public void setRelationid(Integer relationid) {
        this.relationid = relationid;
    }

    public Integer getFlavourid() {
        return flavourid;
    }

    public void setFlavourid(Integer flavourid) {
        this.flavourid = flavourid;
    }

    public Integer getThemeid() {
        return themeid;
    }

    public void setThemeid(Integer themeid) {
        this.themeid = themeid;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getPhotopath() {
        return photopath;
    }

    public void setPhotopath(String photopath) {
        this.photopath = photopath == null ? null : photopath.trim();
    }

    public Integer getStar() {
        return star;
    }

    public void setStar(Integer star) {
        this.star = star;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}