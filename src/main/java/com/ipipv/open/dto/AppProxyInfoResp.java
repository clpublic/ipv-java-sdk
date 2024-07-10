package com.ipipv.open.dto;

public class AppProxyInfoResp {
    private String used;        //已使用
    private String total;       //总数
    private String balance;     //剩余
    private String ipWhiteList; //ip白名单

    public String getused() {
        return used;
    }

    public void setused(String used) {
        this.used = used;
    }

    public String gettotal() {
        return total;
    }

    public void settotal(String total) {
        this.total = total;
    }

    public String getbalance() {
        return balance;
    }

    public void setbalance(String balance) {
        this.balance = balance;
    }

    public String getipWhiteList() {
        return ipWhiteList;
    }

    public void setipWhiteList(String ipWhiteList) {
        this.ipWhiteList = ipWhiteList;
    }
}