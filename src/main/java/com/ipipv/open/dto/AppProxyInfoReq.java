package com.ipipv.open.dto;

public class AppProxyInfoReq {
    private String  username;   //平台主账号，选填 平台主账号和渠道商主账号两个必填一个
    private String  appUsername;//渠道商主账号，选填 平台主账号和渠道商主账号两个必填一个
    private int    proxyType;  //代理类型 必填 104=动态国外 105=动态国内

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAppUsername() {
        return appUsername;
    }

    public void setAppUsername(String appUsername) {
        this.appUsername = appUsername;
    }

    public int getProxyType() {
        return proxyType;
    }

    public void setProxyType(int proxyType) {
        this.proxyType = proxyType;
    }
}