package com.ipipv.open.dto;

public class AppDrawByApiResp {
    private AppDrawByApiItem list;
    private String    proxyUrl;    //提取代理Api地址
    
    public AppDrawByApiItem getlist() {
    return list;
    }
    
    public void setlist(AppDrawByApiItem list) {
        this.list = list;
    }
    
    public String getproxyUrl() {
    return proxyUrl;
    }
    
    public void setproxyUrl(String proxyUrl) {
        this.proxyUrl = proxyUrl;
    }
}
