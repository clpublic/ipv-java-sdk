package com.ipipv.open.dto;

public class AppInstanceRenewReq {
    private String appOrderNo;   //购买者订单号(渠道商订单号)
    private Instance instances;  //实例列表
    private String instanceNo;   //平台实例编号
    private String duration;     //可选 时长 默认1

    public String getappOrderNo() {
    return appOrderNo;
    }
    
    public void setappOrderNo(String appOrderNo) {
        this.appOrderNo = appOrderNo;
    }
    
    public String getinstances() {
    return instances;
    }
    
    public void setinstances(String instances) {
        this.instances = instances;
    }

    public int getinstanceNo() {
    return instanceNo;
    }
    
    public void setinstanceNo(int instanceNo) {
        this.instanceNo = instanceNo;
    }

    public int getduration() {
    return duration;
    }
    
    public void setduration(int duration) {
        this.duration = duration;
    }
}