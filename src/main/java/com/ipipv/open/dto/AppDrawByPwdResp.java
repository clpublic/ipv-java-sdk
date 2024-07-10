package com.ipipv.open.dto;

public class AppDrawByPwdResp {
    private AppDrawByPwdItem list;
    private String    proxyUrl;     //代理地址
    private String    list;

    public AppDrawByPwdItem getlist() {
        return list;
    }

    public void setlist(AppDrawByPwdItem applist) {
        this.applist = applist;
    }

    public String getproxyUrl() {
        return proxyUrl;
    }

    public void setproxyUrl(String proxyUrl) {
        this.proxyUrl = proxyUrl;
    }
    
    public String getlist() {
        return list;
    }

    public void setlist(String list) {
        this.list = list;
    }
}