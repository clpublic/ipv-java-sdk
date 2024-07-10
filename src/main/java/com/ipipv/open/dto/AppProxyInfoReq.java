package com.ipipv.open.dto;

public class AppProxyInfoReq {
    private String  username;   //平台主账号，选填 平台主账号和渠道商主账号两个必填一个
    private String  appUsername;//渠道商主账号，选填 平台主账号和渠道商主账号两个必填一个
    private Uint    proxyType;  //代理类型 必填 104=动态国外 105=动态国内

    public String getusername() {
        return username;
    }

    public void setusername(String username) {
        this.username = username;
    }

    public String getappUsername() {
        return appUsername;
    }

    public void setappUsername(String appUsername) {
        this.appUsername = appUsername;
    }

    public Uint getproxyType() {
        return proxyType;
    }

    public void setproxyType(Uint proxyType) {
        this.proxyType = proxyType;
    }
}