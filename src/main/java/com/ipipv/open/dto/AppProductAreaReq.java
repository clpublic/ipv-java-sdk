package com.ipipv.open.dto;

public class AppProductAreaReq {
    private String productNo; //平台产品编号
    private int proxyType; //代理类型 104=动态国外 105=动态国内

    public String getProductNo() {
        return productNo;
    }

    public void setProductNo(String productNo) {
        this.productNo = productNo;
    }

    public int getProxyType() {
        return proxyType;
    }

    public void setProxyType(int proxyType) {
        this.proxyType = proxyType;
    }
}