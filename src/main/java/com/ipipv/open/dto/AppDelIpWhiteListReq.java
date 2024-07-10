package com.ipipv.open.dto;

public class AppDelIpWhiteListReq {
    private String   appUsername;  //渠道商主账号 必要
    private String   ip;           //ip地址 必要
    private Uint     proxyType;    //代理类型 可选 默认104 104=动态国外 105=动态国内

    public String getappUsername() {
        return appUsername;
    }

    public void setappUsername(String appUsername) {
        this.appUsername = appUsername;
    }

    public String getip() {
        return ip;
    }

    public void setip(String ip) {
        this.ip = ip;
    }
    
    public Uint getproxyType() {
        return proxyType;
    }

    public void setproxyType(Uint proxyType) {
        this.proxyType = proxyType;
    }
}
