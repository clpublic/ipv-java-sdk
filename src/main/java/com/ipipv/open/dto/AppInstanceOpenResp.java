package com.ipipv.open.dto;

public class AppInstanceOpenResp {
    private String orderNo;    //平台订单号
    private String appOrderNo; //购买者订单号(渠道商订单号) 原样返回
    private String amount;     //花费金额

    public String getorderNo() {
    return orderNo;
    }
    
    public void setorderNo(String orderNo) {
        this.orderNo = orderNo;
    }
    
        public String getappOrderNo() {
    return appOrderNo;
    }
    
    public void setappOrderNo(String appOrderNo) {
        this.appOrderNo = appOrderNo;
    }

    public int getamount() {
    return amount;
    }
    
    public void setamount(int amount) {
        this.amount = amount;
    }
}