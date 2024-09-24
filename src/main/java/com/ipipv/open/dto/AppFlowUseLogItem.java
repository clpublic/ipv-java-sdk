package com.ipipv.open.dto;

public class AppFlowUseLogItem {
    private int used; // 已使用流量 B
    private int total; // 总流量 B
    private int balance; // 剩余流量 B
    private int usedTime; // 使用时间 单位秒
    private String productNo; // 产品编号

    public int getUsed() {
        return used;
    }

    public void setUsed(int used) {
        this.used = used;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getUsedTime() {
        return usedTime;
    }

    public void setUsedTime(int usedTime) {
        this.usedTime = usedTime;
    }

    public String getProductNo() {
        return productNo;
    }

    public void setProductNo(String productNo) {
        this.productNo = productNo;
    }
}
