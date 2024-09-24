package com.ipipv.open.dto;

import java.util.List;

public class AppProxyInfoResp {
    private String used;        //已使用
    private String total;       //总数
    private String balance;     //剩余
    private String productNo;  //产品编号
    private List<String> ipWhiteList; //ip白名单
    private int ipUsed;        //已使用ip数量
    private int ipTotal;       //总ip数量

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

    public String getProductNo() {
        return productNo;
    }

    public void setProductNo(String productNo) {
        this.productNo = productNo;
    }

    public List<String> getIpWhiteList() {
        return ipWhiteList;
    }

    public void setIpWhiteList(List<String> ipWhiteList) {
        this.ipWhiteList = ipWhiteList;
    }

    public int getIpUsed() {
        return ipUsed;
    }

    public void setIpUsed(int ipUsed) {
        this.ipUsed = ipUsed;
    }

    public int getIpTotal() {
        return ipTotal;
    }

    public void setIpTotal(int ipTotal) {
        this.ipTotal = ipTotal;
    }
}