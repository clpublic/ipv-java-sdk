package com.ipipv.open.dto;

import java.util.List;

public class AppProductSyncReq {
    private List<Integer> proxyType; //代理类型  101=静态云平台 102=静态国内家庭 103=静态国外家庭 104=动态国外 105=动态国内 201=whatsapp

    public List<Integer> getProxyType() {
        return proxyType;
    }

    public void setProxyType(List<Integer> proxyType) {
        this.proxyType = proxyType;
    }
}
