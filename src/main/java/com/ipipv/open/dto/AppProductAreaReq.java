package com.ipipv.open.dto;

public class AppProductAreaReq {
    private String productNo; //平台产品编号
    private int    proxyType; //代理类型 104=动态国外 105=动态国内

    public String getproductNo() {
        return productNo;
    }

    public void setproductNo(String productNo) {
        this.productNo = productNo;
    }

    public int getproxyType() {
        return proxyType;
    }

    public void setproxyType(int proxyType) {
        this.proxyType = proxyType;
    }
}