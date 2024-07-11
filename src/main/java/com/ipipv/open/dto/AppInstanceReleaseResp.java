package com.ipipv.open.dto;

public class AppInstanceReleaseResp {
    private String orderNo;    //平台订单号
    private String appOrderNo; //购买者订单号(渠道商订单号) 原样返回
    private String amount;     //花费金额

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getAppOrderNo() {
        return appOrderNo;
    }

    public void setAppOrderNo(String appOrderNo) {
        this.appOrderNo = appOrderNo;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}