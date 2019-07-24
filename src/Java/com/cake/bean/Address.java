package com.cake.bean;

public class Address {
    private Integer addressid;

    private String usrcountry;

    private String usrprovince;

    private String usrcity;

    private String usremail;

    public Integer getAddressid() {
        return addressid;
    }

    public void setAddressid(Integer addressid) {
        this.addressid = addressid;
    }

    public String getUsrcountry() {
        return usrcountry;
    }

    public void setUsrcountry(String usrcountry) {
        this.usrcountry = usrcountry == null ? null : usrcountry.trim();
    }

    public String getUsrprovince() {
        return usrprovince;
    }

    public void setUsrprovince(String usrprovince) {
        this.usrprovince = usrprovince == null ? null : usrprovince.trim();
    }

    public String getUsrcity() {
        return usrcity;
    }

    public void setUsrcity(String usrcity) {
        this.usrcity = usrcity == null ? null : usrcity.trim();
    }

    public String getUsremail() {
        return usremail;
    }

    public void setUsremail(String usremail) {
        this.usremail = usremail == null ? null : usremail.trim();
    }
}