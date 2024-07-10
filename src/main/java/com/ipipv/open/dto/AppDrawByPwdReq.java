package com.ipipv.open.dto;

public class AppDrawByPwdReq {
    private String appUsernam;   //必要（渠道商子账号名
    private String addressCode;  //地址代码 可以传 areaCode countryCode stateCode cityCode 四种之一
    private String sessTime;     //有效时间 1-120分钟 默认5分钟
    private int    num;          //数量 默认1
    private Uint   proxyType;    //代理类型 104=动态国外 105=动态国内
    private int    maxFlowLimit; //子账号最大流量限制 可选 大于0的时候生效

    public String getappUsernam() {
        return appUsernam;
    }

    public void setappUsernam(String appUsernam) {
        this.appUsernam = appUsernam;
    }

    public String getaddressCode() {
        return addressCode;
    }

    public void setaddressCode(String addressCode) {
        this.addressCode = addressCode;
    }
    
    public String getsessTime() {
        return sessTime;
    }

    public void setsessTime(String sessTime) {
        this.sessTime = sessTime;
    }
    
    public int getnum() {
        return num;
    }

    public void setnum(int num) {
        this.num = num;
    }
    
    public int getproxyType() {
        return proxyType;
    }

    public void setproxyType(int proxyType) {
        this.proxyType = proxyType;
    }
        
    public int getmaxFlowLimit() {
        return maxFlowLimit;
    }

    public void setmaxFlowLimit(int maxFlowLimit) {
        this.maxFlowLimit = maxFlowLimit;
    }
}