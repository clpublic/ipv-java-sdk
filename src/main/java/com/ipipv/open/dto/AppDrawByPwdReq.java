package com.ipipv.open.dto;

public class AppDrawByPwdReq {
    private String appUsername;   //必要（渠道商子账号名
    private String addressCode;  //地址代码 可以传 areaCode countryCode stateCode cityCode 四种之一
    private String sessTime;     //有效时间 1-120分钟 默认5分钟
    private int num;          //数量 默认1
    private int proxyType;    //代理类型 104=动态国外 105=动态国内
    private int maxFlowLimit; //子账号最大流量限制 可选 大于0的时候生效
    private String productNo; //产品编号

    public String getAppUsername() {
        return appUsername;
    }

    public void setAppUsername(String appUsername) {
        this.appUsername = appUsername;
    }

    public String getAddressCode() {
        return addressCode;
    }

    public void setAddressCode(String addressCode) {
        this.addressCode = addressCode;
    }

    public String getSessTime() {
        return sessTime;
    }

    public void setSessTime(String sessTime) {
        this.sessTime = sessTime;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getProxyType() {
        return proxyType;
    }

    public void setProxyType(int proxyType) {
        this.proxyType = proxyType;
    }

    public int getMaxFlowLimit() {
        return maxFlowLimit;
    }

    public void setMaxFlowLimit(int maxFlowLimit) {
        this.maxFlowLimit = maxFlowLimit;
    }

    public String getProductNo() {
        return productNo;
    }

    public void setProductNo(String productNo) {
        this.productNo = productNo;
    }
}