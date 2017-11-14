package com.wasu.model;

import java.util.Date;

public class Inventory {
    private Long id;

    private Long assetNum;

    private Long completeNum;

    private Long departmentId;

    private Date endTime;

    private Long noNum;

    private Date startTime;

    private Long state;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAssetNum() {
        return assetNum;
    }

    public void setAssetNum(Long assetNum) {
        this.assetNum = assetNum;
    }

    public Long getCompleteNum() {
        return completeNum;
    }

    public void setCompleteNum(Long completeNum) {
        this.completeNum = completeNum;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Long getNoNum() {
        return noNum;
    }

    public void setNoNum(Long noNum) {
        this.noNum = noNum;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Long getState() {
        return state;
    }

    public void setState(Long state) {
        this.state = state;
    }
}