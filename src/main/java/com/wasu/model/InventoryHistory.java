package com.wasu.model;

import java.util.Date;

public class InventoryHistory {
    private Long id;

    private String address;

    private String assetcode;

    private String deptname;

    private Long inventoryId;

    private String inventoryRemark;

    private String inventoryUser;

    private Date inventorydate;

    private Long inventorystate;

    private Long latitude;

    private Long longitude;

    private String name;

    private String photo;

    private String place;

    public InventoryHistory() {
    }

    public InventoryHistory(Long id, String address, Date inventorydate, Long latitude, Long longitude, String photo) {
        this.id = id;
        this.address = address;
        this.inventorydate = inventorydate;
        this.latitude = latitude;
        this.longitude = longitude;
        this.photo = photo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getAssetcode() {
        return assetcode;
    }

    public void setAssetcode(String assetcode) {
        this.assetcode = assetcode == null ? null : assetcode.trim();
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname == null ? null : deptname.trim();
    }

    public Long getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(Long inventoryId) {
        this.inventoryId = inventoryId;
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

    public Long getLatitude() {
        return latitude;
    }

    public void setLatitude(Long latitude) {
        this.latitude = latitude;
    }

    public Long getLongitude() {
        return longitude;
    }

    public void setLongitude(Long longitude) {
        this.longitude = longitude;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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
}