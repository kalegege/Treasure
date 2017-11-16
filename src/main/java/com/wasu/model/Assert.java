package com.wasu.model;

import java.util.Date;

public class Assert {
    private String assetcode;

    private String address;

    private String assetsortname;

    private Date buydate;

    private String deptname;

    private String detailedlocation;

    private Long guarantee;

    private Date inventorydate;

    private Long inventorystate;

    private Double latitude;

    private Long lifeperiods;

    private Double longitude;

    private String manufacturer;

    private String name;

    private String norms;

    private Long numbers;

    private Long periodsused;

    private String photo;

    private String place;

    private Long price;

    private String projectid;

    private String projectname;

    private String remark;

    private Long state;

    private Long unit;

    private Long valid;

    private String inventoryRemark;

    private String inventoryUser;

    public Assert() {
    }

    public Assert(String assetcode, String address, Date inventorydate, Double latitude, Double longitude, String photo) {
        this.assetcode = assetcode;
        this.address = address;
        this.inventorydate = inventorydate;
        this.latitude = latitude;
        this.longitude = longitude;
        this.photo = photo;
    }

    public String getAssetcode() {
        return assetcode;
    }

    public void setAssetcode(String assetcode) {
        this.assetcode = assetcode == null ? null : assetcode.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getAssetsortname() {
        return assetsortname;
    }

    public void setAssetsortname(String assetsortname) {
        this.assetsortname = assetsortname == null ? null : assetsortname.trim();
    }

    public Date getBuydate() {
        return buydate;
    }

    public void setBuydate(Date buydate) {
        this.buydate = buydate;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname == null ? null : deptname.trim();
    }

    public String getDetailedlocation() {
        return detailedlocation;
    }

    public void setDetailedlocation(String detailedlocation) {
        this.detailedlocation = detailedlocation == null ? null : detailedlocation.trim();
    }

    public Long getGuarantee() {
        return guarantee;
    }

    public void setGuarantee(Long guarantee) {
        this.guarantee = guarantee;
    }

    public Date getInventorydate() {
        return inventorydate;
    }

    public void setInventorydate(Date inventorydate) {
        this.inventorydate = inventorydate;
    }

    public Long getInventorystate() {
        return inventorystate;
    }

    public void setInventorystate(Long inventorystate) {
        this.inventorystate = inventorystate;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Long getLifeperiods() {
        return lifeperiods;
    }

    public void setLifeperiods(Long lifeperiods) {
        this.lifeperiods = lifeperiods;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer == null ? null : manufacturer.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getNorms() {
        return norms;
    }

    public void setNorms(String norms) {
        this.norms = norms == null ? null : norms.trim();
    }

    public Long getNumbers() {
        return numbers;
    }

    public void setNumbers(Long numbers) {
        this.numbers = numbers;
    }

    public Long getPeriodsused() {
        return periodsused;
    }

    public void setPeriodsused(Long periodsused) {
        this.periodsused = periodsused;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place == null ? null : place.trim();
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getProjectid() {
        return projectid;
    }

    public void setProjectid(String projectid) {
        this.projectid = projectid == null ? null : projectid.trim();
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname == null ? null : projectname.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Long getState() {
        return state;
    }

    public void setState(Long state) {
        this.state = state;
    }

    public Long getUnit() {
        return unit;
    }

    public void setUnit(Long unit) {
        this.unit = unit;
    }

    public Long getValid() {
        return valid;
    }

    public void setValid(Long valid) {
        this.valid = valid;
    }

    public String getInventoryRemark() {
        return inventoryRemark;
    }

    public void setInventoryRemark(String inventoryRemark) {
        this.inventoryRemark = inventoryRemark == null ? null : inventoryRemark.trim();
    }

    public String getInventoryUser() {
        return inventoryUser;
    }

    public void setInventoryUser(String inventoryUser) {
        this.inventoryUser = inventoryUser == null ? null : inventoryUser.trim();
    }
}