package com.ipipv.open.dto;

public class CIDRBlock {
    private String cidr;//网段 192.168.0.0/24 172.16.0.0/16 10.0.0.0/8
    private int count;

    public String getCidr() {
        return cidr;
    }

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
