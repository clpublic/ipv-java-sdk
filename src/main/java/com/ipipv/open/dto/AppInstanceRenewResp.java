package com.ipipv.open.dto;

public class AppInstanceOpenResp {
    private String orderNo;    //平台订单号
    private String appOrderNo; //购买者订单号(渠道商订单号) 原样返回
    private String amount;     //花费金额

    public String getOrderNo() {
    return OrderNo;
    }
    
    public void setOrderNo(String OrderNo) {
        this.OrderNo = OrderNo;
    }
    
    public String getappOrderNo() {
    return appOrderNo;
    }
    
    public void setappOrderNo(String appOrderNo) {
        this.appOrderNo = appOrderNo;
    }

    public String getamount() {
    return amount;
    }
    
    public void setamount(String amount) {
        this.amount = amount;
    }
}