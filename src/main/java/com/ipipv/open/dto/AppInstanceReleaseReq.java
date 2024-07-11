package com.ipipv.open.dto;

import java.util.List;

public class AppInstanceReleaseReq {
    private String orderNo;   //购买者订单号(渠道商订单号)
    private List<String> instances; //平台实例编号

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public List<String> getInstances() {
        return instances;
    }

    public void setInstances(List<String> instances) {
        this.instances = instances;
    }
}