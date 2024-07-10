package com.ipipv.open.dto;

public class AppInstanceReleaseReq {
    private String orderNo;   //购买者订单号(渠道商订单号)
    private String instances; //平台实例编号

    public String getorderNo() {
        return orderNo;
    }

    public void setorderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getinstances() {
        return instances;
    }

    public void setinstances(String instances) {
        this.instances = instances;
    }
}