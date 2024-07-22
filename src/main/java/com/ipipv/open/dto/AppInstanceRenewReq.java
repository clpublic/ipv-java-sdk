package com.ipipv.open.dto;

import java.util.List;

public class AppInstanceRenewReq {
    private String appOrderNo;   //购买者订单号(渠道商订单号)
    private List<Instance> instances;  //实例列表

    public String getAppOrderNo() {
        return appOrderNo;
    }

    public void setAppOrderNo(String appOrderNo) {
        this.appOrderNo = appOrderNo;
    }

    public List<Instance> getInstances() {
        return instances;
    }

    public void setInstances(List<Instance> instances) {
        this.instances = instances;
    }
}