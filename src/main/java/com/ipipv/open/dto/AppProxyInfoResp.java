package com.ipipv.open.dto;

import java.util.List;

public class AppProxyInfoResp {
    private String used;        //已使用
    private String total;       //总数
    private String balance;     //剩余
    private List<String> ipWhiteList; //ip白名单

    public String getUsed() {
        return used;
    }

    public void setUsed(String used) {
        this.used = used;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public List<String> getIpWhiteList() {
        return ipWhiteList;
    }

    public void setIpWhiteList(List<String> ipWhiteList) {
        this.ipWhiteList = ipWhiteList;
    }
}