package com.ipipv.open.dto;

public class AppInstanceRenewReq {
    private String appOrderNo;   //购买者订单号(渠道商订单号)
    private Instance instances;  //实例列表

    public String getAppOrderNo() {
        return appOrderNo;
    }

    public void setAppOrderNo(String appOrderNo) {
        this.appOrderNo = appOrderNo;
    }

    public Instance getInstances() {
        return instances;
    }

    public void setInstances(Instance instances) {
        this.instances = instances;
    }
}