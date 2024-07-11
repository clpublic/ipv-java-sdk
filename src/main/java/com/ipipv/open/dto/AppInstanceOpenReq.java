package com.ipipv.open.dto;

public class AppInstanceOpenReq {
    private String appOrderNo;  //购买者订单号(渠道商订单号)
    private OpenParam params;   //购买代理产品列表

    public String getAppOrderNo() {
        return appOrderNo;
    }

    public void setAppOrderNo(String appOrderNo) {
        this.appOrderNo = appOrderNo;
    }

    public OpenParam getParams() {
        return params;
    }

    public void setParams(OpenParam params) {
        this.params = params;
    }
}