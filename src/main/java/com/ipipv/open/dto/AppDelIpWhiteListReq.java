package com.ipipv.open.dto;

public class AppDelIpWhiteListReq {
    private String appUsername;  //渠道商主账号 必要
    private String ip;           //ip地址 必要
    private int proxyType;    //代理类型 可选 默认104 104=动态国外 105=动态国内

    public String getAppUsername() {
        return appUsername;
    }

    public void setAppUsername(String appUsername) {
        this.appUsername = appUsername;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getProxyType() {
        return proxyType;
    }

    public void setProxyType(int proxyType) {
        this.proxyType = proxyType;
    }
}
