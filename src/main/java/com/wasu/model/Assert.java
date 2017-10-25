package com.wasu.model;

import java.math.BigDecimal;
import java.util.Date;

public class Assert {
    private String assetcode;

    private BigDecimal id;

    private String assetsortname;

    private String name;

    private String norms;

    private Short unit;

    private Integer numbers;

    private BigDecimal price;

    private Short state;

    private String deptname;

    private String place;

    private String manufacturer;

    private Date buydate;

    private String projectid;

    private String projectname;

    private Short valid;

    private String remark;

    private String detailedlocation;

    private Short guarantee;

    private Short lifeperiods;

    private Short periodsused;

    public String getAssetcode() {
        return assetcode;
    }

    public void setAssetcode(String assetcode) {
        this.assetcode = assetcode == null ? null : assetcode.trim();
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getAssetsortname() {
        return assetsortname;
    }

    public void setAssetsortname(String assetsortname) {
        this.assetsortname = assetsortname == null ? null : assetsortname.trim();
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

    public Short getUnit() {
        return unit;
    }

    public void setUnit(Short unit) {
        this.unit = unit;
    }

    public Integer getNumbers() {
        return numbers;
    }

    public void setNumbers(Integer numbers) {
        this.numbers = numbers;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Short getState() {
        return state;
    }

    public void setState(Short state) {
        this.state = state;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname == null ? null : deptname.trim();
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place == null ? null : place.trim();
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer == null ? null : manufacturer.trim();
    }

    public Date getBuydate() {
        return buydate;
    }

    public void setBuydate(Date buydate) {
        this.buydate = buydate;
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

    public Short getValid() {
        return valid;
    }

    public void setValid(Short valid) {
        this.valid = valid;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getDetailedlocation() {
        return detailedlocation;
    }

    public void setDetailedlocation(String detailedlocation) {
        this.detailedlocation = detailedlocation == null ? null : detailedlocation.trim();
    }

    public Short getGuarantee() {
        return guarantee;
    }

    public void setGuarantee(Short guarantee) {
        this.guarantee = guarantee;
    }

    public Short getLifeperiods() {
        return lifeperiods;
    }

    public void setLifeperiods(Short lifeperiods) {
        this.lifeperiods = lifeperiods;
    }

    public Short getPeriodsused() {
        return periodsused;
    }

    public void setPeriodsused(Short periodsused) {
        this.periodsused = periodsused;
    }
}