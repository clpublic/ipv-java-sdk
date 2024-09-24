package com.ipipv.open.dto;


public class AppInfoResp {
    private String appName; // 应用名
    private String coin; // 余额
    private int useBridge; // 使用桥 1 不使用 2使用
    private String callbackUrl; // 回调地址
    //private String credit;// 授信额度
    private int status;// 1正常 -1禁用
    public String getAppName() {
        return appName;
    }
    public void setAppName(String appName) {
        this.appName = appName;
    }
    public String getCoin() {
        return coin;
    }
    public void setCoin(String coin) {
        this.coin = coin;
    }
    public int getUseBridge() {
        return useBridge;
    }
    public void setUseBridge(int useBridge) {
        this.useBridge = useBridge;
    }
    public String getCallbackUrl() {
        return callbackUrl;
    }
    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }
    /*public String getCredit() {
        return credit;
    }
    public void setCredit(String credit) {
        this.credit = credit;
    }*/
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }

    
}